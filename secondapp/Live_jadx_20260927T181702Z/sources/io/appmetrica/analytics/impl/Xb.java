package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Xb implements LocationReceiverProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yb f96732a = new Yb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    @oy.l
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f96732a;
    }
}
