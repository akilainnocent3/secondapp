package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2092Kl extends AbstractRunnableC2387Wc {
    public final /* synthetic */ AbstractC2585bb A00;

    public C2092Kl(AbstractC2585bb abstractC2585bb) {
        this.A00 = abstractC2585bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
