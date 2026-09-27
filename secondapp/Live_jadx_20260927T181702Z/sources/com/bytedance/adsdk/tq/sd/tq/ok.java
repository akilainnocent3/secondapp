package com.bytedance.adsdk.tq.sd.tq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ok {
    private final hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.sd.hww.vy f32286sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.sd.hww.ok f32287tq;
    private final boolean vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public ok(hww hwwVar, com.bytedance.adsdk.tq.sd.hww.ok okVar, com.bytedance.adsdk.tq.sd.hww.vy vyVar, boolean z10) {
        this.hww = hwwVar;
        this.f32287tq = okVar;
        this.f32286sd = vyVar;
        this.vy = z10;
    }

    public hww hww() {
        return this.hww;
    }

    public com.bytedance.adsdk.tq.sd.hww.vy sd() {
        return this.f32286sd;
    }

    public com.bytedance.adsdk.tq.sd.hww.ok tq() {
        return this.f32287tq;
    }

    public boolean vy() {
        return this.vy;
    }
}
