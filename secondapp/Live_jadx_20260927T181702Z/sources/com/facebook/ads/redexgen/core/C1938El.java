package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1938El {
    public static byte[] A03;
    public final int A00;
    public final C3423pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, c.f161647y, c.f161648z, c.C, c.H, c.C, 36, c.C, 31, c.H, 3, 43, 46, 50, 55, -34, 50, 48, 31, 33, 41, 49, -34, 31, 48, 35, -34, 44, 45, 50, -34, 31, 42, 42, 45, 53, 35, 34};
    }

    public C1938El(C3423pg c3423pg, int... iArr) {
        this(c3423pg, iArr, 0);
    }

    public C1938El(C3423pg c3423pg, int[] iArr, int i10) {
        if (iArr.length == 0) {
            AbstractC16924g.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c3423pg;
        this.A02 = iArr;
        this.A00 = i10;
    }
}
