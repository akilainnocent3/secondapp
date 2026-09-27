package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C18108y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C3460qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, c.D, 9, c.f161638p, c.f161646x, -7, c.A, 6, 8, c.f161640r, a.f103468s7, 28, c.A, c.f161638p, c.C, 10, a.f103468s7, c.f161635m, 6, c.f161638p, 17, 10, 9, -33, a.f103468s7};
    }

    public C18108y(int i10, C3460qI c3460qI, boolean z10) {
        super(A00(0, 25, 91) + i10);
        this.A02 = z10;
        this.A00 = i10;
        this.A01 = c3460qI;
    }
}
