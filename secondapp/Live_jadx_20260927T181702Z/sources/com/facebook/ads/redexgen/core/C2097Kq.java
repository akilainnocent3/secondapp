package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2097Kq extends AbstractRunnableC2387Wc {
    public final /* synthetic */ AbstractC2585bb A00;

    public C2097Kq(AbstractC2585bb abstractC2585bb) {
        this.A00 = abstractC2585bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
