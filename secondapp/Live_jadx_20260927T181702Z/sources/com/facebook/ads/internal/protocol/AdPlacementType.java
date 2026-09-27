package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import f6.q;
import java.util.Arrays;
import java.util.Locale;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(127, 14, 85)),
    UNKNOWN(A00(141, 7, 17));

    public static byte[] A01;
    public static String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, a.A7, -44, a.B7, a.f103511x7, a.f103428n7, a.E7, a.B7, a.A7, a.B7, a.A7, a.f103484u7, -46, c.A, c.f161639q, c.f161638p, 19, 31, c.A, 41, 28, c.f161639q, 13, c.H, c.f161635m, c.B, 17, c.f161648z, c.f161639q, -33, -46, -27, a.B7, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, 44, 31, 49, c.E, 44, c.H, 31, c.H, 57, 48, 35, c.H, 31, 41, c.f161640r, 9, 6, 9, 10, c.f161643u, 9, 5, 4, 17, 17, 8, c.f161647y, c.f161640r, c.f161647y, c.E, c.f161636n, c.C, c.D, c.E, c.f161640r, c.E, c.f161640r, 8, 19, 68, 60, 59, 64, 76, 68, 54, 73, 60, 58, 75, 56, 69, 62, 67, 60, -6, -19, 0, -11, 2, -15, q.f83619w, 87, 106, 95, 108, 91, 85, 88, 87, q.f83619w, q.f83619w, 91, 104, 70, 57, 75, 53, 70, 56, 57, 56, 51, 74, yr.a.f159811k, 56, 57, 67, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
