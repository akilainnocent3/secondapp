package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ie implements N8 {
    @Override // com.ironsource.N8
    public void a(@oy.l Context context, @oy.l String key, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(key, "key");
        IronSourceUtils.b(context, key, i10);
    }

    @Override // com.ironsource.N8
    public int b(@oy.l Context context, @oy.l String key, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(key, "key");
        return IronSourceUtils.a(context, key, i10);
    }

    @Override // com.ironsource.N8
    public void a(@oy.l Context context, @oy.l String key, long j10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(key, "key");
        IronSourceUtils.b(context, key, j10);
    }

    @Override // com.ironsource.N8
    public long b(@oy.l Context context, @oy.l String key, long j10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(key, "key");
        return IronSourceUtils.a(context, key, j10);
    }
}
