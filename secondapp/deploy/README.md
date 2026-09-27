# Deployment

The backend is now deployed at https://api.soccerarena.org. Use the current
[backend deployment guide](../backend/deployment/README.md) and configuration
files under `backend/deployment/`. The templates and preparation notes below
predate the live deployment and are retained as historical frontend/release
planning context; they are not the installed backend configuration.

## Original preparation notes

Verified local toolchain: Python 3.14.2, Django 5.2.17, DRF 3.18.1,
SimpleJWT 5.5.1, PostgreSQL 17 container, Flutter 3.47.5 / Dart 3.13.4.
Use backend/requirements.txt and flutter/pubspec.lock. No production user, fee,
payment or stream is preloaded. This release remains blocked for Android and web
content; review docs/verification.md before any release decision.

## Local

From secondapp:

```sh
python3 -m venv /tmp/arena-venv
/tmp/arena-venv/bin/pip install -r backend/requirements.txt
export DEBUG=1
export FRONTEND_ORIGINS=http://127.0.0.1:8080
/tmp/arena-venv/bin/python backend/manage.py migrate
/tmp/arena-venv/bin/python backend/manage.py createcachetable
/tmp/arena-venv/bin/python backend/manage.py createsuperuser
/tmp/arena-venv/bin/python backend/manage.py runserver 127.0.0.1:8000
```

Use a second terminal for `cd flutter && flutter run -d web-server --web-hostname
127.0.0.1 --web-port 8080 --dart-define=API_BASE_URL=http://127.0.0.1:8000`.
Use the same hostname on both local origins so SameSite cookies work.
No credentials go in Dart defines. Local SQLite is not a concurrency substitute.

## VPS checklist for the owner

1. Create a dedicated unprivileged OS account, `/srv/soccerarena/releases/` and
   a virtual environment. Install PostgreSQL, Nginx and a TLS client. Keep DB and
   Gunicorn off public network interfaces. Create database/role with PostgreSQL's
   `createuser --pwprompt soccerarena` and `createdb -O soccerarena soccerarena`.
   Do not pass real passwords on command lines or commit them.
2. Copy a reviewed release directory. Install pinned requirements in the venv.
   Create `/etc/soccerarena/backend.env` from backend/.env.example, mode 0600,
   owned by the service account. Generate a random Django secret. The environment
   is read by systemd; Django deliberately does not load arbitrary .env files.
3. With the same environment loaded, run `manage.py migrate`, `createcachetable`,
   `collectstatic --noinput`, `check --deploy`, and `createsuperuser`.
   Migrations create default contacts once; later deployment preserves edits.
4. Build `flutter build web --release
   --dart-define=API_BASE_URL=https://api.soccerarena.org`. Configure current symlink
   to the release. Copy service and proxy snippet to the locations in the examples.
5. Point both DNS names to the VPS; configure ports 80/443, issue certificates for
   both hostnames, then install the reviewed TLS Nginx configuration. Check
   `nginx -t` and `systemd-analyze verify` before enabling services.
6. Check HTTPS `/health/`, admin login, production CORS/CSRF origins, registration,
   manual receipt entry and expiry. Check that nonexistent `.js`, assets and WASM
   return 404, while SPA routes load index.html. Test credentialed browser requests
   across the actual HTTPS domains; local integration is not production verification.

Database-backed DRF throttles are process-shared but approximate under races; Nginx
adds an independent IP limit. Restrict admin network access if appropriate for the
operator. No Celery or Redis is needed for access expiry.

## Backups and rollback

Before migration, take an encrypted `pg_dump -Fc` backup, store outside the VPS,
restrict access, record application version, and test `pg_restore` into a separate
database. Backups contain personal data and require a retention/deletion policy.
Never expose them through Nginx. Back up secret configuration separately.

For rollback stop the service, point `current` at the prior reviewed release,
restore its matching virtual environment/static build, and restart. Roll back the
database only using a tested migration reversal or restore into a new database;
restoring a backup can lose newly recorded payments. Reconcile those before service
resumes. Do not blindly rerun or delete applied receipts.

Prune expired SimpleJWT outstanding tokens with `manage.py flushexpiredtokens` and
Django sessions with `manage.py clearsessions` as routine maintenance. Neither job
controls content expiry. Payment deletion policy and auth transport details are in
docs/API.md and docs/admin-guide.md. Android signing/split instructions are in
android_integration/README.md.
