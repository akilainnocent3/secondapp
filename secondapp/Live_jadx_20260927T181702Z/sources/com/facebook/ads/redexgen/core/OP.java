package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C2896ge c2896ge) {
        if (A00 == null) {
            A00 = new OO(c2896ge);
        }
        return A00;
    }

    public static void A01(C2896ge c2896ge) {
        if (AbstractC2353Us.A0F(c2896ge)) {
            A03(c2896ge);
        }
    }

    public static void A02(C2896ge c2896ge) {
        if (AbstractC2353Us.A0E(c2896ge)) {
            A03(c2896ge);
        }
    }

    public static void A03(C2896ge c2896ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C2999iN(c2896ge));
        }
    }
}
