package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2753eK {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-102, -110, -106, -107, -110, -108, -45, -30, -30, -47, -32, -45, -33, -41, -10, -9, 8, -5, -11, -9, -15, -1, 1, -10, -9, -2, a.E7, -36, -48, a.f103529z7, a.E7, -46, -65, a.f103460r7, 38, 42, c.f161648z, 45, 28, 41, -10, -25, -8, -6, -12, -21, -8, -27, -21, -12, -22, -10, -11, -17, -12, -6, a.C7, -35, -46, -22, -46, -45, -35, -42, -48, -33, -46, -34, -42, -56, -72, a.f103484u7, -70, -70, a.f103460r7, -76, -67, -70, -66, -68, -67, a.f103493v7, c.f161648z, 6, c.f161647y, 8, 8, 17, 2, c.D, c.f161636n, 7, c.A, c.f161635m, -19, -34, -27, a.E7, -16, -33, -20, -19, -29, -23, q.B, -1, -15, -1, -1, -11, -5, -6, -21, -11, -16};
    }

    public static Map<String, String> A01(T8 t10, String str, String str2) {
        HashMap map = new HashMap();
        C2323To c2323To = new C2323To(t10);
        int i10 = t10.getResources().getDisplayMetrics().widthPixels;
        int i11 = t10.getResources().getDisplayMetrics().heightPixels;
        map.put(A00(105, 10, 69), t10.A09().A02());
        map.put(A00(56, 13, 42), str2);
        map.put(A00(40, 16, 63), str);
        map.put(A00(14, 12, 75), String.valueOf(c2323To.A09()));
        map.put(A00(82, 12, 92), String.valueOf((int) (i10 / XX.A02)));
        map.put(A00(69, 13, 14), String.valueOf((int) (i11 / XX.A02)));
        map.put(A00(32, 2, 9), t10.A05().A9S());
        map.put(A00(34, 6, 112), C2323To.A04);
        map.put(A00(26, 6, 38), Locale.getDefault().toString());
        map.put(A00(94, 11, 51), A00(0, 6, 29));
        map.put(A00(6, 8, 43), c2323To.A05());
        return map;
    }
}
