package com.bytedance.adsdk.tq.vgm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd {
    private float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f32353tq;

    public sd(float f10, float f11) {
        this.hww = f10;
        this.f32353tq = f11;
    }

    public float hww() {
        return this.hww;
    }

    public String toString() {
        return hww() + "x" + tq();
    }

    public float tq() {
        return this.f32353tq;
    }

    public void hww(float f10, float f11) {
        this.hww = f10;
        this.f32353tq = f11;
    }

    public boolean tq(float f10, float f11) {
        return this.hww == f10 && this.f32353tq == f11;
    }

    public sd() {
        this(1.0f, 1.0f);
    }
}
