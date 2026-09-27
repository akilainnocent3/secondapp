package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4901b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f95448a;

    public C4901b(@oy.l ServiceContext serviceContext) {
        this.f95448a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f95448a.getActiveNetworkTypeProvider().getNetworkType(this.f95448a.getContext()) == NetworkType.CELL;
    }
}
