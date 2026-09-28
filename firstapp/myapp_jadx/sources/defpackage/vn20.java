package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class vn20 {
    @Deprecated
    public static SharedPreferences a(String str) {
        return hp0.A.getSharedPreferences(str, 0);
    }

    public static boolean b(Context context, String str, String str2, boolean z) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    @Deprecated
    public static boolean c(String str, String str2, boolean z) {
        return a(str).getBoolean(str2, z);
    }

    @Deprecated
    public static String d(String str, String str2, String str3) {
        return a(str).getString(str2, str3);
    }

    public static String e(t5g t5gVar, String str) {
        t5gVar.getClass();
        str.getClass();
        String string = t5gVar.b().getString(str, null);
        if (string != null) {
            return string;
        }
        String strD = d("com.sportybet.key", str, null);
        if (strD != null) {
            t5gVar.b().edit().putString(str, strD).commit();
        }
        if (t5gVar.c != null) {
            a("com.sportybet.key").edit().remove(str).commit();
        }
        return strD;
    }

    public static void f(Context context, String str, String str2, boolean z, boolean z2) {
        if (z2) {
            context.getSharedPreferences(str, 0).edit().putBoolean(str2, z).commit();
        } else {
            context.getSharedPreferences(str, 0).edit().putBoolean(str2, z).apply();
        }
    }

    @Deprecated
    public static void g(String str, String str2, boolean z, boolean z2) {
        if (z2) {
            a(str).edit().putBoolean(str2, z).commit();
        } else {
            a(str).edit().putBoolean(str2, z).apply();
        }
    }

    @Deprecated
    public static void h(long j, String str, boolean z) {
        if (z) {
            a("sportybet").edit().putLong(str, j).commit();
        } else {
            a("sportybet").edit().putLong(str, j).apply();
        }
    }

    @Deprecated
    public static void i(String str, String str2, String str3, boolean z) {
        if (z) {
            a(str).edit().putString(str2, str3).commit();
        } else {
            a(str).edit().putString(str2, str3).apply();
        }
    }
}
