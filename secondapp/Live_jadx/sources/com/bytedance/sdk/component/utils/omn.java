package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class omn {
    private static boolean hww = false;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static String f35094tq = "";

    public static void hww() {
        hww = true;
    }

    public static void sd(String str, Object... objArr) {
        if (hww && objArr != null) {
            Log.w(tq(str), hww(objArr));
        }
    }

    public static void tq() {
        hww = false;
    }

    public static void vy(String str, Object... objArr) {
        if (hww && objArr != null) {
            Log.e(tq(str), hww(objArr));
        }
    }

    public static void hww(String str, String str2) {
        if (hww && str2 != null) {
            Log.d(tq(str), str2);
        }
    }

    public static void tq(String str, String str2) {
        if (hww && str2 != null) {
            Log.i(tq(str), str2);
        }
    }

    public static void sd(String str, String str2) {
        if (hww && str2 != null) {
            Log.e(tq(str), str2);
        }
    }

    public static void hww(String str, Object... objArr) {
        if (hww && objArr != null) {
            Log.d(tq(str), hww(objArr));
        }
    }

    public static void tq(String str, Object... objArr) {
        if (hww && objArr != null) {
            Log.i(tq(str), hww(objArr));
        }
    }

    public static void hww(String str, String str2, Throwable th2) {
        if (hww) {
            if (str2 == null && th2 == null) {
                return;
            }
            Log.e(tq(str), str2, th2);
        }
    }

    private static String tq(String str) {
        if (TextUtils.isEmpty(f35094tq)) {
            return str;
        }
        return hww(C4235d4.j.f61460d + f35094tq + "]-[" + str + C4235d4.j.f61462e);
    }

    public static void hww(String str) {
        f35094tq = str;
    }

    private static String hww(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
