package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2405Wv implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C2900gi A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{a.f103493v7, a.f103529z7, a.f103520y7, a.f103476t7, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC2405Wv(C2900gi c2900gi) {
        this.A00 = c2900gi;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            C2313Te otsl = new C2313Te(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().ABD(A00(4, 7, 44), AbstractC2312Td.A1Y, otsl);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
