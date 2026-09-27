package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC16713l {
    public final C18279y A00;
    public final C3338oJ A01;
    public final InterfaceC16703k[] A02;

    public A4(InterfaceC16703k... interfaceC16703kArr) {
        this(interfaceC16703kArr, new C18279y(), new C3338oJ());
    }

    public A4(InterfaceC16703k[] interfaceC16703kArr, C18279y c18279y, C3338oJ c3338oJ) {
        this.A02 = new InterfaceC16703k[interfaceC16703kArr.length + 2];
        System.arraycopy(interfaceC16703kArr, 0, this.A02, 0, interfaceC16703kArr.length);
        this.A00 = c18279y;
        this.A01 = c3338oJ;
        this.A02[interfaceC16703kArr.length] = c18279y;
        this.A02[interfaceC16703kArr.length + 1] = c3338oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16713l
    public final C3439px A4F(C3439px c3439px) {
        this.A01.A02(c3439px.A01);
        this.A01.A01(c3439px.A00);
        return c3439px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16713l
    public final boolean A4G(boolean z10) {
        this.A00.A0D(z10);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16713l
    public final InterfaceC16703k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16713l
    public final long A8U(long j10) {
        return this.A01.A00(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16713l
    public final long A98() {
        return this.A00.A0C();
    }
}
