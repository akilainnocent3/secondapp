from django.contrib.auth.models import User
from django.test import TestCase, override_settings
from rest_framework.test import APIClient


@override_settings(
    CORS_ALLOW_ALL_ORIGINS=True,
    ALLOWED_HOSTS=['api.soccerarena.org'],
    SESSION_COOKIE_SECURE=True,
    CSRF_COOKIE_SECURE=True,
    SESSION_COOKIE_SAMESITE='None',
    CSRF_COOKIE_SAMESITE='None',
)
class OpenOriginTests(TestCase):
    password = 'CORS-test-only!river-7492'
    origins = ['https://unrelated.example', 'http://localhost:5173', 'capacitor://localhost', 'null']

    def setUp(self):
        User.objects.create_user('cors-user', password=self.password)

    def headers(self, origin):
        return {'HTTP_ORIGIN': origin, 'HTTP_HOST': 'api.soccerarena.org', 'secure': True}

    def assert_cors(self, response, origin):
        self.assertEqual(response['Access-Control-Allow-Origin'], origin)
        self.assertEqual(response['Access-Control-Allow-Credentials'], 'true')
        self.assertIn('origin', response['Vary'].lower())

    def test_preflight_all_routes_and_methods(self):
        for origin in self.origins:
            for path, method in [('/api/v1/auth/login/', 'POST'), ('/api/v1/auth/web/login/', 'POST'), ('/api/v1/me/', 'DELETE'), ('/api/v1/payments/', 'GET')]:
                with self.subTest(origin=origin, path=path):
                    response = self.client.options(path, HTTP_ACCESS_CONTROL_REQUEST_METHOD=method,
                        HTTP_ACCESS_CONTROL_REQUEST_HEADERS='authorization,content-type,x-csrftoken', **self.headers(origin))
                    self.assertEqual(response.status_code, 200)
                    self.assert_cors(response, origin)
                    self.assertIn(method, response['Access-Control-Allow-Methods'])
                    for header in ['authorization', 'content-type', 'x-csrftoken']:
                        self.assertIn(header, response['Access-Control-Allow-Headers'])

    def test_public_and_error_responses_have_cors(self):
        for origin in self.origins:
            for path, status in [('/health/', 200), ('/api/v1/settings/', 200), ('/api/v1/me/', 401), ('/api/v1/not-found/', 404)]:
                with self.subTest(origin=origin, path=path):
                    response = self.client.get(path, **self.headers(origin))
                    self.assertEqual(response.status_code, status)
                    self.assert_cors(response, origin)

    def test_cookie_login_logout_all_origins_and_csrf_required(self):
        for origin in self.origins:
            with self.subTest(origin=origin):
                client = APIClient(enforce_csrf_checks=True)
                headers = self.headers(origin)
                data = {'username': 'cors-user', 'password': self.password}
                token = client.get('/api/v1/auth/csrf/', **headers).data['csrf_token']
                denied = client.post('/api/v1/auth/web/login/', data, **headers)
                self.assertEqual(denied.status_code, 403)
                self.assert_cors(denied, origin)
                response = client.post('/api/v1/auth/web/login/', data, HTTP_X_CSRFTOKEN=token, **headers)
                self.assertEqual(response.status_code, 200, response.content)
                self.assert_cors(response, origin)
                self.assertEqual(response.cookies['sessionid']['samesite'], 'None')
                self.assertTrue(response.cookies['sessionid']['secure'])
                self.assertTrue(response.cookies['sessionid']['httponly'])
                self.assertIn('; Partitioned', response.cookies['sessionid'].OutputString())
                self.assertIn('; Partitioned', response.cookies['csrftoken'].OutputString())
                self.assertEqual(client.get('/api/v1/me/', **headers).status_code, 200)
                self.assertEqual(client.post('/api/v1/auth/logout/', **headers).status_code, 403)
                logged_out = client.post('/api/v1/auth/logout/', HTTP_X_CSRFTOKEN=response.data['csrf_token'], **headers)
                self.assertEqual(logged_out.status_code, 204)
                self.assertIn('; Partitioned', logged_out.cookies['sessionid'].OutputString())
                self.assertEqual(logged_out.cookies['sessionid']['max-age'], 0)

    def test_cookie_partitioning_is_limited_to_secure_open_api(self):
        headers = self.headers('https://unrelated.example')
        response = self.client.get('/admin/login/', **headers)
        self.assertNotIn('Partitioned', response.cookies['csrftoken'].OutputString())
        response = self.client.get('/api/v1/auth/csrf/', **{**headers, 'secure': False})
        self.assertNotIn('Partitioned', response.cookies['csrftoken'].OutputString())
        with override_settings(CORS_ALLOW_ALL_ORIGINS=False):
            response = self.client.get('/api/v1/auth/csrf/', **headers)
            self.assertNotIn('Partitioned', response.cookies['csrftoken'].OutputString())

    def test_admin_keeps_standard_csrf_origin_checks(self):
        client = APIClient(enforce_csrf_checks=True)
        headers = self.headers('https://unrelated.example')
        token = client.get('/api/v1/auth/csrf/', **headers).data['csrf_token']
        response = client.post('/admin/login/', {'username': 'cors-user', 'password': self.password}, HTTP_X_CSRFTOKEN=token, **headers)
        self.assertEqual(response.status_code, 403)
        self.assertNotIn('Access-Control-Allow-Origin', response)

    def test_bearer_authentication_from_any_origin_and_without_origin(self):
        for origin in [*self.origins, None]:
            with self.subTest(origin=origin):
                client = APIClient(enforce_csrf_checks=True)
                headers = self.headers(origin)
                if origin is None:
                    del headers['HTTP_ORIGIN']
                response = client.post('/api/v1/auth/login/', {'username': 'cors-user', 'password': self.password}, **headers)
                self.assertEqual(response.status_code, 200)
                response = client.get('/api/v1/me/', HTTP_AUTHORIZATION='Bearer ' + response.data['access'], **headers)
                self.assertEqual(response.status_code, 200)
                if origin is not None:
                    self.assert_cors(response, origin)
