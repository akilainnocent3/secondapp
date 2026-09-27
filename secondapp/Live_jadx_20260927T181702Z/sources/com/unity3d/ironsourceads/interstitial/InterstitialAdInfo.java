package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76246b;

    public InterstitialAdInfo(@l String instanceId, @l String adId) {
        m0.p(instanceId, "instanceId");
        m0.p(adId, "adId");
        this.f76245a = instanceId;
        this.f76246b = adId;
    }

    @l
    public final String getAdId() {
        return this.f76246b;
    }

    @l
    public final String getInstanceId() {
        return this.f76245a;
    }

    @l
    public String toString() {
        return "[instanceId: '" + this.f76245a + "', adId: '" + this.f76246b + "']";
    }
}
