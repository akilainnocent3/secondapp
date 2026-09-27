package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.content.Context;
import android.os.Build;
import com.cleveradssolutions.mediation.n;
import com.cleveradssolutions.mediation.p;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f42543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n f42544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p f42545c;

    public static String a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return g(str2);
        }
        return g(str) + " " + str2;
    }

    public static String b() {
        Context contextA = com.cleveradssolutions.adapters.exchange.rendering.sdk.e.a();
        if (contextA != null) {
            return contextA.getPackageName();
        }
        return null;
    }

    public static String c() {
        String strO;
        n nVar = f42544b;
        return (nVar == null || (strO = nVar.o()) == null) ? f42543a : strO;
    }

    public static boolean d() {
        Boolean boolC = f42545c.c();
        return boolC != null && boolC.booleanValue();
    }

    public static boolean e() {
        return f42544b.d0() == 1;
    }

    public static String f() {
        return f42544b.N();
    }

    public static String g(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static void h(n nVar, p pVar) {
        f42544b = nVar;
        f42545c = pVar;
        f42543a = "Mozilla/5.0 (Linux; U; Android " + Build.VERSION.RELEASE + "; " + a() + gi.j.f86771d;
    }
}
