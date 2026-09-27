package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f74802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest$RequestReason f74803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74804c;

    public fc(ic icVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        this.f74802a = icVar;
        this.f74803b = metaDataRequest$RequestReason;
        this.f74804c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74802a.a(this.f74803b, this.f74804c);
    }
}
