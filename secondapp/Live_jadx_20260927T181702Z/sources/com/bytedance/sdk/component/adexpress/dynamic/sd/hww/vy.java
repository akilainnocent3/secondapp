package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy implements View.OnTouchListener {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f34149hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34150hv = true;
    private float hww;
    private int nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34151ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.sd.ok f34152rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34153sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34154tq;
    private float vgm;
    private boolean vhb;
    private float vy;

    public vy(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar, int i10, boolean z10) {
        this.f34152rs = okVar;
        this.nod = i10;
        this.vhb = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar2;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hww = motionEvent.getX();
            this.f34154tq = motionEvent.getY();
            this.f34149hu = motionEvent.getY();
            this.f34150hv = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.vgm = y10;
                if (Math.abs(y10 - this.f34149hu) > 10.0f) {
                    this.f34151ok = true;
                }
                this.vy = motionEvent.getX();
                this.f34153sd = motionEvent.getY();
                if (Math.abs(this.vy - this.hww) > 8.0f || Math.abs(this.f34153sd - this.f34154tq) > 8.0f) {
                    this.f34150hv = false;
                }
            }
        } else {
            if (!this.f34151ok && !this.f34150hv) {
                return false;
            }
            if (this.vhb || (okVar3 = this.f34152rs) == null) {
                int iTq = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs(this.vgm - this.f34149hu));
                if (this.vgm - this.f34149hu < 0.0f && iTq > this.nod && (okVar2 = this.f34152rs) != null) {
                    okVar2.hww();
                } else if (this.f34150hv && (okVar = this.f34152rs) != null) {
                    okVar.hww();
                }
            } else {
                okVar3.hww();
            }
        }
        return true;
    }
}
