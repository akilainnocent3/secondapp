package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(@oy.l a0 a0Var) {
        P p10 = new P();
        p10.f99043a = a0Var.f99067a;
        p10.f99044b = a0Var.f99068b;
        return p10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p10 = (P) obj;
        return new a0(p10.f99043a, p10.f99044b);
    }

    @oy.l
    public final a0 a(@oy.l P p10) {
        return new a0(p10.f99043a, p10.f99044b);
    }
}
