package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3277nJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{96, 35, 33, 46, 46, 47, 52, 96, 34, 37, 96, 46, 37, 39, 33, 52, 41, 54, 37, 96, 34, 53, 52, 96, 55, 33, 51, 122, 96, 43, a.f127263w, 99, 122, 122, 0, 1, 78, 13, c.f161639q, 2, 2, c.G, 78, c.D, 1, 78, 0, c.f161635m, c.f161648z, c.D, 70, 71, 78, c.G, 7, 0, 13, c.f161635m, 78, c.D, 6, c.f161635m, 78, 2, c.f161639q, c.G, c.D, 78, 13, c.f161639q, 2, 2, 78, c.D, 1, 78, 28, c.f161635m, 3, 1, c.B, c.f161635m, 70, 71, 10, 17, 8, 8, 68, c.f161639q, 1, c.G, 68, 13, 10, 68, 1, 10, c.f161640r, c.f161648z, c.G, 94, 68, 10, 17, 8, 8, 89, 31, 4, c.G, c.G, 81, 7, c.f161640r, c.G, 4, c.f161646x, 81, c.B, 31, 81, c.f161646x, 31, 5, 3, 8, 75, 81};
    }

    public static int A00(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            } else {
                throw new NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
            }
        }
        throw new NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        AbstractC3130ki.A0F(canRemove, A01(34, 50, 57));
    }
}
