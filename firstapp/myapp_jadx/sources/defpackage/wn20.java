package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class wn20 {
    public static boolean a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, true);
    }

    public static String b(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static void c(Context context, String str, String str2, boolean z, boolean z2) {
        if (z2) {
            context.getSharedPreferences(str, 0).edit().putBoolean(str2, z).commit();
        } else {
            context.getSharedPreferences(str, 0).edit().putBoolean(str2, z).apply();
        }
    }

    @Deprecated
    public static void d(long j, String str, String str2, boolean z, Context context) {
        if (z) {
            context.getSharedPreferences(str, 0).edit().putLong(str2, j).commit();
        } else {
            context.getSharedPreferences(str, 0).edit().putLong(str2, j).apply();
        }
    }

    public static void e(Context context, String str, String str2, String str3) {
        context.getSharedPreferences(str, 0).edit().putString(str2, str3).commit();
    }
}
