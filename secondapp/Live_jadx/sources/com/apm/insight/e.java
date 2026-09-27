package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f25893a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f25894b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f25895c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f25896d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25897e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f25898f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f25901i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f25906n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f25899g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f25900h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f25902j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f25903k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f25904l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f25905m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25907o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f25908p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f25909q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f25910r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f25911s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f25912t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f25913u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f25898f == null) {
            f25898f = g.a(f25893a);
        }
        return f25898f;
    }

    public static a b() {
        return f25900h;
    }

    public static g c() {
        if (f25902j == null) {
            synchronized (e.class) {
                f25902j = new g();
            }
        }
        return f25902j;
    }

    public static void d(boolean z10) {
        f25911s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f25903k == null) {
            synchronized (f25904l) {
                try {
                    if (f25903k == null) {
                        f25903k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f25903k;
    }

    public static Context g() {
        return f25893a;
    }

    public static Application h() {
        return f25894b;
    }

    public static ConfigManager i() {
        return f25899g;
    }

    public static long j() {
        return f25895c;
    }

    public static String k() {
        return f25896d;
    }

    public static void l() {
        f25907o = 1;
    }

    public static int m() {
        return f25907o;
    }

    public static boolean n() {
        return f25897e;
    }

    public static void o() {
        f25897e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f25901i;
    }

    public static int q() {
        return f25905m;
    }

    public static String r() {
        return f25906n;
    }

    public static boolean s() {
        return f25908p;
    }

    public static boolean t() {
        return f25909q;
    }

    public static boolean u() {
        return f25910r;
    }

    public static boolean v() {
        return f25911s;
    }

    public static boolean w() {
        return f25913u;
    }

    public static boolean x() {
        return f25912t;
    }

    public static void b(int i10, String str) {
        f25905m = i10;
        f25906n = str;
    }

    public static boolean d() {
        if (!f25899g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f25913u = z10;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f25898f = bVar;
    }

    public static void b(boolean z10) {
        f25909q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f25894b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f25894b == null) {
            f25895c = System.currentTimeMillis();
            f25893a = context;
            f25894b = application;
            f25903k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f25910r = z10;
    }

    public static void f(boolean z10) {
        f25912t = z10;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f25898f = new com.apm.insight.nativecrash.b(f25893a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append(lk.e.f104695m);
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f25895c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(String str) {
        f25896d = str;
    }

    public static void a(int i10, String str) {
        if (f25901i == null) {
            synchronized (e.class) {
                try {
                    if (f25901i == null) {
                        f25901i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f25901i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f25908p = z10;
    }
}
