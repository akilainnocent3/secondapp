package com.bytedance.adsdk.tq.sd.tq;

import android.graphics.PointF;
import fw.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class khx {
    private final List<com.bytedance.adsdk.tq.sd.hww> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f32267sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private PointF f32268tq;

    public khx(PointF pointF, boolean z10, List<com.bytedance.adsdk.tq.sd.hww> list) {
        this.f32268tq = pointF;
        this.f32267sd = z10;
        this.hww = new ArrayList(list);
    }

    public void hww(float f10, float f11) {
        if (this.f32268tq == null) {
            this.f32268tq = new PointF();
        }
        this.f32268tq.set(f10, f11);
    }

    public List<com.bytedance.adsdk.tq.sd.hww> sd() {
        return this.hww;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.hww.size() + "closed=" + this.f32267sd + b.f85383j;
    }

    public boolean tq() {
        return this.f32267sd;
    }

    public PointF hww() {
        return this.f32268tq;
    }

    public khx() {
        this.hww = new ArrayList();
    }

    public void hww(boolean z10) {
        this.f32267sd = z10;
    }

    public void hww(khx khxVar, khx khxVar2, float f10) {
        if (this.f32268tq == null) {
            this.f32268tq = new PointF();
        }
        this.f32267sd = khxVar.tq() || khxVar2.tq();
        if (khxVar.sd().size() != khxVar2.sd().size()) {
            khxVar.sd().size();
            khxVar2.sd().size();
        }
        int iMin = Math.min(khxVar.sd().size(), khxVar2.sd().size());
        if (this.hww.size() < iMin) {
            for (int size = this.hww.size(); size < iMin; size++) {
                this.hww.add(new com.bytedance.adsdk.tq.sd.hww());
            }
        } else if (this.hww.size() > iMin) {
            for (int size2 = this.hww.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.tq.sd.hww> list = this.hww;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFHww = khxVar.hww();
        PointF pointFHww2 = khxVar2.hww();
        hww(com.bytedance.adsdk.tq.hu.hv.hww(pointFHww.x, pointFHww2.x, f10), com.bytedance.adsdk.tq.hu.hv.hww(pointFHww.y, pointFHww2.y, f10));
        for (int size3 = this.hww.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.tq.sd.hww hwwVar = khxVar.sd().get(size3);
            com.bytedance.adsdk.tq.sd.hww hwwVar2 = khxVar2.sd().get(size3);
            PointF pointFHww3 = hwwVar.hww();
            PointF pointFTq = hwwVar.tq();
            PointF pointFSd = hwwVar.sd();
            PointF pointFHww4 = hwwVar2.hww();
            PointF pointFTq2 = hwwVar2.tq();
            PointF pointFSd2 = hwwVar2.sd();
            this.hww.get(size3).hww(com.bytedance.adsdk.tq.hu.hv.hww(pointFHww3.x, pointFHww4.x, f10), com.bytedance.adsdk.tq.hu.hv.hww(pointFHww3.y, pointFHww4.y, f10));
            this.hww.get(size3).tq(com.bytedance.adsdk.tq.hu.hv.hww(pointFTq.x, pointFTq2.x, f10), com.bytedance.adsdk.tq.hu.hv.hww(pointFTq.y, pointFTq2.y, f10));
            this.hww.get(size3).sd(com.bytedance.adsdk.tq.hu.hv.hww(pointFSd.x, pointFSd2.x, f10), com.bytedance.adsdk.tq.hu.hv.hww(pointFSd.y, pointFSd2.y, f10));
        }
    }
}
