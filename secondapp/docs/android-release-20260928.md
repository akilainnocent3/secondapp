# SoccerArena Android integration — 28 September 2026

## Download and install

[SoccerArena-arm64.zip](../android_integration/work/soccerarena-release-20260928/SoccerArena-arm64.zip)
contains the base APK and matching ARM64, English and xhdpi splits, checksums, and
phone installation instructions. This is an installable native account integration,
not another unchanged baseline. It uses the deployed `https://api.soccerarena.org` API.

1. Uninstall the earlier rebuilt test app. The new private release signature differs
   from its disposable test signature; uninstalling removes its local settings/favorites.
2. Extract the ZIP on the phone.
3. In SAI, select all four APKs together and install. Do not mix packages from old ZIPs.
4. Open SoccerArena, create an account or sign in. First successful login starts the
   existing seven-day server trial. The Account button provides renewal contacts,
   payment history, logout and account deletion. The old subscription destination
   also opens the native account screen.

## Implemented

- Native server verification before all nine original content activities initialize,
  and on start/resume/new-intent entry. Both phone and TV entry points are covered.
- Server expiry translated to monotonic time, conservatively including request latency;
  maximum 60-second lease and regular revalidation. Suspended/expired accounts retain
  account/support functions without entering channels. Failed verification grants no
  fresh access. Credentials are sent only to the fixed HTTPS account API; redirects
  are refused. The media provider receives no SoccerArena bearer tokens.
- Encrypted refresh-token storage using Android Keystore AES-GCM; access tokens stay
  in memory. Background exit invalidates the lease and stops playback. Expiry finishes
  protected activities, stops activity-owned players and requests Cast session stop.
- Native registration, login, account details, dynamic support/payment contacts,
  paginated receipt history, logout across devices, and password-confirmed deletion.
- Application-open ad construction removed while retaining the original context
  initializer. Ad configuration returns empty; central banner/interstitial loaders
  are neutralized, interstitial continuations run once, ad-only components are disabled,
  and private-DNS adblock detection is neutralized. Original billing state does not
  grant access to the SoccerArena gate.

## Verification and limits

The user reported that the **baseline** opens, loads channels and plays video/audio;
ads were present. No claims were made about fullscreen, Back, PiP, Cast or TV results.
The integrated APK has not been run on a phone/emulator. No further ad-presence test
was requested of the user.

Build checks: Java/D8 and Smali/resource compilation, four matching signing
certificates, APK signature verification, 16 KiB ZIP alignment, exact split payload
preservation, and base payload comparison. Only `AndroidManifest.xml`, `classes7.dex`
and new `classes10.dex` differ in the base; all original binary resources, assets,
other DEX files and native split libraries are preserved. Fifteen host-Java checks
cover expiry, denial, latency, timestamp parsing and lease boundaries. Public live
API health and settings returned successfully. Detailed evidence is in the package's
adjacent `build-report.json` and `logs/` directory.

This is client-side protection of this installed package. It does not revoke old
free APKs or public upstream media URLs, or guarantee remote Cast revocation after
the phone disconnects. Server-controlled stream authorization remains necessary for
those guarantees. Ads embedded in the video itself are outside app SDK suppression.
The account overlay and integrated playback need actual-device runtime verification
before broad distribution; successful compilation is not proof of runtime behavior.
This work does not complete the separate web content adapter.

## Rebuild and signing backup

Run `python3 android_integration/scripts/build_protected.py --out NEW_DIRECTORY`.
The builder refuses existing output directories and leaves source APK/JADX trees intact.
It uses the prepared Apktool decode and SDK described in the earlier build notes.

The new signing key and password are in the ignored, restricted directory
`android_integration/private/`: `soccerarena-release.jks` and `signing-password`.
Back up that directory securely outside this workspace. Keep it private and never
include it in the customer download. Future updates must reuse that key. Losing it
prevents compatible updates; the publicly-passworded baseline test key must not be
used for customer releases. The private key is deliberately not in the installation ZIP.
