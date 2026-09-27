from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.models import User
from django.core.exceptions import ValidationError as DjangoValidationError
from django.db import DatabaseError, IntegrityError, transaction, connection
from django.db.models import F
from django.http import JsonResponse
from django.middleware.csrf import get_token
from django.utils.decorators import method_decorator
from rest_framework import generics, permissions, serializers, status
from rest_framework.exceptions import AuthenticationFailed, PermissionDenied
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework_simplejwt.tokens import RefreshToken
from rest_framework_simplejwt.utils import get_md5_hash_password
from rest_framework_simplejwt.exceptions import TokenError
from .models import Subscription, SiteSettings
from .serializers import RegistrationSerializer, PaymentSerializer
from .services import start_trial, entitlement
from .authentication import issue_tokens
from .csrf import api_csrf_protect
from .errors import ServiceUnavailable

def account(user):
    sub = Subscription.objects.select_related('user').get(user=user)
    return {'username': user.username, 'email': user.email, 'full_name': sub.full_name, 'phone': sub.phone, 'entitlement': entitlement(sub)}

class NoStoreView(APIView):
    def get_authenticate_header(self, request):
        return 'Bearer realm="api"'

    def finalize_response(self, request, response, *args, **kwargs):
        response = super().finalize_response(request, response, *args, **kwargs)
        response['Cache-Control'] = 'no-store'
        return response

class PublicSettings(NoStoreView):
    permission_classes = [permissions.AllowAny]
    authentication_classes = []
    def get(self, request):
        obj, _ = SiteSettings.objects.get_or_create(pk=1)
        return Response({'support_email': obj.support_email, 'payment_phone': obj.payment_phone, 'instructions': obj.instructions})

class Csrf(NoStoreView):
    permission_classes = [permissions.AllowAny]
    authentication_classes = []
    def get(self, request):
        return Response({'csrf_token': get_token(request)})

class Register(NoStoreView):
    permission_classes = [permissions.AllowAny]
    authentication_classes = []
    throttle_scope = 'register'
    def post(self, request):
        serializer = RegistrationSerializer(data=request.data)
        serializer.is_valid(raise_exception=True)
        try:
            serializer.save()
        except (IntegrityError, DjangoValidationError):
            raise serializers.ValidationError('Username, email or phone is already registered.')
        return Response({'message': 'Account created. Sign in to begin your seven-day trial.'}, status=201)

class Login(NoStoreView):
    permission_classes = [permissions.AllowAny]
    authentication_classes = []
    throttle_scope = 'login'
    web = False
    def post(self, request):
        username, password = request.data.get('username', ''), request.data.get('password', '')
        if not isinstance(username, str) or not isinstance(password, str) or len(password) > 128:
            raise AuthenticationFailed('Invalid username or password.', code='invalid_credentials')
        # Admin-created mixed-case usernames retain the same login policy.
        canonical = User.objects.filter(username__iexact=username).values_list('username', flat=True).first() or username
        user = authenticate(request, username=canonical, password=password)
        if user is None:
            raise AuthenticationFailed('Invalid username or password.', code='invalid_credentials')
        with transaction.atomic():
            start_trial(user)
            user.refresh_from_db()
            if self.web:
                login(request, user)
                request.session['auth_version'] = user.subscription.auth_version
                return Response({'account': account(user), 'csrf_token': get_token(request)})
            return Response({'account': account(user), **issue_tokens(user)})

@method_decorator(api_csrf_protect, name='dispatch')
class WebLogin(Login):
    web = True

class Refresh(NoStoreView):
    permission_classes = [permissions.AllowAny]
    authentication_classes = []
    throttle_scope = 'refresh'
    def post(self, request):
        try:
            # Lock the account before re-checking blacklist: only one rotation wins.
            raw = request.data.get('refresh', '')
            first = RefreshToken(raw)
            with transaction.atomic():
                sub = Subscription.objects.select_for_update().select_related('user').get(user_id=first['user_id'])
                token = RefreshToken(raw)
                if (not sub.user.is_active or token.get('version') != sub.auth_version
                    or token.get('hash_password') != get_md5_hash_password(sub.user.password)):
                    raise AuthenticationFailed('Please sign in again.', code='session_revoked')
                token.blacklist()
                return Response({**issue_tokens(sub.user), 'account': account(sub.user)})
        except (TokenError, Subscription.DoesNotExist, KeyError, TypeError):
            raise AuthenticationFailed('Please sign in again.', code='authentication_expired')

class Me(NoStoreView):
    def get_throttles(self):
        return super().get_throttles() if self.request.method == 'DELETE' else []

    def get(self, request):
        return Response(account(request.user))
    throttle_scope = 'reauth'
    @transaction.atomic
    def delete(self, request):
        sub = Subscription.objects.select_for_update().get(user=request.user)
        user = User.objects.get(pk=request.user.pk)
        password = request.data.get('password', '')
        if not isinstance(password, str) or not user.check_password(password):
            raise serializers.ValidationError({'password': 'Incorrect password.'})
        user.delete()  # Cascade removes subscription and personal payment history.
        logout(request)
        return Response(status=204)

class Logout(NoStoreView):
    @transaction.atomic
    def post(self, request):
        Subscription.objects.filter(user=request.user).update(auth_version=F('auth_version') + 1)
        logout(request)
        return Response(status=204)

class Access(NoStoreView):
    def get(self, request):
        return Response(entitlement(Subscription.objects.select_related('user').get(user=request.user)))

class HasEntitlement(permissions.BasePermission):
    def has_permission(self, request, view):
        if not request.user.is_authenticated:
            return False
        state = entitlement(Subscription.objects.select_related('user').get(user=request.user))
        if not state['allowed']:
            raise PermissionDenied('Viewing access is unavailable. Open your account for details.', code='subscription_' + state['status'])
        return True

class Content(NoStoreView):
    permission_classes = [permissions.IsAuthenticated, HasEntitlement]
    def get(self, request):
        raise ServiceUnavailable()

class Payments(generics.ListAPIView):
    serializer_class = PaymentSerializer
    def get_queryset(self):
        return self.request.user.subscription.payments.all()
    def finalize_response(self, request, response, *args, **kwargs):
        response = super().finalize_response(request, response, *args, **kwargs)
        response['Cache-Control'] = 'no-store'
        return response

def health(request):
    try:
        with connection.cursor() as cursor:
            cursor.execute('SELECT 1')
    except DatabaseError:
        return JsonResponse({'status': 'unavailable'}, status=503)
    return JsonResponse({'status': 'ok'})

def csrf_failure(request, reason=""):
    return JsonResponse({"error": {"code": "csrf_failed", "message": "Refresh this page and try again.", "fields": {}}}, status=403)

def server_error(request):
    return JsonResponse({"error": {"code": "server_error", "message": "Unable to complete this request. Please retry.", "fields": {}}}, status=500)
