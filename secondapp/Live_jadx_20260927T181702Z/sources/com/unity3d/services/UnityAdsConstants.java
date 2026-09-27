package com.unity3d.services;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UnityAdsConstants {

    @l
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;

        @l
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Cache {

        @l
        public static final String CACHE_SCHEME = "unity-ads-cache";

        @l
        public static final String DATASTORE_PATH = "unityAdsDatastore/";

        @l
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ClientInfo {

        @l
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41700;

        @l
        public static final String SDK_VERSION_NAME = "4.17.0";

        private ClientInfo() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultUrls {

        @l
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";

        @l
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";

        @l
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&mode=ad-viewer&";

        @l
        public static final String CACHE_DIR_NAME = "UnityAdsCache";

        @l
        public static final String CACHE_WEBVIEW_DIR_NAME = "webview_cache";

        @l
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";

        @l
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";

        @l
        public static final String HTTP_CACHE_OK_HTTP_DIR_NAME = "UnityAdsOkHttpCache";

        @l
        public static final DefaultUrls INSTANCE = new DefaultUrls();

        @l
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";

        @l
        public static final String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";

        @l
        public static final String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;

        @l
        public static final ErrorHandler INSTANCE = new ErrorHandler();

        private ErrorHandler() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Messages {

        @l
        public static final Messages INSTANCE = new Messages();

        @l
        public static final String MSG_INTERNAL_ERROR = "Internal error";

        @l
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class OpenMeasurement {

        @l
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();

        @l
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";

        @l
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";

        @l
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";

        @l
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";

        @l
        public static final String OM_PARTNER_NAME = "Unity3d";

        @l
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Preferences {

        @l
        public static final Preferences INSTANCE = new Preferences();

        @l
        public static final String PREF_KEY_AUID = "auid";

        @l
        public static final String PREF_KEY_IDFI = "unityads-idfi";

        @l
        public static final String PREF_KEY_UNITY_INSTALLATION_ID = "unity_connect.installation_id";

        @l
        public static final String PREF_KEY_UNITY_MEGA_SESSION_ID = "unity_connect.mega_session_id";

        @l
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";

        @l
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        @l
        private static final String UNITY_PLAYER_PREF_PREFIX = "unity_connect";

        private Preferences() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;

        @l
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        private RequestPolicy() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SafeGuards {

        @l
        public static final SafeGuards INSTANCE = new SafeGuards();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InitRequestRetryPolicy {

            @l
            public static final InitRequestRetryPolicy INSTANCE = new InitRequestRetryPolicy();
            public static final float MAX_JITTER_PCT = 100.0f;
            public static final int MIN_DURATION = 5000;
            public static final float MIN_JITTER_PCT = 0.0f;
            public static final int MIN_MAX_INTERVAL = 0;
            public static final float MIN_SCALING_FACTOR = 0.1f;
            public static final int MIN_WAIT_BASE = 0;

            private InitRequestRetryPolicy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InitRequestTimeoutPolicy {

            @l
            public static final InitRequestTimeoutPolicy INSTANCE = new InitRequestTimeoutPolicy();
            public static final int MIN_TIMEOUT = 1000;

            private InitRequestTimeoutPolicy() {
            }
        }

        private SafeGuards() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;

        @l
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000;

        @l
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    private UnityAdsConstants() {
    }
}
