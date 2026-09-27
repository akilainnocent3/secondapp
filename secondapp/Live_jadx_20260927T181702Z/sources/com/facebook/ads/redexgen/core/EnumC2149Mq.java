package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2149Mq {
    A09,
    A04,
    A05,
    A0A,
    A03,
    A08,
    A07,
    A06;

    public static byte[] A00;
    public static String[] A01 = {"lOzuqd9TjXHlivepUaRJZyovV0XRZz3Q", "3CmPFRqqfEz1KNHoTaFI9Gq9W7MdJSat", "haORrB9MD96pjJjEM3VH9Mkp1W5ocbVO", "NmjzB0Xtr3isEon9bZHWRNmwidAWwXHD", "sUTNp2nMxY0O1vbAqz8mD0UyRSKVk6HB", "U2dhTMN4g5dnFjvsoCGatnesuvXNv1a4", "4yC8jy8D2py2trVgka4ywqiYEdNiB8JC", "oszw9hdc4eixLtuswncqLzcYbbEIixDe"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{41, 56, 56, 55, 59, 60, 39, 58, 45, 40, 42, 37, 37, 36, 63, 52, 36, 59, 46, 37, 118, 116, 123, 123, 122, 97, 106, 97, 103, 116, 118, 126, 32, 54, 43, 52, 52, 33, 32, 28, 1, 13, 28, c.f161635m, c.A, c.B, c.f161647y, 6, c.E, c.f161635m, c.f161648z, c.f161638p, 10, 28, c.f161635m, 98, 106, 105, 81, 80, 81, 90, 115, q.f83619w, 101, 104, 115, q.f83619w, 98, 117, 126, 117, 110, 126, 96, q.A, q.A};
    }

    static {
        A01();
    }

    public static boolean A02(EnumC2149Mq enumC2149Mq) {
        return A04.equals(enumC2149Mq) || A05.equals(enumC2149Mq);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2149Mq[] valuesCustom() {
        EnumC2149Mq[] enumC2149MqArr = (EnumC2149Mq[]) values().clone();
        String[] strArr = A01;
        if (strArr[6].charAt(17) != strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "RzvFYuFX7ttNqzVxDa22HEjRW3DLLGXn";
        strArr2[0] = "i0gT3y5gW8KzD6GAKa0KnQ1HdBIZCzpI";
        return enumC2149MqArr;
    }
}
