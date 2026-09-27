package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Z3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class jpb {
    public static boolean hu(Context context) {
        return sd(context) == 6;
    }

    public static boolean hv(Context context) {
        return sd(context) == 5;
    }

    public static boolean hww(Context context) {
        return sd(context) != 0;
    }

    public static boolean ok(Context context) {
        if (context == null) {
            return false;
        }
        int iSd = sd(context);
        return iSd == 2 || iSd == 3 || iSd == 4 || iSd == 5 || iSd == 6;
    }

    public static int sd(Context context) {
        return zvy.hww(context, 60000L);
    }

    public static int tq(Context context) {
        int iSd = sd(context);
        if (iSd == 1) {
            return 0;
        }
        if (iSd == 4) {
            return 1;
        }
        if (iSd == 5) {
            return 4;
        }
        if (iSd != 6) {
            return iSd;
        }
        return 6;
    }

    public static String vgm(Context context) {
        int iSd = sd(context);
        if (iSd == 2) {
            return "2g";
        }
        if (iSd == 3) {
            return Z3.f60405a;
        }
        if (iSd == 4) {
            return Z3.f60406b;
        }
        if (iSd != 5) {
            return iSd != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean vy(Context context) {
        return sd(context) == 4;
    }

    public static boolean hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
