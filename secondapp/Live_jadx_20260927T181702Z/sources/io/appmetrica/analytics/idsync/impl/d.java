package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f95463a;

    public d(@oy.l e eVar) {
        this.f95463a = eVar;
    }

    @oy.l
    public final byte[] a(@oy.l IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f95463a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f95463a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@oy.l byte[] bArr) {
        return this.f95463a.toModel((o) MessageNano.mergeFrom(new o(), bArr));
    }
}
