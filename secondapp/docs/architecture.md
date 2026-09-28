# SoccerArena architecture

Django's built-in User plus Subscription, Payment and singleton SiteSettings are
the only application models. Standard Django admin manages all four. Registration
is atomic; a locked first successful login starts seven UTC days once. A consumed
marker survives administrative clearing of trial dates. Missing subscriptions
are an integrity error requiring deliberate repair, never an automatic fresh trial.

Native authentication uses SimpleJWT with five-minute access tokens and rotated,
blacklisted refresh tokens. A database auth version invalidates all devices on
logout. Web uses host-only HttpOnly Django sessions, explicit login CSRF, and
credentialed CORS restricted to the configured frontend. Identity survives access
expiry/suspension for contacts, history and deletion; content permission queries
current database state on every request. Account deletion cascades personal payment
history. Password reset is an administrator operation.

Payment application locks Subscription then Payment inside a transaction. Confirmed
receipts apply once; reference and idempotency key are unique. Calendar-month
extension starts at the latest of now, paid expiry and active trial expiry, clamping
to the destination month's last day. Applied fields are immutable; notes remain
editable. Payment never lifts suspension.

Flutter has a single access controller, platform-specific transport and a separate
contact cache. Web never persists bearer credentials. Native refresh credentials
use OS-backed secure storage. Content is withheld during verification. Server time
and a monotonic elapsed clock determine a lease of at most 60 seconds and the exact
known deadline. Foreground restoration requires fresh verification.

The Android baseline now has user-confirmed launch/channel/video/audio results.
The native account integration gates original activity initialization, start, resume,
and new-intent entry. A server-derived monotonic lease lasts at most 60 seconds;
periodic verification refreshes it, and expiry finishes protected activities and
stops their players. Background exit invalidates access and stops local/Cast playback.
The same-package native account screen supports registration, sign-in, renewal
contacts, history, logout and deletion. Refresh tokens use Android Keystore AES-GCM;
access tokens remain in process memory. The original reference APK stays unchanged.
A new private signing identity signs the installable integration, requiring removal
of the baseline before installation. Integrated phone runtime is not yet verified;
see android-release-20260928.md for evidence and limits.

The web content adapter must be built from authorized provider contracts. The API
currently denies unavailable content with 503 after checking entitlement; it does
not expose an arbitrary URL proxy or return fake streams. Browser content/playback
parity remains an outstanding requirement. Even a completed client gate cannot
revoke old free APKs, public upstream endpoints or independently obtained media URLs.
