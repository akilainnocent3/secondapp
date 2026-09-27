package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o6 f40269a = new o6();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i10, Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        float fA = a(context);
        if (fA == 0.0f) {
            return 0;
        }
        return is.d.L0(i10 / fA);
    }
}
