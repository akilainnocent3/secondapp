package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2437Yd implements View.OnClickListener {
    public final /* synthetic */ C2214Pe A00;

    public ViewOnClickListenerC2437Yd(C2214Pe c2214Pe) {
        this.A00 = c2214Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
