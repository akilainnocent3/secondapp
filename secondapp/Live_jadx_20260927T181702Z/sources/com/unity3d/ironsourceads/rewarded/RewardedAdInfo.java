package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76259b;

    public RewardedAdInfo(@l String instanceId, @l String adId) {
        m0.p(instanceId, "instanceId");
        m0.p(adId, "adId");
        this.f76258a = instanceId;
        this.f76259b = adId;
    }

    @l
    public final String getAdId() {
        return this.f76259b;
    }

    @l
    public final String getInstanceId() {
        return this.f76258a;
    }

    @l
    public String toString() {
        return "[instanceId: '" + this.f76258a + "', adId: '" + this.f76259b + "']";
    }
}
