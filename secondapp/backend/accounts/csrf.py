"""Match API session origin checks to the configured CORS policy.

Cookie and token validation still applies. Django admin keeps its normal origin
policy. This applies only to the API's explicitly unrestricted deployment mode.
"""

from django.conf import settings
from django.middleware.csrf import CsrfViewMiddleware
from django.utils.decorators import decorator_from_middleware
from rest_framework.authentication import CSRFCheck


class APIOriginPolicy:
    def _origin_verified(self, request):
        if settings.CORS_ALLOW_ALL_ORIGINS and request.path_info.startswith('/api/v1/'):
            return True
        return super()._origin_verified(request)


class APICsrfViewMiddleware(APIOriginPolicy, CsrfViewMiddleware):
    pass


class APICSRFCheck(APIOriginPolicy, CSRFCheck):
    pass


api_csrf_protect = decorator_from_middleware(APICsrfViewMiddleware)
