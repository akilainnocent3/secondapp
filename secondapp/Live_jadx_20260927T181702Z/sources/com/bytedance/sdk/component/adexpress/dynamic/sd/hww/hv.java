package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements View.OnTouchListener {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34118hv;
    private float hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f34119sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34120tq;
    private com.bytedance.sdk.component.adexpress.dynamic.sd.ok vy;

    public hv(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar, int i10) {
        this.vy = okVar;
        this.f34118hv = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hww = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f34120tq = y10;
                if (Math.abs(y10 - this.hww) > 10.0f) {
                    this.f34119sd = true;
                }
            }
        } else {
            if (!this.f34119sd) {
                return false;
            }
            int iTq = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs(this.f34120tq - this.hww));
            if (this.f34120tq - this.hww < 0.0f && iTq > this.f34118hv && (okVar = this.vy) != null) {
                okVar.hww();
                this.hww = 0.0f;
                this.f34120tq = 0.0f;
                this.f34119sd = false;
            }
        }
        return true;
    }
}
