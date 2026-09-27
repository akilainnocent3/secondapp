package com.bytedance.adsdk.tq.sd.hww;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class rs implements ed<PointF, PointF> {
    private final tq hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final tq f32169tq;

    public rs(tq tqVar, tq tqVar2) {
        this.hww = tqVar;
        this.f32169tq = tqVar2;
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public com.bytedance.adsdk.tq.hww.tq.hww<PointF, PointF> hww() {
        return new com.bytedance.adsdk.tq.hww.tq.khx(this.hww.hww(), this.f32169tq.hww());
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public List<com.bytedance.adsdk.tq.vgm.hww<PointF>> sd() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public boolean tq() {
        return this.hww.tq() && this.f32169tq.tq();
    }
}
