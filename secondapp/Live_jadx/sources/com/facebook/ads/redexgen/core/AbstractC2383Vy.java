package com.facebook.ads.redexgen.core;

import android.util.Log;
import f6.q;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2383Vy {
    public static byte[] A00;
    public static final DateFormat A01;
    public static final AtomicBoolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{112, -66, 119, 107, 112, -66, 97, -81, 104, 92, -105, 97, -81, -103, 92, 97, -81, -41, a.B7, -28, -19, -11, a.B7, -37, a.f103428n7, -21, -35, -11, -30, -27, -35, -35, -37, q.B, -98, -98, -112, a.f103460r7, a.f103460r7, -112, a.f103493v7, a.f103493v7, -124, -87, -87, -87};
    }

    static {
        A03();
        A01 = new SimpleDateFormat(A01(34, 12, 49), Locale.US);
        A02 = new AtomicBoolean();
    }

    public static String A00() {
        return A01.format(Calendar.getInstance().getTime());
    }

    public static void A02() {
        A02.set(true);
    }

    public static void A04(String str, String str2) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(0, 6, 38), A00(), str2));
    }

    public static void A05(String str, String str2, String str3) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(6, 11, 23), A00(), str3, str2));
    }
}
