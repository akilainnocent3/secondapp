package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements View.OnTouchListener {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.sd.ok f34132hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34133hv;
    private float hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34134ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f34135rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34136sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34137tq;
    private int vgm;
    private float vy;

    public sd(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar) {
        this(okVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar2;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar3;
        if (this.f34135rs) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hww = motionEvent.getX();
            this.f34137tq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.vy = motionEvent.getX();
                this.f34136sd = motionEvent.getY();
                if (Math.abs(this.vy - this.hww) > 10.0f) {
                    this.f34133hv = true;
                }
                if (Math.abs(this.vy - this.hww) > 8.0f || Math.abs(this.f34136sd - this.f34137tq) > 8.0f) {
                    this.f34134ok = false;
                }
                int iTq = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs(this.vy - this.hww));
                if (this.vy > this.hww && iTq > this.vgm && (okVar3 = this.f34132hu) != null) {
                    okVar3.hww();
                    this.f34135rs = true;
                }
            }
        } else {
            if (!this.f34133hv && !this.f34134ok) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iTq2 = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs(this.vy - this.hww));
            if (this.vy > this.hww && iTq2 > this.vgm && (okVar2 = this.f34132hu) != null) {
                okVar2.hww();
                this.f34135rs = true;
            }
            float fAbs = Math.abs(x10 - this.hww);
            float fAbs2 = Math.abs(y10 - this.f34137tq);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (okVar = this.f34132hu) != null) {
                okVar.tq();
                this.f34135rs = true;
            }
        }
        return true;
    }

    public sd(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar, int i10) {
        this.vgm = 5;
        this.f34134ok = true;
        this.f34132hu = okVar;
        if (i10 > 0) {
            this.vgm = i10;
        }
    }
}
