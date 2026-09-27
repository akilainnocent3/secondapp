package com.bytedance.sdk.component.tq.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hu {
    private final String[] hww;

    public hu(String[] strArr) {
        this.hww = strArr;
    }

    public int hww() {
        return this.hww.length / 2;
    }

    public String tq(int i10) {
        return this.hww[(i10 * 2) + 1];
    }

    public String hww(int i10) {
        return this.hww[i10 * 2];
    }
}
