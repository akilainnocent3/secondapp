package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2558bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC2559bB A00;

    public ViewOnTouchListenerC2558bA(ViewOnClickListenerC2559bB viewOnClickListenerC2559bB) {
        this.A00 = viewOnClickListenerC2559bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
