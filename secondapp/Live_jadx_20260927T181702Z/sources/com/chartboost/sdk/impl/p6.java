package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p6 {
    public static final int a(int i10, Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
