package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.signals.SignalKey;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2779el {
    A06(101),
    A09(102),
    A0A(103),
    A07(104),
    A08(105),
    A05(106),
    A04(SignalKey.EVENT_ID),
    A03(108);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -52, a.f103468s7, a.f103428n7, a.f103444p7, -46, -69, a.f103511x7, a.f103452q7, -67, a.f103428n7, -56, a.f103484u7, a.f103428n7, -67, -66, -52, a.f103520y7, a.f103511x7, -56, -46, -20, -5, -12, 7, -16, 1, -22, -6, -15, -20, 7, -5, -13, -15, -8, -66, a.f103520y7, -60, -60, a.f103511x7, -69, a.f103502w7, -67, -67, a.f103476t7, -41, a.f103529z7, a.f103444p7, -68, -67, a.f103484u7, -41, a.f103529z7, a.f103444p7, -67, a.A7, -41, a.f103484u7, a.f103476t7, -41, -68, -67, a.f103511x7, -52, a.f103502w7, a.f103484u7, -47, 2, 7, 13, -2, c.f161635m, c.f161636n, 13, 2, 13, 2, -6, 5, c.B, c.f161639q, 2, -3, -2, 8, c.B, c.f161639q, 2, -2, c.f161640r, c.B, -3, -2, c.f161636n, 13, c.f161635m, 8, c.f161643u, c.f161640r, 7, c.C, 33, c.B, c.f161635m, 6, 7, 17, 33, c.f161635m, c.f161640r, c.f161648z, 7, c.f161646x, c.f161647y, c.f161648z, c.f161635m, c.f161648z, c.f161635m, 3, c.f161638p, 33, c.f161640r, 9, c.f161648z, 33, 4, c.A, c.f161648z, c.f161648z, 17, c.f161640r, 7, -2, c.f161640r, c.B, c.f161639q, 2, -3, -2, 8, c.B, 2, 7, 13, -2, c.f161635m, c.f161636n, 13, 2, 13, 2, -6, 5, c.B, 13, 8, 8, 5, -5, -6, c.f161635m, c.B, -4, 5, 8, c.f161636n, -2, c.B, -4, 5, 2, -4, 4, -2, -3, -35, -48, -30, -52, -35, a.A7, -48, a.A7, -22, a.C7, -44, a.A7, -48, a.B7, -22, -33, a.B7, a.B7, -41, a.f103520y7, -52, -35, -22, a.f103529z7, -41, a.B7, -34, -48, -22, a.f103529z7, -41, -44, a.f103529z7, -42, -48, a.A7, a.E7, -47, a.A7, -42, -27, -42, -46, -37, a.f103520y7, a.A7, -44};
    }

    static {
        A01();
    }

    EnumC2779el(int i10) {
        this.A00 = i10;
    }

    public final int A03() {
        return this.A00;
    }
}
