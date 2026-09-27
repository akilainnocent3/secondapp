package com.bytedance.sdk.component.adexpress.dynamic.sd.hww;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm implements View.OnTouchListener {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static int f34142sd = 10;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34144hv;
    private float hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34147tq;
    private com.bytedance.sdk.component.adexpress.dynamic.sd.ok vy;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private RectF f34143hu = new RectF();
    private long vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final int f34145ok = 200;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final int f34146rs = 3;
    private SoftReference<View> nod = new SoftReference<>(null);

    public vgm(com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar, int i10, final ViewGroup viewGroup) {
        this.f34144hv = f34142sd;
        this.vy = okVar;
        if (i10 > 0) {
            this.f34144hv = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sd.hww.vgm.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    vgm.this.nod = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar;
        com.bytedance.sdk.component.adexpress.dynamic.sd.ok okVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f34143hu = hww(this.nod.get());
            this.hww = motionEvent.getRawX();
            this.f34147tq = motionEvent.getRawY();
            this.vgm = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.f34143hu;
            if (rectF != null && !rectF.contains(this.hww, this.f34147tq)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.hww);
            float fAbs2 = Math.abs(rawY - this.f34147tq);
            int iTq = com.bytedance.sdk.component.adexpress.vy.vgm.tq(com.bytedance.sdk.component.adexpress.vy.hww(), Math.abs(rawX - this.hww));
            int i10 = f34142sd;
            if (fAbs < i10 || fAbs2 < i10) {
                if ((System.currentTimeMillis() - this.vgm < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (okVar = this.vy) != null) {
                    okVar.hww();
                }
            } else if (rawX > this.hww && iTq > this.f34144hv && (okVar2 = this.vy) != null) {
                okVar2.hww();
            }
        }
        return true;
    }

    private RectF hww(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i10 + view.getWidth(), iArr[1] + view.getHeight());
    }
}
