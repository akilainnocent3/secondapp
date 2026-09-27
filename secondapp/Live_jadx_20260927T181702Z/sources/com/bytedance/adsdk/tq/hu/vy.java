package com.bytedance.adsdk.tq.hu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy {
    private float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f31966tq;

    public void hww(float f10) {
        float f11 = this.hww + f10;
        this.hww = f11;
        int i10 = this.f31966tq + 1;
        this.f31966tq = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.hww = f11 / 2.0f;
            this.f31966tq = i10 / 2;
        }
    }
}
