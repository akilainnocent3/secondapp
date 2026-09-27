package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class W7 extends AbstractRunnableC2387Wc {
    public static byte[] A07;
    public final /* synthetic */ long A00;
    public final /* synthetic */ W6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{c.f161647y, 33, 31, -32, c.B, 19, c.f161647y, c.A, c.f161646x, 33, 33, c.G, -32, c.G, 19, 38, 19, 32, 19, -32, 34, 36, 33, 40, c.E, c.f161648z, c.A, 36, -32, -5, 32, 37, 38, 19, c.H, c.H, 4, c.A, c.B, c.A, 36, 36, c.A, 36, 2, 36, 33, 40, c.E, c.f161648z, c.A, 36, -74, a.f103452q7, a.f103436o7, -127, -68, a.f103444p7, a.f103476t7, a.f103484u7, -76, -70, a.f103468s7, -76, a.f103436o7, -127, -74, a.f103452q7, a.f103444p7, a.f103484u7, -72, a.f103444p7, a.f103484u7, a.f103460r7, a.f103468s7, a.f103452q7, a.f103493v7, -68, -73, -72, a.f103468s7, -127, -100, a.f103444p7, a.f103476t7, a.f103484u7, -76, -65, -65, -91, -72, -71, -72, a.f103468s7, a.f103468s7, -72, a.f103468s7, -93, a.f103468s7, a.f103452q7, a.f103493v7, -68, -73, -72, a.f103468s7};
    }

    public W7(W6 w10, boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A01 = w10;
        this.A06 = z10;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = j10;
        this.A05 = z11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        boolean fb4aResult = this.A01.A03(A00(0, 52, 96), this.A06, this.A02, this.A04, this.A03, this.A00);
        if (fb4aResult) {
            return;
        }
        boolean fb4aResult2 = this.A05;
        if (fb4aResult2) {
            this.A01.A03(A00(52, 53, 1), this.A06, this.A02, this.A04, this.A03, this.A00);
        }
    }
}
