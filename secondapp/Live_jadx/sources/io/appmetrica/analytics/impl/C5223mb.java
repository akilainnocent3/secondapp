package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5223mb implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nc f97897a;

    public C5223mb() {
        this(new Nc(new Sn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Rn rn2) {
        return MessageNano.toByteArray((MessageNano) this.f97897a.f96215a.fromModel(rn2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5223mb(Nc nc2) {
        this.f97897a = nc2;
    }

    @NonNull
    public final Rn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
