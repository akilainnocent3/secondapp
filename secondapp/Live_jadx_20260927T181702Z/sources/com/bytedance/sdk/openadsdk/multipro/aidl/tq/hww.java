package com.bytedance.sdk.openadsdk.multipro.aidl.tq;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.syb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends IAppOpenAdInteractionListener.Stub {
    private volatile com.bytedance.sdk.openadsdk.hww.vy.tq hww;

    public hww(com.bytedance.sdk.openadsdk.hww.vy.tq tqVar) {
        this.hww = tqVar;
    }

    private void hww() {
        this.hww = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        final com.bytedance.sdk.openadsdk.hww.vy.tq tqVar = this.hww;
        if (tqVar == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.hww.2
            @Override // java.lang.Runnable
            public void run() {
                tqVar.onAdClicked();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        final com.bytedance.sdk.openadsdk.hww.vy.tq tqVar = this.hww;
        if (tqVar == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.hww.1
            @Override // java.lang.Runnable
            public void run() {
                tqVar.hww();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        final com.bytedance.sdk.openadsdk.hww.vy.tq tqVar = this.hww;
        if (tqVar == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.hww.3
            @Override // java.lang.Runnable
            public void run() {
                tqVar.tq();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        final com.bytedance.sdk.openadsdk.hww.vy.tq tqVar = this.hww;
        if (tqVar == null) {
            return;
        }
        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.tq.hww.4
            @Override // java.lang.Runnable
            public void run() {
                tqVar.sd();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        hww();
    }
}
