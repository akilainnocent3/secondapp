package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2237Qe extends AbstractRunnableC2387Wc {
    public final /* synthetic */ XO A00;

    public C2237Qe(XO xo2) {
        this.A00 = xo2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
