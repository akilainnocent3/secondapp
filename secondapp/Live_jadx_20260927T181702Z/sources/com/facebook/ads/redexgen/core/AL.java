package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AL extends C3386p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, c.D, 34, 13, c.B, c.f161647y, c.f161640r, -52, c.f161639q, c.E, c.D, 32, 17, c.D, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C17205i c17205i) {
        super(A01(0, 22, 85) + str, c17205i, 2003, 1);
        this.A00 = str;
    }
}
