package com.cleveradssolutions.adapters.exchange;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void a(String str, String str2) {
        f(6, str, str2);
    }

    public static void b(String str, String str2) {
        f(4, str, str2);
    }

    public static void d(String str, String str2) {
        f(5, str, str2);
    }

    public static int e() {
        return xc.a.f144822c.getDebugMode() ? 2 : 6;
    }

    public static void f(int i10, String str, String str2) {
        if (str == null || str2 == null || i10 < e()) {
            return;
        }
        Log.println(i10, "CAS.AI-X", str + " " + str2);
    }

    public static void g(String str) {
        h("", str);
    }

    public static void h(String str, String str2) {
        f(2, str, str2);
    }

    public static void i(String str, String str2, Throwable th2) {
        if (str == null || str2 == null) {
            return;
        }
        Log.e("CAS.AI-X", str + " " + str2, th2);
    }

    public static void c(String str, String str2) {
    }
}
