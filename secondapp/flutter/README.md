# SoccerArena account client

Flutter 3.47.5 / Dart 3.13.4. Dependencies are pinned; retain pubspec.lock.

```sh
flutter pub get
flutter analyze
flutter test
flutter build web --release --dart-define=API_BASE_URL=https://api.soccerarena.org
```

The release artifact is `build/web/` (ignored). Local backend instructions are in
../deploy/README.md. Build locally with
`--dart-define=API_BASE_URL=http://127.0.0.1:8000`; use frontend port 8080 and the
same hostname for local SameSite cookies. Never embed tokens or provider credentials
in Dart defines.

Web uses secure Django cookie sessions in production. Only public contacts are
cached in browser preferences. Native account transport uses SimpleJWT and
flutter_secure_storage; it has unit coverage but has **not** been integrated into
the original Android host or tested on Android/iOS hardware. Do not generate a
standalone replacement Android launcher and describe it as the requested integration.

`AccessController` withholds use during verification, checks before content entry,
revalidates on foreground and caps leases at 60 seconds (default poll 45s). A
monotonic stopwatch and server timestamp determine remaining access, conservatively
subtracting request latency. Expiry closes viewing state but retains restricted
identity; no repeated auto-logout loop. The current web content endpoint reports its
unfinished integration explicitly. See ../docs/parity.md.

UI uses explicit account states, inline form errors, keyboard submission, autofill,
password visibility, accessible contacts, pagination and password-confirmed deletion.
Screenshots of the running app are in ../docs/screenshots. No price/checkout is shown.

For local browser verification, install Playwright outside the repository and run:

```sh
NODE_PATH=/tmp/soccerarena-browser/node_modules \
PLAYWRIGHT_BROWSERS_PATH=/tmp/soccerarena-playwright \
node tool/browser_smoke.cjs
```

The script requires the local build on 127.0.0.1:8080 and Django on 127.0.0.1:8000.
It creates a temporary test account through the actual UI and deletes it at the end.
It never targets production. Passwords are randomized and not written to artifacts.
