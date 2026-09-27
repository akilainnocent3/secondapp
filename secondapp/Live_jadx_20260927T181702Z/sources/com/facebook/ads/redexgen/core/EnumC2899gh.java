package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import java.util.Locale;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2899gh {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, c.f161640r, 10, c.f161639q, 89, 40, 38, 38, 51, 110, 125, q.f83619w, q.f83619w, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC2899gh(String str) {
        this.A00 = str;
    }

    public static EnumC2899gh A00(String str) {
        for (EnumC2899gh enumC2899gh : values()) {
            if (enumC2899gh.A00.equals(str)) {
                return enumC2899gh;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
