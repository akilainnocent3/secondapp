package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC2387Wc {
    public final /* synthetic */ InterfaceC2722dp A00;
    public final /* synthetic */ C2723dq A01;

    public GX(C2723dq c2723dq, InterfaceC2722dp interfaceC2722dp) {
        this.A01 = c2723dq;
        this.A00 = interfaceC2722dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2387Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
