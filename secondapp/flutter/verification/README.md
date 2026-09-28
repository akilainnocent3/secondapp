# Live release verification — 2026-09-27

Historical production-browser report. The matching APK splits have since arrived,
and SDK setup plus test-signed baseline builds succeeded. See
[current preparation](../../docs/build-preparation-20260928.md) and
[resumed verification](../../docs/resume-verification-20260928.md).
The native integration and provider-backed web playback remain incomplete.

Release status: **not ready**. No APK was generated or deployed.

The existing Flutter `build/web` was rendered in Chromium at a simulated
`https://soccerarena.org` origin. Frontend static requests were fulfilled from
local build files; all API traffic reached the real `api.soccerarena.org` server.
This does not establish that the web files have been deployed to soccerarena.org.

`release-checks.json` records 17 passing checks and two failed content checks.
Actual web UI login, secure HttpOnly session cookies, restoration after reload,
logout, and remaining signed out after reload passed. Native JWT login, rotation,
refresh replay rejection, and cross-device revocation after web logout passed.
Anonymous account and content requests returned 401. No JavaScript exceptions or
requests to the checked advertising domains were observed in the account flow.
The latter is not a comprehensive ad audit or an Android runtime test.

Both authenticated content requests returned **503 content_unavailable**. The
Flutter UI displayed the API error. The backend `accounts/views.py` Content view
unconditionally raises ServiceUnavailable after its entitlement checks. Flutter's
Open content handler requests that endpoint but has no catalog/player rendering.
Changing an API hostname or rebuilding cannot complete these implementations.

## Inputs needed for completion

1. A working content-provider contract and connection: catalog, channel/event
   metadata, playback URLs, required headers, and supported web playback/DRM.
   The old app calls separate provider endpoints and decodes their responses;
   its decompiled models alone are not a working connection.
2. The original Android source/build project or complete matching APK split set.
   Live.apk declares required ABI/density splits, contains no `lib/` entries,
   and recovered TvMainActivity declares native methods. Only Live.apk is present.
   Ad SDKs remain in its manifest; the native auth and ad-removal patches are absent.
3. Access to deploy the backend implementation. The supplied application account
   authenticates to the API; no server deployment credentials are present here.
4. Android runtime testing and production signing access for a distributable
   update. No APK/device integration was verified by these browser/API tests.

## Repeat the checks

Install Playwright/Chromium outside the repository, then run from Flutter:

```sh
NODE_PATH=/tmp/soccerarena-browser/node_modules \
PLAYWRIGHT_BROWSERS_PATH=/tmp/soccerarena-playwright \
python3 tool/verify_release.py YOUR_TEST_USERNAME
```

The script prompts for the password and keeps it out of files and shell history.
It tests production: first login can start a trial, and logout signs the account
out on all devices. It does not register/delete an account or change subscriptions.
The JSON report omits passwords, cookies, bearer tokens, and personal account data.
Screenshots show only the signed-out screen at 360, 768, and 1280 pixels wide.
Exit code 1 indicates a failed check. Even all checks passing would not establish
Android runtime correctness, actual video playback, or a complete ad audit.
