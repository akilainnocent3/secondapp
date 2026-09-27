package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class D9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5358rm fromModel(@oy.m C9 c10) {
        C5358rm c5358rm = new C5358rm();
        if (c10 != null) {
            c5358rm.f98246a = c10.f95676a;
        }
        return c5358rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C9(((C5358rm) obj).f98246a);
    }

    @oy.l
    public final C9 a(@oy.l C5358rm c5358rm) {
        return new C9(c5358rm.f98246a);
    }
}
