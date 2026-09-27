package com.facebook.ads.redexgen.core;

import android.util.Log;
import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class R1 implements InterfaceC2393Wi {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-100, -104, -105, a.f103511x7, -70, -65, -69, -60, -71, -69, -92, -69, a.f103502w7, a.f103520y7, a.f103468s7, -56, a.f103444p7, -48, -23, -26, -23, -22, q.f83622z, -23, -101, -32, -13, -34, -32, -21, -17, -28, -22, -23, -87};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2393Wi
    public final void AAx(int i10, Throwable th2) {
        Log.e(A00(0, 17, 58), A00(17, 18, 95), th2);
    }
}
