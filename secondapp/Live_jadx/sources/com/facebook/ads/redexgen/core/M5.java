package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum M5 {
    A0D(A00(191, 5, 106)),
    A0B(A00(178, 5, 95)),
    A04(A00(109, 8, 91)),
    A0C(A00(183, 8, 25)),
    A08(A00(150, 10, 89)),
    A0A(A00(169, 9, 102)),
    A09(A00(160, 9, 13)),
    A05(A00(117, 7, 40)),
    A06(A00(124, 13, 36)),
    A07(A00(137, 13, 39)),
    A0E(A00(196, 22, 1));

    public static byte[] A01;
    public static String[] A02 = {"oCsQT6uSz7ndvPMuhNCnHwcy1cykmRIP", "dxQgW1fHfG7Li9QwjA", "TlDnXloLJlBDv", "qrnaS13DqrzNxoM4SqOtGSj6SkXXKDQP", "QLSlnpUZPESqj81ZgNRIADff9IPI", "BL2v8T5j9auQgeZuOiJA3Si6ird26Og", "iKYEyte3TNWgl6dOfYC56N4OH", "66RXzOK8gCySKfU5jrDKZ2dh9bBiLsuP"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{a.f103493v7, a.f103484u7, a.f103428n7, -43, -37, a.E7, a.f103511x7, -46, -42, -37, -44, -36, a.C7, a.f103428n7, -41, c.D, 31, c.B, 32, 37, 28, c.E, 54, 32, 36, c.B, c.H, 28, a.f103493v7, a.f103529z7, a.f103484u7, a.A7, -44, a.f103511x7, a.f103502w7, -27, -36, a.A7, a.f103502w7, a.f103511x7, -43, c.C, 40, 33, 52, c.G, 46, c.A, 39, c.H, c.C, -8, 7, 0, 19, -3, 1, -11, -5, -7, 32, 47, 40, 59, 50, 37, 32, 33, 43, c.B, 28, c.f161640r, c.f161648z, c.f161646x, a.A7, a.f103511x7, a.f103436o7, a.f103428n7, a.f103436o7, a.f103444p7, a.f103511x7, -60, -65, -78, -83, -82, -72, 32, 19, c.f161638p, c.f161639q, c.C, 41, c.f161648z, c.f161639q, c.f161635m, c.f161638p, 19, c.B, 17, 41, c.D, c.f161648z, c.f161635m, 35, c.f161635m, c.f161636n, c.f161648z, c.f161639q, c.E, c.C, 42, 39, 45, 43, c.G, 36, q.B, -19, -26, -18, -13, -22, -23, -28, -23, -30, -22, -17, -26, -27, -32, -22, -18, -30, q.B, -26, -25, -20, -27, -19, q.f83622z, -23, q.B, -29, -6, -19, q.B, -23, -13, c.D, 41, 34, c.f161647y, c.H, 47, c.B, 40, 31, c.D, a.f103529z7, -35, -42, a.f103493v7, -45, -41, a.f103511x7, -47, a.A7, 39, 54, 47, 34, 57, 44, 39, 40, 50, 37, 41, c.G, 35, 33, -26, -30, -41, -17, -41, a.f103428n7, -30, -37, yr.a.f159811k, 48, 43, 44, 54, -44, a.f103484u7, a.f103452q7, a.f103460r7, a.f103520y7, -67, a.f103502w7, a.f103460r7, -65, a.f103452q7, a.f103484u7, -52, a.f103468s7, -67, a.f103529z7, a.f103502w7, -65, -41, -65, a.f103436o7, a.f103502w7, a.f103460r7};
    }

    static {
        A01();
    }

    M5(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static M5[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        String[] strArr = A02;
        if (strArr[7].charAt(31) != strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "ymHT22Zq8hAPwyebTDebaq4ICrnV1cmD";
        strArr2[2] = "0dMwzo5EpOMJA";
        return (M5[]) objClone;
    }
}
