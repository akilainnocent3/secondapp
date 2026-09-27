package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Em implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5458vm fromModel(@oy.l Dm dm2) {
        C5458vm c5458vm = new C5458vm();
        c5458vm.f98493a = dm2.f95742a;
        return c5458vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C5458vm) obj).f98493a);
    }

    @oy.l
    public final Dm a(@oy.l C5458vm c5458vm) {
        return new Dm(c5458vm.f98493a);
    }
}
