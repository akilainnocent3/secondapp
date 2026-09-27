package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2460Za {
    public int A00;
    public YM A01;
    public InterfaceC2465Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C2900gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C2460Za(C2900gi c2900gi, InterfaceC2465Zf interfaceC2465Zf) {
        this.A0B = c2900gi;
        this.A02 = interfaceC2465Zf;
    }

    public final C2460Za A0C(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2460Za A0D(YM ym2) {
        this.A01 = ym2;
        return this;
    }

    public final C2460Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C2460Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C2460Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C2460Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C2460Za A0I(boolean z10) {
        this.A08 = z10;
        return this;
    }

    public final C2460Za A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C2460Za A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C2461Zb A0L() {
        return new C2461Zb(this, null);
    }
}
