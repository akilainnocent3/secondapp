# API v1

Base: `https://api.soccerarena.org/api/v1/`. JSON request/response bodies; trailing
slashes are required. All account responses are `Cache-Control: no-store`.
Times are aware ISO-8601; access responses include UTC server time. Client clocks
are not authoritative. Effective expiry is the latest trial/paid end; equality
with server time is expired. Suspension takes precedence. Disabled users cannot
authenticate. No endpoint accepts another customer's ID for account operations.

| Method/path | Request | Response / permission |
| --- | --- | --- |
| GET settings/ | — | Public support_email, payment_phone, instructions |
| POST auth/register/ | username, email, full_name, phone, password, password_confirmation | 201 message; no session or started trial |
| GET auth/csrf/ | credentialed request | csrf_token and host-only CSRF cookie |
| POST auth/web/login/ | username, password; X-CSRFToken | account, rotated csrf_token; HttpOnly session cookie |
| POST auth/login/ | username, password | account, access, refresh; native or web bearer authentication |
| POST auth/refresh/ | refresh | account, new access and refresh; old refresh blacklisted |
| POST auth/logout/ | empty JSON | 204; all account sessions revoked |
| GET me/ | authenticated | username, email, full_name, phone, entitlement |
| DELETE me/ | password | 204; permanent own-account deletion |
| GET access/ | authenticated | entitlement object below |
| GET payments/?page=1 | authenticated | count, next, previous, results; 20 per page |
| GET content/ | active entitlement | Currently 503 content_unavailable; provider integration unfinished |
| GET /health/ | — | `{ "status": "ok" }` after DB connectivity check |

Username is case-insensitive and normalized to lowercase by registration/admin.
Email comparisons are case-insensitive; unique expression indexes enforce both at
the database. Admin users may have blank email/phone; customer registration requires
them. Phone validation uses phonenumbers and stores E.164, with a database canonical
format constraint and uniqueness. Full name is stored intact in Subscription.

An account response contains:

```json
{
  "username": "example",
  "email": "example@example.test",
  "full_name": "Example",
  "phone": "+255629645878",
  "entitlement": {
    "status": "active_trial",
    "allowed": true,
    "expires_at": "2026-10-04T12:00:00Z",
    "server_time": "2026-09-27T12:00:00Z",
    "trial_start": "2026-09-27T12:00:00Z",
    "trial_end": "2026-10-04T12:00:00Z",
    "paid_until": null,
    "reason": "",
    "max_staleness_seconds": 60
  }
}
```

This is a schema example, not production fixture data. Status values: unstarted,
active_trial, active_paid, expired, suspended. Suspension reason is returned only
after authentication. Failed login uses the same message for nonexistent, inactive
and incorrect-password accounts.

Payment results: id, decimal-string amount, currency, paid_at, reference, months,
confirmed, period_start, period_end, applied_at. No note, staff identity or other
customer records are exposed. A pending receipt has no applied period. Clients
cannot create/update payments or change access dates/staff privileges.

Errors use `{ "error": { "code": "...", "message": "...", "fields": {} } }`.
Validation fields can contain lists. Codes include invalid, invalid_credentials,
authentication_expired, session_revoked, csrf_failed, throttled,
subscription_expired, subscription_suspended and content_unavailable. 401 means
identity must be restored or reauthenticated; 403 subscription failures must not
trigger token refresh. 503 content_unavailable is an unfinished provider adapter,
not an expired subscription. Network errors are local `offline` failures.

## Session policy

Access JWT lifetime is five minutes; refresh is seven days, rotated once
under a subscription row lock. Tokens carry an auth version, never trusted paid
claims. Current activation/version/password hash are checked. Logout increments
the version and invalidates all native tokens and API cookie sessions across devices.
Password reset invalidates both Django session hashes and JWT password hashes.
Expiry/suspension does not revoke identity: old credentials remain usable only for
restricted account operations and cannot bypass current content permissions.

Web uses credentialed BrowserClient requests, a CSRF token held in memory and a
Secure HttpOnly host-only session cookie. The deployed API allows all CORS origins,
including localhost and unrelated web domains. HTTPS API session and CSRF cookies
use SameSite=None and Partitioned so supported browsers can accept them despite
third-party-cookie blocking. Each top-level site gets an independent cookie login.
CSRF token bootstrap is readable in JSON from any allowed origin; cookie and token
validation still applies. Login rotates the token; the client replaces the old one. Browser secrets are
never stored in localStorage or shared_preferences. Public contacts are cached there
independently. Register has no identity/cookie side effects; browser login is explicitly
CSRF-protected even before authentication.

## Deletion and retention

Deletion verifies the current password, deletes User, cascades Subscription and
Payment records, then clears the caller's Django session. Other sessions fail their
next database-backed identity check. Outstanding signed JWTs cannot recreate users.
Django's old session rows are unusable and expire through clearsessions; they are not
an account-retention mechanism. Operators must apply an explicit backup retention
policy; live database deletion does not retroactively rewrite encrypted backups.

## Enforcement boundary

The new content endpoint has server entitlement permission but no upstream adapter.
Do not mistake its permission tests for media playback tests. No SoccerArena token is
sent to existing streaming hosts. No arbitrary URL proxy exists. Revoking the new
account does not revoke a public upstream stream, modified client, old free APK or
remote Cast receiver that lacks server-enforced entitlement.
