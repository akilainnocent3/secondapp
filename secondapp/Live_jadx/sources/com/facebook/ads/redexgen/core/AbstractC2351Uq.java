package com.facebook.ads.redexgen.core;

import android.content.Context;
import f6.q;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2351Uq {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 58, 55, 55, 52, 44, 4, 50, 58, 57, 4, 56, 52, 53, 47, 62, 35, 47, 4, 44, 41, 58, 43, 43, 62, 41, 4, 56, 41, 62, 58, 47, 50, 52, 53, 32, 37, 47, 54, c.H, 32, 47, 37, 51, 46, 40, 37, c.H, 36, 47, 32, 35, 45, 36, c.H, 40, 47, c.H, 32, 49, 49, c.H, 35, 51, 46, 54, 50, 36, 51, c.H, 39, 40, 45, 36, c.H, 34, 41, 46, 46, 50, 36, 51, c.f161635m, c.f161638p, 4, c.G, 53, c.f161635m, 4, c.f161638p, c.B, 5, 3, c.f161638p, 53, c.f161639q, 4, c.f161635m, 8, 6, c.f161639q, 53, 3, 4, 53, c.f161635m, c.D, c.D, 53, 8, c.B, 5, c.G, c.C, c.f161639q, c.B, 53, 4, c.f161635m, 28, 3, 13, c.f161635m, c.H, 3, 5, 4, 106, 111, 101, 124, 84, 106, 101, 111, 121, q.f83619w, 98, 111, 84, 98, 106, 105, 84, 98, 102, 123, 121, q.f83619w, 125, 110, 84, 105, 121, q.f83619w, 124, a.f127263w, 98, 101, 108, 84, 104, 106, 123, 106, 105, 98, 103, 98, 127, 98, 110, a.f127263w, 93, 88, 82, 75, 99, 89, 82, 93, 94, 80, 89, 99, 85, 93, 94};
    }

    public static boolean A02(Context context) {
        return C2350Up.A0V(context).A38(A00(0, 47, 121), true);
    }

    public static boolean A03(Context context) {
        return C2350Up.A0V(context).A38(A00(47, 47, 99), false);
    }

    public static boolean A04(Context context) {
        return C2350Up.A0V(context).A38(A00(139, 46, 41), false);
    }

    public static boolean A05(Context context) {
        return C2350Up.A0V(context).A38(A00(185, 15, 30), false);
    }

    public static boolean A06(Context context) {
        return C2350Up.A0V(context).A38(A00(94, 45, 72), false);
    }
}
