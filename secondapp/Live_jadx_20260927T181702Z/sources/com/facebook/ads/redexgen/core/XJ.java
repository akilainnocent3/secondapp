package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum XJ {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, q.f83619w, 99, 126, 99, 107, 102, 99, 112, 111, 110, c.f161643u, c.f161647y, c.f161643u, c.f161639q, c.f161643u, c.D, c.A, c.f161643u, 1, c.f161643u, c.f161647y, 28, c.B, c.C, 2, 9, 31, c.B, 31, 2, 31, c.A, c.D, 31, c.f161636n, 19, c.f161643u};
    }

    static {
        A01();
    }
}
