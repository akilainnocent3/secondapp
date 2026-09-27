package com.bytedance.adsdk.tq.hww.tq;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq extends vgm<Integer> {
    public tq(List<com.bytedance.adsdk.tq.vgm.hww<Integer>> list) {
        super(list);
    }

    public int rs() {
        return sd(sd(), hv());
    }

    public int sd(com.bytedance.adsdk.tq.vgm.hww<Integer> hwwVar, float f10) {
        if (hwwVar.hww == null || hwwVar.f32352tq == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f32073sd == null) {
            return com.bytedance.adsdk.tq.hu.tq.hww(com.bytedance.adsdk.tq.hu.hv.tq(f10, 0.0f, 1.0f), hwwVar.hww.intValue(), hwwVar.f32352tq.intValue());
        }
        hwwVar.vgm.getClass();
        vy();
        ok();
        throw null;
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public Integer hww(com.bytedance.adsdk.tq.vgm.hww<Integer> hwwVar, float f10) {
        return Integer.valueOf(sd(hwwVar, f10));
    }
}
