package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2560bC {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC2559bB viewOnClickListenerC2559bB = new ViewOnClickListenerC2559bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2559bB);
            view.setOnTouchListener(new ViewOnTouchListenerC2558bA(viewOnClickListenerC2559bB));
        }
    }
}
