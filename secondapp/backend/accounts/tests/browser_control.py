"""Explicit local browser-test helper, never a production fixture command.

Called only by flutter/tool/browser_smoke.cjs. No password or token is emitted.
"""
import os
import sys
from pathlib import Path
from datetime import timedelta
assert os.environ.get('DEBUG') == '1' and os.environ.get('ARENA_BROWSER_TEST') == '1'
assert not os.environ.get('PGHOST'), 'This helper is limited to the local SQLite test database.'
sys.path.insert(0, str(Path(__file__).resolve().parents[2]))
os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'config.settings')
import django
django.setup()
from django.contrib.auth.models import User
from django.test import Client
from django.utils import timezone
from accounts.models import Payment

action, username = sys.argv[1:3]
assert username.startswith('browser_')
if action == 'cleanup':
    User.objects.filter(username__startswith='browser_', email__endswith='@example.test', subscription__phone='+255629645879').delete()
    from django.core.cache import cache
    cache.clear()  # Explicit disposable local test reset, never production.
    sys.exit(0)
user = User.objects.get(username=username)
sub = user.subscription
if action == 'expire':
    sub.trial_start = timezone.now() - timedelta(days=8)
    sub.trial_end = timezone.now() - timedelta(days=1)
    sub.save()
elif action == 'suspend':
    sub.suspended = True
    sub.suspension_reason = 'Temporary test suspension'
    sub.save()
elif action == 'unsuspend':
    sub.suspended = False
    sub.save()
elif action == 'payment':
    admin = User.objects.create_superuser(username + '_admin', password=None)
    try:
        client = Client()
        client.force_login(admin)
        now = timezone.localtime()
        response = client.post('/admin/accounts/payment/add/', {
            'subscription': sub.pk, 'amount': '123.45', 'currency': 'TZS',
            'paid_at_0': now.strftime('%Y-%m-%d'), 'paid_at_1': now.strftime('%H:%M:%S'),
            'reference': 'BROWSER-TEST-' + username, 'months': '1',
            'confirmed': 'on', 'note': 'Explicit local browser test only', '_save': 'Save',
        })
        assert response.status_code == 302, 'Admin receipt submission did not redirect.'
        assert Payment.objects.get(reference='BROWSER-TEST-' + username).applied_at
    finally:
        admin.delete()
else:
    raise ValueError('Unknown local test action')
