package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivationBarrierCallback f95304a;

    public m(ActivationBarrierCallback activationBarrierCallback) {
        this.f95304a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f95304a.onWaitFinished();
    }
}
