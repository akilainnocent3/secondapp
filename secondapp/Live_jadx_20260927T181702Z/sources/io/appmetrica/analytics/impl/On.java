package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class On extends AbstractCallableC5528yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f96303f;

    public On(@oy.l C5287p0 c5287p0, @oy.m InterfaceC4924al interfaceC4924al, int i10, @oy.l Bundle bundle) {
        super(c5287p0, interfaceC4924al);
        this.f96302e = i10;
        this.f96303f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5528yh
    public final void a(@oy.l IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f96302e, this.f96303f);
    }
}
