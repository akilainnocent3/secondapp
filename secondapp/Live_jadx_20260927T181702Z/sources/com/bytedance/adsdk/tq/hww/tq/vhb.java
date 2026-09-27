package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vhb extends vgm<PointF> {
    private final PointF vy;

    public vhb(List<com.bytedance.adsdk.tq.vgm.hww<PointF>> list) {
        super(list);
        this.vy = new PointF();
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public PointF hww(com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar, float f10) {
        return hww(hwwVar, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public PointF hww(com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = hwwVar.hww;
        if (pointF2 == null || (pointF = hwwVar.f32352tq) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.f32073sd != null) {
            hwwVar.vgm.getClass();
            vy();
            ok();
            throw null;
        }
        PointF pointF5 = this.vy;
        float f13 = pointF3.x;
        float f14 = f13 + (f11 * (pointF4.x - f13));
        float f15 = pointF3.y;
        pointF5.set(f14, f15 + (f12 * (pointF4.y - f15)));
        return this.vy;
    }
}
