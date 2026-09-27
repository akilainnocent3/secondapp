package io.appmetrica.analytics.impl;

import android.app.Service;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5411u0 implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f98386a;

    public C5411u0(@oy.l Service service) {
        this.f98386a = service;
    }

    public final void a(int i10) {
        this.f98386a.stopSelf(i10);
    }
}
