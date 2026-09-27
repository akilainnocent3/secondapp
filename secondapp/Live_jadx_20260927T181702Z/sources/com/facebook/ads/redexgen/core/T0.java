package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, q.f83622z, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, a.f103428n7, -35, a.B7, -107, a.E7, -34, q.B, -32, -107, q.B, -22, a.f103428n7, a.f103428n7, a.B7, q.B, q.B, -93, -7, c.A, c.C, c.H, c.E, -42, c.D, 37, 45, 36, 34, 37, c.A, c.D, -42, 28, c.A, 31, 34, 43, 40, c.E, -28, -80, a.f103529z7, -48, -43, -46, -115, -43, -42, a.C7, -101, a.f103444p7, -33, a.C7, -26, -29, -98, -21, -25, -15, -15, -84, 19, c.f161648z, 17, c.f161647y, 36, c.A, 19, 38, c.E, 40, c.A, 17, 37, c.E, 44, c.A, 17, c.f161646x, 43, 38, c.A, 37, -33, -30, -35, a.C7, -16, -29, -33, q.f83622z, -25, -12, -29, -35, q.f83622z, -9, -18, -29, c.G, 32, c.E, 34, 43, 46, 41, c.G, 48, c.E, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, c.H, 28, c.H, 35, 32, 63, yr.a.f159811k, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, a.f103428n7, -32, -29, -20, -23, -36, -42, -23, -36, a.f103428n7, -22, -26, -27, c.A, c.E, c.f161639q, c.f161647y, 19, 28, 31, 17, c.f161646x, c.f161639q, 36, c.C, c.G, c.f161647y, 70, 67, yr.a.f159811k};
    }

    static {
        A01();
        A09 = T0.class.getSimpleName();
        A05 = AbstractC2312Td.A0o;
        A06 = AbstractC2312Td.A0s;
        A02 = AbstractC2312Td.A0l;
        A01 = AbstractC2312Td.A0k;
        A03 = AbstractC2312Td.A0m;
        A00 = AbstractC2312Td.A0i;
        A04 = AbstractC2312Td.A0n;
        A07 = AbstractC2312Td.A0t;
    }

    public static void A02(T8 t10, C2299Sq c2299Sq, int i10, String str, long j10) {
        if (!A06(t10)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c2299Sq.A01);
            jSONObject.put(A00(134, 13, 46), c2299Sq.A02);
            if (j10 > 0) {
                jSONObject.put(A00(191, 9, 73), Y1.A07(System.currentTimeMillis() - j10));
            }
            C2313Te c2313Te = new C2313Te(str);
            c2313Te.A07(jSONObject);
            c2313Te.A05(1);
            t10.A08().ABD(A00(154, 5, 84), i10, c2313Te);
        } catch (Throwable deLogException) {
            t10.A08().A4I(deLogException);
        }
    }

    public static void A03(T8 t10, C2304Sv c2304Sv, String str, int i10, String str2, Long l10, Long l11) {
        if (A06(t10)) {
            A05(t10, c2304Sv.A06, c2304Sv.A07, c2304Sv.A08, A00(186, 5, 71), str, i10, str2, l10, l11, null);
        }
    }

    public static void A04(T8 t10, C2308Sz c2308Sz, boolean z10) {
        if (!A06(t10)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c2308Sz.A01);
            jSONObject.put(A00(134, 13, 46), c2308Sz.A03);
            jSONObject.put(A00(104, 16, 23), c2308Sz.A02);
            jSONObject.put(A00(159, 13, 117), c2308Sz.A00);
            if (C2350Up.A2T(t10)) {
                jSONObject.put(A00(200, 3, 106), c2308Sz.A04);
            }
            String strA00 = z10 ? A00(61, 10, 6) : A00(71, 11, 23);
            int i10 = z10 ? A05 : A06;
            C2313Te c2313Te = new C2313Te(strA00);
            c2313Te.A07(jSONObject);
            c2313Te.A05(1);
            t10.A08().ABD(A00(154, 5, 84), i10, c2313Te);
        } catch (Throwable th2) {
            t10.A08().A4I(th2);
        }
    }

    public static void A05(T8 t10, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (C2350Up.A2T(t10)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String strA00 = A00(19, 19, 14);
            if (i10 == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i10 == A01) {
                strA00 = A00(0, 19, 39);
            }
            C2313Te c2313Te = new C2313Te(strA00);
            c2313Te.A07(jSONObject);
            c2313Te.A05(1);
            t10.A08().ABD(A00(154, 5, 84), i10, c2313Te);
        } catch (Throwable th2) {
            t10.A08().A4I(th2);
        }
    }

    public static boolean A06(T8 t10) {
        int iA06;
        if (t10.A05().AAO()) {
            iA06 = 1;
        } else {
            iA06 = AbstractC2352Ur.A06(t10);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || t10.A09().A00() <= 1.0d / ((double) iA06);
    }
}
