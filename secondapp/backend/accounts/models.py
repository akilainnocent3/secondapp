import uuid
from decimal import Decimal
from django.conf import settings
from django.core.exceptions import ValidationError
from django.core.validators import MinValueValidator, MaxValueValidator, RegexValidator
from django.db import models
from django.db.models import Q, F
from django.utils import timezone

class Subscription(models.Model):
    user = models.OneToOneField(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)
    full_name = models.CharField(max_length=200, blank=True)
    phone = models.CharField(max_length=16, unique=True, null=True, blank=True)
    trial_consumed = models.BooleanField(default=False, editable=False)
    trial_start = models.DateTimeField(null=True, blank=True)
    trial_end = models.DateTimeField(null=True, blank=True)
    paid_until = models.DateTimeField(null=True, blank=True)
    suspended = models.BooleanField(default=False)
    suspension_reason = models.CharField(max_length=300, blank=True)
    auth_version = models.PositiveIntegerField(default=1, editable=False)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    class Meta:
        constraints = [models.CheckConstraint(condition=(Q(trial_start__isnull=True, trial_end__isnull=True) | Q(trial_start__isnull=False, trial_end__isnull=False, trial_end__gt=F('trial_start'))), name='valid_trial_period'), models.CheckConstraint(condition=Q(phone__isnull=True) | Q(phone__regex=r'^\+[1-9][0-9]{6,14}$'), name='canonical_phone')]
    def clean(self):
        if bool(self.trial_start) != bool(self.trial_end) or (self.trial_start and self.trial_end <= self.trial_start):
            raise ValidationError('Trial dates must both be set, with end after start.')
        if self.phone:
            from .validation import normalize_phone
            self.phone = normalize_phone(self.phone)
    def save(self, *args, **kwargs):
        self.full_clean()
        if self.trial_start:
            self.trial_consumed = True
        if self.pk and Subscription.objects.filter(pk=self.pk, trial_consumed=True).exists():
            self.trial_consumed = True
        super().save(*args, **kwargs)
    def __str__(self):
        return self.user.username

class Payment(models.Model):
    subscription = models.ForeignKey(Subscription, on_delete=models.CASCADE, related_name='payments')
    amount = models.DecimalField(max_digits=12, decimal_places=2, validators=[MinValueValidator(Decimal('0.01'))])
    currency = models.CharField(max_length=3, default='TZS', validators=[RegexValidator(r'^[A-Z]{3}$', 'Use a three-letter uppercase currency code.')])
    paid_at = models.DateTimeField(default=timezone.now)
    reference = models.CharField(max_length=120, unique=True)
    months = models.PositiveSmallIntegerField(default=1, validators=[MinValueValidator(1), MaxValueValidator(120)])
    idempotency_key = models.UUIDField(default=uuid.uuid4, unique=True, editable=False)
    confirmed = models.BooleanField(default=False)
    period_start = models.DateTimeField(null=True, editable=False)
    period_end = models.DateTimeField(null=True, editable=False)
    applied_at = models.DateTimeField(null=True, editable=False)
    recorded_by = models.ForeignKey(settings.AUTH_USER_MODEL, null=True, on_delete=models.SET_NULL, related_name='recorded_payments', editable=False)
    note = models.TextField(blank=True)
    class Meta:
        ordering = ['-paid_at', '-pk']
        constraints = [models.CheckConstraint(condition=Q(amount__gt=0), name='positive_payment'), models.CheckConstraint(condition=Q(months__gte=1, months__lte=120), name='valid_payment_months')]
    def save(self, *args, **kwargs):
        if self.pk:
            old = Payment.objects.get(pk=self.pk)
            if old.applied_at:
                fields = ['subscription_id', 'amount', 'currency', 'paid_at', 'reference', 'months', 'confirmed', 'period_start', 'period_end', 'applied_at', 'idempotency_key', 'recorded_by_id']
                if any(getattr(old, f) != getattr(self, f) for f in fields):
                    raise ValidationError('Applied payment fields are immutable. Only notes may change.')
        self.full_clean()
        super().save(*args, **kwargs)

class SiteSettings(models.Model):
    id = models.PositiveSmallIntegerField(primary_key=True, default=1, editable=False)
    support_email = models.EmailField(default='akilainnocent@pm.me')
    payment_phone = models.CharField(max_length=16, default='255629645877', validators=[RegexValidator(r'^\+?[1-9]\d{6,14}$')])
    instructions = models.TextField(blank=True, default='Payment confirmation is manual. Contact support for assistance.')
    class Meta:
        verbose_name_plural = 'Site settings'
        constraints = [models.CheckConstraint(condition=Q(id=1), name='singleton_settings')]
    def save(self, *args, **kwargs):
        self.pk = 1
        self.full_clean()
        super().save(*args, **kwargs)
