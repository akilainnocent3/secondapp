# Android integration

The user confirmed baseline launch, channel loading, video and audio on 28 September
2026. The native integration is now implemented in `native/org/soccerarena/auth/`
and built with `scripts/build_protected.py`. See the
[current package and verification notes](../docs/android-release-20260928.md).
The historical preparation notes below describe the state before this integration.

## Historical baseline preparation

No authentication/ad patch has been applied to the original APK or reference trees.
A full Apktool decode/Smali rebuild completed; a stricter no-source/no-resource
baseline script additionally verifies byte equality of original DEX/resources.
This does not establish launchability. The supplied `.apks` now provides the matching
base plus ARM64, English, and xhdpi splits; see the baseline update below.

Run from any directory with Java 25 and Apktool 2.12.1:

```sh
APKTOOL_JAR=/tmp/soccerarena-apktool.jar bash android_integration/scripts/baseline.sh
```

For analysis, extract classes7.dex from Live.apk (to /tmp) and run JADX 1.5.6:

```sh
unzip -p Live.apk classes7.dex > /tmp/soccerarena-classes7.dex
JADX_CONFIG_DIR=/tmp/soccerarena-jadx-config JADX_CACHE_DIR=/tmp/soccerarena-jadx-cache \
JADX_OPTS=-Xmx3g /tmp/soccerarena-jadx/bin/jadx -j 2 -r \
  --no-inline-anonymous --no-move-inner-classes \
  -d android_integration/analysis/classes7 /tmp/soccerarena-classes7.dex
```

Expected current recovery exit: 3, 19 errors. For fallback instructions:

```sh
java -jar "$APKTOOL_JAR" d -f -p /tmp/soccerarena-apktool-framework \
  Live.apk -o android_integration/work/baseline
```

Do not install an unsigned build, remove split requirements to disguise missing
inputs, uninstall the installed app, or describe a new debug signature as an update.
Production upgrade requires the original signing/Play signing release path. No key
belongs in this repository.

## Exact prerequisites

* Matching base + ARM64 + English + xhdpi splits received and extracted. Original
  supported source/build inputs remain unavailable. Preserve package/provider config.
* Supply baseline phone results and a clean spare ARM64 device for rebuilt comparison.
  SDK command-line tools 22.0, platform tools 37.0.1, platform API 36, and build
  tools 36.0.0 are installed under `/tmp/soccerarena-android-sdk`; no device is attached.
* Establish signing through the original release owner/Play App Signing for updates.
* Obtain provider-supported web/catalog access and representative permitted streams.

## Future reviewable integration boundaries

| Boundary | Required change after baseline launch |
| --- | --- |
| MyApp / AppOpenManager | Disable ad-only construction/registration; preserve cp.a initializer |
| HomeScreen, TvHomeActivity | Gate before content/config initialization; retain original entry flow after native server verification |
| MainActivity, TV main/channel and all players | Guard direct entry, process restoration, foreground and playback; stop at server deadline/60-second maximum lease |
| ExpendedActivity / Cast | Guard exported controller and issue remote stop; receiver-side access still needed for reliable remote revocation |
| FirebaseService / notification navigation | Preserve storage and external-URL semantics, guard protected internal destinations |
| SubscriptionScreen / Account entry | Explicitly redirect old Play Billing destination to manual account screen; add unobtrusive Account entry |
| First-party ad coordinator and layouts | Short-circuit continuations exactly once; collapse slots, independently neutralize adblock detection |
| Manifest ad-only providers | Disable proven ad-only auto-init without deleting shared Firebase/player libraries |

These are **not implemented patches**. A Dart MethodChannel assertion is not an
entitlement and no launcher opens a separately installed free APK. A complete native
host must own verification and playback cleanup, with auth credentials restricted to
the SoccerArena API host. Ad-free runtime behavior remains NOT RUN.

## Baseline update — 28 September 2026

The supplied archive has the identical base plus ARM64, English, and xhdpi splits.
All four original APK signatures verify with the same certificate. Two independent
Apktool 2.12.1 raw-resource/raw-DEX rebuilds of all four APKs produced identical
signed APK hashes using the same disposable RSA test key. All 2,900 non-signing
payload entries match, including binary manifests, DEX, resources, assets, and
native libraries. These are APK container rebuilds, not recovered source builds.

Rebuild in a **new** output directory; existing directories are refused:

```sh
bash android_integration/scripts/setup_android.sh
source /tmp/soccerarena-android-env.sh
python3 android_integration/scripts/build_split_baseline.py \
  --out android_integration/work/baseline-new \
  --test-key /tmp/soccerarena-baseline-test.jks
python3 android_integration/scripts/test_install_baseline.py
```

The setup script pins the command-line download/checksum and build tools. Platform
API revisions and platform tools are SDK repository selections; this run used API
36 revision 2 and platform tools 37.0.1. The build requires Python 3.11+ and Java
(Java 25 verified here). The test key has intentionally public test-only credentials;
keep the key outside source, and never use it for production. Reusing that key and
the same Python/zlib/Java/toolchain enables identical signed output; generating a
new key changes the signatures and hashes.

Current artifacts are under `work/baseline-20260928-a/`:

* `original-baseline-arm64.zip`: unchanged, original-signed input set.
* `rebuilt-baseline-arm64.zip`: payload-preserving test-signed rebuild for a clean spare.
* `build-report.json` and `logs/`: per-APK signatures, identity, payload counts, and tool output.

Both ZIPs include checksums, the safe installer, and testing instructions. Original
inputs and previous project work are untouched. Source-stamp/signing metadata are
replaced during rebuild, and original META-INF v1 coverage warnings are retained
in logs. v2/v3 verification succeeds. Package/provider configuration is unchanged.

**Do not install over the working Samsung app.** Follow the
[Samsung checklist](../docs/samsung-baseline-checklist.md) on its current installation.
The included installer inspects by default and refuses packages present or retained
in any Android user. Explicit clean-device installation also passes `-R` to prevent
replacement in PackageManager; no uninstall or data-clearing route exists.

[Build evidence](../docs/android-baseline-build-report.json) records the verified
hashes. [Current verification](../docs/build-preparation-20260928.md) separates
build/static checks from the unexecuted device matrix. Native integration remains
gated on baseline launch, content, and playback comparisons. A new signing identity
may affect signature-sensitive services; test-signing is not a production upgrade.
