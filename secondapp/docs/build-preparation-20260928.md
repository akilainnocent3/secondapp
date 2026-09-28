# Build preparation and executed verification — 28 September 2026

**Resume update:** Temporary tools were restored and fresh builds/checks executed;
see [resumed verification](resume-verification-20260928.md) for the current artifact
and signing-key status. Earlier artifacts and this historical evidence are preserved.

**Baseline build preparation succeeded. Native integration is still gated on
device baseline results.** No device installation, uninstall, replacement, data
clear, production deployment, commit, or push was performed in this run.

## Outputs and tools

* SDK: `/tmp/soccerarena-android-sdk`, command-line tools 22.0 (archive 15859902),
  platform tools 37.0.1, Android API 36 revision 2, build tools 36.0.0.
* Configuration: `source /tmp/soccerarena-android-env.sh`.
* Apktool 2.12.1: `/tmp/soccerarena-apktool.jar`; Java 25.0.4.1; Python 3.14.2.
* Flutter 3.47.5 / Dart 3.13.4: `/tmp/soccerarena-flutter-sdk`.
* Release web output: `/tmp/soccerarena-web-20260928` (existing `flutter/build/web`
  retained). This is the account UI, not a completed catalog/player.
* Android outputs: `android_integration/work/baseline-20260928-a/`, with a second
  independent build in `baseline-20260928-b/`. Both are ignored generated work.
* Downloadable test set: `baseline-20260928-a/rebuilt-baseline-arm64.zip`.
  Original-signed comparison set: `baseline-20260928-a/original-baseline-arm64.zip`.
  Each includes all four APKs, checksums, safe installer, and phone checklist.
* Public evidence: [build report](android-baseline-build-report.json),
  [input inventory](split-baseline-inventory.json), and
  [phone checklist](samsung-baseline-checklist.md).

The rebuilt APKs retain package `com.sports.live.football.tv`, version 3.3.8/338,
and unchanged binary manifests, DEX, resources, assets, and native libraries. This
is a no-change Apktool container rebuild with a disposable test signature, not an
Android source/Flutter integration build. All four APKs must use the same signer;
original and test-signed splits must not be mixed. Production upgrade signing
requires the original signing/Play release path, which is not available here.

## Checks actually executed

| Check | Result | Scope |
| --- | --- | --- |
| Official SDK archive SHA-256 | PASS | Matched published `4e4c464f…eedf583` |
| SDK package installation and setup script | PASS | API 36, platform tools, build tools operational |
| Original APK/APKS inventory and existing JADX hashes | PASS | Originals unchanged |
| Original four APK signatures | PASS | Same signer `6121a31f…78ad1c`; v1/v2/v3 verify |
| Manifest package/version/split identities | PASS | Base and three matching splits |
| Apktool raw baseline rebuild | PASS | Four APKs; repeated in separate output directories |
| Non-signing payload equivalence | PASS | All 2,900 entries byte-equivalent by per-entry SHA-256 |
| Rebuilt APK signing and ZIP alignment | PASS | Disposable RSA signer; `zipalign -c -P 16 4` |
| Reproducibility | PASS | Four signed APK hashes identical across two builds with same key/toolchain |
| ARM64 ELF inspection | PASS | All 10 libraries machine 183, every LOAD alignment 16 KiB |
| Safe installer protection tests | PASS | Seven mocked tests including existing/other-user app refusal and explicit `-R` |
| ADB device enumeration | PASS, empty | No device connected; no install attempted |
| Backend PostgreSQL tests | PASS | 26/26, including three concurrency tests |
| Backend SQLite tests | PASS with skips | 23 passed, three PostgreSQL-only tests skipped |
| Migration drift | PASS | No changes detected |
| Production Django configuration check | PASS with warnings | W005/W021: HSTS subdomains/preload remain deliberately unset |
| Dart formatting / Flutter analysis | PASS | Seven files unchanged; no analyzer issues |
| Flutter unit/widget tests | PASS | 13/13 |
| Flutter web release | PASS | Production API build and separate localhost API test build |
| Local Chromium browser checks | PASS | Real UI/API against disposable local SQLite; no production account used |
| Native runtime, installation, phone playback | NOT RUN | No attached device; no `/dev/kvm` |
| Integrated native auth/ad removal/TV/PiP/Cast | NOT RUN | Integration gated on device comparisons |
| Actual web catalog/playback | NOT IMPLEMENTED | Provider adapter still absent; expected 503 message verified |

The browser run covered signup/login/input fidelity, trial, HttpOnly session cookie
and no credential storage, payment history, expiry, admin receipt, suspension,
unsuspension, unavailable-content error, offline recovery, logout/relogin,
second-session restoration/revocation, incorrect-password deletion rejection,
successful deletion, and reload. No page JavaScript errors occurred. Screenshots
are in `/tmp/soccerarena-browser-evidence-20260928`; existing project screenshots
were preserved using the new optional `ARENA_SCREENSHOTS_DIR` setting.

