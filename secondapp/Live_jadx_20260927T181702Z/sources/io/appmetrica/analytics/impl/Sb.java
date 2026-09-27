package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Sb extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Sb f96452a = new Sb();

    public Sb() {
        super(1);
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return dr.w2.f79517a;
    }
}
