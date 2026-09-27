package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu implements View.OnTouchListener {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static int f34115sd = 10;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.sd.ok f34116hv;
    private float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34117tq;
    private boolean vy;

    public hu(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar) {
        this.f34116hv = okVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hww = motionEvent.getX();
            this.f34117tq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.hww) >= f34115sd || Math.abs(y10 - this.f34117tq) >= f34115sd) {
                    this.vy = true;
                }
            } else if (action == 3) {
                this.vy = false;
            }
        } else {
            if (this.vy) {
                this.vy = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.hww) >= f34115sd || Math.abs(y11 - this.f34117tq) >= f34115sd) {
                this.vy = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar = this.f34116hv;
                if (okVar != null) {
                    okVar.hww();
                }
            }
        }
        return true;
    }
}
