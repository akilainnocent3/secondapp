package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2297So {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C2896ge A00;
    public String A01;
    public final C2419Xl A02 = new C2419Xl(300000000000L, new C2907gp(this));

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, a.f103529z7, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, a.f103436o7, -78, a.f103436o7, a.f103436o7, -74, -68, -69, -52, a.f103444p7, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static UD A00(C2896ge c2896ge) {
        if (C2350Up.A1B(c2896ge)) {
            return UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2896ge c2896ge;
        synchronized (this) {
            c2896ge = this.A00;
        }
        if (c2896ge == null) {
            return;
        }
        String strA05 = UG.A00().A01(c2896ge, true).A05(A00(c2896ge));
        synchronized (this) {
            this.A01 = strA05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C2896ge c2896ge) {
        this.A00 = c2896ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c2896ge);
        if (this.A00.A07().AJw() || ((A04.get() && C2350Up.A21(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
