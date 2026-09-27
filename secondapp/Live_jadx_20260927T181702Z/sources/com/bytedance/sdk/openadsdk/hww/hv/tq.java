package com.bytedance.sdk.openadsdk.hww.hv;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener hww;

    public tq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.hww = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.vgm
    public void onError(final int i10, final String str) {
        if (this.hww == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.hv.tq.1
            @Override // java.lang.Runnable
            public void run() {
                if (tq.this.hww != null) {
                    tq.this.hww.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.hv.tq.2
            @Override // java.lang.Runnable
            public void run() {
                if (tq.this.hww != null) {
                    tq.this.hww.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
