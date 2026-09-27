package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2533al {
    public static byte[] A02;
    public boolean A00 = true;
    public final M3 A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{13, c.D, c.D, 45, 66, c.f161640r, 59, 57, c.f161639q, 59, 58, 64, 49, 58, 64, c.B, 59, 45, 48, 49, 48, 6, c.f161646x, 33, 33, 52, 73, 31, 66, 52, 55, c.B, 73, 56, 65, 71, c.B, 65, 55, 13, -52, a.E7, a.E7, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, a.f103468s7, 34, c.E, c.f161647y, c.f161640r, -44, -44, c.f161643u, 33, c.D, c.f161639q, 32, c.f161647y, c.E, c.D, -44, -43, -52, 39, 32, c.H, 37, -52, 39, -52, -52, c.f161647y, c.f161643u, -52, -44, a.f103520y7, 35, c.f161647y, c.D, c.f161640r, c.E, 35, a.B7, 28, 17, c.H, c.f161643u, c.E, c.H, c.C, 13, c.D, c.f161639q, 17, -52, 40, 40, -52, a.f103520y7, 35, c.f161647y, c.D, c.f161640r, c.E, 35, a.B7, 28, 17, c.H, c.f161643u, c.E, c.H, c.C, 13, c.D, c.f161639q, 17, a.B7, 32, c.f161647y, c.C, c.f161647y, c.D, 19, -52, 40, 40, -52, a.f103520y7, c.f161640r, c.E, c.f161639q, 33, c.C, 17, c.D, 32, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, a.f103520y7, c.f161640r, c.E, c.f161639q, 33, c.C, 17, c.D, 32, a.B7, c.f161638p, c.E, c.f161640r, 37, -52, 40, 40, -52, a.f103520y7, c.f161640r, c.E, c.f161639q, 33, c.C, 17, c.D, 32, a.B7, c.f161638p, c.E, c.f161640r, 37, a.B7, c.f161639q, c.f161646x, c.f161647y, c.B, c.f161640r, c.H, 17, c.D, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, c.f161640r, c.E, c.f161639q, 33, c.C, 17, c.D, 32, a.B7, c.f161638p, c.E, c.f161640r, 37, a.B7, c.f161639q, c.f161646x, c.f161647y, c.B, c.f161640r, c.H, 17, c.D, a.B7, c.B, 17, c.D, 19, 32, c.f161646x, -52, q.B, -52, -35, -43, -52, 39, -52, -52, -52, -52, c.H, 17, 32, 33, c.H, c.D, -25, -52, -52, 41, -52, -52, 34, 13, c.H, -52, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, -52, -23, -52, 35, c.f161647y, c.D, c.f161640r, c.E, 35, a.B7, 28, 17, c.H, c.f161643u, c.E, c.H, c.C, 13, c.D, c.f161639q, 17, a.B7, 32, c.f161647y, c.C, c.f161647y, c.D, 19, -25, -52, -52, c.f161647y, c.f161643u, -52, -44, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.H, 17, 31, 28, c.E, c.D, 31, 17, -15, c.D, c.f161640r, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, c.f161639q, c.E, c.D, 31, c.E, c.B, 17, a.B7, c.B, c.E, 19, -44, -45, -19, -6, -6, 13, 34, -2, 17, 31, 28, c.E, c.D, 31, 17, -15, c.D, c.f161640r, -26, -45, -52, -41, -52, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.H, 17, 31, 28, c.E, c.D, 31, 17, -15, c.D, c.f161640r, -43, -25, -52, -52, 41, -52, -52, c.f161647y, c.f161643u, -52, -44, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.f161640r, c.E, c.C, -17, c.E, c.D, 32, 17, c.D, 32, -8, c.E, 13, c.f161640r, 17, c.f161640r, -15, 34, 17, c.D, 32, -1, 32, 13, c.H, 32, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, c.f161639q, c.E, c.D, 31, c.E, c.B, 17, a.B7, c.B, c.E, 19, -44, -45, -19, -6, -6, 13, 34, -16, c.E, c.C, -17, c.E, c.D, 32, 17, c.D, 32, -8, c.E, 13, c.f161640r, 17, c.f161640r, -26, -45, -52, -41, -52, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.f161640r, c.E, c.C, -17, c.E, c.D, 32, 17, c.D, 32, -8, c.E, 13, c.f161640r, 17, c.f161640r, -15, 34, 17, c.D, 32, -1, 32, 13, c.H, 32, -43, -25, -52, -52, 41, -52, -52, c.f161647y, c.f161643u, -52, -44, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.B, c.E, 13, c.f161640r, -15, 34, 17, c.D, 32, -15, c.D, c.f161640r, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, c.f161639q, c.E, c.D, 31, c.E, c.B, 17, a.B7, c.B, c.E, 19, -44, -45, -19, -6, -6, 13, 34, -8, c.E, 13, c.f161640r, -15, 34, 17, c.D, 32, -15, c.D, c.f161640r, -26, -45, -52, -41, -52, c.D, 34, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, c.f161635m, 13, c.D, c.f161635m, 32, a.B7, c.B, c.E, 13, c.f161640r, -15, 34, 17, c.D, 32, -15, c.D, c.f161640r, -43, -25, -52, -52, 41, 41, -52, c.f161639q, 13, 32, c.f161639q, c.f161646x, -44, 17, c.H, c.H, -43, -52, 39, -52, -52, c.f161639q, c.E, c.D, 31, c.E, c.B, 17, a.B7, c.B, c.E, 19, -44, -45, 13, c.D, c.f161635m, c.D, 13, 34, c.f161647y, 19, 13, 32, c.f161647y, c.E, c.D, c.f161635m, 32, c.f161647y, c.C, c.f161647y, c.D, 19, c.f161635m, 17, c.H, c.H, c.E, c.H, -26, -45, -52, -41, -52, 17, c.H, c.H, a.B7, c.C, 17, 31, 31, 13, 19, 17, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C2533al(M3 m10) {
        this.A01 = m10;
    }

    public static long A00(String str, String str2) {
        String strSubstring = str.substring(str2.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return -1L;
        }
        try {
            long j10 = Long.parseLong(strSubstring);
            if (j10 < 0) {
                return -1L;
            }
            return j10;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String strA01 = A01(40, 17, 54);
        if (str.startsWith(strA01)) {
            this.A01.A0M(A00(str, strA01));
            return;
        }
        String strA02 = A01(0, 22, 119);
        if (str.startsWith(strA02)) {
            this.A01.A0K(A00(str, strA02));
            return;
        }
        String strA03 = A01(22, 18, 126);
        if (!str.startsWith(strA03)) {
            return;
        }
        this.A01.A0L(A00(str, strA03));
    }

    public final void A05(boolean z10) {
        this.A00 = z10;
    }
}
