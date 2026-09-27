package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public enum C0E {
    A07,
    A0A,
    A0F,
    A04,
    A0E,
    A0D,
    A0G,
    A03,
    A0B,
    A05,
    A08,
    A0H,
    A06,
    A09,
    A0C,
    A02;

    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{116, 121, 121, 35, 47, 46, 51, 52, 50, 53, 35, 52, 47, 50, 63, 50, 37, 51, 53, 44, 52, 117, 104, 115, 117, 96, q.f83619w, 121, 127, 126, 111, 96, q.A, 98, q.A, 125, 117, q.f83619w, 117, 98, 123, 102, 110, 114, 119, 125, 119, 106, 97, 114, q.A, 105, 123, 108, 97, 124, q.A, 107, 112, 122, 122, 103, 111, 115, 118, 124, 118, 107, 96, 106, 111, 111, 122, 109, 96, 125, 112, 106, q.A, 123, 4, c.f161635m, 7, c.f161638p, 6, 5, 1, 28, 0, 5, c.f161639q, 5, c.B, 19, 0, 3, c.E, 9, c.H, 19, c.f161638p, 3, c.C, 2, 8, c.E, 31, 2, c.H, c.E, 17, c.E, 6, 13, 7, 2, 2, c.A, 0, 13, c.f161640r, c.G, 7, 28, c.f161648z, 85, 86, 90, 88, 85, 70, 79, 88, 75, 80, 88, 91, 85, 92, 51, 48, 40, 58, 45, 32, a.f159811k, 48, 42, 49, 59, c.f161635m, c.f161640r, c.f161636n, 1, c.f161648z, 19, 13, c.A, 1, 90, 75, 88, 75, 71, 79, 94, 79, 88, 4, 19, c.f161647y, 19, 31, 0, 19, 4, 49, 38, 48, 44, 54, 49, 32, 38, 60, 53, 34, 49, 42, 34, 33, 47, 38, c.H, 9, c.B, c.C, c.H, 2, 54, 51, 51, 38, 49, 60, 33, 44, 54, 45, 39};
    }
}
