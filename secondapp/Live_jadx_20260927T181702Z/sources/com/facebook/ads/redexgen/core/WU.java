package com.facebook.ads.redexgen.core;

import com.ironsource.mediationsdk.demandOnly.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class WU {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<WS> A02 = new AtomicReference<>();

    public static void A00(Throwable th2, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC2394Wj.A00().AAx(b.C0587b.f62522i, th2);
            WS contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AIZ(th2, obj);
                return;
            }
            return;
        }
        throw th2;
    }

    public static void A01(boolean z10, WS ws2) {
        A01.set(z10);
        A02.set(ws2);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
