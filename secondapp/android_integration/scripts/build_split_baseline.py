#!/usr/bin/env python3
"""Rebuild an unchanged split set with Apktool, align, test-sign, and audit it.

This is a container rebuild, not a Java/Flutter source build or an app update.
Outputs must be new directories. Inputs and existing work are never overwritten.
"""
import argparse
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import zipfile

ROOT = Path(__file__).resolve().parents[2]
PACKAGE = "com.sports.live.football.tv"
NAMES = ("base.apk", "split_config.arm64_v8a.apk", "split_config.en.apk", "split_config.xhdpi.apk")


def digest(path):
    with path.open("rb") as file:
        return hashlib.file_digest(file, "sha256").hexdigest()


def signing_entry(name):
    return name == "stamp-cert-sha256" or bool(re.fullmatch(
        r"META-INF/(?:MANIFEST\.MF|[^/]+\.(?:SF|RSA|DSA|EC))", name, re.I))


def payload(path):
    with zipfile.ZipFile(path) as archive:
        if len(archive.namelist()) != len(set(archive.namelist())):
            raise RuntimeError(f"Duplicate ZIP entries: {path.name}")
        return {i.filename: hashlib.sha256(archive.read(i)).hexdigest()
                for i in archive.infolist() if not i.is_dir() and not signing_entry(i.filename)}


def run(command, log=None):
    result = subprocess.run([str(x) for x in command], text=True, capture_output=True)
    if log:
        log.write_text(result.stdout + result.stderr)
    if result.returncode:
        raise RuntimeError(f"Command failed ({result.returncode}): {command}\n{result.stderr[-3000:]}")
    return result.stdout


def signer(tool, apk, log):
    output = run([tool, "verify", "--verbose", "--print-certs", apk], log)
    certs = re.findall(r"Signer #\d+ certificate SHA-256 digest: ([0-9a-f]+)", output)
    if len(certs) != 1:
        raise RuntimeError(f"Expected exactly one signer: {apk.name}")
    return certs[0]


