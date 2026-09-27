package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2571bN implements View.OnClickListener {
    public final /* synthetic */ C2104Kx A00;

    public ViewOnClickListenerC2571bN(C2104Kx c2104Kx) {
        this.A00 = c2104Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
