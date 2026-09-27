package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class BillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95115b;

    public BillingConfig(int i10, int i11) {
        this.f95114a = i10;
        this.f95115b = i11;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f95115b;
    }

    public final int getSendFrequencySeconds() {
        return this.f95114a;
    }

    @l
    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f95114a + ", firstCollectingInappMaxAgeSeconds=" + this.f95115b + ')';
    }

    public BillingConfig() {
        this(new s().f95055a, new s().f95056b);
    }
}
