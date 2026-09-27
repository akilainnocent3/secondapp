package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1945Es extends AbstractRunnableC2387Wc {
    public final /* synthetic */ C1937Ek A00;

    public C1945Es(C1937Ek c1937Ek) {
        this.A00 = c1937Ek;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        if (!this.A00.A04) {
            UM um2 = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um2.A02(new EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
