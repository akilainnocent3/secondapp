package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static LO A00(InterfaceC3251ms interfaceC3251ms, C17074v c17074v) throws IOException {
        interfaceC3251ms.AGt(c17074v.A0l(), 0, 8);
        c17074v.A0f(0);
        int iA0C = c17074v.A0C();
        long size = c17074v.A0O();
        return new LO(iA0C, size);
    }
}
