package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2114Lh extends AbstractRunnableC2387Wc {
    public final WeakReference<C2845fp> A00;

    public C2114Lh(C2845fp c2845fp) {
        this.A00 = new WeakReference<>(c2845fp);
    }

    public C2114Lh(WeakReference<C2845fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        C2845fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
