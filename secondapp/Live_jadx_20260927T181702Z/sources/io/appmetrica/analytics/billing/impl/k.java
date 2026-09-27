package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f95042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4898a f95043b;

    public k(@oy.l ProtobufStateStorage<C4898a> protobufStateStorage) {
        this.f95042a = protobufStateStorage;
        this.f95043b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @oy.l
    public final List<BillingInfo> getBillingInfo() {
        return this.f95043b.f95023a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f95043b.f95024b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@oy.l List<? extends BillingInfo> list, boolean z10) {
        for (BillingInfo billingInfo : list) {
        }
        C4898a c4898a = new C4898a(list, z10);
        this.f95043b = c4898a;
        this.f95042a.save(c4898a);
    }
}
