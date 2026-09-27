package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class YE implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{c.C, c.f161647y, c.A, 84, 28, c.E, c.C, 31, c.B, c.f161647y, c.f161647y, 17, 84, c.E, c.H, 9, 90, c.f161638p, c.f161643u, 8, 31, c.E, c.H, 87, 95, c.H, 90, 95, c.f161638p, 60, 90, 95, 70, c.f161638p, 46, 5, c.C, 3, c.f161646x, c.f161640r, c.f161647y, 2, 46, c.f161643u, c.H, 4, 31, 5, c.f161646x, 3, 46, 2, c.f161647y, c.D, 46, c.A, c.f161640r, c.f161643u, 5, c.H, 3, 8};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC2318Tj.A00(A01(35, 27, 45));
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
