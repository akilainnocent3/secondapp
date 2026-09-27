package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class U5 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{6, 6, 19, -9, 3, 2, -6, -3, -5, 19, 8, 7, 19, 1, 7, -5, -5, 8, -4, -18, -5, -1, q.f83622z, -20, -18, 8, -18, 1, -3, -5, -22, -4, -16, -16, -3, -15, -29, -16, -12, -25, a.C7, -29, -3, -15, -30, -23, -3, -12, -29, -16, -15, -25, -19, -20};
    }

    public static String A01(C2896ge c2896ge) {
        return WN.A00(c2896ge).getString(A00(0, 15, 75), null);
    }

    public static String A02(C2896ge c2896ge) {
        return WN.A00(c2896ge).getString(A00(15, 17, 64), null);
    }

    public static String A03(C2896ge c2896ge) {
        return WN.A00(c2896ge).getString(A00(32, 22, 53), null);
    }

    public static void A05(C2896ge c2896ge) {
        WN.A00(c2896ge).edit().remove(A00(32, 22, 53)).apply();
    }

    public static void A06(C2896ge c2896ge, String str, String str2) {
        WN.A00(c2896ge).edit().putString(A00(32, 22, 53), str).putString(A00(15, 17, 64), str2).putString(A00(0, 15, 75), Y1.A07(Y1.A00())).apply();
    }
}
