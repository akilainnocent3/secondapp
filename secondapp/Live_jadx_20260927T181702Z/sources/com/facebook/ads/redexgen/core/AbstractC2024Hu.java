package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2024Hu {
    public final InterfaceC2007Hd A00;

    public abstract boolean A0B(C17074v c17074v) throws C3K;

    public abstract boolean A0C(C17074v c17074v, long j10) throws C3K;

    public AbstractC2024Hu(InterfaceC2007Hd interfaceC2007Hd) {
        this.A00 = interfaceC2007Hd;
    }

    public final boolean A00(C17074v c17074v, long j10) throws C3K {
        return A0B(c17074v) && A0C(c17074v, j10);
    }
}
