package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5247na implements InterfaceC5232mk {
    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
