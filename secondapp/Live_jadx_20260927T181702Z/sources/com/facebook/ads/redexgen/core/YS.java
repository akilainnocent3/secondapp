package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C2223Pp A00;
    public final YU A01;

    public YS(C2900gi c2900gi, Executor executor, C2331Tw c2331Tw) {
        this.A01 = new YU(c2900gi);
        this.A00 = new C2223Pp(executor, c2331Tw, c2900gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2900gi c2900gi, Executor executor, C2331Tw c2331Tw) {
        if (!C2350Up.A1c(c2900gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c2900gi, executor, c2331Tw);
            A02.A00();
        } else {
            A02.A02(c2331Tw);
        }
    }

    private void A02(C2331Tw c2331Tw) {
        this.A00.A07(c2331Tw);
    }
}
