package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Nk extends BaseProtobufStateSerializer {
    @oy.l
    public final Lk a() {
        return new Lk();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final MessageNano defaultValue() {
        return new Lk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk toState(@oy.l byte[] bArr) {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Lk();
    }
}
