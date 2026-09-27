#!/usr/bin/env bash
set -euo pipefail
# Tool jars/SDKs remain outside source; APK output is explicitly unsigned.
root_dir="$(cd "$(dirname "$0")/../.." && pwd)"
: "${APKTOOL_JAR:?Set APKTOOL_JAR to Apktool 2.12.1 jar}"
: "${ARENA_BUILD_DIR:=/tmp/soccerarena-preserved-baseline}"
mkdir -p "$ARENA_BUILD_DIR"
python3 "$root_dir/android_integration/scripts/inspect_inputs.py"
java -jar "$APKTOOL_JAR" d -f -s -r -p "$ARENA_BUILD_DIR/framework" "$root_dir/Live.apk" -o "$ARENA_BUILD_DIR/decoded"
java -jar "$APKTOOL_JAR" b -p "$ARENA_BUILD_DIR/framework" "$ARENA_BUILD_DIR/decoded" -o "$ARENA_BUILD_DIR/baseline-unsigned.apk"
python3 - "$root_dir/Live.apk" "$ARENA_BUILD_DIR/baseline-unsigned.apk" <<'PY'
import sys, zipfile
with zipfile.ZipFile(sys.argv[1]) as original, zipfile.ZipFile(sys.argv[2]) as rebuilt:
    protected = [n for n in original.namelist() if n.endswith('.dex') or n == 'resources.arsc' or n.startswith('res/')]
    for name in protected:
        assert original.read(name) == rebuilt.read(name), name
    print(f'PASS: {len(protected)} DEX/resource entries byte-identical. Not signed or runtime-verified.')
PY
