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

Android integration is conditional on a launchable preservation baseline. No guessed
replacement APK or separate-app launcher is supplied. Native enforcement must precede
protected activity initialization, cover playback/background/Cast boundaries and
verify server state independently of Dart messages. The current original APK remains
unchanged and unprotected. No production signing identity has been supplied.

The web content adapter must be built from authorized provider contracts. The API
currently denies unavailable content with 503 after checking entitlement; it does
not expose an arbitrary URL proxy or return fake streams. Browser content/playback
parity remains an outstanding requirement. Even a completed client gate cannot
revoke old free APKs, public upstream endpoints or independently obtained media URLs.
