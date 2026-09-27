package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.ironsource.Mf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements com.bytedance.sdk.openadsdk.hww.vy.tq {
    private final PAGAppOpenAdInteractionListener hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final AtomicBoolean f35626tq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final AtomicBoolean f35625sd = new AtomicBoolean(false);

    public hv(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.hww = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.hww.vy.tq
    public void hww() {
        if (this.f35625sd.compareAndSet(false, true)) {
            omn.hww("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.hww;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        omn.hww("BVA", Mf.f59495f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.hww;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hww.vy.tq
    public void sd() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f35626tq.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.hww) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.hww.vy.tq
    public void tq() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        omn.hww("BVA", "onAdSkip");
        if (this.f35626tq.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.hww) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
