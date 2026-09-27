# Verification — 27 September 2026

Status is scoped to what ran. **The requested Android integration and full web
content experience are not complete.** No production deployment, commit, push,
ZIP creation, production signing or modification of firstapp occurred.

## Toolchain and commands

Working directory was the actual repository's `secondapp/`, not a presumed root.
Python 3.14.2; Django 5.2.17; DRF 3.18.1; SimpleJWT 5.5.1; PostgreSQL 17 Docker image
(digest `d74eeac9a635390a49bc21bd49fccd973de707e2a53a76ac49b552b8712ec46f`);
Flutter 3.47.5 / Dart 3.13.4 (framework 6a19cca564); Java 25.0.4.1;
JADX 1.5.6; Apktool 2.12.1; Playwright Chromium 153.0.8010.12.
Downloaded tools live in /tmp. Dependency pins are in backend/requirements.txt and
flutter/pubspec.yaml/pubspec.lock. Local databases/builds/recovery trees are ignored.

Commands below omit no production secret; the displayed database password is for
the disposable loopback test container only.

```sh
# From secondapp; venv was provisioned under /tmp.
DEBUG=1 /tmp/soccerarena-venv/bin/python backend/manage.py test accounts --settings=config.test_settings --verbosity=1
DEBUG=1 PGHOST=127.0.0.1 PGPORT=55432 PGDATABASE=soccerarena PGUSER=postgres \
PGPASSWORD=local-test-only /tmp/soccerarena-venv/bin/python backend/manage.py test accounts --settings=config.test_settings --verbosity=1
DEBUG=1 /tmp/soccerarena-venv/bin/python backend/manage.py makemigrations --check --dry-run
APKTOOL_JAR=/tmp/soccerarena-apktool.jar bash android_integration/scripts/baseline.sh
# From flutter:
/tmp/soccerarena-flutter-sdk/bin/dart format --output=none --set-exit-if-changed lib test
/tmp/soccerarena-flutter-sdk/bin/flutter analyze
/tmp/soccerarena-flutter-sdk/bin/flutter test
/tmp/soccerarena-flutter-sdk/bin/flutter build web --release
/tmp/soccerarena-flutter-sdk/bin/flutter build web --release \
  --dart-define=API_BASE_URL=http://127.0.0.1:8000 --output=/tmp/soccerarena-web-test
# Browser server/backend run on loopback only; from secondapp:
NODE_PATH=/tmp/soccerarena-browser/node_modules \
PLAYWRIGHT_BROWSERS_PATH=/tmp/soccerarena-playwright \
node flutter/tool/browser_smoke.cjs
```

## Backend evidence

| Check | Result | Evidence / scope |
| --- | --- | --- |
| PostgreSQL suite | PASS | 20 tests, including three concurrency tests |
| SQLite convenience suite | PASS | 18-test run: 15 passed, three PostgreSQL-only tests skipped; added throttle tests verified in final PostgreSQL run |
| Registration fields, hash, weak/duplicate identities | PASS | API tests, database expression indexes and canonical phone check |
| Trial only after login, exact boundary, consumed marker | PASS | Failed/repeated login, clearing dates, simultaneous HTTP first logins |
| Restricted expiry/suspension, paid precedence | PASS | Me/history accessible; content denied; payment does not unsuspend |
| Refresh replay/logout/deletion/password reset | PASS | Old credentials rejected; competing refresh rotations produce 200/401 |
| Monthly grant and early renewal | PASS | Jan 31 to Feb 28/29, trial-preserving start, repeated application, rollback, concurrent receipts |
| Ownership/staff/date/payment mutation | PASS | Customers receive read-only own data; unauthorized writes denied |
| Django admin | PASS | User add/change/settings/payment forms render; user creation hashes password; receipt applies via admin service |
| Browser security transport | PASS | Allowed HTTPS origin simulation, hostile origin, missing CSRF at login/logout/delete, Secure/HttpOnly cookies |
| Initial settings and later edits | PASS | Migration defaults and edited public settings response |
| Migration drift | PASS | No changes detected |
| Production settings check | PASS with warnings | No errors; HSTS include-subdomains/preload deliberately not enabled without operator review |
| Deployed HTTPS origins / Nginx/systemd syntax/runtime | NOT RUN | Templates only; nothing installed on production |

Test settings use a fast password hasher and disabled throttles for deterministic
behavior tests; the running local browser backend uses normal password hashing and
configured throttles. Nginx plus database-cache throttling are prepared; distributed
rate-limit race/load testing is NOT RUN. Tests use synthetic accounts/payments only.

## Flutter and browser evidence

| Check | Result | Evidence / scope |
| --- | --- | --- |
| Formatter | PASS | Zero changes required |
| Analyzer | PASS | No issues found |
| Unit/widget suite | PASS | 13 tests: long-paid-expiry regression, responsive forms, 2x text, exact deadline, fail-closed leases, offline recovery, concurrent verification/refresh, logout race, public contact cache, foreground, web CSRF/no bearer storage |
| Web release | PASS | Production-configured build/web; local API build separately in /tmp |
| Browser registration/login/trial | PASS | Real UI keyboard input to running Django API |
| Browser expiry, admin receipt, paid history, suspension | PASS | Synthetic local data; actual Django admin HTTP form records receipt; UI checks authoritative account state |
| Phone/tablet/desktop screenshots | PASS | Actual Chromium captures at 360, 768, 1440 widths in screenshots/ |
| Android/iOS native storage/runtime tests | NOT RUN | No integrated host or attached device; mocked transport is not OS-storage verification |
| Actual content, streams, CORS/DRM/media headers | NOT RUN | Provider-backed web adapter not implemented; no permitted representative browser stream established |
| Native/Web playback termination, Cast/PiP | NOT RUN | No integrated player to test; account state tests are not playback tests |

