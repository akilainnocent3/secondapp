package com.bytedance.sdk.openadsdk.multipro.aidl.tq;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.hww.hv.hww hww;

    public vy(com.bytedance.sdk.openadsdk.hww.hv.hww hwwVar) {
        this.hww = hwwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.vy.3
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.hww != null) {
                    vy.this.hww.tq();
                }
                vy.this.hww();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.vy.1
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.hww != null) {
                    vy.this.hww.hww();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.vy.2
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.hww != null) {
                    vy.this.hww.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.vy.4
            @Override // java.lang.Runnable
            public void run() {
                if (vy.this.hww != null) {
                    vy.this.hww.hww(z10, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww() {
        this.hww = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
