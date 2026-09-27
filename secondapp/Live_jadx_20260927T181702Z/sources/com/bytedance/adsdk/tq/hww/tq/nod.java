package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class nod extends vgm<PointF> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final PathMeasure f32082hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final float[] f32083hv;
    private rs vgm;
    private final PointF vy;

    public nod(List<? extends com.bytedance.adsdk.tq.vgm.hww<PointF>> list) {
        super(list);
        this.vy = new PointF();
        this.f32083hv = new float[2];
        this.f32082hu = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public PointF hww(com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar, float f10) {
        rs rsVar = (rs) hwwVar;
        Path pathTq = rsVar.tq();
        if (pathTq == null) {
            return hwwVar.hww;
        }
        if (this.f32073sd != null) {
            rsVar.vgm.getClass();
            vy();
            ok();
            throw null;
        }
        if (this.vgm != rsVar) {
            this.f32082hu.setPath(pathTq, false);
            this.vgm = rsVar;
        }
        PathMeasure pathMeasure = this.f32082hu;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f32083hv, null);
        PointF pointF = this.vy;
        float[] fArr = this.f32083hv;
        pointF.set(fArr[0], fArr[1]);
        return this.vy;
    }
}
