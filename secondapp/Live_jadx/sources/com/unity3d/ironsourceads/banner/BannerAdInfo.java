package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76212b;

    public BannerAdInfo(@l String instanceId, @l String adId) {
        m0.p(instanceId, "instanceId");
        m0.p(adId, "adId");
        this.f76211a = instanceId;
        this.f76212b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f76211a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f76212b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.f76211a;
    }

    @l
    public final String component2() {
        return this.f76212b;
    }

    @l
    public final BannerAdInfo copy(@l String instanceId, @l String adId) {
        m0.p(instanceId, "instanceId");
        m0.p(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return m0.g(this.f76211a, bannerAdInfo.f76211a) && m0.g(this.f76212b, bannerAdInfo.f76212b);
    }

    @l
    public final String getAdId() {
        return this.f76212b;
    }

    @l
    public final String getInstanceId() {
        return this.f76211a;
    }

    public int hashCode() {
        return (this.f76211a.hashCode() * 31) + this.f76212b.hashCode();
    }

    @l
    public String toString() {
        return "[instanceId: '" + this.f76211a + "', adId: '" + this.f76212b + "']";
    }
}
