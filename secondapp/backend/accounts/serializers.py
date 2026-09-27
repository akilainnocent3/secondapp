from django.contrib.auth.models import User
from django.contrib.auth.password_validation import validate_password
from django.core.exceptions import ValidationError as DjangoValidationError
from django.db import transaction
from rest_framework import serializers
from .models import Subscription, Payment
from .validation import normalize_phone

class RegistrationSerializer(serializers.Serializer):
    username = serializers.RegexField(r'^[A-Za-z0-9_@.+-]+$', max_length=150)
    email = serializers.EmailField(max_length=254)
    full_name = serializers.CharField(max_length=200)
    phone = serializers.CharField(max_length=40)
    password = serializers.CharField(write_only=True, trim_whitespace=False, max_length=128)
    password_confirmation = serializers.CharField(write_only=True, trim_whitespace=False, max_length=128)
    def validate_username(self, value):
        value = value.lower()
        if User.objects.filter(username__iexact=value).exists():
            raise serializers.ValidationError('This username is unavailable.')
        return value
    def validate_email(self, value):
        value = value.lower()
        if User.objects.filter(email__iexact=value).exists():
            raise serializers.ValidationError('This email is unavailable.')
        return value
    def validate_phone(self, value):
        try:
            value = normalize_phone(value)
        except DjangoValidationError as e:
            raise serializers.ValidationError(e.messages)
        if Subscription.objects.filter(phone=value).exists():
            raise serializers.ValidationError('This phone number is unavailable.')
        return value
    def validate(self, attrs):
        if attrs['password'] != attrs['password_confirmation']:
            raise serializers.ValidationError({'password_confirmation': 'Passwords do not match.'})
        try:
            validate_password(attrs['password'], User(username=attrs['username'], email=attrs['email']))
        except DjangoValidationError as e:
            raise serializers.ValidationError({'password': e.messages})
        return attrs
    @transaction.atomic
    def create(self, data):
        user = User.objects.create_user(username=data['username'], email=data['email'], password=data['password'])
        sub = user.subscription
        sub.full_name, sub.phone = data['full_name'], data['phone']
        sub.save()
        return user

class PaymentSerializer(serializers.ModelSerializer):
    class Meta:
        model = Payment
        fields = ['id', 'amount', 'currency', 'paid_at', 'reference', 'months', 'confirmed', 'period_start', 'period_end', 'applied_at']
