package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2778ek {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{a.f103428n7, -35, a.f103529z7, -48, a.f103428n7, -41, -56, -90, -105, -85, -87, -101, -67, -71, -82, a.f103476t7, q.B, -37, -23, -21, -29, -37, -36, -44, -46, a.E7, a.C7, -42, a.B7, -46, q.B, a.C7, -32, q.B, -25, a.f103428n7, -5, -18, -22, -4, -26, -25, -15, -22, 4, -18, q.f83622z, -11, -9, -22, -8, -8, -18, -12, -13};
    }

    static {
        A01();
    }

    EnumC2778ek(int i10) {
        this.A00 = i10;
    }
}
