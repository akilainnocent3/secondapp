package io.appmetrica.analytics.coreutils.internal.services;

import dr.i0;
import dr.k0;
import io.appmetrica.analytics.coreutils.impl.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class UtilityServiceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f95348a = k0.b(new l(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f95349b = new WaitForActivationDelayBarrier();

    @oy.l
    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f95349b;
    }

    @oy.l
    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f95348a.getValue();
    }

    public final void initAsync() {
        this.f95349b.activate();
    }

    public final void updateConfiguration(@oy.l UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
