package com.facebook.ads.redexgen.core;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2249Qr extends Observable<AbstractC2250Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC2250Qs) this.mObservers.get(size)).A00();
        }
    }
}
