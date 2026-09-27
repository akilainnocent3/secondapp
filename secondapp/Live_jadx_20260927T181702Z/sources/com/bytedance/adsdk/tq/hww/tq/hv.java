package com.bytedance.adsdk.tq.hww.tq;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv extends vgm<com.bytedance.adsdk.tq.sd.tq.vy> {
    private final com.bytedance.adsdk.tq.sd.tq.vy vy;

    public hv(List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy>> list) {
        super(list);
        com.bytedance.adsdk.tq.sd.tq.vy vyVar = list.get(0).hww;
        int iSd = vyVar != null ? vyVar.sd() : 0;
        this.vy = new com.bytedance.adsdk.tq.sd.tq.vy(new float[iSd], new int[iSd]);
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.tq.sd.tq.vy hww(com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy> hwwVar, float f10) {
        this.vy.hww(hwwVar.hww, hwwVar.f32352tq, f10);
        return this.vy;
    }
}
