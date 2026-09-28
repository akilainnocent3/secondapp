# SoccerArena implementation

Django API/admin, Flutter account UI, and the native Android account integration
live here alongside the untouched reference APK/JADX trees. The user confirmed the
rebuilt Android baseline opens, loads channels, and plays video/audio. An installable
Android integration now adds native authentication and ad suppression; its phone
runtime remains unverified. The web catalog/playback adapter remains outstanding.

* [Android package, installation, verification, and signing backup](docs/android-release-20260928.md)

* [Backend deployment and operations](backend/deployment/README.md)
* [Current build preparation and verification](docs/build-preparation-20260928.md)
* [Samsung phone testing checklist](docs/samsung-baseline-checklist.md)
* [Earlier verification and limitations](docs/verification.md)
* [Inspection](docs/inspection.md) and [architecture](docs/architecture.md)
* [API contract](docs/API.md) and [admin guide](docs/admin-guide.md)
* [Feature parity](docs/parity.md)
* [Android baseline/recovery scripts](android_integration/README.md)
* [Flutter client](flutter/README.md)

The backend is deployed at https://api.soccerarena.org using Nginx, Gunicorn, and
PostgreSQL under soccerarena.service. See the deployment guide for verified API
behavior and the remaining content-provider limitation. Generated SDKs, local DBs
and build artifacts remain ignored/outside tracked source. The original references
have an independently repeatable hash audit.
