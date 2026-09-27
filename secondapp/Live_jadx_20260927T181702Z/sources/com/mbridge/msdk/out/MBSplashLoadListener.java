package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MBSplashLoadListener {
    void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10);

    void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10);

    void onLoadSuccessed(MBridgeIds mBridgeIds, int i10);
}
