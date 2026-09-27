package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class r implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f95053a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(@oy.l RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f95058a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f95059b = config != null ? this.f95053a.fromModel(config) : null;
        return tVar;
    }

    public r(@oy.l g gVar) {
        this.f95053a = gVar;
    }

    public /* synthetic */ r(g gVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(@oy.l t tVar) {
        boolean z10 = tVar.f95058a;
        g gVar = this.f95053a;
        s sVar = tVar.f95059b;
        gVar.getClass();
        return new RemoteBillingConfig(z10, new BillingConfig(sVar.f95055a, sVar.f95056b));
    }
}
