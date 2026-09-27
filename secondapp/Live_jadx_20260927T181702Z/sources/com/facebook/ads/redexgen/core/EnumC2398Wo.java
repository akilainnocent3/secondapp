package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2398Wo {
    A05(0),
    A0D(1),
    A08(2),
    A0B(3),
    A09(4),
    A0C(5),
    A04(6),
    A0A(7),
    A06(8),
    A07(9);

    public static byte[] A01;
    public static String[] A02 = {"qsBFV4QzyJZ", "Un3rqFVsxSBnmkCaaN3XKlbCw4AYbFqb", "uS", "DU", "tTGntKCVfgII9xqsGpGrv4L0WmyWUOUj", "KWr2MioisOT1RP6pbxaLpNmtsO5qpX4q", "QPqS7MAagvQqYe50TQs3IlpOEHW3O171", "i9UHFEeYKrwiWF3GKw7x6guqyhTqAOKO"};
    public int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[4].charAt(8) == 'p') {
                throw new RuntimeException();
            }
            A02[4] = "bTRLSoLZMuaOSwXtpMMGEunxdgwN2gpY";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i14 = (bArrCopyOfRange[i13] - i12) - 94;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                String[] strArr2 = A02;
                strArr2[6] = "ZL8DSguYajuR1eoXw1hG2lJW2j5bJdo3";
                strArr2[1] = "JhAlZD5OxJYpmdx1a1lzSlrIDQC8pEtq";
                bArrCopyOfRange[i13] = (byte) i14;
                i13++;
            } else {
                bArrCopyOfRange[i13] = (byte) i14;
                i13++;
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-46, a.B7, -35, a.C7, -26, -20, a.f103529z7, -48, a.C7, -42, -29, -42, a.C7, -42, -46, -32, -20, -33, -46, -45, a.E7, -46, -48, a.C7, -42, -36, -37, -36, a.B7, -29, a.B7, -25, -34, a.f103428n7, -12, a.B7, -25, -25, -28, -25, 6, -5, c.f161639q, 8, -3, 2, -1, c.f161636n, c.C, 0, 9, c.f161639q, 8, -2, c.C, -5, 10, 3, -20, -21, 2, -9, c.f161635m, 4, -7, -2, -5, 8, c.f161647y, -4, 5, c.f161635m, 4, -6, c.f161647y, 8, -5, -4, 2, -5, -7, 10, -1, 5, 4, -2, -1, c.f161639q, -15, -13, 4, -7, 6, -7, 4, 9, c.f161639q, 3, -11, 2, 6, -7, -13, -11, -6, -5, c.f161635m, -8, -19, 1, -6, -17, -12, -15, -2, c.f161635m, q.f83622z, -5, 1, -6, -16, c.f161635m, -19, -4, -11, -34, -35, a.f103460r7, -60, -44, a.f103444p7, -74, a.f103502w7, a.f103460r7, -72, -67, -70, a.f103484u7, -44, -69, -60, a.f103502w7, a.f103460r7, -71, -44, a.f103484u7, -70, -69, a.f103444p7, -70, -72, a.f103493v7, -66, -60, a.f103460r7, -1, 0, c.f161640r, 3, 6, -1, -1, -6, -1, -8, c.f161640r, 5, q.f83622z, 4, -4, 4, a.f103529z7, -43, -52, -52, -33, a.f103444p7, a.f103460r7, -44, a.f103493v7, -42, a.f103493v7, -44, a.f103493v7, a.f103468s7, -45, -33, -46, a.f103468s7, a.f103476t7, -52, a.f103468s7, a.f103460r7, -44, a.f103493v7, a.A7, a.f103529z7, c.f161640r, c.A, c.f161638p, c.f161638p, 33, 5, 17, c.f161640r, c.f161648z, 7, c.D, c.f161648z};
    }

    static {
        A01();
    }

    EnumC2398Wo(int i10) {
        this.A00 = i10;
    }
}
