package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.view.View;
import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class Z4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-112, -116, -117, -65, -82, -77, -81, -72, -83, -81, -104, -81, -66, a.f103444p7, -71, -68, -75, -123, -96, -88, -85, 95, -77, -82, 95, -79, -92, -83, -93, -92, -79, 95, -115, -96, -77, -88, -75, -92, 95, -77, -92, -84, -81, -85, -96, -77, -92, 109, 95, -124, -84, -81, -77, -72, 95, -128, -83, -93, -79, -82, -88, -93, 95, -107, -88, -92, -74, 95, -74, -88, -85, -85, 95, -95, -92, 95, -79, -92, -77, -76, -79, -83, -92, -93, 109, -1, q.f83622z, 5, -6, 7, -10, -16, 5, -10, -2, 1, -3, q.f83622z, 5, -10};
    }

    public static View A00(C2900gi c2900gi, Throwable th2) {
        A03(c2900gi, th2);
        return new View(c2900gi);
    }

    public static void A03(C2900gi c2900gi, Throwable th2) {
        c2900gi.A08().ABC(A01(85, 15, 103), AbstractC2312Td.A1w, new C2313Te(th2));
        Log.e(A01(0, 17, 32), A01(17, 68, 21), th2);
    }
}
