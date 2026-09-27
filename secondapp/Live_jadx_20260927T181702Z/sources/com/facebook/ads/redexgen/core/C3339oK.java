package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3339oK implements InterfaceC18088v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ AnonymousClass12 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, c.E, 10, 7, 1, 78, c.G, 7, 0, 5, 78, c.f161635m, 28, 28, 1, 28, 32, 8, 9, 4, c.f161636n, 46, 2, 9, 8, c.f161638p, 44, c.B, 9, 4, 2, 63, 8, 3, 9, 8, 31, 8, 31, 55, 54, c.f161635m, 52, a.f159811k, a.f159811k, 40, c.B, c.C, 32, c.f161648z, 28, c.f161643u, 2, 7};
    }

    static {
        A01();
    }

    public C3339oK(AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AD6(Exception exc) {
        AbstractC16924g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        this.A00.A0F.A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AD7(C18058r c18058r) {
        this.A00.A0F.A0B(c18058r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AD8(C18058r c18058r) {
        this.A00.A0F.A0C(c18058r);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AF2() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AF3() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AFN(long j10) {
        this.A00.A0F.A03(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AFy(boolean z10) {
        this.A00.A0F.A0I(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18088v
    public final void AGJ(int i10, long j10, long j11) {
        this.A00.A0F.A01(i10, j10, j11);
    }
}
