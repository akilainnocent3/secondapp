package com.bytedance.sdk.openadsdk.hww.tq;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm implements hu {
    private final PAGNativeAdInteractionListener hww;

    public vgm(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.hww = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.tq.vgm.1
            @Override // java.lang.Runnable
            public void run() {
                if (vgm.this.hww != null) {
                    vgm.this.hww.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.hww.tq.hu
    public boolean tq() {
        return this.hww != null;
    }

    @Override // com.bytedance.sdk.openadsdk.hww.tq.hu
    public void hww(PAGNativeAd pAGNativeAd) {
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.tq.vgm.2
            @Override // java.lang.Runnable
            public void run() {
                if (vgm.this.hww != null) {
                    vgm.this.hww.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.hww.tq.hu
    public void hww() {
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hww.tq.vgm.3
            @Override // java.lang.Runnable
            public void run() {
                if (vgm.this.hww != null) {
                    vgm.this.hww.onAdDismissed();
                }
            }
        });
    }
}
