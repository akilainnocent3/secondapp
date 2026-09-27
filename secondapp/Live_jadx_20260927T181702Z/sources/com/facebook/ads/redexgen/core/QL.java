package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QL implements InterfaceC2425Xr {
    public int A00;
    public final InterfaceC2425Xr A01;
    public final InterfaceC2425Xr A02;

    public QL(InterfaceC2425Xr interfaceC2425Xr, int i10, InterfaceC2425Xr interfaceC2425Xr2) {
        this.A01 = interfaceC2425Xr;
        this.A00 = i10;
        this.A02 = interfaceC2425Xr2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void flush() {
        this.A02.flush();
    }
}
