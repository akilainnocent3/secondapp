package com.facebook.ads.redexgen.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC3026ir {
    A09(A00(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 7, 111)),
    A07(A00(145, 11, 71)),
    A0A(A00(180, 16, 94)),
    A06(A00(129, 16, 114)),
    A08(A00(156, 17, 64)),
    A05(A00(120, 9, 118)),
    A04(A00(98, 22, 15));

    public static byte[] A01;
    public static String[] A02 = {"3irfHjb1xBggEOYppIC20CVGO", "PvTwVw4l1egAAUgNiEJHpQxcY", "Z83jj4f2UJi7iIzCa97fW954cYyfIvRS", "Pn3ECjM654pG8xNfJs7iPR6nvOfTtg4S", "rnvCizUmlaJkbQ0LWt7EGYvIVwvlRHSU", "Y4v1TwA3VTqRjFpvhM1P5mrv4yN1Kb1i", "iJ3TP1yTdydKb8xTTpNjz5p9ilImmlzt", "3Fyn3bOdC3lEL0zKVakbNgp9AIkAOPYu"};
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[4].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "9Fh1XlTwmrAkPSBsBt7sR6HEZ4z1EPMB";
            strArr2[3] = "w0XpqxyBnVeSACOsJ07N96wKg89kpHEO";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 80, 67, 67, 64, 87, 90, 71, 64, 73, 74, 82, 90, 81, 77, 87, 64, 86, 77, 74, 73, 65, c.C, c.f161640r, 13, 28, c.D, 0, c.D, 17, c.E, 33, 32, 48, 32, 58, 59, 63, 58, 59, 48, 45, 58, 41, 41, 42, a.f159811k, 103, 124, 101, 101, 118, 111, 102, 123, q.f83619w, 104, 125, 79, 73, 78, 90, 93, 95, 89, 67, 82, 83, 72, 67, 78, 89, 93, 88, 69, 2, c.C, 28, c.C, c.B, 0, c.C, 127, 105, 97, 124, 97, 102, 111, 119, 110, 103, 122, 119, 99, 109, q.A, 123, 86, 65, 82, 82, 81, 70, 107, 86, 81, 88, 91, 67, 107, 64, 92, 70, 81, 71, 92, 91, 88, 80, 43, 34, 63, 46, 40, c.f161643u, 40, 35, 41, 39, 38, c.f161648z, 38, 60, a.f159811k, 57, 60, a.f159811k, c.f161648z, 43, 60, 47, 47, 44, 59, c.f161643u, 9, c.f161640r, c.f161640r, 35, c.D, 19, c.f161638p, 17, c.G, 8, 8, c.f161638p, 9, c.G, c.D, c.B, c.H, 36, c.f161647y, c.f161646x, c.f161639q, 36, 9, c.H, c.D, 31, 2, 33, 58, 63, 58, 59, 35, 58, c.f161643u, 4, c.f161636n, 17, c.f161636n, c.f161635m, 2, 58, 3, 10, c.A, 58, c.f161638p, 0, 28, c.f161648z};
    }

    static {
        A01();
    }

    EnumC3026ir(String str) {
        this.A00 = str;
    }
}
