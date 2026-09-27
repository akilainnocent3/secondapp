package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class khx extends hww<PointF, PointF> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final PointF f32078hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected com.bytedance.adsdk.tq.vgm.tq<Float> f32079hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final hww<Float, Float> f32080ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final hww<Float, Float> f32081rs;
    private final PointF vgm;
    protected com.bytedance.adsdk.tq.vgm.tq<Float> vy;

    public khx(hww<Float, Float> hwwVar, hww<Float, Float> hwwVar2) {
        super(Collections.EMPTY_LIST);
        this.f32078hu = new PointF();
        this.vgm = new PointF();
        this.f32080ok = hwwVar;
        this.f32081rs = hwwVar2;
        hww(ok());
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
    public PointF vgm() {
        return hww(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public PointF hww(com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar, float f10) {
        if (this.vy != null && this.f32080ok.sd() != null) {
            this.f32080ok.hv();
            throw null;
        }
        if (this.f32079hv != null && this.f32081rs.sd() != null) {
            this.f32081rs.hv();
            throw null;
        }
        this.vgm.set(this.f32078hu.x, 0.0f);
        PointF pointF = this.vgm;
        pointF.set(pointF.x, this.f32078hu.y);
        return this.vgm;
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    public void hww(float f10) {
        this.f32080ok.hww(f10);
        this.f32081rs.hww(f10);
        this.f32078hu.set(this.f32080ok.vgm().floatValue(), this.f32081rs.vgm().floatValue());
        for (int i10 = 0; i10 < this.hww.size(); i10++) {
            this.hww.get(i10).hww();
        }
    }
}
