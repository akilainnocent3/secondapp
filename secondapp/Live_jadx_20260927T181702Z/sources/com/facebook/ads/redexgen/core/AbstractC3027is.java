package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import java.util.Random;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3027is {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, 13, 4, 5, 65, c.f161647y, c.f161638p, 65, 19, 4, c.f161647y, 19, 8, 4, c.A, 4, 65, 44, 4, 5, 8, 0, 39, c.f161638p, 19, c.f161636n, 0, c.f161647y, 73, q.f83619w, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, 13, 108, q.f83619w, 13, 107, 127, 110, 13, 124, 107, 105, 13, 65, 72, 91, 72, 65, 13, 89, 66, 13, 8, 73, 59, 13, 28, 72, 41, 33, 72, 46, 58, 43, 72, c.D, 13, c.C, c.G, 13, c.E, 28, 72, 28, 7, 72, 89, c.f161636n, 58, 43, 127, c.H, c.f161648z, 127, c.C, 13, 28, 127, 41, 54, 59, 58, 48, 127, 59, 42, 45, 62, 43, 54, 48, 49, 127, 43, 48, 127, 122, 59, 37, 40, 36, 42, 37, 57, 19, c.f161638p, 10, 2, 8, c.f161643u, 19, 56, 19, c.f161647y, c.H, c.f161638p, 9, 0, 56, 19, 8, 56, 1, c.f161638p, 9, 3, 56, c.f161646x, 2, 0, 10, 2, 9, 19, 56, c.f161638p, 9, 56, 8, c.f161638p, c.f161635m, c.f161639q, 28, c.A, c.G, c.f161648z, c.f161635m, 87, 10, 28, c.D, 84, c.B, c.f161640r, 31, c.f161635m, c.D, 84, 13, c.f161635m, c.B, c.A, 10, 31, 28, c.f161635m, 84, c.f161635m, 28, 8, c.f161636n, 28, 10, 13, 87, c.f161639q, c.B, c.f161647y, c.f161636n, 28, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, 43, 103, 111, 96, 116, 101, 43, 112, 111, 98, 99, 105, 43, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, c.f161648z, 75, 93, 91, c.f161647y, 89, 81, 94, 74, 91, c.f161647y, 78, 81, 92, 93, 87, c.f161647y, 73, 94, 92, c.f161647y, 84, 93, 78, 93, 84, c.f161648z, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(139, 37, 109);
        A03 = new Random();
    }

    public static int A00(int i10, int i11) {
        if (i11 != 0) {
            return (int) ((Math.pow(2.0d, i10 - 1) * ((double) i11) * 1000.0d) + ((double) A03.nextInt(2000)));
        }
        return (int) Math.min((((long) (i10 - 1)) * 1000) + 500, 5000L);
    }

    public static void A03(C3056jQ c3056jQ, MediaFormat mediaFormat) {
        String strA01 = A01(0, 30, SignalKey.EVENT_ID);
        String strA02 = A01(30, 11, 11);
        if (!c3056jQ.A01) {
            return;
        }
        try {
            if (C3025iq.A02()) {
                if (c3056jQ.A0P && !C3025iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(133, 6, 71)))) {
                    return;
                }
                long j10 = c3056jQ.A00;
                if (j10 > 0) {
                    mediaFormat.setLong(A01(215, 37, 12), j10);
                    AbstractC2957hd.A01(strA02, A01(102, 31, 85), Long.valueOf(j10));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c3056jQ.A02);
                AbstractC2957hd.A01(strA02, A01(53, 26, 39), Integer.valueOf(c3056jQ.A02));
                mediaFormat.setInteger(A01(176, 39, 115), 1);
                AbstractC2957hd.A00(strA02, A01(79, 23, 98));
            }
        } catch (ClassCastException e10) {
            AbstractC2957hd.A02(strA02, strA01, e10);
        } catch (NullPointerException e11) {
            AbstractC2957hd.A02(strA02, strA01, e11);
        }
    }

    public static boolean A04(C3056jQ c3056jQ, int i10, int i11, int i12, int i13) {
        if (c3056jQ.A01 && c3056jQ.A0P && C3025iq.A03(i10, i11) != C3025iq.A03(i12, i13)) {
            return true;
        }
        return false;
    }
}