Browser second-session restoration, incorrect-password deletion rejection, successful
deletion, revocation of the copied old session and reload all passed in the complete
script run. This is real browser/API evidence, independent of widget mocks. Screenshots are synthetic test accounts, not real
customer data. Passwords are randomized, masked, and not written to logs.

## Android and preservation

| Check | Result | Evidence / scope |
| --- | --- | --- |
| Original APK/tree hashes | PASS | inspect_inputs.py matches input-inventory.json for all three inputs |
| Manifest / splits / resources | PASS (inspection only) | Package/version/SDK rechecked; required splits present, no native libs; 16 ordinary XML parse failures reproduced |
| Missing class recovery | PASS (partial analysis) | classes7 DEX-definition audit and targeted JADX export recover entry points; 19 errors remain |
| Full resource/Smali rebuild | PASS (build only) | Apktool decode/build exit 0 after fixing framework cache path |
| Byte-preserving baseline | PASS (build only) | 2,318 DEX/resource entries byte-identical; unsigned artifact in /tmp |
| Baseline installation/launch/playback | NOT RUN | Missing matching ABI/density splits, Android SDK/device/emulator |
| Production signing/upgrade | NOT RUN | Original signing/Play release access not supplied |
| Integrated Flutter Android APK | NOT RUN | No launch-proven baseline; adding Flutter/guards before that would violate preservation requirement |
| Native ad removal/regression/network audit | NOT RUN | Ads unchanged; coordinator recovery incomplete; no runtime baseline |
| Phone/TV/direct intents/notifications/Back/process recreation | NOT RUN | Original paths statically traced but no integrated runtime |

## Failures found and fixed / still open

* Initial dependency downloads/cache writes/localhost sockets were sandbox-blocked;
  rerun with approved tool access. Flutter official manifest URL returned 404, so
  official stable Git checkout supplied Flutter 3.47.5.
* Apktool initially failed at its unwritable default framework cache; rerun with -p.
* SQLite rebuilt auth tables initially removed early custom indexes; adding the
  latest auth migration dependency fixed real database uniqueness tests.
* Anonymous DRF errors initially returned 403; an explicit auth challenge corrected
  the documented 401 identity response.
* Large text overflow in the header was fixed and covered by a 2x text test.
* Browser automation initially wrote semantic surrogate inputs before Flutter focus
  was ready. Real keyboard focus/typing and live-region-aware selectors fixed input
  fidelity; the tests do not bypass form submission through API seeding.
* Foreground stale-response handling and conservative network-latency subtraction
  were hardened while reviewing lease behavior.
* JADX errors, missing Android splits/device/signing, complete ad mapping and web
  content/playback parity remain open. See parity.md and android_integration/README.md.

Browser-specific finding: month-long `Timer` durations exceed JavaScript's timer
range and initially caused premature local expiry. Fixed by never scheduling a timer
longer than the short verification lease; exact expiry is armed inside that lease.
The regression is covered by a Flutter test and paid-session browser restoration.

Deletion-throttle regression found through browser testing: GET me/ originally
consumed the password-reauthentication quota. Fixed by applying that scope only to
DELETE. A regression test proves repeated account reads do not consume deletion
attempts, while wrong-password deletion attempts are still throttled.

Final additional browser checks: **PASS** for the content button's explicit 503
unavailable message (not playback), simulated offline verification and retry,
logout followed by paid relogin without a new trial. The complete browser script
then passed deletion and old-session rejection again. Offline screenshot is included.

Final preservation audit: all three input aggregate hashes matched again;
classes7.dex contains 284 first-party class definitions. No migration drift.

## Checks explicitly not completed

* Native platform test matrix (phone/TV, components, notification/deep links, PiP,
  Cast, process recreation, original content network equivalence and ad removal):
  **NOT RUN**, no launchable complete input/device baseline or integrated host.
* Real web catalog/search/favorites/match information/playback, protected content
  deep links and browser media controls: **NOT RUN**, provider adapter outstanding.
* Browser Back navigation through protected content and broad multi-tab active
  playback revocation: **NOT RUN**, no protected player implementation. Separate
  account-session restoration/deletion was tested and is distinct from this.
* Native/iOS OS secure storage, TV remote navigation and screen-reader hardware:
  **NOT RUN**, portable Dart code/semantic widget checks are not device tests.
* Payment-history pagination beyond one page and browser request timeout lasting
  the full timeout: **NOT RUN** in a browser; implementation exists, but these
  manual cases are not represented as verified.

## Change map

| Path | Purpose / legacy effect |
| --- | --- |
| backend/ | New API, domain services, three app models, admin, migrations and behavior tests |
| flutter/lib/ | New branded account UI, coherent access controller, native/web auth transport; no legacy player rewrite |
| flutter/tool/ and backend/accounts/tests/browser_control.py | Explicit localhost-only browser verification with disposable synthetic data |
| android_integration/scripts/ | Read-only input audit and copied byte-preserving rebuild; no patches to original code |
| deploy/ | Reviewable Nginx/systemd/env/setup/rollback templates; not deployed |
| docs/ | Inspection, contract, admin guide, parity, screenshots and evidence |
| .gitignore | Excludes local DBs, generated recovery/builds, SDK metadata and signing files |

All files are left uncommitted for the owner. Signing keys, downloaded tools and
real credentials are absent from new source. Generated web output is locally
available at flutter/build/web/ and must be rebuilt after downloading source.

Legacy provider connectivity: credential-free `curl --max-time 20 -sS -I
https://www.streamingucms.com/api/applications/` completed with HTTP/2 503 .
This HEAD request does not authenticate, exercise the dynamic catalog protocol or
establish media/CORS/DRM compatibility. No provider credentials were sent.
