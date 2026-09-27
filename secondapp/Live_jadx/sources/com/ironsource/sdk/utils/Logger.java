package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4523t8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f64068a;

    public static void d(String str, String str2) {
        if (f64068a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f64068a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        f64068a = C4523t8.d.MODE_0.b() != i10;
    }

    public static void i(String str, String str2) {
        if (f64068a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f64068a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f64068a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f64068a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f64068a) {
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f64068a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f64068a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f64068a) {
            Log.w(str, str2, th2);
        }
    }
}
