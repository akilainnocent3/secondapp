package com.bytedance.adsdk.ugeno.vgm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class vy {
    private static String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f32746sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static Resources f32747tq;

    public static void hww(String str) {
        hww = str;
    }

    public static int tq(Context context, String str) {
        return hww(context, str, "drawable");
    }

    private static String hww(Context context) {
        if (hww == null) {
            hww = context.getPackageName();
        }
        return hww;
    }

    private static int hww(Context context, String str, String str2) {
        if (f32747tq == null) {
            f32747tq = context.getResources();
        }
        return f32747tq.getIdentifier(str, str2, hww(context));
    }

    public static int hww(Context context, String str) {
        return hww(context, str, "raw");
    }
}
