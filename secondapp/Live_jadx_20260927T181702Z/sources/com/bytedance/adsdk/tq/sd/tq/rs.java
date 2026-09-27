package com.bytedance.adsdk.tq.sd.tq;

import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class rs implements sd {
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final boolean f32291sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final hww f32292tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static hww hww(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public rs(String str, hww hwwVar, boolean z10) {
        this.hww = str;
        this.f32292tq = hwwVar;
        this.f32291sd = z10;
    }

    public String hww() {
        return this.hww;
    }

    public boolean sd() {
        return this.f32291sd;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f32292tq + b.f85383j;
    }

    public hww tq() {
        return this.f32292tq;
    }

    @Override // com.bytedance.adsdk.tq.sd.tq.sd
    public com.bytedance.adsdk.tq.hww.hww.sd hww(com.bytedance.adsdk.tq.rs rsVar, com.bytedance.adsdk.tq.vgm vgmVar, com.bytedance.adsdk.tq.sd.sd.hww hwwVar) {
        return new com.bytedance.adsdk.tq.hww.hww.ny(this);
    }
}
