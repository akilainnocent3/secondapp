package com.facebook.ads.redexgen.core;

import f6.q;
import java.io.IOException;
import java.util.Arrays;
import rg.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2008He {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, 127, 82, 94, 58, 121, 114, 111, 116, q.A, 58, 105, 123, 119, 106, 118, 127, 105, 58, 119, 111, 105, 110, 58, a.f127263w, 127, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, 127, 58, 105, 123, 119, 106, 118, 127, 58, 107, 111, 127, 111, 127, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC3251ms interfaceC3251ms) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC3251ms.AGt(this.A06, 0, 10);
        interfaceC3251ms.AIl();
        if (AbstractC1995Gr.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC2007Hd interfaceC2007Hd, long j10, int i10, int i11, int i12, C2005Hb c2005Hb) {
        AbstractC16843y.A0A(this.A01 <= i11 + i12, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i13 = this.A02;
        this.A02 = i13 + 1;
        if (i13 == 0) {
            this.A04 = j10;
            this.A00 = i10;
            this.A03 = 0;
        }
        this.A03 += i11;
        this.A01 = i12;
        if (this.A02 >= 16) {
            A05(interfaceC2007Hd, c2005Hb);
        }
    }

    public final void A05(InterfaceC2007Hd interfaceC2007Hd, C2005Hb c2005Hb) {
        if (this.A02 > 0) {
            interfaceC2007Hd.AIu(this.A04, this.A00, this.A03, this.A01, c2005Hb);
            this.A02 = 0;
        }
    }
}
