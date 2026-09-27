# SoccerArena implementation

Django API/admin and Flutter account UI live here alongside the untouched reference
APK/JADX trees. This is **not a completed protected Android or content-capable web
release**: Android needs matching splits and a verified device baseline; the web
catalog/playback adapter remains outstanding.

* [Backend deployment and operations](backend/deployment/README.md)
* [Verification and exact limitations](docs/verification.md)
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
