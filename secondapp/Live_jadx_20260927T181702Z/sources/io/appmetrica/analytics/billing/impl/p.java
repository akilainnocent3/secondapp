package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class p implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f95050a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.l
    public final byte[] a(@oy.l RemoteBillingConfig remoteBillingConfig) {
        return MessageNano.toByteArray(this.f95050a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f95050a.fromModel((RemoteBillingConfig) obj));
    }

    public p(@oy.l r rVar) {
        this.f95050a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@oy.l byte[] bArr) {
        t tVar;
        try {
            tVar = (t) MessageNano.mergeFrom(new t(), bArr);
        } catch (Throwable unused) {
            tVar = new t();
        }
        return this.f95050a.toModel(tVar);
    }

    public /* synthetic */ p(r rVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new r(null, 1, null) : rVar);
    }
}
