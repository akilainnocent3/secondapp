package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2986i9 implements InterfaceC2204Ou {
    private C2205Ov A00(InterfaceC2203Ot interfaceC2203Ot) {
        return (C2205Ov) interfaceC2203Ot.A7E();
    }

    public final void A01(InterfaceC2203Ot interfaceC2203Ot) {
        if (!interfaceC2203Ot.A9R()) {
            interfaceC2203Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC2203Ot);
        float fA8r = A8r(interfaceC2203Ot);
        float elevation = AbstractC2207Ox.A00(fA8S, fA8r, interfaceC2203Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC2207Ox.A01(fA8S, fA8r, interfaceC2203Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC2203Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final ColorStateList A71(InterfaceC2203Ot interfaceC2203Ot) {
        return A00(interfaceC2203Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final float A7v(InterfaceC2203Ot interfaceC2203Ot) {
        return interfaceC2203Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final float A8S(InterfaceC2203Ot interfaceC2203Ot) {
        return A00(interfaceC2203Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final float A8X(InterfaceC2203Ot interfaceC2203Ot) {
        return A8r(interfaceC2203Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final float A8Y(InterfaceC2203Ot interfaceC2203Ot) {
        return A8r(interfaceC2203Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final float A8r(InterfaceC2203Ot interfaceC2203Ot) {
        return A00(interfaceC2203Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AAG(InterfaceC2203Ot interfaceC2203Ot, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C2205Ov background = new C2205Ov(colorStateList, f10);
        interfaceC2203Ot.AJK(background);
        View view = interfaceC2203Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AJX(interfaceC2203Ot, f12);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void ADP(InterfaceC2203Ot interfaceC2203Ot) {
        AJX(interfaceC2203Ot, A8S(interfaceC2203Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AFT(InterfaceC2203Ot interfaceC2203Ot) {
        AJX(interfaceC2203Ot, A8S(interfaceC2203Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AJJ(InterfaceC2203Ot interfaceC2203Ot, ColorStateList colorStateList) {
        A00(interfaceC2203Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AJP(InterfaceC2203Ot interfaceC2203Ot, float f10) {
        interfaceC2203Ot.A7F().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AJX(InterfaceC2203Ot interfaceC2203Ot, float f10) {
        A00(interfaceC2203Ot).A07(f10, interfaceC2203Ot.A9R(), interfaceC2203Ot.A8q());
        A01(interfaceC2203Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2204Ou
    public final void AJj(InterfaceC2203Ot interfaceC2203Ot, float f10) {
        A00(interfaceC2203Ot).A06(f10);
    }
}
