package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGBiddingRequest {
    private PAGBannerSize hww = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f35474tq = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f35473sd = null;

    public String getAdxId() {
        return this.f35473sd;
    }

    public PAGBannerSize getBannerSize() {
        return this.hww;
    }

    public String getSlotId() {
        return this.f35474tq;
    }

    public void setAdxId(String str) {
        this.f35473sd = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.hww = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f35474tq = str;
    }
}
