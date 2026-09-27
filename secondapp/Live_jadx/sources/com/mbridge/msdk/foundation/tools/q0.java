package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f67459a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f67460b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f67461c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f67462d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f67463e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f67464f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f67465g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f67466h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f67465g = false;
        f67459a = false;
        f67461c = false;
        f67466h = false;
        f67460b = false;
        f67464f = false;
        f67463e = false;
        f67462d = false;
    }

    public static void a(String str, String str2) {
        if (!f67459a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f67460b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f67461c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f67466h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f67460b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f67466h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f67459a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f67466h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
