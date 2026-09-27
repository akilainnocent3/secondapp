"""Keep API login usable when browsers block ordinary third-party cookies."""

from http.cookies import Morsel

from django.conf import settings
from django.utils.deprecation import MiddlewareMixin


class PartitionedMorsel(Morsel):
    # Python 3.14 adds this natively; the deployed Python 3.13 needs a local
    # subclass. Do not modify the standard library's process-wide cookie parser.
    _reserved = {**Morsel._reserved, 'partitioned': 'Partitioned'}
    _flags = Morsel._flags | {'partitioned'}


class APICookieMiddleware(MiddlewareMixin):
    def process_response(self, request, response):
        if (settings.CORS_ALLOW_ALL_ORIGINS and request.is_secure()
                and request.path_info.startswith('/api/v1/')):
            for name in [settings.SESSION_COOKIE_NAME, settings.CSRF_COOKIE_NAME]:
                if name not in response.cookies:
                    continue
                original = response.cookies[name]
                cookie = PartitionedMorsel()
                cookie.set(original.key, original.value, original.coded_value)
                cookie.update(original)
                cookie['partitioned'] = True
                cookie['secure'] = True
                cookie['samesite'] = 'None'
                response.cookies[name] = cookie
        return response
