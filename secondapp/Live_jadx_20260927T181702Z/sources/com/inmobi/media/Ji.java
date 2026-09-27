package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f54934a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f54935b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f54936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f54937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dr.i0 f54938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f54939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f54940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jv.s0 f54941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f54942i;

    static {
        String name = Ji.class.getSimpleName();
        f54937d = new AtomicBoolean();
        f54938e = dr.k0.b(new ds.a() { // from class: com.inmobi.media.es
            @Override // ds.a
            public final Object invoke() {
                return Ji.a();
            }
        });
        kotlin.jvm.internal.m0.o(name, "TAG");
        kotlin.jvm.internal.m0.p(name, "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new B9(name, false));
        f54940g = COMPONENT_SERVICE;
        kotlin.jvm.internal.m0.o(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        f54941h = jv.t0.a(jv.b2.d(COMPONENT_SERVICE));
    }

    public static final C4114xc a() {
        return new C4114xc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e10) {
                try {
                    throw new Zk(e10.getMessage());
                } catch (Zk e11) {
                    kotlin.jvm.internal.m0.o("Ji", "TAG");
                    e11.getMessage();
                    dr.i0 i0Var = P9.f55304a;
                    P9.a(new L2(e11));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        kotlin.jvm.internal.m0.o("Ji", "TAG");
                    } catch (Exception e12) {
                        kotlin.jvm.internal.m0.o("Ji", "TAG");
                        e12.getMessage();
                        kotlin.jvm.internal.m0.o("Ji", "TAG");
                        dr.i0 i0Var2 = P9.f55304a;
                        AbstractC3738i9.a(e12);
                    }
                    return str;
                } catch (Exception e13) {
                    kotlin.jvm.internal.m0.o("Ji", "TAG");
                    e13.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        kotlin.jvm.internal.m0.m(defaultUserAgent);
        return defaultUserAgent;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return f54942i == 2;
    }

    public static void a(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        try {
            T6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e10) {
            kotlin.jvm.internal.m0.o("Ji", "TAG");
            e10.getMessage();
        }
    }

    public static final String c() {
        if (f54935b.length() == 0) {
            f54935b = b(f54934a);
        }
        return f54935b;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.m0.p(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = f54934a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f54559b;
        Ea eaA = Da.a(context, "coppa_store");
        kotlin.jvm.internal.m0.p("im_accid", "key");
        return eaA.f54560a.getString("im_accid", null);
    }
}
