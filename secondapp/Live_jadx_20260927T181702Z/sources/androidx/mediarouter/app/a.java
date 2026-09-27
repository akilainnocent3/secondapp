package androidx.mediarouter.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Boolean f17693a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Boolean f17694b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Boolean f17695c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static Boolean f17696d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static Boolean f17697e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static Boolean f17698f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static Boolean f17699g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17700h = "android.hardware.type.automotive";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f17701i = "com.google.android.tv";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f17702j = "android.hardware.type.television";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f17703k = "android.software.leanback";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @q(unit = 0)
    public static final int f17704l = 600;

    public static String a(@NonNull Context context) {
        if (e(context) || d(context)) {
            return context.getString(q7.a.j.f121990l);
        }
        if (h(context) || f(context)) {
            return context.getString(q7.a.j.f121991m);
        }
        if (j(context)) {
            return context.getString(q7.a.j.f121992n);
        }
        if (l(context)) {
            return context.getString(q7.a.j.f121994p);
        }
        return b(context) ? context.getString(q7.a.j.f121989k) : context.getString(q7.a.j.f121993o);
    }

    public static boolean b(@NonNull Context context) {
        return c(context.getPackageManager());
    }

    public static boolean c(@NonNull PackageManager packageManager) {
        if (f17698f == null) {
            f17698f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature(f17700h));
        }
        return f17698f.booleanValue();
    }

    public static boolean d(@NonNull Context context) {
        if (f17695c == null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            f17695c = Boolean.valueOf((Build.VERSION.SDK_INT < 30 || sensorManager == null || sensorManager.getDefaultSensor(36) == null) ? false : true);
        }
        return f17695c.booleanValue();
    }

    public static boolean e(@NonNull Context context) {
        if (f17693a == null) {
            f17693a = Boolean.valueOf((h(context) || l(context) || b(context) || j(context)) ? false : true);
        }
        return f17693a.booleanValue();
    }

    public static boolean f(@NonNull Context context) {
        return g(context.getResources());
    }

    public static boolean g(@NonNull Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f17696d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            f17696d = Boolean.valueOf(z10);
        }
        return f17696d.booleanValue();
    }

    public static boolean h(@NonNull Context context) {
        return i(context.getResources());
    }

    public static boolean i(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (f17694b == null) {
            f17694b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || g(resources));
        }
        return f17694b.booleanValue();
    }

    public static boolean j(@NonNull Context context) {
        return k(context.getPackageManager());
    }

    public static boolean k(@NonNull PackageManager packageManager) {
        if (f17699g == null) {
            f17699g = Boolean.valueOf(packageManager.hasSystemFeature(f17701i) || packageManager.hasSystemFeature(f17702j) || packageManager.hasSystemFeature(f17703k));
        }
        return f17699g.booleanValue();
    }

    public static boolean l(@NonNull Context context) {
        return m(context.getPackageManager());
    }

    public static boolean m(@NonNull PackageManager packageManager) {
        if (f17697e == null) {
            f17697e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f17697e.booleanValue();
    }
}
