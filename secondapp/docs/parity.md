# Feature and preservation status

| Feature | Shared account / web | Original Android integration |
| --- | --- | --- |
| Signup, username login | Implemented | Shared code only; host blocked |
| Seven-day trial, paid access | Backend enforced | Native gate not integrated |
| Renewal, dynamic contacts | Implemented | Native Account entry outstanding |
| Payment history, deletion | Implemented | Shared code; not installed in APK |
| Categories/channels/events/search | Outstanding provider-backed web implementation | Original DEX preserved |
| Favorites | Outstanding web implementation | Original Room behavior preserved in reference |
| Match information | Outstanding web implementation | Original fragments recovered for analysis |
| Actual playback/headers/DRM | NOT RUN; no authorized web contract established | Baseline launch blocked |
| PiP/Cast/TV/notifications | Not web parity | Guard integration and runtime checks outstanding |
| Ad removal | Account UI has no ad dependency | Original app ads unchanged; removal outstanding |

The Flutter web release is a functioning account interface, **not the completed web
content experience requested**. The content button reaches the protected API and
reports unavailable integration; no fake catalogs, iframe or free-app link substitutes
for playback. Provider-supported catalog access, media CORS/HTTPS/DRM configuration
and representative permitted streams are needed to complete and test the adapter.

Legacy change map: zero changes to Live.apk, Live_jadx or
Live_jadx_20260927T181702Z. New scripts inspect/rebuild copies. All legacy integration
points that would need modification are listed in android_integration/README.md;
none are presented as implemented or runtime-verified. Firstapp is unchanged.
