from datetime import datetime, timedelta, timezone as tz
from decimal import Decimal
from unittest.mock import patch
from django.contrib.auth.models import User
from django.core.exceptions import ValidationError
from django.db import IntegrityError, transaction
from django.test import TestCase, override_settings
from django.utils import timezone
from rest_framework.test import APIClient
from accounts.models import Payment, SiteSettings, Subscription
from accounts.services import start_trial, entitlement, apply_payment

PASSWORD = 'Test-only!copper-river-493'
class AccountsTests(TestCase):
    def setUp(self):
        self.client = APIClient()
        self.user = User.objects.create_user('tester', 'tester@example.test', PASSWORD)
    def login(self, client=None):
        c = client or self.client
        r = c.post('/api/v1/auth/login/', {'username': 'tester', 'password': PASSWORD}, format='json')
        self.assertEqual(r.status_code, 200, r.data)
        c.credentials(HTTP_AUTHORIZATION='Bearer ' + r.data['access'])
        return r.data
    def payment(self, **kwargs):
        return Payment.objects.create(subscription=self.user.subscription, amount=Decimal('100'), reference='receipt-one', confirmed=True, **kwargs)
    def test_registration_atomic_and_validation(self):
        data = dict(username='NewUser', email='new@example.test', full_name='SingleName', phone='+255629645878', password=PASSWORD, password_confirmation=PASSWORD)
        r = self.client.post('/api/v1/auth/register/', data, format='json')
        self.assertEqual(r.status_code, 201, r.data)
        u = User.objects.get(username='newuser')
        self.assertTrue(u.check_password(PASSWORD))
        self.assertNotEqual(u.password, PASSWORD)
        self.assertEqual(u.subscription.full_name, 'SingleName')
        self.assertEqual(u.subscription.phone, '+255629645878')
        self.assertIsNone(u.subscription.trial_start)
        for field, value in [('username', 'NEWUSER'), ('email', 'NEW@example.test'), ('phone', '+255 629 645 878'), ('password', '12345678')]:
            d = {**data, 'username': 'another', 'email': 'other@example.test', 'phone': '+255629645879', field: value}
            self.assertEqual(self.client.post('/api/v1/auth/register/', d, format='json').status_code, 400)
    def test_database_identity_constraints(self):
        for data in [dict(username='TESTER', email='other@example.test'), dict(username='other', email='TESTER@example.test')]:
            with self.assertRaises(IntegrityError), transaction.atomic():
                User.objects.create(**data)
    def test_trial_only_first_success(self):
        self.client.post('/api/v1/auth/login/', {'username': 'tester', 'password': 'wrong'})
        self.user.subscription.refresh_from_db()
        self.assertIsNone(self.user.subscription.trial_start)
        first = self.login()['account']['entitlement']
        sub = Subscription.objects.get(user=self.user)
        self.assertEqual(sub.trial_end - sub.trial_start, timedelta(days=7))
        self.client.credentials()
        second = self.login()['account']['entitlement']
        self.assertEqual(first['trial_start'], second['trial_start'])
        sub.trial_start = sub.trial_end = None
        sub.save()
        self.assertIsNone(start_trial(self.user).trial_start)
    def test_exact_expiry_and_clock(self):
        sub = start_trial(self.user)
        self.assertTrue(entitlement(sub, sub.trial_end - timedelta(microseconds=1))['allowed'])
        self.assertFalse(entitlement(sub, sub.trial_end)['allowed'])
    def test_restricted_suspension_and_old_tokens(self):
        tokens = self.login()
        sub = Subscription.objects.get(user=self.user)
        sub.suspended = True
        sub.save()
        self.assertEqual(self.client.get('/api/v1/content/').status_code, 403)
        self.assertEqual(self.client.get('/api/v1/me/').status_code, 200)
        apply_payment(self.payment().pk)
        sub.refresh_from_db()
        self.assertTrue(sub.suspended)
        sub.suspended = False
        sub.save()
        self.assertEqual(self.client.get('/api/v1/access/').data['status'], 'active_paid')
        self.assertEqual(self.client.get('/api/v1/content/').status_code, 503)
        self.assertEqual(self.client.post('/api/v1/auth/logout/').status_code, 204)
        self.assertEqual(self.client.get('/api/v1/me/').status_code, 401)
        self.assertEqual(APIClient().post('/api/v1/auth/refresh/', {'refresh': tokens['refresh']}).status_code, 401)
    def test_expired_login_refresh_stays_restricted(self):
        sub = start_trial(self.user)
        sub.trial_start = timezone.now() - timedelta(days=8)
        sub.trial_end = timezone.now() - timedelta(days=1)
        sub.save()
        token = self.login()
        self.assertFalse(token['account']['entitlement']['allowed'])
        self.assertEqual(self.client.get('/api/v1/payments/').status_code, 200)
        self.assertEqual(self.client.get('/api/v1/content/').status_code, 403)
        r = APIClient().post('/api/v1/auth/refresh/', {'refresh': token['refresh']})
        self.assertEqual(r.status_code, 200)
        self.assertFalse(r.data['account']['entitlement']['allowed'])
        self.assertEqual(APIClient().post('/api/v1/auth/refresh/', {'refresh': token['refresh']}).status_code, 401)
    def test_payment_calendar_idempotency_immutability(self):
        with patch('accounts.services.timezone.now', return_value=datetime(2024, 1, 31, 10, tzinfo=tz.utc)):
            p = apply_payment(self.payment().pk)
        self.assertEqual(p.period_end, datetime(2024, 2, 29, 10, tzinfo=tz.utc))
        self.assertEqual(apply_payment(p.pk).period_end, p.period_end)
        p.note = 'Updated note'
        p.save()
        p.amount = 200
        with self.assertRaises(ValidationError):
            p.save()
        with self.assertRaises(ValidationError):
            self.payment()
    def test_early_payment_and_rollback(self):
        sub = start_trial(self.user)
        p = apply_payment(self.payment().pk)
        self.assertEqual(p.period_start, sub.trial_end)
        end = p.period_end
        with self.assertRaises(RuntimeError):
            with transaction.atomic():
                p2 = Payment.objects.create(subscription=sub, amount=100, reference='second', confirmed=True)
                apply_payment(p2.pk)
                raise RuntimeError()
        sub.refresh_from_db()
        self.assertEqual(sub.paid_until, end)
    def test_ownership_and_delete_other_session(self):
        self.login()
        other = APIClient()
        self.login(other)
        self.payment()
        stranger = User.objects.create_user('stranger')
        Payment.objects.create(subscription=stranger.subscription, amount=200, reference='private')
        result = self.client.get('/api/v1/payments/').data
        self.assertEqual(result['count'], 1)
        self.assertEqual(self.client.post('/api/v1/payments/', {'amount': 1}).status_code, 405)
        self.assertEqual(self.client.patch('/api/v1/me/', {'is_staff': True}).status_code, 405)
        self.assertEqual(self.client.delete('/api/v1/me/', {'password': 'wrong'}, format='json').status_code, 400)
        self.assertEqual(self.client.delete('/api/v1/me/', {'password': PASSWORD, 'user_id': stranger.pk}, format='json').status_code, 204)
        self.assertTrue(User.objects.filter(pk=stranger.pk).exists())
        self.assertFalse(Payment.objects.filter(reference='receipt-one').exists())
        self.assertEqual(other.get('/api/v1/me/').status_code, 401)
    def test_settings_and_disabled_user(self):
        s = SiteSettings.objects.get(pk=1)
        self.assertEqual(s.payment_phone, '255629645877')
        s.support_email = 'changed@example.test'
        s.save()
        self.assertEqual(self.client.get('/api/v1/settings/').data['support_email'], s.support_email)
        self.user.is_active = False
        self.user.save()
        r = self.client.post('/api/v1/auth/login/', {'username': 'tester', 'password': PASSWORD})
        self.assertEqual(r.status_code, 401)
        self.assertEqual(r.data['error']['code'], 'invalid_credentials')
    @override_settings(SESSION_COOKIE_SECURE=True, CSRF_COOKIE_SECURE=True, CORS_ALLOW_ALL_ORIGINS=False)
    def test_browser_csrf_origins_and_sessions(self):
        c = APIClient(enforce_csrf_checks=True)
        origin = {'HTTP_ORIGIN': 'https://soccerarena.org', 'secure': True, 'HTTP_HOST': 'api.soccerarena.org'}
        with override_settings(ALLOWED_HOSTS=['api.soccerarena.org']):
            data = {'username': 'tester', 'password': PASSWORD}
            self.assertEqual(c.post('/api/v1/auth/web/login/', data, **origin).status_code, 403)
            r = c.get('/api/v1/auth/csrf/', **origin)
            csrf = r.data['csrf_token']
            self.assertEqual(r['Access-Control-Allow-Origin'], 'https://soccerarena.org')
            bad = c.post('/api/v1/auth/web/login/', data, HTTP_X_CSRFTOKEN=csrf, **{**origin, 'HTTP_ORIGIN': 'https://evil.example'})
            self.assertEqual(bad.status_code, 403)
            self.assertNotIn('Access-Control-Allow-Origin', bad)
            r = c.post('/api/v1/auth/web/login/', data, HTTP_X_CSRFTOKEN=csrf, **origin)
            self.assertEqual(r.status_code, 200, r.content)
            self.assertTrue(r.cookies['sessionid']['secure'])
            self.assertTrue(r.cookies['sessionid']['httponly'])
            self.assertEqual(c.get('/api/v1/me/', **origin).status_code, 200)
            self.assertEqual(c.post('/api/v1/auth/logout/', **origin).status_code, 403)
            self.assertEqual(c.delete('/api/v1/me/', {'password': PASSWORD}, format='json', **origin).status_code, 403)
            self.assertEqual(c.post('/api/v1/auth/logout/', HTTP_X_CSRFTOKEN=r.data['csrf_token'], **origin).status_code, 204)
    def test_password_reset_revokes_existing_jwt(self):
        tokens = self.login()
        self.user.set_password('Different-password!48393')
        self.user.save()
        self.assertEqual(self.client.get('/api/v1/me/').status_code, 401)
        # Refresh must not resurrect the pre-reset session either.
        self.assertEqual(APIClient().post('/api/v1/auth/refresh/', {'refresh': tokens['refresh']}).status_code, 401)
    def test_admin_user_and_payment_workflow(self):
        from django.contrib.admin.sites import site
        from django.test import RequestFactory
        from accounts.admin import PaymentAdmin
        staff = User.objects.create_superuser('admin-fixture', 'admin@example.test', PASSWORD)
        c = APIClient()
        c.force_login(staff)
        for path in ['/admin/auth/user/add/', f'/admin/auth/user/{self.user.pk}/change/', '/admin/accounts/payment/add/', '/admin/accounts/sitesettings/1/change/']:
            self.assertEqual(c.get(path).status_code, 200, path)
        response = c.post('/admin/auth/user/add/', {'username': 'admincreated', 'password1': PASSWORD, 'password2': PASSWORD, 'usable_password': 'true', '_save': 'Save'})
        self.assertEqual(response.status_code, 302, response.content[:300])
        new = User.objects.get(username='admincreated')
        self.assertTrue(new.check_password(PASSWORD))
        self.assertIsNone(new.subscription.trial_start)
        p = Payment(subscription=self.user.subscription, amount=123, reference='admin-recorded', confirmed=True)
        req = RequestFactory().post('/admin/accounts/payment/add/')
        req.user = staff
        with transaction.atomic():
            site._registry[Payment].save_model(req, p, None, False)
        p.refresh_from_db()
        self.assertIsNotNone(p.applied_at)
        self.assertEqual(p.recorded_by, staff)
    def test_invalid_dates_and_phone_db_constraint(self):
        sub = self.user.subscription
        sub.trial_start = timezone.now()
        with self.assertRaises(ValidationError): sub.save()
        with self.assertRaises(IntegrityError), transaction.atomic():
            Subscription.objects.filter(pk=sub.pk).update(trial_start=timezone.now())
        with self.assertRaises(IntegrityError), transaction.atomic():
            Subscription.objects.filter(pk=sub.pk).update(phone='255629645877')
    def test_non_leap_month_and_unconfirmed(self):
        p = self.payment()
        p.confirmed = False
        p.save()
        self.assertIsNone(apply_payment(p.pk).applied_at)
        p.confirmed = True
        p.save()
        with patch('accounts.services.timezone.now', return_value=datetime(2025, 1, 31, 23, 59, tzinfo=tz.utc)):
            p = apply_payment(p.pk)
        self.assertEqual(p.period_end, datetime(2025, 2, 28, 23, 59, tzinfo=tz.utc))

    def test_registration_is_throttled(self):
        from django.core.cache import cache
        from rest_framework.throttling import ScopedRateThrottle
        from accounts.views import Register
        cache.clear()
        with patch.object(Register, 'throttle_classes', [ScopedRateThrottle]), patch.dict(ScopedRateThrottle.THROTTLE_RATES, {'register': '2/min'}):
            self.assertEqual(self.client.post('/api/v1/auth/register/', {}).status_code, 400)
            self.assertEqual(self.client.post('/api/v1/auth/register/', {}).status_code, 400)
            response = self.client.post('/api/v1/auth/register/', {})
            self.assertEqual(response.status_code, 429)
            self.assertEqual(response.data['error']['code'], 'throttled')
        cache.clear()
    def test_account_reads_do_not_consume_deletion_throttle(self):
        from django.core.cache import cache
        from rest_framework.throttling import ScopedRateThrottle
        from accounts.views import Me
        cache.clear()
        self.login()
        with patch.object(Me, 'throttle_classes', [ScopedRateThrottle]), patch.dict(ScopedRateThrottle.THROTTLE_RATES, {'reauth': '2/min'}):
            for _ in range(6):
                self.assertEqual(self.client.get('/api/v1/me/').status_code, 200)
            for _ in range(2):
                self.assertEqual(self.client.delete('/api/v1/me/', {'password': 'wrong'}, format='json').status_code, 400)
            self.assertEqual(self.client.delete('/api/v1/me/', {'password': 'wrong'}, format='json').status_code, 429)
        cache.clear()
