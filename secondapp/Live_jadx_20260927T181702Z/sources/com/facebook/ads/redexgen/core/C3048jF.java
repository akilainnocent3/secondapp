package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3048jF implements SM {
    public final /* synthetic */ AbstractC3065jd A00;
    public final /* synthetic */ InterfaceC2177Nt A01;
    public final /* synthetic */ C2178Nu A02;
    public final /* synthetic */ C2900gi A03;
    public final /* synthetic */ boolean A04;

    public C3048jF(C2178Nu c2178Nu, C2900gi c2900gi, boolean z10, AbstractC3065jd abstractC3065jd, InterfaceC2177Nt interfaceC2177Nt) {
        this.A02 = c2178Nu;
        this.A03 = c2900gi;
        this.A04 = z10;
        this.A00 = abstractC3065jd;
        this.A01 = interfaceC2177Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        if (C2350Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC2685dD.A01(this.A03, this.A00, 1, new C3049jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
