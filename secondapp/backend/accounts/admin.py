from django import forms
from django.contrib import admin
from django.contrib.auth.admin import UserAdmin
from django.contrib.auth.models import User
from django.core.exceptions import ValidationError
from .models import Subscription, Payment, SiteSettings
from .services import apply_payment

class IdentityForm(forms.ModelForm):
    class Meta:
        model = User
        fields = '__all__'
    def clean_email(self):
        value = self.cleaned_data['email'].lower()
        if value and User.objects.filter(email__iexact=value).exclude(pk=self.instance.pk).exists():
            raise ValidationError('This email is unavailable.')
        return value
    def clean_username(self):
        value = self.cleaned_data['username'].lower()
        if User.objects.filter(username__iexact=value).exclude(pk=self.instance.pk).exists():
            raise ValidationError('This username is unavailable.')
        return value

class SubscriptionInline(admin.StackedInline):
    model = Subscription
    can_delete = False
    extra = 0
    readonly_fields = ['trial_consumed', 'auth_version', 'created_at', 'updated_at']

admin.site.unregister(User)
@admin.register(User)
class AccountAdmin(UserAdmin):
    form = type('AccountChangeForm', (IdentityForm, UserAdmin.form), {})
    add_form = type('AccountCreationForm', (IdentityForm, UserAdmin.add_form), {})
    inlines = [SubscriptionInline]
    def get_inline_instances(self, request, obj=None):
        return super().get_inline_instances(request, obj) if obj else []

@admin.register(Subscription)
class SubscriptionAdmin(admin.ModelAdmin):
    list_display = ['user', 'trial_end', 'paid_until', 'suspended']
    list_filter = ['suspended', 'trial_consumed']
    search_fields = ['user__username', 'user__email', 'phone', 'full_name']
    readonly_fields = ['user', 'trial_consumed', 'auth_version', 'created_at', 'updated_at']
    def has_add_permission(self, request):
        return False
    def has_delete_permission(self, request, obj=None):
        return False

@admin.register(Payment)
class PaymentAdmin(admin.ModelAdmin):
    list_display = ['reference', 'subscription', 'amount', 'currency', 'confirmed', 'applied_at']
    list_filter = ['confirmed', 'currency']
    search_fields = ['reference', 'subscription__user__username']
    readonly_fields = ['period_start', 'period_end', 'applied_at', 'idempotency_key', 'recorded_by']
    def get_readonly_fields(self, request, obj=None):
        if obj and obj.applied_at:
            return [f.name for f in Payment._meta.fields if f.name not in ['id', 'note']]
        return self.readonly_fields
    def save_model(self, request, obj, form, change):
        if not obj.pk:
            obj.recorded_by = request.user
        obj.save()
        apply_payment(obj.pk)
    def has_delete_permission(self, request, obj=None):
        return False

@admin.register(SiteSettings)
class SiteSettingsAdmin(admin.ModelAdmin):
    def has_add_permission(self, request):
        return not SiteSettings.objects.exists()
    def has_delete_permission(self, request, obj=None):
        return False
admin.site.site_header = 'SoccerArena administration'
