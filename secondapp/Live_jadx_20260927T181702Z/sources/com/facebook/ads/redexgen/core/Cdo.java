package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C2170Nm A07;
    public final C2900gi A08;
    public C2158Na A01 = C2158Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C2900gi c2900gi, NY ny2, C2170Nm c2170Nm) {
        this.A08 = c2900gi;
        this.A06 = ny2;
        this.A07 = c2170Nm;
    }

    public final Cdo A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final Cdo A0A(C2158Na c2158Na) {
        this.A01 = c2158Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C2723dq A0F() {
        return new C2723dq(this, null);
    }
}
