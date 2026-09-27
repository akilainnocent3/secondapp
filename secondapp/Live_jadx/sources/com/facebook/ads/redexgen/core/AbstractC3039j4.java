package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3039j4 implements InterfaceC2298Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC3039j4(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2298Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2298Sp
    public final void ADT() {
        A01(true);
    }
}
