package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import java.util.regex.Pattern;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2095Ko {
    public static byte[] A00;
    public static String[] A01 = {"rzG5nsHyiLOWX8UOWspYPJE0qk8", "zzN7h9kZ1110Ms84Vk8TxNIxLbkfn1bs", "Ea1csqz6uGTsOrOcIglVsCF", "HzbrV2YdC0QyP2mr3Tf3UtzOp", "wDtYJLWcmo8biPQhT7PXhiXa0nvGQfME", "EfdNeKI6mNZbvmHLu3zFEqD29", "z9B2Nu2EMki8SlMmHuJ5tm0bMARcwAxE", "Vyy1RSqHmZDwxzuj6K"};
    public static final Pattern A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{115, 108, 48, 13, 5, c.f161640r, c.f161648z, 1, c.f161640r, 17, 85, 34, 48, 55, 35, 33, 33, 91, 85, 50, c.D, 1, 85, 76, 121, 110, 127, 121, 114, 104, 125, 123, 121, 111, 60, q.A, 105, 111, 104, 60, 121, 114, a.f127263w, 60, 107, 117, 104, 116, 60, 57, 87, 69, 66, 86, 84, 84, 121, c.f161635m, 74, 90, 91, 64, 81, 60, 79, 52, c.G, 73, 58, 62, yr.a.f159811k, 43, 48};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(58, 15, 19));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 81))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 27));
    }

    public static long A01(String str) throws NumberFormatException {
        long j10 = 0;
        String[] subparts = C5C.A1P(str, A02(56, 2, 34));
        for (String str2 : C5C.A1O(subparts[0], A02(1, 1, 81))) {
            long j11 = 60 * j10;
            if (A01[0].length() != 27) {
                throw new RuntimeException();
            }
            String[] parts = A01;
            parts[2] = "6AHxBA9eqgTuoeEClHZkEfjq11VkmmF";
            long value = Long.parseLong(str2);
            j10 = j11 + value;
        }
        long j12 = j10 * 1000;
        if (subparts.length == 2) {
            long value2 = Long.parseLong(subparts[1]);
            j12 += value2;
        }
        return 1000 * j12;
    }

    public static void A04(C17074v c17074v) throws C3K {
        int iA09 = c17074v.A09();
        if (A05(c17074v)) {
            return;
        }
        c17074v.A0f(iA09);
        throw C3K.A01(A02(2, 21, 114) + c17074v.A0T(), null);
    }

    public static boolean A05(C17074v c17074v) {
        String strA0T = c17074v.A0T();
        if (strA0T != null) {
            String line = A02(50, 6, 7);
            if (strA0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
