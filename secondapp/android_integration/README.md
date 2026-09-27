# Android preservation work — integration blocked

No authentication/ad patch has been applied to the original APK or reference trees.
A full Apktool decode/Smali rebuild completed; a stricter no-source/no-resource
baseline script additionally verifies byte equality of original DEX/resources.
This does not establish launchability or supply the absent split APKs.

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

* Obtain the matching installed split set (base + ABI + density) or the original
  supported source/build inputs, preferably both. Preserve package/provider config.
* Supply an authorized emulator/device and matching complete installation for
  baseline playback comparison. There is no attached device or Android SDK here.
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
