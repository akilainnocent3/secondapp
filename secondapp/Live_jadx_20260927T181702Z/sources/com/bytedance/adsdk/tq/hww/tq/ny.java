package com.bytedance.adsdk.tq.hww.tq;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ny extends vgm<com.bytedance.adsdk.tq.vgm.sd> {
    private final com.bytedance.adsdk.tq.vgm.sd vy;

    public ny(List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.vgm.sd>> list) {
        super(list);
        this.vy = new com.bytedance.adsdk.tq.vgm.sd();
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.tq.vgm.sd hww(com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.vgm.sd> hwwVar, float f10) {
        com.bytedance.adsdk.tq.vgm.sd sdVar;
        com.bytedance.adsdk.tq.vgm.sd sdVar2 = hwwVar.hww;
        if (sdVar2 == null || (sdVar = hwwVar.f32352tq) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.tq.vgm.sd sdVar3 = sdVar2;
        com.bytedance.adsdk.tq.vgm.sd sdVar4 = sdVar;
        if (this.f32073sd == null) {
            this.vy.hww(com.bytedance.adsdk.tq.hu.hv.hww(sdVar3.hww(), sdVar4.hww(), f10), com.bytedance.adsdk.tq.hu.hv.hww(sdVar3.tq(), sdVar4.tq(), f10));
            return this.vy;
        }
        hwwVar.vgm.getClass();
        vy();
        ok();
        throw null;
    }
}
