# Resumed build verification — 28 September 2026

The persistent project and earlier artifacts survived, but `/tmp` tools and the
old test signing key did not. Restored the pinned Android tools, Python dependencies,
and Flutter 3.47.5 / Dart 3.13.4. Original APK/APKS files, reference trees, previous
builds, and existing project edits were preserved. No phone installation, uninstall,
data clearing, production change, or native integration was performed.

## Executed in this resumed run

* SDK setup: command-line tools 22.0, platform tools 37.0.1, API 36, build tools
  36.0.0 installed successfully. Environment: `source /tmp/soccerarena-android-env.sh`.
  Setup now detects missing packages even when sdkmanager exits zero after skipped
  license acceptance, before writing a misleading environment configuration.
* Original input/reference aggregate hashes: PASS. APKS/base/split hashes and
  original signatures verified by the build script.
* Two separate baseline builds: PASS in `android_integration/work/baseline-20260928-resume`
  and `baseline-20260928-resume-repeat`. All four signed APK hashes match between
  builds; all 2,900 non-signing payload entries are unchanged. Signing and ZIP
  alignment checks passed. All ten native libraries are ARM64 with 16 KiB LOAD
  alignment. These are container rebuilds, not recovered source or integrated apps.
* Installer safety tests: 7/7 PASS. Inspection is the default, all Android users
  are checked for installed/retained packages, and explicit installation uses `-R`
  to forbid replacement. No real device installation was attempted.
* Backend SQLite: 23 passed, three PostgreSQL-only skips. PostgreSQL: 26/26 passed,
  including concurrency tests. No migration drift. Deployment configuration check:
  no errors; existing W005/W021 HSTS subdomain/preload warnings remain.
* Flutter formatting: seven files unchanged. Analyzer: no issues. Unit/widget
  tests: 13/13 PASS. Release web build: PASS at `/tmp/soccerarena-web-resume`,
  preserving the existing web build. This is the account UI, not a working player.
* ADB enumeration: successful, empty. `/dev/kvm` absent. Device launch, navigation,
  content, playback, PiP/Cast, and native integration tests: NOT RUN.
* Previous browser/API evidence is retained in the earlier report; browser and
  production account checks were not repeated during this resumed run.

## Artifacts and reproduction

[Fresh test artifact](../android_integration/work/baseline-20260928-resume/rebuilt-baseline-arm64.zip)
contains all four APKs, checksums, the safe installer, and phone instructions.
ZIP SHA-256: `3c94697fb42e8bfdb591e1f4a62820e7bc500b95febcdc7b6b2403392b50bfc3`.
[Machine-readable evidence](android-baseline-resume-report.json) records APK hashes,
signers, payload counts, alignment, and artifact hashes.

The new disposable key is `/tmp/soccerarena-baseline-test.jks`; it is not bundled.
It differs from the lost earlier key, so fresh signed APK hashes differ from the
older report. Reproducibility is established between the two fresh builds with
the same key/toolchain. Preserve that key privately if identical future output
is needed; never use it for production. No original production signing key exists here.

```sh
bash android_integration/scripts/setup_android.sh
source /tmp/soccerarena-android-env.sh
python3 android_integration/scripts/build_split_baseline.py \
  --out android_integration/work/baseline-next \
  --test-key /tmp/soccerarena-baseline-test.jks
python3 android_integration/scripts/test_install_baseline.py
```

Output directories must be new. Use the working Samsung installation for the
[short checklist and exact screenshot/log instructions](samsung-baseline-checklist.md).
Test-signed APKs retain the original package name and cannot coexist with or
update it. Only test the rebuilt set on a clean spare ARM64 device with the package
absent across all users; Secure Folder is not a substitute. Do not mix original
and rebuilt splits. Native integration remains gated on original and rebuilt
device baseline results. Provider-backed web content/playback remains unimplemented.

## Exact setup failures and resolution

`bash android_integration/scripts/setup_android.sh` initially failed at:

```text
curl -fL https://dl.google.com/android/repository/commandlinetools-linux-15859902_latest.zip -o /tmp/soccerarena-commandlinetools.zip
curl: (6) Could not resolve host: dl.google.com
```

The network-enabled retry downloaded and verified the archive. That invocation
had no interactive license answer, so sdkmanager skipped packages:

```text
/tmp/soccerarena-android-sdk/cmdline-tools/latest/bin/sdkmanager --sdk_root=/tmp/soccerarena-android-sdk 'platform-tools' 'platforms;android-36' 'build-tools;36.0.0'
Skipping following packages as the license is not accepted:
Android SDK Build-Tools 36
Android SDK Platform-Tools
Android SDK Platform 36
android_integration/scripts/setup_android.sh: line 47: /tmp/soccerarena-android-sdk/platform-tools/adb: No such file or directory
```

Resolved by the approved network-enabled command:
`yes | bash android_integration/scripts/setup_android.sh > /tmp/soccerarena-sdk-resume.log 2>&1`.
It exited zero; ADB and apksigner are operational. No SDK installation blocker remains.

Initial build/check commands also reported the missing `/tmp` apksigner, Python,
and Dart paths before restoration. Pip initially failed DNS resolution and passed
with approved network access. ADB initially failed with
`could not install *smartsocket* listener: Operation not permitted`; the approved
retry returned an empty device list. Docker inspection initially lacked socket
permission; the approved retry restarted the existing disposable test container.
