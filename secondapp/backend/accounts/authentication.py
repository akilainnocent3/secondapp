from django.contrib.auth import get_user_model
from rest_framework.authentication import SessionAuthentication
from rest_framework.exceptions import AuthenticationFailed
from rest_framework_simplejwt.authentication import JWTAuthentication
from rest_framework_simplejwt.tokens import RefreshToken

class CurrentJWTAuthentication(JWTAuthentication):
    def get_user(self, validated_token):
        user = super().get_user(validated_token)
        if validated_token.get('version') != user.subscription.auth_version:
            raise AuthenticationFailed('Please sign in again.', code='session_revoked')
        return user

class CurrentSessionAuthentication(SessionAuthentication):
    def authenticate(self, request):
        result = super().authenticate(request)
        if result:
            user, _ = result
            if request.session.get('auth_version') != user.subscription.auth_version:
                raise AuthenticationFailed('Please sign in again.', code='session_revoked')
        return result

def issue_tokens(user):
    token = RefreshToken.for_user(user)
    token['version'] = user.subscription.auth_version
    return {'access': str(token.access_token), 'refresh': str(token)}
