"""Exercise the live API through Nginx and remove only the test account created.

Usage: python3 deployment/smoke_test.py [http://127.0.0.1]
Before DNS propagates, requests still carry Host: api.soccerarena.org.
"""

import http.client
import json
import secrets
import sys
from urllib.parse import urlsplit


base = urlsplit(sys.argv[1] if len(sys.argv) > 1 else 'http://127.0.0.1')
origin = 'https://unrelated-client.example'
count = 0


def request(method, path, expected, data=None, token=None, source=origin, extra=None):
    global count
    cls = http.client.HTTPSConnection if base.scheme == 'https' else http.client.HTTPConnection
    connection = cls(base.hostname, base.port, timeout=15)
    headers = {'Host': 'api.soccerarena.org'}
    if source is not None:
        headers['Origin'] = source
    if data is not None:
        headers['Content-Type'] = 'application/json'
    if token:
        headers['Authorization'] = 'Bearer ' + token
    headers.update(extra or {})
    connection.request(method, path, body=json.dumps(data) if data is not None else None, headers=headers)
    response = connection.getresponse()
    body = response.read()
    status = response.status
    result_headers = {key.lower(): value for key, value in response.getheaders()}
    connection.close()
    assert status == expected, f'{method} {path}: expected {expected}, received {status}'
    if source is not None and (path.startswith('/api/') or path == '/health/'):
        assert result_headers.get('access-control-allow-origin') == source, f'CORS origin missing on {path}'
        assert result_headers.get('access-control-allow-credentials') == 'true', f'CORS credentials missing on {path}'
        assert 'origin' in result_headers.get('vary', '').lower()
    count += 1
    return json.loads(body) if body and 'application/json' in result_headers.get('content-type', '') else None, result_headers


assert request('GET', '/health/', 200)[0] == {'status': 'ok'}
request('GET', '/api/v1/settings/', 200)
request('GET', '/api/v1/auth/csrf/', 200)
request('GET', '/static/admin/css/base.css', 200, source=None)
request('GET', '/admin/login/', 200, source=None)
for source in [origin, 'https://soccerarena.org', 'http://localhost:5173', 'http://127.0.0.1:8080', 'capacitor://localhost', 'null']:
    for path, method in [('/api/v1/auth/register/', 'POST'), ('/api/v1/auth/web/login/', 'POST'), ('/api/v1/me/', 'DELETE'), ('/api/v1/payments/', 'GET')]:
        _, headers = request('OPTIONS', path, 200, source=source, extra={
            'Access-Control-Request-Method': method,
            'Access-Control-Request-Headers': 'authorization,content-type,x-csrftoken',
        })
        assert method in headers['access-control-allow-methods']
        for header in ['authorization', 'content-type', 'x-csrftoken']:
            assert header in headers['access-control-allow-headers']
    request('GET', '/api/v1/me/', 401, source=source)
request('GET', '/api/v1/not-found/', 404)
request('GET', '/api/v1/settings/', 200, source=None)

username = 'deploycheck_' + secrets.token_hex(6)
password = secrets.token_urlsafe(28)
created = False
deleted = False
try:
    request('POST', '/api/v1/auth/register/', 201, data={
        'username': username, 'email': username + '@example.test', 'full_name': 'Deployment Test',
        'phone': '+120255501' + str(secrets.randbelow(100)).zfill(2),
        'password': password, 'password_confirmation': password,
    })
    created = True
    request('POST', '/api/v1/auth/login/', 401, data={'username': username, 'password': 'wrong'})
    credentials = {'username': username, 'password': password}
    tokens, _ = request('POST', '/api/v1/auth/login/', 200, data=credentials)
    access = tokens['access']
    assert tokens['account']['entitlement']['status'] == 'active_trial'
    first_trial = tokens['account']['entitlement']['trial_start']
    for path in ['me', 'access', 'payments']:
        result, headers = request('GET', f'/api/v1/{path}/', 200, token=access)
        assert headers['cache-control'] == 'no-store'
        if path == 'payments':
            assert result['count'] == 0
    unavailable, _ = request('GET', '/api/v1/content/', 503, token=access)
    assert unavailable['error']['code'] == 'content_unavailable'
    request('POST', '/api/v1/payments/', 405, data={'amount': 1}, token=access)
    refreshed, _ = request('POST', '/api/v1/auth/refresh/', 200, data={'refresh': tokens['refresh']})
    request('POST', '/api/v1/auth/refresh/', 401, data={'refresh': tokens['refresh']})
    request('GET', '/api/v1/me/', 200, token=refreshed['access'], source=None)
    request('POST', '/api/v1/auth/logout/', 204, data={}, token=refreshed['access'])
    request('GET', '/api/v1/me/', 401, token=access)
    request('POST', '/api/v1/auth/refresh/', 401, data={'refresh': refreshed['refresh']})
    tokens, _ = request('POST', '/api/v1/auth/login/', 200, data=credentials, source=None)
    assert tokens['account']['entitlement']['trial_start'] == first_trial
    request('DELETE', '/api/v1/me/', 400, data={'password': 'wrong'}, token=tokens['access'])
    request('DELETE', '/api/v1/me/', 204, data={'password': password}, token=tokens['access'])
    deleted = True
    request('GET', '/api/v1/me/', 401, token=tokens['access'])
finally:
    if created and not deleted:
        tokens, _ = request('POST', '/api/v1/auth/login/', 200, data={'username': username, 'password': password})
        request('DELETE', '/api/v1/me/', 204, data={'password': password}, token=tokens['access'])
        deleted = True

print(f'PASS: {count} live HTTP checks through Nginx; temporary account removed.')
print('Confirmed existing limitation: /api/v1/content/ returns 503 content_unavailable.')
