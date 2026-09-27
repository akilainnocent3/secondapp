package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC2435Yb {
    public static byte[] A03;
    public C2900gi A00;
    public InterfaceC2434Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, a.C7, -27, -41, -110, -77, -42};
    }

    public PU(C2900gi c2900gi, AbstractC3065jd abstractC3065jd, int i10) {
        super(c2900gi);
        this.A00 = c2900gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC3065jd, i10);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC2451Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final void A0C(float f10, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final void A0D(C2158Na c2158Na, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public int getToolbarHeight() {
        return AbstractC2435Yb.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public InterfaceC2434Ya getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setCTAClickListener(ViewOnClickListenerC2098Kr viewOnClickListenerC2098Kr) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setFullscreen(boolean z10) {
    }

    public void setInitialUnskippableSeconds(int i10) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setPageDetails(C2170Nm c2170Nm, String str, int i10, C2176Ns c2176Ns) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setProgress(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setProgressImage(YM ym2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setToolbarActionMode(int i10) {
        this.A02.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435Yb
    public void setToolbarListener(InterfaceC2434Ya interfaceC2434Ya) {
        this.A01 = interfaceC2434Ya;
    }
}
