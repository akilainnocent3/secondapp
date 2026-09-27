package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95020b;

    public A(int i10, int i11) {
        this.f95019a = i10;
        this.f95020b = i11;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f95019a + ", firstCollectingInappMaxAgeSeconds=" + this.f95020b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
