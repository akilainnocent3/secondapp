# Samsung baseline test — 28 September 2026

Use your **existing working installation** on the Samsung. Do not install the
rebuilt set over it, uninstall it, clear storage, or reset app preferences. Nothing
has been installed on your phone from this workspace.
If the installed version is not 3.3.8 (code 338), report that difference; do not
replace it just to match this test archive.

## Five-minute checklist

1. **Launch:** open Live Football Tv normally. Record app version, Samsung model,
   Android version, One UI version, and whether you used Wi-Fi or mobile data.
   Take `01-home.png` after the home screen finishes loading. Report crashes,
   blank screens, startup errors, and how long loading took.
2. **Navigation:** open a category/channel list, match details, and search (if
   available), then use Back to return home. Take `02-channel-list.png` and
   `03-match-or-search.png`. Report any missing or broken destinations.
3. **Content loading:** open two different categories/events. Note their names,
   the test time and timezone, and whether each list loaded, was empty, or showed
   an error. Take `04-content-error.png` only if an error occurs, including its
   exact wording. Do not send private stream URLs or account credentials.
4. **Playback:** select two streams you are permitted to watch. Play each for at
   least 60 seconds; check picture, sound, loading time, buffering, and controls.
   Rotate the screen, return from full screen, go Back, and select another stream.
   Return `05-player.png` showing the controls/status; a black screenshot caused
   by protected video is fine—describe whether video was visible on the phone.
5. **Resume:** while playing, go Home and return. Report whether playback pauses,
   continues, or enters PiP, and whether the app resumes correctly. If you normally
   use Cast, test it separately and report start/stop behavior; otherwise mark
   Cast **not tested**. Report ads as observed; this baseline still contains them.

Send the screenshots above plus a short result for each numbered step (pass/fail,
exact error, stream/channel label, approximate time). Crop notifications and other
personal information. No account password, cookies, token, or signing key is needed.

## Optional ADB evidence (read-only)

These commands run on a computer with Android platform tools. Enable USB debugging
and authorize that computer on the phone. Use `adb devices -l` to find its serial;
replace `SERIAL` below. These commands do not reinstall, stop, or clear the app.

```sh
adb -s SERIAL shell getprop ro.product.model
adb -s SERIAL shell getprop ro.build.version.release
adb -s SERIAL shell getprop ro.build.version.sdk
adb -s SERIAL shell getprop ro.product.cpu.abilist
adb -s SERIAL shell getconf PAGE_SIZE
adb -s SERIAL shell wm density
adb -s SERIAL shell dumpsys package com.sports.live.football.tv > package-info.txt
```

Return the property output and only the `versionName`, `versionCode`, `splits`,
`primaryCpuAbi`, and `secondaryCpuAbi` lines from `package-info.txt`. The device
serial is not needed in the returned report. Also write the One UI version from
Settings → About phone → Software information.

For a playback/navigation failure, open the app, then find its PID:

```sh
adb -s SERIAL shell pidof -s com.sports.live.football.tv
adb -s SERIAL logcat --pid=PID -v threadtime -T 1 > baseline-logcat.txt
```

Replace `PID` with the printed number. Leave that command running, reproduce the
problem once, then press Ctrl+C. Return the short interval around the failure
along with the exact time and action. If the app restarted, get its new PID before
recording another attempt. For a startup crash that happens too early for PID
capture, use `adb -s SERIAL logcat -b crash -d -v threadtime > crash.txt` and send
only the crash block for `com.sports.live.football.tv`.

Review logs before sending: remove access tokens, authorization headers, full
stream URLs/query strings, emails, phone numbers, and unrelated app entries.
Do not clear logcat or send a full device bugreport. Screenshots can be taken with
the phone buttons; optional computer capture is:

```sh
adb -s SERIAL exec-out screencap -p > 01-home.png
```

## Rebuilt artifact testing — clean spare device only

`rebuilt-baseline-arm64.zip` contains four APKs, `SHA256SUMS`, and the safe Python
installer. This is an unchanged-payload rebuild with a **disposable test signature**,
not the completed SoccerArena app. It retains the original package name and cannot
coexist with or update the working installation. Changing the package name would
change the baseline and is intentionally not part of this test.

Use a spare ARM64 Android device with this package absent across **all users**.
A secondary profile/Secure Folder on a phone with the working app is not an
approved substitute. Extract the ZIP and run from its directory (Python 3.11+):

```sh
python3 install_baseline.py --serial SERIAL
python3 install_baseline.py --serial SERIAL --install-on-empty-device
```

The first command only checks hashes, ABI/API, and installed/retained packages.
The second repeats those checks and sends all four APKs together with `-R`, which
explicitly forbids replacement. It never uninstalls, clears data, or downgrades.
If it refuses, or if an older device rejects `-R`, stop and return the error;
do not remove the flag or bypass the checks. No installation command was executed
against a real device here. Original and rebuilt artifacts are separate: do not
mix splits from them, because their signing identities differ.

Run the same checklist on the rebuilt spare-device installation and label the
results **rebuilt/test-signed**. Keep the Samsung results labeled **existing/original**.
Signature-sensitive services may behave differently with the test certificate;
record the difference rather than treating build success as runtime success.

The supplied density resources are xhdpi and the language split is English;
installation/rendering on your particular display is still a device test. ARM64
ELF and ZIP 16 KiB alignment checks passed, but do not establish runtime support.

Production updates require the original app-signing/Play release path. No production
key was supplied or generated. Native auth/ad/player changes stay gated until the
original baseline and rebuilt comparison have device evidence.
