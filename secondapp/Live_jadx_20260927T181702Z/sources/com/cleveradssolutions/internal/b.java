package com.cleveradssolutions.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final int a(Context context, int i10, int i11) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        String str;
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        if (i11 != 1) {
            str = i11 != 2 ? "getCurrentOrientationAnchoredAdaptiveBannerAdSize" : "getLandscapeAnchoredAdaptiveBannerAdSize";
        } else {
            str = "getPortraitAnchoredAdaptiveBannerAdSize";
        }
        Object objInvoke = cls.getMethod("getHeight", null).invoke(cls.getMethod(str, Context.class, Integer.TYPE).invoke(null, context, Integer.valueOf(i10)), null);
        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objInvoke).intValue();
    }
}
