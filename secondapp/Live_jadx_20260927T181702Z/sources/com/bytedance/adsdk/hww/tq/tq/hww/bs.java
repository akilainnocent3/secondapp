package com.bytedance.adsdk.hww.tq.tq.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bs implements com.bytedance.adsdk.hww.tq.tq.hww {
    protected com.bytedance.adsdk.hww.tq.tq.hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected com.bytedance.adsdk.hww.tq.vy.sd f31893sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected com.bytedance.adsdk.hww.tq.tq.hww f31894tq;

    public bs(com.bytedance.adsdk.hww.tq.vy.sd sdVar) {
        this.f31893sd = sdVar;
    }

    public void hww(com.bytedance.adsdk.hww.tq.tq.hww hwwVar) {
        this.hww = hwwVar;
    }

    public String toString() {
        return tq();
    }

    public void tq(com.bytedance.adsdk.hww.tq.tq.hww hwwVar) {
        this.f31894tq = hwwVar;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        return this.hww.tq() + this.f31893sd.hww() + this.f31894tq.tq();
    }
}
