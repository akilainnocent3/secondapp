package com.bytedance.adsdk.tq.hww.tq;

import android.graphics.Path;
import com.bytedance.adsdk.tq.hww.hww.mrs;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ed extends hww<com.bytedance.adsdk.tq.sd.tq.khx, Path> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private List<mrs> f32068hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final Path f32069hv;
    private final com.bytedance.adsdk.tq.sd.tq.khx vy;

    public ed(List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.khx>> list) {
        super(list);
        this.vy = new com.bytedance.adsdk.tq.sd.tq.khx();
        this.f32069hv = new Path();
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public Path hww(com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.khx> hwwVar, float f10) {
        this.vy.hww(hwwVar.hww, hwwVar.f32352tq, f10);
        com.bytedance.adsdk.tq.sd.tq.khx khxVarHww = this.vy;
        List<mrs> list = this.f32068hu;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                khxVarHww = this.f32068hu.get(size).hww(khxVarHww);
            }
        }
        com.bytedance.adsdk.tq.hu.hv.hww(khxVarHww, this.f32069hv);
        return this.f32069hv;
    }

    public void hww(List<mrs> list) {
        this.f32068hu = list;
    }
}
