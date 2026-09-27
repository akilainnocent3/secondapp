package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3389p8 implements C5Y {
    public final InterfaceC17315t A00;

    public C3389p8() {
        this(null);
    }

    public C3389p8(InterfaceC17315t interfaceC17315t) {
        this.A00 = interfaceC17315t;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    public final InterfaceC3396pF A5I() {
        C16211j c16211j = new C16211j();
        if (this.A00 != null) {
            c16211j.A43(this.A00);
        }
        return c16211j;
    }
}
