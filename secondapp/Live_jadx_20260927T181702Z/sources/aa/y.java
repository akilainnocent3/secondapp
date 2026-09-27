package aa;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import ba.g2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static final String A = "WEB_MESSAGE_PORT_CLOSE";
    public static final String B = "WEB_MESSAGE_ARRAY_BUFFER";
    public static final String C = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
    public static final String D = "CREATE_WEB_MESSAGE_CHANNEL";
    public static final String E = "POST_WEB_MESSAGE";
    public static final String F = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
    public static final String G = "GET_WEB_VIEW_CLIENT";
    public static final String H = "GET_WEB_CHROME_CLIENT";
    public static final String I = "GET_WEB_VIEW_RENDERER";
    public static final String J = "WEB_VIEW_RENDERER_TERMINATE";
    public static final String K = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
    public static final String L = "PROXY_OVERRIDE";
    public static final String M = "MULTI_PROCESS";
    public static final String N = "FORCE_DARK";
    public static final String O = "FORCE_DARK_STRATEGY";
    public static final String P = "ALGORITHMIC_DARKENING";
    public static final String Q = "WEB_MESSAGE_LISTENER";
    public static final String R = "DOCUMENT_START_SCRIPT";
    public static final String S = "PROXY_OVERRIDE_REVERSE_BYPASS";
    public static final String T = "GET_VARIATIONS_HEADER";
    public static final String U = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";
    public static final String V = "GET_COOKIE_INFO";
    public static final String W = "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX";
    public static final String X = "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS";

    @y0({y0.a.LIBRARY_GROUP})
    public static final String Y = "REQUESTED_WITH_HEADER_ALLOW_LIST";
    public static final String Z = "USER_AGENT_METADATA";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4610a = "VISUAL_STATE_CALLBACK";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f4611a0 = "MULTI_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4612b = "OFF_SCREEN_PRERASTER";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f4613b0 = "ATTRIBUTION_REGISTRATION_BEHAVIOR";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4614c = "SAFE_BROWSING_ENABLE";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f4615c0 = "WEBVIEW_MEDIA_INTEGRITY_API_STATUS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"IntentName"})
    public static final String f4616d = "DISABLED_ACTION_MODE_MENU_ITEMS";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f4617d0 = "MUTE_AUDIO";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4618e = "START_SAFE_BROWSING";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f4619e0 = "WEB_AUTHENTICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4620f = "SAFE_BROWSING_ALLOWLIST";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f4621f0 = "SPECULATIVE_LOADING_STATUS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final String f4622g = "SAFE_BROWSING_WHITELIST";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f4623g0 = "BACK_FORWARD_CACHE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f4624h = "SAFE_BROWSING_PRIVACY_POLICY_URL";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f4625i = "SERVICE_WORKER_BASIC_USAGE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f4626j = "SERVICE_WORKER_CACHE_MODE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f4627k = "SERVICE_WORKER_CONTENT_ACCESS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f4628l = "SERVICE_WORKER_FILE_ACCESS";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f4629m = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f4630n = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f4631o = "RECEIVE_WEB_RESOURCE_ERROR";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f4632p = "RECEIVE_HTTP_ERROR";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f4633q = "SHOULD_OVERRIDE_WITH_REDIRECTS";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f4634r = "SAFE_BROWSING_HIT";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f4635s = "TRACING_CONTROLLER_BASIC_USAGE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f4636t = "WEB_RESOURCE_REQUEST_IS_REDIRECT";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f4637u = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f4638v = "WEB_RESOURCE_ERROR_GET_CODE";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f4639w = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f4640x = "SAFE_BROWSING_RESPONSE_PROCEED";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f4641y = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f4642z = "WEB_MESSAGE_PORT_POST_MESSAGE";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface b {
    }

    public static boolean a(@NonNull String str) {
        return g2.d(str);
    }

    public static boolean b(@NonNull Context context, @NonNull String str) {
        return g2.b(str, context);
    }
}
