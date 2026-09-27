package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3267n9 implements FF {
    public final int A00;

    public C3267n9() {
        this(-1);
    }

    public C3267n9(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final int A8Z(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final long A8u(FE fe2) {
        IOException iOException = fe2.A03;
        if ((iOException instanceof C3K) || (iOException instanceof FileNotFoundException) || (iOException instanceof AM) || (iOException instanceof FP) || C17135b.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((fe2.A00 - 1) * 1000, 5000);
    }
}
