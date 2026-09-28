#!/usr/bin/env python3
"""Fail-closed baseline installer. Defaults to inspection; never replaces an app."""
import argparse
import hashlib
from pathlib import Path
import re
import shutil
import subprocess

PACKAGE = "com.sports.live.football.tv"
NAMES = ("base.apk", "split_config.arm64_v8a.apk", "split_config.en.apk", "split_config.xhdpi.apk")


def run(command):
    result = subprocess.run(command, text=True, capture_output=True)
    if result.returncode:
        raise RuntimeError(f"Command failed: {command}\n{result.stdout}{result.stderr}")
    return result.stdout.strip()


def inspect_device(adb):
    if run(adb + ["get-state"]) != "device":
        raise RuntimeError("Device must be connected and authorized")
    abis = run(adb + ["shell", "getprop", "ro.product.cpu.abilist"]).split(",")
    if "arm64-v8a" not in abis:
        raise RuntimeError("This split set requires ARM64; no compatible ABI detected")
    sdk = run(adb + ["shell", "getprop", "ro.build.version.sdk"])
    if not sdk.isdigit() or int(sdk) < 23:
        raise RuntimeError("Android API 23 or newer is required")
    users = re.findall(r"UserInfo\{(\d+):", run(adb + ["shell", "pm", "list", "users"]))
    if not users:
        raise RuntimeError("Cannot enumerate Android users; refusing installation")
    for user in users:
        packages = run(adb + ["shell", "pm", "list", "packages", "-u", "--user", user])
        lines = packages.splitlines()
        if not lines or any(not line.startswith("package:") for line in lines):
            raise RuntimeError(f"Cannot reliably inspect Android user {user}; refusing installation")
        if f"package:{PACKAGE}" in lines:
            raise RuntimeError("Working or retained app found on device. STOP: use it for the baseline "
                               "checklist. Installation/replacement/uninstall/data clearing is prohibited.")
    return {"api": sdk, "abis": abis, "users_checked": users}


def verify_files(directory):
    checks = {}
    for line in (directory / "SHA256SUMS").read_text().splitlines():
        expected, name = line.split("  ", 1)
        checks[name] = expected
    if set(checks) != set(NAMES):
        raise RuntimeError("Checksum inventory is not the expected four-APK set")
    for name in NAMES:
        with (directory / name).open("rb") as file:
            actual = hashlib.file_digest(file, "sha256").hexdigest()
        if actual != checks[name]:
            raise RuntimeError(f"Artifact checksum mismatch: {name}")


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--serial", required=True, help="Explicit ADB serial from adb devices -l")
    parser.add_argument("--adb", default=shutil.which("adb") or "adb")
    parser.add_argument("--artifact-dir", type=Path, default=Path(__file__).resolve().parent)
    parser.add_argument("--install-on-empty-device", action="store_true")
    args = parser.parse_args()
    verify_files(args.artifact_dir)
    adb = [args.adb, "-s", args.serial]
    print(inspect_device(adb))
    if not args.install_on_empty_device:
        print("Preflight passed; no app was installed or changed.")
        return
    # Modern PackageManager defaults to replacement, even without -r. Explicit
    # -R disables replacement atomically. Older unsupported tools must fail;
    # never retry without -R. No downgrade, uninstall, or pm clear.
    inspect_device(adb)
    print(run(adb + ["install-multiple", "-R", "--no-incremental"] +
              [str((args.artifact_dir / name).resolve()) for name in NAMES]))


if __name__ == "__main__":
    try:
        main()
    except (RuntimeError, OSError, ValueError) as error:
        raise SystemExit(str(error))
