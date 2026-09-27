package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class rs extends com.bytedance.adsdk.tq.vgm.hww<PointF> {
    private Path nod;
    private final com.bytedance.adsdk.tq.vgm.hww<PointF> vhb;

    public rs(com.bytedance.adsdk.tq.vgm vgmVar, com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar) {
        super(vgmVar, hwwVar.hww, hwwVar.f32352tq, hwwVar.f32351sd, hwwVar.vy, hwwVar.f32347hv, hwwVar.f32346hu, hwwVar.vgm);
        this.vhb = hwwVar;
        hww();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void hww() {
        T t10;
        T t11;
        T t12 = this.f32352tq;
        boolean z10 = (t12 == 0 || (t11 = this.hww) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.hww;
        if (t13 == 0 || (t10 = this.f32352tq) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.tq.vgm.hww<PointF> hwwVar = this.vhb;
        this.nod = com.bytedance.adsdk.tq.hu.hu.hww((PointF) t13, (PointF) t10, hwwVar.f32349ok, hwwVar.f32350rs);
    }

    public Path tq() {
        return this.nod;
    }
}
