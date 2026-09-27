package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3186ld implements InterfaceC2064Jj {
    public final long[] A00;
    public final C3410pT[] A01;

    public C3186ld(C3410pT[] c3410pTArr, long[] jArr) {
        this.A01 = c3410pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final List<C3410pT> A7X(long j10) {
        int iA0L = C5C.A0L(this.A00, j10, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C3410pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final long A83(int i10) {
        boolean z10 = true;
        AbstractC16843y.A07(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC16843y.A07(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A8a(long j10) {
        int iA0K = C5C.A0K(this.A00, j10, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
