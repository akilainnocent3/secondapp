package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5375se extends AbstractCallableC5528yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cf f98296e;

    public C5375se(@oy.l C5287p0 c5287p0, @oy.m InterfaceC4924al interfaceC4924al, @oy.l Cf cf2) {
        super(c5287p0, interfaceC4924al);
        this.f98296e = cf2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5528yh
    public final void a(@oy.l IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Cf cf2 = this.f98296e;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
