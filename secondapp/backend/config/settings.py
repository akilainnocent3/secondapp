import os
from pathlib import Path
from datetime import timedelta
BASE_DIR = Path(__file__).resolve().parent.parent
DEBUG = os.environ.get('DEBUG', '0') == '1'
SECRET_KEY = os.environ.get('DJANGO_SECRET_KEY', '')
if not SECRET_KEY:
    if not DEBUG:
        raise RuntimeError('DJANGO_SECRET_KEY is required')
    SECRET_KEY = 'local-development-only-not-for-production-1234567890'
ALLOWED_HOSTS = os.environ.get('ALLOWED_HOSTS', 'localhost,127.0.0.1,testserver').split(',')
INSTALLED_APPS = ['django.contrib.admin', 'django.contrib.auth', 'django.contrib.contenttypes', 'django.contrib.sessions', 'django.contrib.messages', 'django.contrib.staticfiles', 'corsheaders', 'rest_framework', 'rest_framework_simplejwt.token_blacklist', 'accounts.apps.AccountsConfig']
MIDDLEWARE = ['corsheaders.middleware.CorsMiddleware', 'django.middleware.security.SecurityMiddleware', 'accounts.middleware.APICookieMiddleware', 'django.contrib.sessions.middleware.SessionMiddleware', 'django.middleware.common.CommonMiddleware', 'django.middleware.csrf.CsrfViewMiddleware', 'django.contrib.auth.middleware.AuthenticationMiddleware', 'django.contrib.messages.middleware.MessageMiddleware', 'django.middleware.clickjacking.XFrameOptionsMiddleware']
ROOT_URLCONF = 'config.urls'
TEMPLATES = [{'BACKEND': 'django.template.backends.django.DjangoTemplates', 'DIRS': [], 'APP_DIRS': True, 'OPTIONS': {'context_processors': ['django.template.context_processors.request', 'django.contrib.auth.context_processors.auth', 'django.contrib.messages.context_processors.messages']}}]
WSGI_APPLICATION = 'config.wsgi.application'
DATABASES = {'default': {'ENGINE': 'django.db.backends.sqlite3', 'NAME': BASE_DIR / 'local.sqlite3'}}
if os.environ.get('PGHOST'):
    DATABASES['default'] = {'ENGINE': 'django.db.backends.postgresql', 'HOST': os.environ['PGHOST'], 'PORT': os.environ.get('PGPORT', '5432'), 'NAME': os.environ.get('PGDATABASE', 'soccerarena'), 'USER': os.environ.get('PGUSER', 'soccerarena'), 'PASSWORD': os.environ['PGPASSWORD'], 'CONN_MAX_AGE': 60}
AUTH_PASSWORD_VALIDATORS = [{'NAME': 'django.contrib.auth.password_validation.' + name} for name in ['UserAttributeSimilarityValidator', 'MinimumLengthValidator', 'CommonPasswordValidator', 'NumericPasswordValidator']]
LANGUAGE_CODE = 'en-us'
TIME_ZONE = 'Africa/Dar_es_Salaam'
USE_TZ = True
STATIC_URL = '/static/'
STATIC_ROOT = BASE_DIR / 'staticfiles'
DEFAULT_AUTO_FIELD = 'django.db.models.BigAutoField'
CORS_ALLOWED_ORIGINS = os.environ.get('FRONTEND_ORIGINS', 'https://soccerarena.org').split(',')
# Public API clients may run on any web origin, including localhost and WebViews.
CORS_ALLOW_ALL_ORIGINS = os.environ.get('CORS_ALLOW_ALL_ORIGINS', '1') == '1'
CORS_URLS_REGEX = r'^/(api/|health/)'
CORS_ALLOW_CREDENTIALS = True
CORS_EXPOSE_HEADERS = ['Retry-After', 'WWW-Authenticate']
CSRF_TRUSTED_ORIGINS = CORS_ALLOWED_ORIGINS
SESSION_COOKIE_SECURE = not DEBUG
SESSION_COOKIE_HTTPONLY = True
SESSION_COOKIE_SAMESITE = 'None' if CORS_ALLOW_ALL_ORIGINS and not DEBUG else 'Lax'
CSRF_COOKIE_SECURE = not DEBUG
CSRF_COOKIE_HTTPONLY = True
CSRF_COOKIE_SAMESITE = SESSION_COOKIE_SAMESITE
# HTTP bootstrap is needed until DNS points here and a TLS certificate is issued.
SECURE_SSL_REDIRECT = os.environ.get('SECURE_SSL_REDIRECT', '0' if DEBUG else '1') == '1'
SECURE_PROXY_SSL_HEADER = ('HTTP_X_FORWARDED_PROTO', 'https')
SECURE_HSTS_SECONDS = 31536000 if SECURE_SSL_REDIRECT and not DEBUG else 0
SECURE_CONTENT_TYPE_NOSNIFF = True
X_FRAME_OPTIONS = 'DENY'
SESSION_COOKIE_AGE = 7 * 86400
REST_FRAMEWORK = {
 'DEFAULT_AUTHENTICATION_CLASSES': ['accounts.authentication.CurrentJWTAuthentication', 'accounts.authentication.CurrentSessionAuthentication'],
 'DEFAULT_PERMISSION_CLASSES': ['rest_framework.permissions.IsAuthenticated'],
 'DEFAULT_THROTTLE_CLASSES': ['rest_framework.throttling.ScopedRateThrottle'],
 'DEFAULT_THROTTLE_RATES': {'login': '10/min', 'register': '5/hour', 'reauth': '5/min', 'refresh': '30/min'},
 'DEFAULT_PAGINATION_CLASS': 'rest_framework.pagination.PageNumberPagination', 'PAGE_SIZE': 20,
 'EXCEPTION_HANDLER': 'accounts.errors.exception_handler',
}
SIMPLE_JWT = {'ACCESS_TOKEN_LIFETIME': timedelta(minutes=5), 'REFRESH_TOKEN_LIFETIME': timedelta(days=7), 'ROTATE_REFRESH_TOKENS': True, 'BLACKLIST_AFTER_ROTATION': True, 'UPDATE_LAST_LOGIN': False, 'CHECK_REVOKE_TOKEN': True}
# Shared process-safe throttling without Redis; run createcachetable on deployment.
CACHES = {'default': {'BACKEND': 'django.core.cache.backends.db.DatabaseCache', 'LOCATION': 'api_cache'}}

CSRF_FAILURE_VIEW = 'accounts.views.csrf_failure'

# Request exception details may contain receipt/identity values. Keep production
# operational logs minimal; reproduce failures with synthetic test data instead.
LOGGING = {
    'version': 1,
    'disable_existing_loggers': False,
    'filters': {'safe_request': {'()': 'accounts.logging.SafeRequestFilter'}},
    'handlers': {'safe_console': {'class': 'logging.StreamHandler', 'filters': ['safe_request']}},
    'loggers': {
        'django.request': {'handlers': ['safe_console'], 'level': 'WARNING', 'propagate': False},
        'django.security': {'handlers': ['safe_console'], 'level': 'WARNING', 'propagate': False},
    },
}
