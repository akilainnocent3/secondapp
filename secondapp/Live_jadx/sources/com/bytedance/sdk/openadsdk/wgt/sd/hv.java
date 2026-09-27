package com.bytedance.sdk.openadsdk.wgt.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class hv implements sd {
    private static volatile hv hww;

    private hv() {
    }

    @Override // com.bytedance.sdk.openadsdk.wgt.sd.sd
    public void hww(com.bytedance.sdk.openadsdk.wgt.tq tqVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.wgt.sd.sd
    public void hww(com.bytedance.sdk.openadsdk.wgt.tq tqVar, boolean z10) {
    }

    public static hv hww() {
        if (hww == null) {
            synchronized (hv.class) {
                try {
                    if (hww == null) {
                        hww = new hv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }
}
