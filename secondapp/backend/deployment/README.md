# SoccerArena backend deployment

Deployed on 2026-09-27 to `139.59.93.218`.

- API: https://api.soccerarena.org/api/v1/
- Database health: https://api.soccerarena.org/health/
- Django admin: https://api.soccerarena.org/admin/
- Service: `soccerarena.service`, enabled at boot; Gunicorn runs two workers as
  the unprivileged `soccerarena` account behind Nginx.
- Database and role: `soccerarena`, PostgreSQL 17 on loopback port 5432. The role
  has no superuser, database-creation, or role-creation privileges.
- Secrets: `/etc/soccerarena/backend.env`, root-owned mode `0600`, containing the
  supplied database password and a generated Django secret. Never commit it.
- Active release: `/srv/soccerarena/current`; releases are under
  `/srv/soccerarena/releases/`, with a venv at `/srv/soccerarena/venv`.
- Gunicorn sockets: `/run/soccerarena/gunicorn.sock` and
  `/run/soccerarena/control.sock`. Gunicorn has no public TCP listener.
- Nginx site: `/etc/nginx/sites-available/api.soccerarena.org`, with the proxy
  snippet at `/etc/nginx/snippets/soccerarena-proxy.conf`.

## HTTPS and DNS

The A record already resolves to this host and a Let's Encrypt certificate is
installed. HTTP redirects to HTTPS. `certbot.timer` renews the certificate; a
deploy hook validates and reloads Nginx. The renewal dry run passed.

The installation includes `soccerarena-https.service` and a DNS-waiting timer for
initial provisioning. The timer automatically disabled itself after HTTPS was
successfully enabled. It is no longer needed for renewal.

## CORS and web/native authentication

`CORS_ALLOW_ALL_ORIGINS=1` applies to `/api/` and `/health/` in production as well
as development. Responses echo the requesting Origin and allow credentials;
`Vary: Origin` prevents shared caches from mixing origins. Preflights allow the
standard API methods and `Authorization`, `Content-Type`, and `X-CSRFToken`.

Native or web clients can use `POST /api/v1/auth/login/` for JWT authentication,
then send `Authorization: Bearer <access>` and rotate refresh tokens through
`POST /api/v1/auth/refresh/`. Native clients do not need an Origin header.

Cookie-based web clients use `credentials: 'include'`, fetch
`GET /api/v1/auth/csrf/`, then pass its `csrf_token` in `X-CSRFToken` when posting
to `auth/web/login/`. Login returns a rotated token, which must be used for later
unsafe session requests such as logout and deletion. API origin checks follow
the unrestricted CORS setting while cookie and CSRF-token validation remain.
Django admin retains standard CSRF origin checks.

HTTPS API cookies have `Secure`, `HttpOnly`, `SameSite=None`, and `Partitioned`.
Partitioning fixes Chromium's third-party-cookie rejection while keeping each
top-level site's login separate. See the [CHIPS documentation](https://privacysandbox.google.com/cookies/chips).
Older browsers or user settings that disable all cookies may still require the
JWT flow. Authentication, validation, permissions, and rate limits still apply.

## Operations

Run these commands as root (or with `sudo`):

```sh
systemctl status soccerarena.service
systemctl restart soccerarena.service
journalctl -u soccerarena.service -n 100 --no-pager
/srv/soccerarena/current/deployment/manage check --deploy
/srv/soccerarena/current/deployment/manage createsuperuser
certbot renew --cert-name api.soccerarena.org --dry-run --no-random-sleep-on-renew
```

The `manage` wrapper loads the private environment and runs Django as the service
account. No admin user was pre-created. Application edits in the workspace do not
automatically change the active release. To redeploy reviewed changes from the
backend directory:

```sh
/srv/soccerarena/venv/bin/python deployment/install.py /etc/soccerarena/backend.env
```

Before deploying schema changes, take a protected database backup and review the
migration plan. The installer copies a new release, installs pinned dependencies,
runs the suite on a disposable PostgreSQL database/role, applies migrations,
creates the shared throttle-cache table, collects static files, verifies Nginx
and systemd configuration, and switches the release symlink. It preserves the
existing database password and Django secret.

If rolling back application code, point `/srv/soccerarena/current` to the reviewed
previous release and restart `soccerarena.service`. Verify database compatibility
first; changing the symlink does not reverse schema changes.

## Verification and known limitations

- 26 automated tests passed on PostgreSQL, including concurrent first login,
  payment application, refresh replay, account isolation/deletion, and CORS/CSRF.
- 55 live HTTPS checks through Nginx passed: health, settings, registration,
  login, JWT refresh/replay, account/access/payment reads, logout/revocation,
  deletion, protected/error responses, admin/static routes, and six CORS origins.
- 26 real Chromium checks passed from `http://localhost:5173` and
  `https://unrelated-browser.example`, including cookie login with normal browser
  privacy protections enabled. Temporary test accounts were removed.
- All 33 migrations are applied; PostgreSQL connectivity, the `api_cache` table,
  Nginx syntax, systemd configuration, and certificate renewal were checked.
- `check --deploy` reports only optional HSTS subdomain/preload warnings. Neither
  policy was enabled for unverified child domains. Nginx also reports pre-existing
  warnings in other sites' configurations, which do not prevent successful checks.
- `GET /api/v1/content/` intentionally returns `503 content_unavailable` after
  entitlement checks because the repository has no content-provider integration.
  The deployment does not add playback or upstream content functionality.

Repeat the live API check with:

```sh
python3 deployment/smoke_test.py https://api.soccerarena.org
PLAYWRIGHT_MODULE=/path/to/playwright node deployment/browser_smoke.cjs
```

These checks create and delete a temporary account; repeated runs consume normal
registration/login limits. Run `manage.py test --settings=config.test_settings`
only against a disposable PostgreSQL database using a test role with CREATEDB.

During installation, old archived system journals were trimmed to retain about
500 MB, freeing approximately 1.4 GB. No other site's application or database was
changed.
