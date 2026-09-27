package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2813fJ {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{28, 19, c.f161646x, c.f161640r, 28, 9, c.B, c.C, 107, q.f83619w, 99, 103, 107, 126, 99, q.f83619w, 109, 107, 124, 111, 124, 107, 106, 124, 102, a.f127263w, 119, 112, 116, a.f127263w, 109, 124, 125, 91, 76, 95, 76, 91, 90, 76, 86, 72, 71, 64, 68, 72, 93, 64, 71, 78};
    }

    static {
        A01();
    }
}
