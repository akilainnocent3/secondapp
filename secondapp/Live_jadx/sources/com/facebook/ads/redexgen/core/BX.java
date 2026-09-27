package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class BX extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, c.E, c.H, c.A, c.f161648z, 82, 6, c.G, 82, 3, 7, c.A, 0, c.f161635m, 82, 7, 28, c.f161648z, c.A, 0, c.H, c.f161635m, c.E, 28, c.f161647y, 82, 31, c.A, c.f161648z, c.E, 19, 82, 17, c.G, c.f161648z, c.A, 17, 1};
    }

    public BX(Throwable th2) {
        super(A00(0, 39, 35), th2);
    }
}
