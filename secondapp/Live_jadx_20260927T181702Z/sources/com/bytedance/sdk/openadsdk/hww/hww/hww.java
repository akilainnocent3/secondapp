package com.bytedance.sdk.openadsdk.hww.hww;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener hww;

    public hww(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.hww = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.vgm
    public void onError(final int i10, final String str) {
        if (this.hww == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.hww.hww.1
            @Override // java.lang.Runnable
            public void run() {
                hww.this.hww.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.hww.hww.2
            @Override // java.lang.Runnable
            public void run() {
                hww.this.hww.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
