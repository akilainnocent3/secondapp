package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum SW {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, c.f161639q, c.B, c.f161635m, 9, c.D, -32, a.f103520y7, -32, -6, -17, -32, -18, -17, 57, 53, 39, 52, a.f103502w7, a.f103511x7, -37, a.f103460r7, a.f103493v7, a.A7, 41, 28, c.G, 35, 28, c.D, 43, 32, 38, 37, 39, c.C, 38, 42, c.G, c.A, c.C, 28, 17, 10, c.E, c.f161638p, 13, 40, c.C, c.E, c.f161638p, c.f161639q, 28, 31, c.f161640r, c.H, 31};
    }

    static {
        A01();
    }
}
