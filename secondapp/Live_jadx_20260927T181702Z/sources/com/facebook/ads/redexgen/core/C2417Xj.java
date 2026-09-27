package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2417Xj {
    public static byte[] A02;
    public long A00;
    public long A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-52, -15, -7, -28, -17, -20, -25, -93, -15, -8, -16, -27, q.B, -11, -93, q.f83622z, -23, -93, -15, -28, -15, q.f83622z, -10, q.B, -26, q.f83622z, -15, -25, -10, -93, -23, q.f83622z, -11, -93, -9, -21, q.B, -93, -9, -20, -16, q.B, -11, -67, -93, -88, -25};
    }

    public C2417Xj(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(0, 47, 115), Long.valueOf(j10)));
        }
        this.A01 = j10;
        this.A00 = System.nanoTime() + j10;
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03() {
        this.A00 = System.nanoTime() + this.A01;
    }

    public final synchronized void A04() throws InterruptedException {
        while (!A05()) {
            long jMax = Math.max(this.A00 - System.nanoTime(), 1L);
            wait(jMax / 1000000, (int) (jMax % 1000000));
        }
    }

    public final synchronized boolean A05() {
        return System.nanoTime() >= this.A00;
    }
}
