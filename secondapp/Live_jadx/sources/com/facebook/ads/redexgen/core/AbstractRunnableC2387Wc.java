package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC2387Wc implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<WS> A04;
    public final WQ A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, c.f161635m, c.f161640r, c.f161640r, 31, 28, c.f161643u, c.E, 94, c.G, c.f161636n, c.E, 31, 10, c.E, c.D, 80, 94, 42, c.f161648z, c.f161636n, c.E, 31, c.D, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC2387Wc() {
        if (A03.get()) {
            this.A00 = C2392Wh.A01(new C2391Wg(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z10) {
        A03.set(z10);
    }

    public static void A05(boolean z10, WS ws2) {
        A02.set(z10);
        A04.set(ws2);
    }

    public final WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C2392Wh.A03(this);
            }
            try {
                A07();
            } catch (Throwable th2) {
                if (A02.get()) {
                    AbstractC2394Wj.A00().AAx(3301, th2);
                    WS ws2 = A04.get();
                    if (ws2 != null) {
                        ws2.AIZ(th2, this);
                    }
                } else {
                    throw th2;
                }
            }
            if (A03.get()) {
                C2392Wh.A04(this);
            }
        } catch (Throwable th3) {
            WU.A00(th3, this);
        }
    }
}
