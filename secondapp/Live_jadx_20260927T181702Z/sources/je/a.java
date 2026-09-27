package je;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f99787a = "TRuntime.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99788b = 23;

    public static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void b(String str, String str2) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, String.format(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        String strG = g(str);
        if (Log.isLoggable(strG, 3)) {
            Log.d(strG, String.format(str2, objArr));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        String strG = g(str);
        if (Log.isLoggable(strG, 6)) {
            Log.e(strG, str2, th2);
        }
    }

    public static String g(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a(f99787a, str);
        }
        return f99787a + str;
    }

    public static void h(String str, String str2, Object obj) {
        String strG = g(str);
        if (Log.isLoggable(strG, 4)) {
            Log.i(strG, String.format(str2, obj));
        }
    }

    public static void i(String str, String str2, Object obj) {
        String strG = g(str);
        if (Log.isLoggable(strG, 5)) {
            Log.w(strG, String.format(str2, obj));
        }
    }
}
