package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3302ni implements InterfaceC1952Ez {
    public long A00;
    public long A01;
    public C3302ni A02;
    public C1951Ey A03;

    public C3302ni(long j10, int i10) {
        A02(j10, i10);
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A01)) + this.A03.A00;
    }

    public final C3302ni A01() {
        this.A03 = null;
        C3302ni c3302ni = this.A02;
        this.A02 = null;
        return c3302ni;
    }

    public final void A02(long j10, int i10) {
        AbstractC16843y.A08(this.A03 == null);
        this.A01 = j10;
        this.A00 = ((long) i10) + j10;
    }

    public final void A03(C1951Ey c1951Ey, C3302ni c3302ni) {
        this.A03 = c1951Ey;
        this.A02 = c3302ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1952Ez
    public final C1951Ey A6u() {
        return (C1951Ey) AbstractC16843y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1952Ez
    public final C3302ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
