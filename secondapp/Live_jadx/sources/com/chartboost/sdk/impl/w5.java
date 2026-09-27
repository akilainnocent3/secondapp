package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w5 implements c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41296a;

    public w5(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f41296a = context.getResources().getDisplayMetrics().density;
    }

    @Override // com.chartboost.sdk.impl.c6
    public int a(double d10) {
        return (int) (d10 * ((double) this.f41296a));
    }

    @Override // com.chartboost.sdk.impl.c6
    public int a(int i10) {
        return (int) (i10 * this.f41296a);
    }
}
