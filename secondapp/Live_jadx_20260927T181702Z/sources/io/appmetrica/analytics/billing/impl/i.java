package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@oy.l BillingInfo billingInfo) {
        c cVar = new c();
        int i10 = h.f95038a[billingInfo.type.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            i11 = i10 != 2 ? 1 : 3;
        }
        cVar.f95027a = i11;
        cVar.f95028b = billingInfo.productId;
        cVar.f95029c = billingInfo.purchaseToken;
        cVar.f95030d = billingInfo.purchaseTime;
        cVar.f95031e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(@oy.l c cVar) {
        ProductType productType;
        int i10 = cVar.f95027a;
        if (i10 == 2) {
            productType = ProductType.INAPP;
        } else if (i10 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f95028b, cVar.f95029c, cVar.f95030d, cVar.f95031e);
    }
}
