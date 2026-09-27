package ba;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba.a.b f20920a = new ba.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ba.a.b f20922b = new ba.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ba.a.e f20924c = new ba.a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ba.a.c f20926d = new ba.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ba.a.f f20928e = new ba.a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final ba.a.f f20930f = new ba.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final ba.a.f f20932g = new ba.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ba.a.f f20934h = new ba.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ba.a.f f20936i = new ba.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ba.a.f f20938j = new ba.a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ba.a.c f20939k = new ba.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ba.a.c f20940l = new ba.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ba.a.c f20941m = new ba.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ba.a.c f20942n = new ba.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ba.a.c f20943o = new ba.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ba.a.c f20944p = new ba.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ba.a.b f20945q = new ba.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ba.a.b f20946r = new ba.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ba.a.c f20947s = new ba.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ba.a.f f20948t = new ba.a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ba.a.c f20949u = new ba.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ba.a.b f20950v = new ba.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ba.a.b f20951w = new ba.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ba.a.f f20952x = new ba.a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ba.a.f f20953y = new ba.a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ba.a.f f20954z = new ba.a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final ba.a.b A = new ba.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final ba.a.b B = new ba.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final ba.a.d C = new ba.a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final ba.a.b D = new ba.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final ba.a.b E = new ba.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final ba.a.b F = new ba.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final ba.a.b G = new ba.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final ba.a.e H = new ba.a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final ba.a.e I = new ba.a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final ba.a.h J = new ba.a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final ba.a.h K = new ba.a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final ba.a.g L = new ba.a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final t1.b M = new t1.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final t1.a N = new t1.a(aa.y.X, u1.f20999b);
    public static final ba.a.h O = new ba.a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final ba.a.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final ba.a.d Q = new ba.a.d(aa.y.L, my.b.J);
    public static final ba.a.d R = new ba.a.d(aa.y.M, my.b.Q);
    public static final ba.a.h S = new ba.a.h("FORCE_DARK", "FORCE_DARK");
    public static final ba.a.d T = new ba.a.d(aa.y.O, my.b.S);
    public static final ba.a.d U = new ba.a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final ba.a.d V = new ba.a.d(aa.y.R, my.b.V);
    public static final ba.a.d W = new ba.a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final ba.a.d X = new ba.a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final ba.a.d Y = new ba.a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final ba.a.d Z = new ba.a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public static final ba.a.d f20921a0 = new ba.a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final ba.a.d f20923b0 = new ba.a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final ba.a.d f20925c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final ba.a.d f20927d0 = new ba.a.d(aa.y.f4613b0, my.b.f115477g0);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final ba.a.d f20929e0 = new ba.a.d(aa.y.f4615c0, my.b.f115479h0);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public static final ba.a.d f20931f0 = new ba.a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final ba.a.d f20933g0 = new ba.a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final ba.a.d f20935h0 = new ba.a.d(aa.y.f4621f0, my.b.f115483j0);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final ba.a.d f20937i0 = new ba.a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ba.a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Pattern f20955d;

        public a(String str, String str2) {
            super(str, str2);
            this.f20955d = Pattern.compile("\\A\\d+");
        }

        @Override // ba.a
        public boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            PackageInfo packageInfoF = aa.x.f();
            if (packageInfoF == null) {
                return false;
            }
            Matcher matcher = this.f20955d.matcher(packageInfoF.versionName);
            return matcher.find() && Integer.parseInt(packageInfoF.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends ba.a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public boolean d() {
            if (super.d() && aa.y.a(aa.y.M)) {
                return aa.x.t();
            }
            return false;
        }
    }

    @NonNull
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(@NonNull String str, @NonNull Context context) {
        return c(str, t1.g(), context);
    }

    @k.h1
    public static boolean c(@NonNull String str, @NonNull Collection<t1> collection, @NonNull Context context) {
        HashSet hashSet = new HashSet();
        for (t1 t1Var : collection) {
            if (t1Var.b().equals(str)) {
                hashSet.add(t1Var);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((t1) it.next()).d(context)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(@NonNull String str) {
        return e(str, ba.a.e());
    }

    @k.h1
    public static <T extends e1> boolean e(@NonNull String str, @NonNull Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((e1) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
