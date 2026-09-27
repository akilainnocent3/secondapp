# Partial decompilation

APK: `Live.apk`

SHA-256: `c619b30bd6c98bdf675963ef746bd34d751cc6cf088b89e9328f1ea5bee5277e`

Java:
```text
openjdk version "25.0.4.1" 2026-08-18 LTS
OpenJDK Runtime Environment Microsoft-14951822 (build 25.0.4.1+1-LTS)
OpenJDK 64-Bit Server VM Microsoft-14951822 (build 25.0.4.1+1-LTS, mixed mode, sharing)
```

JADX: 1.5.6

Command:
```sh
JADX_CONFIG_DIR=/tmp/secondapp-jadx-1.5.6-eisoiqu3/config JADX_CACHE_DIR=/tmp/secondapp-jadx-1.5.6-eisoiqu3/cache /tmp/secondapp-jadx-1.5.6-eisoiqu3/bin/jadx -d /workspaces/codespaces-blank/secondapp/Live_jadx /workspaces/codespaces-blank/secondapp/Live.apk
```

Sources: `sources/`; resources: `resources/`; decoded manifest: `resources/AndroidManifest.xml`.

Initial invocation exited 1 because the default config directory was read-only; resolved using config/cache directories in /tmp. Retry terminated at 33% with actual exit status 143; cause not established. See `decompile.log`. Partial generated output is preserved without manual changes. A further attempt is in `/workspaces/codespaces-blank/secondapp/Live_jadx_20260927T181702Z`. This is decompiled review material, not a verified buildable Android Studio project.

Final APK SHA-256 was verified unchanged: `c619b30bd6c98bdf675963ef746bd34d751cc6cf088b89e9328f1ea5bee5277e`.
