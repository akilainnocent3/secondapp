package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC2142Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, c.f161640r, 9, c.f161643u, 17, 36, c.E, c.f161635m, c.H, 17, c.f161640r, c.f161647y, c.H};
    }

    public static long A00(InterfaceC2143Mk interfaceC2143Mk) {
        return interfaceC2143Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC2143Mk interfaceC2143Mk) {
        String strA6j = interfaceC2143Mk.A6j(A02(7, 9, 119), null);
        if (strA6j == null) {
            return null;
        }
        return Uri.parse(strA6j);
    }
}
