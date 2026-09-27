package com.bytedance.sdk.openadsdk.multipro.aidl.tq;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.hww.sd.tq hww;

    public sd(com.bytedance.sdk.openadsdk.hww.sd.tq tqVar) {
        this.hww = tqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.sd.3
            @Override // java.lang.Runnable
            public void run() {
                if (sd.this.hww != null) {
                    sd.this.hww.tq();
                }
                sd.this.hww();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.sd.1
            @Override // java.lang.Runnable
            public void run() {
                if (sd.this.hww != null) {
                    sd.this.hww.hww();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.hww == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.sd.2
            @Override // java.lang.Runnable
            public void run() {
                if (sd.this.hww != null) {
                    sd.this.hww.onAdClicked();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww() {
        this.hww = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
