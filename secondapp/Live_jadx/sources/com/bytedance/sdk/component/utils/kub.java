package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class kub {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static boolean f35090hu = false;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static boolean f35091hv = false;

    @SuppressLint({"StaticFieldLeak"})
    private static Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static Resources f35092sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static String f35093tq;
    private static String vy;

    public static int hu(Context context, String str) {
        return hww(context, str, "style");
    }

    public static int hv(Context context, String str) {
        return hww(context, str, "id");
    }

    public static void hww(Context context) {
        hww = context;
    }

    public static int ok(Context context, String str) {
        return hww(context, str, "color");
    }

    public static int rs(Context context, String str) {
        return hww(context, str, "anim");
    }

    public static Drawable sd(Context context, String str) {
        try {
            return tq(context).getDrawable(vy(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int tq(Context context, String str) {
        return hww(context, str, "string");
    }

    public static int vgm(Context context, String str) {
        return tq(context).getColor(ok(context, str));
    }

    private static String vy(Context context) {
        if (vy == null) {
            vy = context.getPackageName();
        }
        return vy;
    }

    public static void hww(String str) {
        vy = str;
    }

    public static Resources tq(Context context) {
        Resources resources = f35092sd;
        if (resources == null) {
            resources = null;
        }
        Context context2 = hww;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    private static int hww(Context context, String str, String str2) {
        int identifier = tq(context).getIdentifier(str, str2, vy(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!f35091hv) {
            sd(context);
            return tq(context).getIdentifier(str, str2, vy(context));
        }
        return context.getResources().getIdentifier(str, str2, vy(context));
    }

    public static synchronized void sd(Context context) {
        try {
            if (TextUtils.isEmpty(f35093tq)) {
                return;
            }
            f35091hv = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    public static int vy(Context context, String str) {
        try {
            return hww(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String hww(Context context, String str) {
        return tq(context).getString(tq(context, str));
    }
}
