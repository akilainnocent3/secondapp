package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f67425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f67426b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f67425a = charArray;
        int[] iArr = new int[256];
        f67426b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f67426b[f67425a[i10]] = i10;
        }
        f67426b[61] = 0;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        return (bArrB == null || bArrB.length == 0) ? "" : new String(bArrB, StandardCharsets.UTF_8);
    }

    public static byte[] b(String str) {
        int i10;
        int i11;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i12 = length - 1;
        int i13 = 0;
        while (i13 < i12 && f67426b[str.charAt(i13) & 255] < 0) {
            i13++;
        }
        while (i12 > 0 && f67426b[str.charAt(i12) & 255] < 0) {
            i12--;
        }
        if (str.charAt(i12) == '=') {
            i10 = str.charAt(i12 + (-1)) == '=' ? 2 : 1;
        } else {
            i10 = 0;
        }
        int i14 = (i12 - i13) + 1;
        if (length > 76) {
            i11 = (str.charAt(76) == '\r' ? i14 / 78 : 0) << 1;
        } else {
            i11 = 0;
        }
        int i15 = (((i14 - i11) * 6) >> 3) - i10;
        byte[] bArr = new byte[i15];
        int i16 = (i15 / 3) * 3;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int[] iArr = f67426b;
            int i19 = i13 + 4;
            int i20 = iArr[str.charAt(i13 + 3)] | (iArr[str.charAt(i13 + 1)] << 12) | (iArr[str.charAt(i13)] << 18) | (iArr[str.charAt(i13 + 2)] << 6);
            bArr[i17] = (byte) (i20 >> 16);
            int i21 = i17 + 2;
            bArr[i17 + 1] = (byte) (i20 >> 8);
            i17 += 3;
            bArr[i21] = (byte) i20;
            if (i11 <= 0 || (i18 = i18 + 1) != 19) {
                i13 = i19;
            } else {
                i13 += 6;
                i18 = 0;
            }
        }
        if (i17 < i15) {
            int i22 = 0;
            int i23 = 0;
            while (i13 <= i12 - i10) {
                i22 |= f67426b[str.charAt(i13)] << (18 - (i23 * 6));
                i23++;
                i13++;
            }
            int i24 = 16;
            while (i17 < i15) {
                bArr[i17] = (byte) (i22 >> i24);
                i24 -= 8;
                i17++;
            }
        }
        return bArr;
    }
}
