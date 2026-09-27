package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import f6.q;
import java.net.UnknownHostException;
import java.util.Arrays;
import l3.a;
import org.checkerframework.dataflow.qual.Pure;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC16924g {
    public static int A00;
    public static InterfaceC16914f A01;
    public static boolean A02;
    public static byte[] A03;
    public static String[] A04 = {"pjC", "Ar4G3OSxcgl2D", "AarUE2nt7cnp4GdKoelKCQn2Jt4OXyEc", "B5uTmPcht7q4WCzfelpVRln9dVKzTr9W", "36fORse15dXsGKgrcWq47HxFqRHPKtSm", "Eh56lsHHP32qxPGDjQKhG4rai7NSZl8p", "QN71kq8063jCyPpsf", "zuMcuSAj79dOj6A3T"};
    public static final Object A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A04[1].length() == 28) {
                throw new RuntimeException();
            }
            A04[0] = "EwS";
            bArrCopyOfRange[i13] = (byte) (i14 - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{a.f103476t7, -65, 127, -107, -107, 4, 4, 4, 4, -8, 17, c.f161638p, 17, c.f161643u, c.D, 17, -21, c.f161643u, c.f161648z, c.A, q.B, c.E, 6, 8, 19, c.A, c.f161636n, c.f161643u, 17, a.f103460r7, a.f103511x7, 17, c.f161643u, a.f103460r7, 17, 8, c.A, c.D, c.f161643u, c.f161647y, c.f161638p, -52};
    }

    static {
        A03();
        A05 = new Object();
        A00 = 0;
        A02 = true;
        A01 = InterfaceC16914f.A00;
    }

    @Pure
    public static String A01(String str, Throwable th2) {
        String strA02 = A02(th2);
        if (!TextUtils.isEmpty(strA02)) {
            StringBuilder sbAppend = new StringBuilder().append(str);
            String strA00 = A00(2, 3, 2);
            StringBuilder sbAppend2 = sbAppend.append(strA00);
            String throwableString = A00(1, 1, 66);
            return sbAppend2.append(strA02.replace(throwableString, strA00)).append('\n').toString();
        }
        return str;
    }

    @Pure
    public static String A02(Throwable th2) {
        synchronized (A05) {
            try {
                if (th2 == null) {
                    return null;
                }
                if (A0B(th2)) {
                    return A00(9, 33, 48);
                }
                if (!A02) {
                    return th2.getMessage();
                }
                return Log.getStackTraceString(th2).trim().replace(A00(0, 1, 74), A00(5, 4, 113));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Pure
    public static void A04(String str, String str2) {
        synchronized (A05) {
            int i10 = A00;
        }
    }

    @Pure
    public static void A05(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 3) {
                A01.A6H(str, str2);
            }
        }
    }

    @Pure
    public static void A06(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 1) {
                A01.A9t(str, str2);
            }
        }
    }

    @Pure
    public static void A07(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 2) {
                A01.AKm(str, str2);
            }
        }
    }

    @Pure
    public static void A08(String str, String str2, Throwable th2) {
        A05(str, A01(str2, th2));
    }

    @Pure
    public static void A09(String str, String str2, Throwable th2) {
        A06(str, A01(str2, th2));
    }

    @Pure
    public static void A0A(String str, String str2, Throwable th2) {
        A07(str, A01(str2, th2));
    }

    @Pure
    public static boolean A0B(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                String[] strArr = A04;
                if (strArr[3].charAt(22) != strArr[2].charAt(22)) {
                    throw new RuntimeException();
                }
                A04[1] = "Bi";
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }
}
