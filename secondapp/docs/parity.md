# Feature and preservation status

| Feature | Shared account / web | Original Android integration |
| --- | --- | --- |
| Signup, username login | Implemented | Native account UI implemented; device runtime unverified |
| Seven-day trial, paid access | Backend enforced | Native server verification and bounded lease implemented |
| Renewal, dynamic contacts | Implemented | Native Account entry and support screen implemented |
| Payment history, deletion | Implemented | Native UI implemented; device runtime unverified |
| Categories/channels/events/search | Outstanding provider-backed web implementation | Original DEX preserved |
| Favorites | Outstanding web implementation | Original Room behavior preserved in reference |
| Match information | Outstanding web implementation | Original fragments recovered for analysis |
| Actual playback/headers/DRM | NOT RUN; no authorized web contract established | User confirmed baseline video/audio; integrated runtime unverified |
| PiP/Cast/TV/notifications | Not web parity | Native activity guards and playback cleanup added; runtime unverified |
| Ad removal | Account UI has no ad dependency | Ad-loading paths patched; runtime absence not verified |

The Flutter web release is a functioning account interface, **not the completed web
content experience requested**. The content button reaches the protected API and
reports unavailable integration; no fake catalogs, iframe or free-app link substitutes
for playback. Provider-supported catalog access, media CORS/HTTPS/DRM configuration
and representative permitted streams are needed to complete and test the adapter.

Legacy reference map: zero changes to Live.apk, Live_jadx or
Live_jadx_20260927T181702Z. New scripts inspect/rebuild copies. The native integration
and its limits are documented in android-release-20260928.md. Build checks and the
user-confirmed baseline are distinct from integrated-device runtime verification.
Firstapp is unchanged.
