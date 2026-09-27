package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4254e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C4254e5 f61613a = new C4254e5();

    private C4254e5() {
    }

    private final int a(Context context, int i10) {
        return is.d.L0(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int b(@oy.l Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(@oy.l Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
