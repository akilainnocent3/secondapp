from concurrent.futures import ThreadPoolExecutor
from threading import Barrier
from datetime import timedelta
from unittest import skipUnless
from django.contrib.auth.models import User
from django.db import connection, connections
from django.test import TransactionTestCase
from accounts.models import Subscription, Payment
from accounts.services import start_trial, apply_payment

@skipUnless(connection.vendor == 'postgresql', 'Requires real PostgreSQL row locks')
class ConcurrencyTests(TransactionTestCase):
    def setUp(self):
        self.user = User.objects.create_user('parallel')
    def run_parallel(self, functions):
        barrier = Barrier(len(functions))
        def run(fn):
            connections.close_all()
            try:
                barrier.wait(timeout=10)
                return fn()
            finally:
                connections.close_all()
        with ThreadPoolExecutor(max_workers=len(functions)) as pool:
            return list(pool.map(run, functions))
    def test_first_login(self):
        periods = self.run_parallel([lambda: start_trial(self.user).trial_start] * 2)
        self.assertEqual(periods[0], periods[1])
        sub = Subscription.objects.get(user=self.user)
        self.assertEqual(sub.trial_end - sub.trial_start, timedelta(days=7))
    def test_distinct_and_duplicate_payments(self):
        p = [Payment.objects.create(subscription=self.user.subscription, amount=100, reference=f'parallel-{i}', confirmed=True) for i in range(2)]
        self.run_parallel([lambda: apply_payment(p[0].pk), lambda: apply_payment(p[1].pk)])
        periods = list(Payment.objects.order_by('period_start'))
        self.assertEqual(periods[0].period_end, periods[1].period_start)
        end = periods[1].period_end
        self.run_parallel([lambda: apply_payment(p[0].pk)] * 2)
        self.assertEqual(Subscription.objects.get(user=self.user).paid_until, end)
    def test_simultaneous_http_login_and_refresh_replay(self):
        from rest_framework.test import APIClient
        self.user.set_password('Concurrent-test-password!45')
        self.user.save()
        def login():
            response = APIClient().post('/api/v1/auth/login/', {'username': self.user.username, 'password': 'Concurrent-test-password!45'})
            self.assertEqual(response.status_code, 200)
            return response.data
        results = self.run_parallel([login, login])
        self.assertEqual(results[0]['account']['entitlement']['trial_start'], results[1]['account']['entitlement']['trial_start'])
        def refresh():
            return APIClient().post('/api/v1/auth/refresh/', {'refresh': results[0]['refresh']}).status_code
        self.assertEqual(sorted(self.run_parallel([refresh, refresh])), [200, 401])
