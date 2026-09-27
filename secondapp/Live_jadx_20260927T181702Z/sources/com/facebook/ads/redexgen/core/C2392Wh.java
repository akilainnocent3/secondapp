package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2392Wh {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C2392Wh> A02 = new ThreadLocal<>();
    public final WQ A00 = new WQ();

    public static WQ A00() {
        return A02().A00;
    }

    public static WQ A01(C2391Wg c2391Wg) {
        WQ currentStackTraces = new WQ(A00());
        currentStackTraces.add(c2391Wg);
        return currentStackTraces;
    }

    public static C2392Wh A02() {
        C2392Wh c2392Wh = A02.get();
        if (c2392Wh == null) {
            C2392Wh c2392Wh2 = new C2392Wh();
            A02.set(c2392Wh2);
            return c2392Wh2;
        }
        return c2392Wh;
    }

    public static void A03(AbstractRunnableC2387Wc abstractRunnableC2387Wc) {
        WQ wqA06 = abstractRunnableC2387Wc.A06();
        if (wqA06 != null) {
            WQ createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(wqA06);
        }
    }

    public static void A04(AbstractRunnableC2387Wc abstractRunnableC2387Wc) {
        WQ wqA06 = abstractRunnableC2387Wc.A06();
        if (wqA06 != null) {
            WQ wq2 = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            wq2.removeAll(wqA06);
        }
    }
}
