package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC2425Xr {
    public int A00;
    public final InterfaceC2425Xr A01;

    public QI(InterfaceC2425Xr interfaceC2425Xr, int i10) {
        this.A01 = interfaceC2425Xr;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2425Xr
    public final void flush() {
        this.A01.flush();
    }
}
