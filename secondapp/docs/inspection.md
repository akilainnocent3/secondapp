# Inspection — 27 September 2026

Repository root: `/workspaces/codespaces-blank`; implementation scope: `secondapp/`.
Initial `git status --short` was empty. No applicable AGENTS.md was found in the
workspace or ancestor directories. `firstapp/` has not been modified.

## Preserved inputs

`input-inventory.json` records counts and SHA-256 hashes, including a sorted-path
aggregate hash of every file in each reference tree. Live.apk is 89,397,197 bytes,
SHA-256 `c619b30bd6c98bdf675963ef746bd34d751cc6cf088b89e9328f1ea5bee5277e`.
Both supplied JADX trees are references, not build inputs. All new recovery is in
ignored `android_integration/analysis/` and `android_integration/work/`.

The APK has nine root DEX files and two audience-network asset DEX files. It has
no `lib/` entries. The manifest declares required ABI/density splits; those split
APKs are absent. This is not a verified universal APK. No original Gradle project,
wrapper or original Flutter project was found in the repository.

## Recovery and baseline

JADX 1.5.6 applied directly to extracted classes7.dex with inner-class movement and
anonymous inlining disabled recovered the previously missing application classes.
It exited 3 with 19 errors; errors are retained in the local analysis log. Recovery
is evidence for tracing, not a supported Java build. Apktool 2.12.1 decoded all nine
root DEX files to Smali after its framework cache was directed to /tmp. Initial
failure was an unwritable default framework directory, not corrupt input.

## Traced behavior

* `MyApp.onCreate`: constructs AppOpenManager, then `cp.a` context initialization.
  Non-ad context initialization must survive any future ad patch.
* Phone `HomeScreen.onCreate`: sets theme preferences, initializes binding and
  view model, resets PiP state, initializes Play Billing coordinator `wn.h`, registers
  activity results, records country state. `onResume` resets player counters and
  invokes `f2`. An activity-created callback would be too late to guard this.
* TV `TvHomeActivity`: resume invokes connectivity test, then schedules transition
  to TvMainActivity after two seconds. Both activities need pre-content gating.
* `vo.b` is OneViewModel; configuration/content are loaded through coroutines and
  observable state. Provider tokens/configuration are separate from customer login.
* Media3 player builds requests with Referer, Origin and User-Agent overrides.
  Channel records also contain clear-key, forwarded-for and channel configuration.
  These headers cannot simply be copied into a browser video element.
* `SubscriptionScreen` uses Google Play Billing ProductDetails, offers and pricing
  phases. Replacing its destination with manual-account access is a deliberate
  future integration change, not a harmless relabeling of an existing login page.
* FirebaseService stores notifications in Room. HTTP(S) notification URLs launch
  external ACTION_VIEW; other notifications open HomeScreen. These are distinct
  navigation boundaries. Avoid copying its raw remote-message logging into new code.
* ExpendedActivity is the exported Cast controller. Closing it alone does not
  revoke media already playing on a remote receiver.

Runtime content traffic, complete ad-coordinator continuation behavior, baseline
launch, PiP and Cast are not verified. Do not infer them from successful decompilation.
Provider configuration is intentionally omitted from these notes and logs in source.

## Additional static evidence

`io.a` is the Retrofit API interface: POST `details` returns DataStone; POST
`get_url` returns DataStone2; `matches/live` and `matches/by_date` return lists of
FootballMatches. `io.k` builds multiple clients using dynamic configuration base
URLs and 90-second timeouts. `vo.b.B` transforms the response with `to.k.o` and the
runtime filter value, then parses DataModel and derives passphrase state from extra_1.
The APK therefore does not provide a standalone browser-ready JSON catalog contract.
Static extraction of these endpoints is not evidence of valid provider credentials,
CORS support or an authorized web delivery contract. No extracted secret was copied
into the new backend/client.

Favorites/notifications use Room tables (`ko.a` reads/deletes event_table by event
name/code); web favorites would require a separate implementation. Media3 has
multiple ExoPlayer release sites and Cast RemoteMediaClient branches; these must
be mapped to actual runtime modes before revocation patches are safe.

AppOpenManager registers both activity and process lifecycle observers. Its nested
coordinator `i(Activity, callback)` invokes `callback.a()` when no ad is loaded,
then requests an ad; a future no-ad implementation must invoke continuation once
without that request. A show-in-progress flag currently returns early. This does
not account for every first-party banner/interstitial/rewarded placement; ad removal
remains incomplete rather than being claimed from a string search.

Rechecked manifest: package com.sports.live.football.tv, version 3.3.8 / 338,
minimum API 23, target API 36. Ordinary XML parsing reproduced 16 resource failures.
The byte-preserving baseline verified 2,318 DEX/resources equal. Neither its signing
nor launch is established; the original runtime configuration has not been changed.

## Official references consulted

* Flutter [add-to-app Android setup](https://docs.flutter.dev/add-to-app/android/project-setup),
  [web FAQ](https://docs.flutter.dev/platform-integration/web/faq), and
  [video playback](https://docs.flutter.dev/cookbook/plugins/play-video).
* [JADX usage/limitations](https://github.com/skylot/jadx),
  [Apktool CLI](https://apktool.org/docs/cli-parameters/),
  [Android signing](https://developer.android.com/studio/publish/app-signing).
* Django 5.2 [transactions](https://docs.djangoproject.com/en/5.2/topics/db/transactions/)
  and [deployment checklist](https://docs.djangoproject.com/en/5.2/howto/deployment/checklist/).
* DRF [authentication](https://www.django-rest-framework.org/api-guide/authentication/)
  and [permissions](https://www.django-rest-framework.org/api-guide/permissions/),
  [SimpleJWT 5.5.1 settings](https://django-rest-framework-simplejwt.readthedocs.io/en/stable/settings.html).
* Official package pages for [http](https://pub.dev/packages/http),
  [flutter_secure_storage](https://pub.dev/packages/flutter_secure_storage),
  [shared_preferences](https://pub.dev/packages/shared_preferences) and
  [url_launcher](https://pub.dev/packages/url_launcher).

These explain tool behavior; repository/runtime evidence above establishes what
was actually recovered and tested for this APK.
