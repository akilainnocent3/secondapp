package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private AdapterNativeAdViewBinder f59779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private AdapterNativeAdData f59780b;

    public final void a(@oy.m AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f59779a = adapterNativeAdViewBinder;
    }

    @oy.m
    public final AdapterNativeAdViewBinder b() {
        return this.f59779a;
    }

    @oy.m
    public final AdapterNativeAdData a() {
        return this.f59780b;
    }

    public final void a(@oy.m AdapterNativeAdData adapterNativeAdData) {
        this.f59780b = adapterNativeAdData;
    }
}
