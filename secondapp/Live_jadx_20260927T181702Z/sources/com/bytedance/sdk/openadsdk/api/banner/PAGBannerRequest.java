package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize hww;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.hww = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.hww;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.hww = pAGBannerSize;
    }
}
