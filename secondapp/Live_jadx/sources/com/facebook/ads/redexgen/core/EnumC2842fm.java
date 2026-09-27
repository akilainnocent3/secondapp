package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2842fm {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-11, 8, -7, -7, -8, 5, -4, 1, -6, -27, q.f83622z, q.f83622z, -17, q.f83622z, -8, -13, -5, -12, -21, -36, -16, -18, -32, -33, c.f161636n, 8, -3, c.f161647y, -2, -3, -1, 7, c.E, -1, c.f161635m, 9, c.f161636n, 8, 1, c.f161640r, 1, 0, -23, -21, -34, -23, a.B7, -21, -34, -35, 47, 49, 36, 47, 32, 49, 40, 45, 38, 19, c.f161635m, 9, c.f161640r, c.f161640r, 5, 4, q.f83622z, -13, -32, -15, -13, -28, -29};
    }

    static {
        A01();
    }
}
