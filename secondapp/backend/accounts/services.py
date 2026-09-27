from datetime import timedelta
from dateutil.relativedelta import relativedelta
from django.db import transaction
from django.utils import timezone
from .models import Subscription, Payment

@transaction.atomic
def start_trial(user):
    # Missing subscriptions are an integrity issue, never silently a new trial.
    sub = Subscription.objects.select_for_update().get(user=user)
    if not sub.trial_consumed:
        sub.trial_start = timezone.now()
        sub.trial_end = sub.trial_start + timedelta(days=7)
        sub.trial_consumed = True
        sub.save()
    return sub

def entitlement(sub, now=None):
    now = now or timezone.now()
    expiry = max((d for d in [sub.trial_end, sub.paid_until] if d), default=None)
    allowed = bool(sub.user.is_active and not sub.suspended and expiry and now < expiry)
    status = 'suspended' if sub.suspended else 'expired'
    if allowed:
        status = 'active_paid' if sub.paid_until and now < sub.paid_until else 'active_trial'
    elif not sub.trial_consumed and not sub.suspended:
        status = 'unstarted'
    return {'status': status, 'allowed': allowed, 'expires_at': expiry, 'server_time': now, 'trial_start': sub.trial_start, 'trial_end': sub.trial_end, 'paid_until': sub.paid_until, 'reason': sub.suspension_reason if sub.suspended else '', 'max_staleness_seconds': 60}

@transaction.atomic
def apply_payment(payment_id):
    # Consistent lock order: subscription, then payment. Serializes distinct receipts.
    sid = Payment.objects.values_list('subscription_id', flat=True).get(pk=payment_id)
    sub = Subscription.objects.select_for_update().get(pk=sid)
    payment = Payment.objects.select_for_update().get(pk=payment_id)
    if payment.applied_at or not payment.confirmed:
        return payment
    now = timezone.now()
    start = max([now] + [d for d in [sub.paid_until, sub.trial_end] if d and d > now])
    end = start + relativedelta(months=payment.months)
    payment.period_start, payment.period_end, payment.applied_at = start, end, now
    payment.save()
    sub.paid_until = end
    sub.save()
    return payment
