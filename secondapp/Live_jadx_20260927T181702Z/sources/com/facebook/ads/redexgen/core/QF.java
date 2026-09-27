package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC2425Xr {
    public final C2424Xq A00;
    public final InterfaceC2425Xr A01;

    public QF(InterfaceC2425Xr interfaceC2425Xr, int i10, int i11) {
        this.A01 = interfaceC2425Xr;
        this.A00 = new C2424Xq(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC2427Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC2427Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
