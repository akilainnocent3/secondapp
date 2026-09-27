package com.bytedance.adsdk.tq.sd.hww;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv implements ed<PointF, PointF> {
    private final List<com.bytedance.adsdk.tq.vgm.hww<PointF>> hww;

    public hv(List<com.bytedance.adsdk.tq.vgm.hww<PointF>> list) {
        this.hww = list;
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public com.bytedance.adsdk.tq.hww.tq.hww<PointF, PointF> hww() {
        return this.hww.get(0).hv() ? new com.bytedance.adsdk.tq.hww.tq.vhb(this.hww) : new com.bytedance.adsdk.tq.hww.tq.nod(this.hww);
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public List<com.bytedance.adsdk.tq.vgm.hww<PointF>> sd() {
        return this.hww;
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public boolean tq() {
        return this.hww.size() == 1 && this.hww.get(0).hv();
    }
}
