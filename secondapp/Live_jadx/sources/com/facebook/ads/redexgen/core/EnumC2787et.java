package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2787et {
    A03,
    A04,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-75, a.f103493v7, -56, a.f103460r7, -45, a.f103484u7, -56, -75, a.f103476t7, -56, -71, -72, -27, -26, -21, -10, -22, -21, a.f103428n7, -23, -21, -36, -37, a.f103460r7, a.f103444p7, -77, a.f103436o7, a.f103520y7, a.f103444p7, a.f103452q7, -81, a.f103436o7, a.f103452q7, -77, -78};
    }

    static {
        A01();
    }
}
