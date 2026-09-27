package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mrs {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f37096hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f37097hv;
    private final hww hww;
    private int vgm;
    private boolean vhb;
    private float vy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f37101tq = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f37100sd = false;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f37098ok = true;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f37099rs = false;
    private final View.OnTouchListener nod = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.mrs.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (mrs.this.hww.kub()) {
                return !mrs.this.f37100sd;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                mrs mrsVar = mrs.this;
                mrsVar.vhb = mrsVar.hww(motionEvent);
                mrs.this.vy = x10;
                mrs.this.f37097hv = y10;
                mrs.this.f37096hu = (int) x10;
                mrs.this.vgm = (int) y10;
                mrs.this.f37098ok = true;
                if (mrs.this.hww != null && mrs.this.f37100sd) {
                    mrs.this.hww.hww(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - mrs.this.f37096hu) > 20.0f || Math.abs(y10 - mrs.this.vgm) > 20.0f) {
                    mrs.this.f37098ok = false;
                }
                mrs.this.f37098ok = true;
                mrs.this.f37099rs = false;
                mrs.this.vy = 0.0f;
                mrs.this.f37097hv = 0.0f;
                mrs.this.f37096hu = 0;
                if (mrs.this.hww != null) {
                    mrs.this.hww.hww(view, mrs.this.f37098ok);
                }
                mrs.this.vhb = false;
            } else if (action == 3) {
                mrs.this.vhb = false;
            }
            return !mrs.this.f37100sd;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(View view, boolean z10);

        boolean kub();
    }

    public mrs(hww hwwVar) {
        this.hww = hwwVar;
    }

    public void hww(View view) {
        if (view != null) {
            view.setOnTouchListener(this.nod);
        }
    }

    public void hww(boolean z10) {
        this.f37100sd = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hww(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iSd = wdz.sd(com.bytedance.sdk.openadsdk.core.bs.hww().getApplicationContext());
        int iHv = wdz.hv(com.bytedance.sdk.openadsdk.core.bs.hww().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iSd;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iHv;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