def normalize(source, dest):
    # Apktool/ZIP timestamps are not reproducible. Keep compression methods and all
    # non-signing payload bytes while sorting entries and fixing container metadata.
    with zipfile.ZipFile(source) as src, zipfile.ZipFile(dest, "w") as dst:
        for entry in sorted(src.infolist(), key=lambda i: i.filename):
            if entry.is_dir() or signing_entry(entry.filename):
                continue
            info = zipfile.ZipInfo(entry.filename, (1980, 1, 1, 0, 0, 0))
            info.compress_type = entry.compress_type
            info.create_system = 3
            info.external_attr = 0o100644 << 16
            dst.writestr(info, src.read(entry), compresslevel=9)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--sdk", type=Path, default=Path("/tmp/soccerarena-android-sdk"))
    parser.add_argument("--apktool", type=Path, default=Path("/tmp/soccerarena-apktool.jar"))
    parser.add_argument("--out", type=Path, required=True, help="New output directory")
    parser.add_argument("--test-key", type=Path, required=True, help="Disposable RSA key; reused for reproducibility")
    args = parser.parse_args()
    args.out = args.out.resolve()
    args.test_key = args.test_key.resolve()
    bt = args.sdk.resolve() / "build-tools/36.0.0"
    for tool in (bt / "apksigner", bt / "aapt", bt / "zipalign", args.apktool):
        if not tool.is_file():
            parser.error(f"Missing tool: {tool}")
    inventory = json.loads((ROOT / "docs/split-baseline-inventory.json").read_text())
    archive = ROOT / inventory["archive"]
    if digest(archive) != inventory["sha256"]:
        raise RuntimeError("Input APKS hash differs from verified inventory")
    if digest(ROOT / "Live.apk") != inventory["apks"][0]["sha256"]:
        raise RuntimeError("Original Live.apk hash differs from verified base")
    args.out.mkdir(parents=True, exist_ok=False)
    for name in ("original", "rebuilt", "logs", "work"):
        (args.out / name).mkdir()
    with zipfile.ZipFile(archive) as src:
        if sorted(n for n in src.namelist() if n.endswith(".apk")) != sorted(NAMES):
            raise RuntimeError("Unexpected split set")
        for item in inventory["apks"]:
            dest = args.out / "original" / item["name"]
            dest.write_bytes(src.read(item["name"]))
            if digest(dest) != item["sha256"]:
                raise RuntimeError(f"Input hash mismatch: {dest.name}")

    # Test credentials only; never use this keystore for a release.
    os.environ["ARENA_TEST_KEY_PASSWORD"] = "android"
    if not args.test_key.exists():
        args.test_key.parent.mkdir(parents=True, exist_ok=True)
        run(["keytool", "-genkeypair", "-keystore", args.test_key, "-storepass:env",
             "ARENA_TEST_KEY_PASSWORD", "-keypass:env", "ARENA_TEST_KEY_PASSWORD",
             "-alias", "baseline-test", "-keyalg", "RSA", "-keysize", "2048",
             "-validity", "3650", "-dname", "CN=SoccerArena Baseline TEST ONLY", "-noprompt"])
        args.test_key.chmod(0o600)

    report = {"package": PACKAGE, "version_code": 338, "version_name": "3.3.8",
              "input_apks_sha256": inventory["sha256"],
              "build_tools": "36.0.0", "apktool_sha256": digest(args.apktool),
              "kind": "unchanged payload, test-signed container rebuild; NOT an upgrade",
              "runtime": "NOT RUN", "apks": []}
    for name in NAMES:
        print(f"Verifying and rebuilding {name}...", flush=True)
        original = args.out / "original" / name
        logs = args.out / "logs"
        original_cert = signer(bt / "apksigner", original, logs / f"{name}.original-signature.txt")
        badging = run([bt / "aapt", "dump", "badging", original])
        package_line = badging.splitlines()[0]
        if f"name='{PACKAGE}'" not in package_line or "versionCode='338'" not in package_line:
            raise RuntimeError(f"Unexpected package/version: {package_line}")
        expected_split = name.removeprefix("split_").removesuffix(".apk")
        if name != "base.apk" and f"split='{expected_split}'" not in package_line:
            raise RuntimeError(f"Unexpected split manifest: {package_line}")
        work = args.out / "work" / name
        run(["java", "-jar", args.apktool, "d", "-s", "-r", "-p", args.out / "work/framework",
             original, "-o", work], logs / f"{name}.decode.txt")
        raw = args.out / "work" / f"{name}.raw"
        run(["java", "-jar", args.apktool, "b", "-p", args.out / "work/framework",
             work, "-o", raw], logs / f"{name}.build.txt")
        expected = payload(original)
        if payload(raw) != expected:
            raise RuntimeError(f"Apktool changed non-signing payload: {name}")
        canonical = args.out / "work" / f"{name}.canonical"
        aligned = args.out / "work" / f"{name}.aligned"
        normalize(raw, canonical)
        run([bt / "zipalign", "-P", "16", "4", canonical, aligned])
        signed = args.out / "rebuilt" / name
        run([bt / "apksigner", "sign", "--ks", args.test_key, "--ks-key-alias", "baseline-test",
             "--ks-pass", "env:ARENA_TEST_KEY_PASSWORD", "--key-pass", "env:ARENA_TEST_KEY_PASSWORD",
             "--v4-signing-enabled", "false", "--out", signed, aligned], logs / f"{name}.sign.txt")
        new_cert = signer(bt / "apksigner", signed, logs / f"{name}.rebuilt-signature.txt")
        run([bt / "zipalign", "-c", "-P", "16", "4", signed], logs / f"{name}.alignment.txt")
        if payload(signed) != expected:
            raise RuntimeError(f"Signed build changed non-signing payload: {name}")
        report["apks"].append({"name": name, "original_sha256": digest(original),
            "rebuilt_sha256": digest(signed), "original_signer_sha256": original_cert,
            "test_signer_sha256": new_cert, "preserved_payload_entries": len(expected),
            "manifest_identity": package_line, "signature_verified": True, "zip_alignment": "PASS (16 KiB)"})
    for field in ("original_signer_sha256", "test_signer_sha256"):
        if len({x[field] for x in report["apks"]}) != 1:
            raise RuntimeError(f"Split signer mismatch: {field}")
    if report["apks"][0]["original_signer_sha256"] == report["apks"][0]["test_signer_sha256"]:
        raise RuntimeError("Test key unexpectedly matches original signing identity")
    (args.out / "build-report.json").write_text(json.dumps(report, indent=2) + "\n")
    for kind in ("original", "rebuilt"):
        directory = args.out / kind
        (directory / "SHA256SUMS").write_text("".join(f"{digest(directory / n)}  {n}\n" for n in NAMES))
        shutil.copy2(ROOT / "android_integration/scripts/install_baseline.py", directory)
        shutil.copy2(ROOT / "docs/samsung-baseline-checklist.md", directory / "TESTING.md")
        (directory / "README.txt").write_text(
            f"{kind.upper()} BASELINE SPLIT SET — ARM64 only, Android 6/API 23 or later.\n"
            "Not the protected SoccerArena integration. Ads and original behavior remain.\n"
            "Do not install over the working phone app. Installer refuses existing packages,\n"
            "including other Android users. No uninstall, replacement, or data clearing.\n"
            "The rebuilt set uses a disposable test signature; it cannot update the original.\n"
            "Use the current Samsung installation for the original baseline checklist.\n"
            "Rebuilt comparison needs a spare device with this package absent globally.\n"
            "First run: python3 install_baseline.py --serial DEVICE_SERIAL\n"
            "Install on a clean spare only: add --install-on-empty-device\n"
            "See docs/samsung-baseline-checklist.md in the repository.\n")
        with zipfile.ZipFile(args.out / f"{kind}-baseline-arm64.zip", "w", zipfile.ZIP_DEFLATED) as z:
            for file in sorted(directory.iterdir()):
                info = zipfile.ZipInfo(file.name, (1980, 1, 1, 0, 0, 0))
                info.compress_type = zipfile.ZIP_DEFLATED
                z.writestr(info, file.read_bytes())
    print(f"PASS: four rebuilt APKs verified, aligned, and payload-preserved. Artifacts: {args.out}")


if __name__ == "__main__":
    main()
