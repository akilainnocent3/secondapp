package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import com.ironsource.C4235d4;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f38991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f38992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r6 f38993d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g7 f38990a = new g7();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f38994e = "not available";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f38995f = "not available";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f38996g = "not available";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f38997h = "not available";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f38998i = "not available";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f38999j = "not available";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f39000k = "not available";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f39001l = "not available";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f39002m = "unknown";

    public final void a(Application app, r6 dm2) {
        kotlin.jvm.internal.m0.p(app, "app");
        kotlin.jvm.internal.m0.p(dm2, "dm");
        if (f38991b) {
            return;
        }
        f38992c = app;
        f38993d = dm2;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.m0.o(MANUFACTURER, "MANUFACTURER");
            f38994e = MANUFACTURER;
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.m0.o(MODEL, "MODEL");
            f38995f = MODEL;
            f38996g = "Android " + Build.VERSION.RELEASE;
            f38997h = n() ? "Amazon" : C4235d4.f61260d;
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            f38998i = country;
            String strM = m();
            if (strM == null) {
                strM = "Cannot retrieve language";
            }
            f38999j = strM;
            f39001l = m3.a();
            String strA = a(app);
            if (strA == null) {
                strA = "Unknown version";
            }
            f39000k = strA;
        } catch (Exception e10) {
            sb.b("Failed to initialize EnvironmentManager", e10);
        }
        f38991b = true;
    }

    public final String b() {
        a();
        return f39000k;
    }

    public final Application c() {
        return f38992c;
    }

    public final String d() {
        a();
        return f38998i;
    }

    public final String e() {
        a();
        return f39002m;
    }

    public final String f() {
        a();
        return f38999j;
    }

    public final String g() {
        a();
        return f38994e;
    }

    public final String h() {
        a();
        return f38995f;
    }

    public final String i() {
        a();
        return f38996g;
    }

    public final String j() {
        a();
        return f38997h;
    }

    public final String k() {
        a();
        return f39001l;
    }

    public final r6 l() {
        a();
        return f38993d;
    }

    public final String m() {
        if (Build.VERSION.SDK_INT < 24) {
            return Locale.getDefault().getLanguage();
        }
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e10) {
            sb.a("Cannot retrieve language", e10);
            return null;
        }
    }

    public final boolean n() {
        return cv.k0.c2("Amazon", Build.MANUFACTURER, true);
    }

    public final boolean o() {
        return f38991b;
    }

    public final String a(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager != null && packageName != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            }
            return null;
        } catch (Exception e10) {
            sb.b("Exception while retrieving appVersion: " + e10.getMessage(), (Throwable) null, 2, (Object) null);
            return null;
        }
    }

    public final void a() {
        if (f38991b) {
            return;
        }
        sb.b("EnvironmentManager not initialized. Call init() first.", (Throwable) null, 2, (Object) null);
    }
}
