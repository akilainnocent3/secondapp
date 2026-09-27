package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum OD {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, c.f161646x, 3, 7, c.f161643u, 3, 2, c.B, c.C, c.f161639q, 8, c.f161638p, 19, 5, c.C, c.B, 10, c.G, c.G, 0, c.G, 101, 102, 104, 109, 108, 109, 53, 54, 56, a.f159811k, 48, 55, 62, 46, 53, 50, 42, 52, 51, 58, 28, 7, 0, c.B, 1};
    }

    static {
        A01();
    }
}
