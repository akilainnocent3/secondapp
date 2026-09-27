package dp;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventParameters;
import com.tiktok.appevents.c0;
import com.tiktok.appevents.h0;
import com.tiktok.appevents.m0;
import com.tiktok.appevents.x;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79387a = "dp.c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f79388b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f79389c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static x f79390d = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AtomicBoolean f79397k = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static i f79402p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static kp.h f79403q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static b f79405s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f79406t = -2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static gp.c f79407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static InterfaceC0774c f79408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static f f79409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static g f79410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static h f79411y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f79391e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f79392f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f79393g = Boolean.TRUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f79394h = "v1.2";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f79395i = "analytics.us.tiktok.com";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static e f79396j = e.INFO;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static AtomicBoolean f79398l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static AtomicBoolean f79399m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static AtomicBoolean f79400n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f79401o = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f79404r = UUID.randomUUID().toString();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f79412a;

        public a(final Thread.UncaughtExceptionHandler val$existingExHandler) {
            this.f79412a = val$existingExHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable throwable) {
            if (c0.d(throwable)) {
                c0.b(c.f79387a, throwable, 3);
            }
            if (c.q() != null) {
                c.q().a(thread, throwable);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f79412a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, throwable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(Thread thread, Throwable ex2);
    }

    /* JADX INFO: renamed from: dp.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0774c {
        void a(int dumped);

        void b(int diskSize, boolean read);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(String deepLinkUrl, com.tiktok.appevents.a errorData);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e {
        NONE,
        INFO,
        WARN,
        DEBUG;

        public boolean d() {
            return this != NONE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a(int size);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        void a(int toBeSentRequests, int successfulRequest, int failedRequests, int totalRequests, int totalSuccessRequests);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface h {
        void a(int timeLeft);

        void b(int threshold, int left);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface j {
        void fail(int code, String msg);

        void success();
    }

    public c(@NonNull i ttConfig) {
        e eVar = ttConfig.f79424g;
        f79396j = eVar;
        f79403q = new kp.h(f79387a, eVar);
        if (TextUtils.isEmpty(ttConfig.f79419b) || !kp.c.b(ttConfig.f79419b)) {
            ttConfig.f79419b = "";
            f79403q.f("Invalid App Id!", new Object[0]);
        }
        if (ttConfig.f79420c == null || !kp.c.c(ttConfig.f79420c)) {
            ttConfig.f79420c = "";
            ttConfig.f79421d = new String[]{""};
            ttConfig.f79422e = new BigInteger("0");
            f79403q.f("Invalid TikTok App Id!", new Object[0]);
        }
        if (ttConfig.f79434q != null) {
            ttConfig.f79434q = ttConfig.f79434q.trim();
        }
        f79403q.c("appId: %s, TTAppId: %s, autoIapTrack: %s", ttConfig.f79419b, ttConfig.f79420c, Boolean.valueOf(ttConfig.f79432o));
        f79402p = ttConfig;
        gp.c cVar = f79407u;
        if (cVar != null) {
            cVar.c();
        }
        M(f79402p.f79418a);
        f79397k = new AtomicBoolean(ttConfig.f79427j);
        f79398l.set(ttConfig.f79430m);
        if (f79398l.get()) {
            f79401o = d(ttConfig);
        }
        f79399m.set(ttConfig.f79431n);
    }

    public static void A(i ttConfig) {
        B(ttConfig, null);
    }

    public static void B(i ttConfig, final j callback) {
        if (f79388b != null || ttConfig == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        } catch (Exception unused) {
        }
        f79388b = new c(ttConfig);
        m0.j(p(), false);
        x xVar = new x(ttConfig.f79425h, ttConfig.f79428k, ttConfig.f79423f, ttConfig.f79429l);
        f79390d = xVar;
        xVar.D(jCurrentTimeMillis, callback, f79400n);
        try {
            ip.c.e(f79402p.f79432o);
        } catch (Throwable unused2) {
        }
        try {
            f79390d.F("init_end", kp.i.c(null).put("latency", System.currentTimeMillis() - jCurrentTimeMillis), null);
        } catch (Exception unused3) {
        }
    }

    public static boolean C() {
        i iVar = f79402p;
        return iVar != null && iVar.f79433p;
    }

    public static Boolean D() {
        return Boolean.valueOf(f79392f.get());
    }

    public static boolean E() {
        i iVar = f79402p;
        if (iVar == null) {
            return false;
        }
        return iVar.f79426i;
    }

    public static Boolean F() {
        return Boolean.valueOf(f79391e.get());
    }

    public static Boolean G() {
        return Boolean.valueOf(f79398l.get());
    }

    public static Boolean H() {
        return Boolean.valueOf(f79399m.get());
    }

    public static boolean I() {
        return f79388b != null && f79400n.get();
    }

    public static boolean J() {
        if (f79403q == null) {
            return false;
        }
        Boolean boolU = u();
        if (!boolU.booleanValue()) {
            f79403q.c("Global switch is off, ignore all operations", new Object[0]);
        }
        return boolU.booleanValue();
    }

    public static void K() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f79390d.E();
            f79390d.F("logout", kp.i.c(Long.valueOf(jCurrentTimeMillis)).put("latency", System.currentTimeMillis() - jCurrentTimeMillis), null);
        } catch (Exception unused) {
        }
    }

    public static boolean L() {
        i iVar = f79402p;
        return iVar == null || iVar.f79420c == null;
    }

    public static void M(Application context) {
        if (context == null || f79407u != null) {
            return;
        }
        gp.c cVar = new gp.c();
        f79407u = cVar;
        context.registerActivityLifecycleCallbacks(cVar);
    }

    public static void N(String apiAvailableVersion) {
        f79394h = apiAvailableVersion;
    }

    public static void O(String apiTrackDomain) {
        f79395i = apiTrackDomain;
    }

    public static void P() {
        f79391e.set(true);
    }

    public static void Q(b crashListener) {
        f79405s = crashListener;
    }

    public static void R(Boolean sdkGlobalSwitch) {
        f79393g = sdkGlobalSwitch;
    }

    public static void S(f ml2, InterfaceC0774c dl2, g nl2, h nfl) {
        if (ml2 != null) {
            f79409w = ml2;
        }
        if (dl2 != null) {
            f79408v = dl2;
        }
        if (nl2 != null) {
            f79410x = nl2;
        }
        if (nfl != null) {
            f79411y = nfl;
        }
        j();
    }

    public static void T() {
        if (f79390d == null || f79397k.get()) {
            return;
        }
        f79397k.set(true);
        f79390d.A();
    }

    @Deprecated
    public static void U(String event) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.N(event, null);
    }

    @Deprecated
    public static void V(String event, String eventId) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.O(event, null, eventId);
    }

    @Deprecated
    public static void W(String event, @Nullable JSONObject props) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.O(event, props, "");
    }

    @Deprecated
    public static void X(String event, @Nullable JSONObject props, String eventId) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.O(event, props, eventId);
    }

    public static void Y(h0 info) {
        Z(Collections.singletonList(info));
    }

    public static void Z(List<h0> purchaseInfos) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.R(purchaseInfos);
    }

    public static boolean a() {
        return !L();
    }

    public static void a0(ep.a event) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.N(event.toString(), null);
    }

    public static void b() {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.r();
    }

    public static void b0(ep.a event, String eventId) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.O(event.toString(), null, eventId);
    }

    public static void c() {
        throw new RuntimeException("force crash from sdk");
    }

    public static void c0(ep.c event) {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.O(event.f81495b, event.f81494a, event.f81496c);
    }

    public static void d0(String accessToken) {
        if (I() && !TextUtils.isEmpty(accessToken)) {
            f79402p.f79434q = accessToken.trim();
        }
    }

    public static void e() {
        f79388b = null;
        f79409w = null;
        f79408v = null;
        f79410x = null;
        f79411y = null;
        x xVar = f79390d;
        if (xVar != null) {
            xVar.u();
        }
    }

    public static void f() {
        f79392f.set(false);
    }

    public static boolean g() {
        i iVar = f79402p;
        return iVar != null && iVar.G();
    }

    public static void h() {
        f79392f.set(true);
    }

    public static void i(d callback) {
        if (callback == null) {
            return;
        }
        try {
            if (f79390d == null || !J()) {
                callback.a(null, new com.tiktok.appevents.a(-1, com.tiktok.appevents.a.f76015e));
            }
            f79390d.w(callback);
        } catch (Throwable unused) {
        }
    }

    public static void j() {
        x xVar = f79390d;
        if (xVar == null) {
            return;
        }
        xVar.A();
    }

    public static String k() {
        return f79402p.f79434q;
    }

    public static String l() {
        return f79394h;
    }

    public static String m() {
        return f79395i;
    }

    public static x n() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (c0.e((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 3, stackTrace.length))) {
            return f79390d;
        }
        return null;
    }

    public static String o() {
        i iVar = f79402p;
        return iVar == null ? "" : iVar.f79419b;
    }

    public static Application p() {
        if (f79388b == null) {
            return null;
        }
        return f79402p.f79418a;
    }

    public static b q() {
        return f79405s;
    }

    public static BigInteger r() {
        i iVar = f79402p;
        return iVar == null ? new BigInteger("0") : iVar.f79422e;
    }

    public static e s() {
        return f79396j;
    }

    public static boolean t() {
        return f79397k.get();
    }

    public static Boolean u() {
        return f79393g;
    }

    public static String v() {
        return f79404r;
    }

    public static String w() {
        i iVar = f79402p;
        return iVar == null ? "" : iVar.f79420c;
    }

    public static String[] x() {
        i iVar = f79402p;
        return iVar == null ? new String[0] : iVar.f79421d;
    }

    public static String y() {
        return f79401o;
    }

    public static void z(String externalId, @Nullable String externalUserName, @Nullable String phoneNumber, @Nullable String email) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (f79390d.C(externalId, externalUserName, phoneNumber, email)) {
                f79390d.F("identify", kp.i.c(Long.valueOf(jCurrentTimeMillis)).put("latency", System.currentTimeMillis() - jCurrentTimeMillis).put("extid", externalId != null).put(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, externalUserName != null).put("phone", phoneNumber != null).put("email", email != null), null);
            }
        } catch (Exception unused) {
        }
    }

    public final String d(@NonNull i ttConfig) {
        return (ttConfig == null || ttConfig.f79420c == null) ? "" : ttConfig.f79420c.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Application f79418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f79419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f79420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String[] f79421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public BigInteger f79422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f79423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f79424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f79425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f79426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f79427j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List<kp.e.b> f79428k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f79429l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f79430m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f79431n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f79432o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f79433p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f79434q;

        @Deprecated
        public i(Context context) {
            this.f79419b = "";
            this.f79420c = "";
            this.f79421d = new String[]{""};
            this.f79422e = new BigInteger("0");
            this.f79423f = 15;
            this.f79424g = e.NONE;
            this.f79425h = true;
            this.f79426i = true;
            this.f79427j = true;
            this.f79429l = false;
            this.f79430m = false;
            this.f79431n = false;
            this.f79432o = false;
            this.f79433p = true;
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            this.f79418a = (Application) context.getApplicationContext();
            this.f79428k = new ArrayList();
        }

        public i A() {
            this.f79428k.add(kp.e.b.InstallApp);
            return this;
        }

        public i B() {
            this.f79428k.add(kp.e.b.LaunchAPP);
            return this;
        }

        public i C() {
            this.f79429l = true;
            return this;
        }

        public i D() {
            this.f79428k.add(kp.e.b.SecondDayRetention);
            return this;
        }

        public i E() {
            this.f79432o = true;
            return this;
        }

        public i F() {
            this.f79431n = true;
            return this;
        }

        public boolean G() {
            return this.f79432o;
        }

        public i H() {
            this.f79430m = true;
            return this;
        }

        public i I(String apiId) {
            if (!TextUtils.isEmpty(apiId)) {
                this.f79419b = apiId;
            }
            return this;
        }

        public i J(int seconds) {
            if (seconds < 0) {
                throw new RuntimeException("Invalid Flush interval");
            }
            this.f79423f = seconds;
            return this;
        }

        public i K(boolean isLowPerformanceDevice) {
            this.f79433p = this.f79433p && !isLowPerformanceDevice;
            return this;
        }

        public i L(e ll2) {
            this.f79424g = ll2;
            return this;
        }

        public i M(String ttAppId) {
            this.f79420c = ttAppId;
            try {
                this.f79421d = ttAppId.replace(" ", "").split(",");
                this.f79422e = new BigInteger(this.f79421d[0]);
            } catch (Throwable unused) {
            }
            return this;
        }

        public i w() {
            this.f79426i = false;
            return this;
        }

        public i x() {
            this.f79433p = false;
            return this;
        }

        public i y() {
            this.f79425h = false;
            return this;
        }

        public i z() {
            this.f79427j = false;
            return this;
        }

        public i(Context context, String accessToken) {
            this(context);
            this.f79434q = accessToken;
        }
    }
}
