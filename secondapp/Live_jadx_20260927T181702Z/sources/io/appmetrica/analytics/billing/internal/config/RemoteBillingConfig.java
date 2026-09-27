package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RemoteBillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f95116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BillingConfig f95117b;

    public RemoteBillingConfig(boolean z10, @l BillingConfig billingConfig) {
        this.f95116a = z10;
        this.f95117b = billingConfig;
    }

    @l
    public final BillingConfig getConfig() {
        return this.f95117b;
    }

    public final boolean getEnabled() {
        return this.f95116a;
    }

    @l
    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f95116a + ", config=" + this.f95117b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f95058a, new BillingConfig());
    }
}
