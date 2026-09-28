#!/usr/bin/env bash
# Re-create the baseline toolchain; installs only under the selected tools directory.
set -euo pipefail
tools_dir="${ARENA_TOOLS_DIR:-/tmp}"
sdk_dir="$tools_dir/soccerarena-android-sdk"
mkdir -p "$tools_dir"
archive="$tools_dir/soccerarena-commandlinetools.zip"
if [[ ! -f "$sdk_dir/cmdline-tools/latest/bin/sdkmanager" ]]; then
  curl -fL https://dl.google.com/android/repository/commandlinetools-linux-15859902_latest.zip -o "$archive"
  python3 - "$archive" "$sdk_dir" <<'PY'
import hashlib, sys, zipfile
from pathlib import Path
archive, sdk = map(Path, sys.argv[1:])
expected = '4e4c464f145a7512b57d088ac6c278c03c9eea610886b35a5e0804e74eedf583'
if hashlib.sha256(archive.read_bytes()).hexdigest() != expected:
    raise SystemExit('Official SDK archive checksum mismatch')
target = sdk / 'cmdline-tools'
target.mkdir(parents=True, exist_ok=True)
with zipfile.ZipFile(archive) as source:
    source.extractall(target)
    for entry in source.infolist():
        if entry.external_attr >> 16:
            (target / entry.filename).chmod(entry.external_attr >> 16)
(target / 'cmdline-tools').rename(target / 'latest')
PY
fi
# sdkmanager prompts for any unaccepted package licenses.
"$sdk_dir/cmdline-tools/latest/bin/sdkmanager" --sdk_root="$sdk_dir" \
  'platform-tools' 'platforms;android-36' 'build-tools;36.0.0'
# sdkmanager can exit successfully after declining licenses and skipping packages.
for required in platform-tools/adb platforms/android-36/android.jar build-tools/36.0.0/apksigner build-tools/36.0.0/zipalign build-tools/36.0.0/aapt; do
  if [[ ! -f "$sdk_dir/$required" ]]; then
    echo "SDK installation incomplete: missing $sdk_dir/$required. Re-run setup and accept the SDK licenses." >&2
    exit 1
  fi
done
jar="$tools_dir/soccerarena-apktool.jar"
if [[ ! -f "$jar" ]]; then
  curl -fL https://github.com/iBotPeaches/Apktool/releases/download/v2.12.1/apktool_2.12.1.jar -o "$jar"
fi
python3 - "$jar" <<'PY'
import hashlib, sys
from pathlib import Path
expected = '66cf4524a4a45a7f56567d08b2c9b6ec237bcdd78cee69fd4a59c8a0243aeafa'
if hashlib.sha256(Path(sys.argv[1]).read_bytes()).hexdigest() != expected:
    raise SystemExit('Pinned Apktool checksum mismatch')
PY
cat > "$tools_dir/soccerarena-android-env.sh" <<EOF
export ANDROID_HOME='$sdk_dir'
export ANDROID_SDK_ROOT='$sdk_dir'
export APKTOOL_JAR='$jar'
export PATH='$sdk_dir/platform-tools:$sdk_dir/build-tools/36.0.0:$sdk_dir/cmdline-tools/latest/bin':\$PATH
EOF
"$sdk_dir/platform-tools/adb" version
"$sdk_dir/build-tools/36.0.0/apksigner" version
echo "Ready: source $tools_dir/soccerarena-android-env.sh"
