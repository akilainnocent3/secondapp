package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3345oQ implements InterfaceC16703k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC16703k.A00;
    public ByteBuffer A03 = InterfaceC16703k.A00;
    public C16683i A00 = C16683i.A05;
    public C16683i A01 = C16683i.A05;
    public C16683i A05 = C16683i.A05;
    public C16683i A06 = C16683i.A05;

    public abstract C16683i A09(C16683i c16683i) throws C16693j;

    public final ByteBuffer A00(int i10) {
        if (this.A02.capacity() < i10) {
            this.A02 = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public final C16683i A57(C16683i c16683i) throws C16693j {
        this.A00 = c16683i;
        this.A01 = A09(c16683i);
        return AAL() ? this.A01 : C16683i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC16703k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public boolean AAL() {
        return this.A01 != C16683i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC16703k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16703k
    public final void flush() {
        this.A03 = InterfaceC16703k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
