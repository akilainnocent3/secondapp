package com.bytedance.adsdk.tq.sd.tq;

import fw.b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class wgt implements sd {
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final boolean f32310sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final List<sd> f32311tq;

    public wgt(String str, List<sd> list, boolean z10) {
        this.hww = str;
        this.f32311tq = list;
        this.f32310sd = z10;
    }

    public String hww() {
        return this.hww;
    }

    public boolean sd() {
        return this.f32310sd;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.hww + "' Shapes: " + Arrays.toString(this.f32311tq.toArray()) + b.f85383j;
    }

    public List<sd> tq() {
        return this.f32311tq;
    }

    @Override // com.bytedance.adsdk.tq.sd.tq.sd
    public com.bytedance.adsdk.tq.hww.hww.sd hww(com.bytedance.adsdk.tq.rs rsVar, com.bytedance.adsdk.tq.vgm vgmVar, com.bytedance.adsdk.tq.sd.sd.hww hwwVar) {
        return new com.bytedance.adsdk.tq.hww.hww.vy(rsVar, hwwVar, this, vgmVar);
    }
}
