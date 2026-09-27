package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C17626y implements InterfaceC2330Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C17626y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C2325Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C2326Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C2372Vm c2372Vm) {
        WT.A00(new C2328Tt(this, c2372Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C2324Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2330Tv
    public final void AEq() {
        WT.A00(new C2327Ts(this));
    }
}