The browser database was `/tmp/soccerarena-browser-20260928.sqlite3`, selected by
temporary `/tmp/arena_browser_settings.py` via `DJANGO_SETTINGS_MODULE`/`PYTHONPATH`.
The existing `backend/local.sqlite3` was not used for browser test mutations.
PostgreSQL tests created/destroyed their own test database in the existing local
`soccerarena-test-postgres` container.

Signature verification logs contain original META-INF v1 coverage warnings for
library metadata. The commands still verify v2/v3 successfully. The rebuild removes
old signing/source-stamp material and signs with the test key; it does not claim
the original signing identity or source stamp. Java 25 emits a native-access warning
for apksigner, and SDK tools report sdkmanager deprecation; both tools completed.
ELF/ZIP alignment is a static check, not proof of device compatibility.

## Reproduction commands

From `secondapp/`:

```sh
bash android_integration/scripts/setup_android.sh
source /tmp/soccerarena-android-env.sh
python3 android_integration/scripts/build_split_baseline.py \
  --out android_integration/work/baseline-new \
  --test-key /tmp/soccerarena-baseline-test.jks
python3 android_integration/scripts/test_install_baseline.py
python3 android_integration/scripts/inspect_inputs.py

DEBUG=1 /tmp/soccerarena-venv/bin/python backend/manage.py test accounts \
  --settings=config.test_settings --verbosity=1
DEBUG=1 PGHOST=127.0.0.1 PGPORT=55432 PGDATABASE=soccerarena PGUSER=postgres \
  PGPASSWORD=local-test-only /tmp/soccerarena-venv/bin/python backend/manage.py \
  test accounts --settings=config.test_settings --verbosity=1
DEBUG=1 /tmp/soccerarena-venv/bin/python backend/manage.py makemigrations --check --dry-run
```

From `secondapp/flutter/`:

```sh
/tmp/soccerarena-flutter-sdk/bin/dart format --output=none --set-exit-if-changed lib test
/tmp/soccerarena-flutter-sdk/bin/flutter analyze
/tmp/soccerarena-flutter-sdk/bin/flutter test
/tmp/soccerarena-flutter-sdk/bin/flutter build web --release --output=/tmp/soccerarena-web-20260928
```

The test keystore lives only in `/tmp/soccerarena-baseline-test.jks`; no private key
is included in artifacts/source. Reproducibility requires reusing this disposable
key and the same toolchain. A new key produces a new signature/hash. The script
refuses existing output directories to preserve prior work. Setup accepts package
licenses interactively; the authorized installation in this run used `yes` piped
to sdkmanager.

## Installation failures encountered and resolved

No SDK installation failure remains. Exact failed commands and their errors:

```text
curl -fL https://dl.google.com/android/repository/commandlinetools-linux-14742923_latest.zip -o /tmp/soccerarena-commandlinetools.zip
curl: (6) Could not resolve host: dl.google.com
```

This first attempted URL was not used for the toolchain. After consulting the
official download page, the network-enabled command used archive **15859902**,
completed, and matched its official SHA-256.

```text
/tmp/soccerarena-android-sdk/cmdline-tools/latest/bin/sdkmanager --sdk_root=/tmp/soccerarena-android-sdk 'platform-tools' 'platforms;android-36' 'build-tools;36.0.0'
Warning: Failed to download any source lists!
Warning: IO exception while downloading manifest
Warning: Failed to find package 'platform-tools'
```

Resolved with a network-enabled retry:

```sh
yes | /tmp/soccerarena-android-sdk/cmdline-tools/latest/bin/sdkmanager \
  --sdk_root=/tmp/soccerarena-android-sdk \
  'platform-tools' 'platforms;android-36' 'build-tools;36.0.0'
```

ADB initially failed with `could not install *smartsocket* listener: Operation not
permitted`; the permitted retry started the daemon and returned an empty device
list. Pip/npm/Chromium downloads also initially hit sandbox DNS restrictions and
passed with permitted network access. Local servers/browser child-process startup
initially returned `Operation not permitted`/`EPERM`, then passed outside the sandbox.
One Flutter local-web build initially failed updating
`/home/codespace/.dart-tool/dart-flutter-telemetry-session.json` (read-only filesystem);
the permitted retry completed. These are environment setup failures, not passing
device checks or unresolved application failures.

## Remaining gates

1. Return the Samsung checklist results for the working installation. No replacement
   is needed to collect the original baseline.
2. Compare the test-signed rebuilt set on a clean spare ARM64 device; package-signature
   sensitive behavior is not established by the static build.
3. Keep native guards, ad removal, and player changes gated until that evidence is
   available. Full web content separately requires the provider adapter/contract.

Official references: [SDK downloads](https://developer.android.com/studio),
[apksigner](https://developer.android.com/tools/apksigner),
[zipalign](https://developer.android.com/tools/zipalign), and
[PackageManager shell source](https://android.googlesource.com/platform/frameworks/base/+/refs/heads/main/services/core/java/com/android/server/pm/PackageManagerShellCommand.java).
The latter confirms that `-R` explicitly disables replacement; the installer never
relies solely on omitting `-r`.
