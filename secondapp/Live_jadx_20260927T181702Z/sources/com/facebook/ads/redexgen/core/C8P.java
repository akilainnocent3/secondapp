package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC3380oz implements InterfaceC2064Jj {
    public long A00;
    public InterfaceC2064Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3380oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC17325u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j10, InterfaceC2064Jj interfaceC2064Jj, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC2064Jj;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final List<C3410pT> A7X(long j10) {
        return ((InterfaceC2064Jj) AbstractC16843y.A01(this.A01)).A7X(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final long A83(int i10) {
        return ((InterfaceC2064Jj) AbstractC16843y.A01(this.A01)).A83(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A84() {
        return ((InterfaceC2064Jj) AbstractC16843y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A8a(long j10) {
        return ((InterfaceC2064Jj) AbstractC16843y.A01(this.A01)).A8a(j10 - this.A00);
    }
}
