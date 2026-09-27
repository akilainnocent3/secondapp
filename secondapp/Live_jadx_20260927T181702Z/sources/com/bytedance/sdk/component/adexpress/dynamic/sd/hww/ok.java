package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok implements View.OnTouchListener {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f34128hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f34129hv;
    private final com.bytedance.sdk.component.adexpress.dynamic.sd.ok hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final int f34130sd = 10;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f34131tq;
    private float vgm;
    private float vy;

    public ok(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar, boolean z10) {
        this.hww = okVar;
        this.f34131tq = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vy = motionEvent.getX();
            this.f34129hv = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.f34129hv);
        } else if (action == 1) {
            this.f34128hu = motionEvent.getX();
            this.vgm = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.vgm);
            if (this.f34131tq || (okVar2 = this.hww) == null) {
                float f10 = this.f34128hu - this.vy;
                float f11 = this.vgm - this.f34129hv;
                if (com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs((float) Math.sqrt((f10 * f10) + (f11 * f11)))) > 10.0f && (okVar = this.hww) != null) {
                    okVar.hww();
                }
            } else {
                okVar2.hww();
            }
        }
        return true;
    }
}
