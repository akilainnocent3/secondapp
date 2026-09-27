package com.bytedance.adsdk.tq.hww.hww;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hnv implements sd, com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.hww.tq.hww<?, Float> f31989hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.hww.tq.hww<?, Float> f31990hv;
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final List<com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww> f31991sd = new ArrayList();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f31992tq;
    private final com.bytedance.adsdk.tq.hww.tq.hww<?, Float> vgm;
    private final com.bytedance.adsdk.tq.sd.tq.mrs.hww vy;

    public hnv(com.bytedance.adsdk.tq.sd.sd.hww hwwVar, com.bytedance.adsdk.tq.sd.tq.mrs mrsVar) {
        this.hww = mrsVar.hww();
        this.f31992tq = mrsVar.hu();
        this.vy = mrsVar.tq();
        com.bytedance.adsdk.tq.hww.tq.hww<Float, Float> hwwVarHww = mrsVar.vy().hww();
        this.f31990hv = hwwVarHww;
        com.bytedance.adsdk.tq.hww.tq.hww<Float, Float> hwwVarHww2 = mrsVar.sd().hww();
        this.f31989hu = hwwVarHww2;
        com.bytedance.adsdk.tq.hww.tq.hww<Float, Float> hwwVarHww3 = mrsVar.hv().hww();
        this.vgm = hwwVarHww3;
        hwwVar.hww(hwwVarHww);
        hwwVar.hww(hwwVarHww2);
        hwwVar.hww(hwwVarHww3);
        hwwVarHww.hww(this);
        hwwVarHww2.hww(this);
        hwwVarHww3.hww(this);
    }

    public boolean hu() {
        return this.f31992tq;
    }

    public com.bytedance.adsdk.tq.hww.tq.hww<?, Float> hv() {
        return this.vgm;
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.sd
    public void hww(List<sd> list, List<sd> list2) {
    }

    public com.bytedance.adsdk.tq.hww.tq.hww<?, Float> sd() {
        return this.f31990hv;
    }

    public com.bytedance.adsdk.tq.sd.tq.mrs.hww tq() {
        return this.vy;
    }

    public com.bytedance.adsdk.tq.hww.tq.hww<?, Float> vy() {
        return this.f31989hu;
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww
    public void hww() {
        for (int i10 = 0; i10 < this.f31991sd.size(); i10++) {
            this.f31991sd.get(i10).hww();
        }
    }

    public void hww(com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww interfaceC0297hww) {
        this.f31991sd.add(interfaceC0297hww);
    }
}
