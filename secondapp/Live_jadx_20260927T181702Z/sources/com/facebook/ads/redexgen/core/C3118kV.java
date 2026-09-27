package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3118kV implements C5V {
    public MP A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C3118kV A00(MP mp2) {
        this.A02 = mp2;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5V
    public final C3117kU A5H() {
        return new C3117kU((MP) AbstractC16843y.A01(this.A02), this.A01, this.A00);
    }
}
