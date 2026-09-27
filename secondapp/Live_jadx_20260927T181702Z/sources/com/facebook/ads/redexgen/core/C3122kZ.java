package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3122kZ implements InterfaceC2130Lx {
    public final InterfaceC2127Lu A00;

    public C3122kZ(InterfaceC2127Lu interfaceC2127Lu) {
        this.A00 = interfaceC2127Lu;
    }

    public final InterfaceC2127Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2130Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2130Lx
    public final C3126kd ACM() {
        return new C3126kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2130Lx
    public final C3126kd ACN(String str) {
        return new C3126kd(this, str);
    }
}
