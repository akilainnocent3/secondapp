package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pgt {
    public static int a = 3;

    public static void a(String str, String str2) {
        String strH = h(str);
        if (g(3, strH)) {
            Log.d(strH, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String strH = h(str);
        if (g(3, strH)) {
            Log.d(strH, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String strH = h(str);
        if (g(6, strH)) {
            Log.e(strH, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strH = h(str);
        if (g(6, strH)) {
            Log.e(strH, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String strH = h(str);
        if (g(4, strH)) {
            Log.i(strH, str2);
        }
    }

    public static boolean f(String str) {
        return g(3, h(str));
    }

    public static boolean g(int i, String str) {
        return a <= i || Log.isLoggable(str, i);
    }

    public static String h(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void i(String str, String str2) {
        String strH = h(str);
        if (g(5, strH)) {
            Log.w(strH, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        String strH = h(str);
        if (g(5, strH)) {
            Log.w(strH, str2, th);
        }
    }
}
