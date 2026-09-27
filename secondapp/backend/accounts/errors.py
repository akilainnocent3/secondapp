from rest_framework.views import exception_handler as drf_handler
from rest_framework.exceptions import APIException
class ServiceUnavailable(APIException):
    status_code = 503
    default_detail = 'Content provider integration is not yet available.'
    default_code = 'content_unavailable'
def exception_handler(exc, context):
    response = drf_handler(exc, context)
    if response is not None:
        code = getattr(exc, 'default_code', 'request_failed')
        detail = response.data
        if isinstance(detail, dict) and 'detail' in detail:
            code = getattr(detail['detail'], 'code', code)
        response.data = {'error': {'code': code, 'message': str(detail.get('detail', 'Please check your details.')) if isinstance(detail, dict) else 'Request failed.', 'fields': detail}}
        response['Cache-Control'] = 'no-store'
    return response
