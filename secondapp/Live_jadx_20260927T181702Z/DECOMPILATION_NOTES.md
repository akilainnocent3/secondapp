# Decompilation notes

- APK: `Live.apk` (89,397,197 bytes).
- SHA-256 before and after: `c619b30bd6c98bdf675963ef746bd34d751cc6cf088b89e9328f1ea5bee5277e` (unchanged).
- JADX: `1.5.6`, official release https://github.com/skylot/jadx/releases/tag/v1.5.6. Download and installation kept under `/tmp`.
- Java:
```text
openjdk version "25.0.4.1" 2026-08-18 LTS
OpenJDK Runtime Environment Microsoft-14951822 (build 25.0.4.1+1-LTS)
OpenJDK 64-Bit Server VM Microsoft-14951822 (build 25.0.4.1+1-LTS, mixed mode, sharing)
```

Exact command (stdout and stderr captured in `decompile.log`):
```sh
JADX_CONFIG_DIR=/tmp/secondapp-jadx-1.5.6-eisoiqu3/config JADX_CACHE_DIR=/tmp/secondapp-jadx-1.5.6-eisoiqu3/cache JADX_OPTS=-Xmx3g /tmp/secondapp-jadx-1.5.6-eisoiqu3/bin/jadx -j 2 -d /workspaces/codespaces-blank/secondapp/Live_jadx_20260927T181702Z /workspaces/codespaces-blank/secondapp/Live.apk
```

- Actual JADX exit status: **3**; finished with **47 reported errors**. Generated results preserved without manual source edits.
- Sources: `sources/` (32,711 Java files).
- Resources: `resources/` (2,615 files).
- Decoded manifest: `resources/AndroidManifest.xml` (verified parseable XML).
- Exported assets: `resources/assets/` (20 of 22 original asset entries exported as files). The two asset DEX files were consumed as source inputs and are represented in `sources/`, rather than copied as raw resources. `mbridge_download_dialog_view.xml` and `rv_binddatas.xml` were decoded to parseable XML and therefore differ in bytes from their original binary XML. All other exported assets match the original bytes.
- Generated source annotations represent all 11 APK DEX entries, including the two under `assets/audience_network/`. No dependency filters were used.

Limitations: Some methods/classes could not be fully reconstructed; generated code contains JADX diagnostics and fallback code. See `decompile.log` and `decompilation_error_locations.txt` (13 explicit source error markers; these are not a one-to-one count of JADX's 47 errors). Error categories include type fixing, region construction/overflow, and method code generation. The last progress display was 64%, but JADX then emitted its final error summary and exited; the displayed percentage is not a completeness guarantee. Decompiled code is review material, not a verified buildable Android Studio project. Native binaries are resources, not decompiled Java.

Earlier attempts are preserved in `/workspaces/codespaces-blank/secondapp/Live_jadx`: initial exit 1 due to a read-only default config directory (resolved by using `/tmp`), followed by exit 143 at 33% for an undetermined reason. This final retry used a 3 GiB heap cap and two workers. No rebuild or re-signing was performed.
