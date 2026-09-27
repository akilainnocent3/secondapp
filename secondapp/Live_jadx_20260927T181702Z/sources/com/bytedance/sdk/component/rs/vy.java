package com.bytedance.sdk.component.rs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.omn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private View.OnTouchListener f35004hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final hu f35005hv;
    private final View.OnTouchListener hww;
    private String nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f35006ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f35007rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final long f35008sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f35009tq;
    private long vgm = -1;
    private final Context vy;

    public vy(Context context, View.OnTouchListener onTouchListener, int i10, long j10, hu huVar) {
        this.vy = context;
        this.hww = onTouchListener;
        this.f35009tq = i10;
        this.f35008sd = j10;
        this.f35005hv = huVar;
    }

    private boolean hww(long j10) {
        long j11 = this.vgm;
        if (j11 == -1) {
            this.vgm = j10;
            return false;
        }
        int i10 = this.f35009tq;
        if (i10 == 1) {
            if (j10 - j11 <= this.f35008sd) {
                return true;
            }
            this.vgm = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.f35008sd) {
                this.vgm = j10;
                return true;
            }
            this.vgm = j10;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        vy vyVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            vyVar = this;
            vyVar.f35006ok = x10;
            vyVar.f35007rs = y10;
        } else if (action != 1) {
            vyVar = this;
        } else {
            vyVar = this;
            if (vyVar.hww(x10, y10, this.f35006ok, this.f35007rs, this.vy)) {
                if (hww(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    hww(1, x10, y10);
                } else {
                    hww(0, x10, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = vyVar.hww;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = vyVar.f35004hu;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void hww(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f35009tq);
            jSONObject.put("lp_click_interval", this.f35008sd);
        } catch (Throwable th2) {
            omn.hww("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.rs.hww.hww.hww().tq() != null) {
            com.bytedance.sdk.component.rs.hww.tq tqVarTq = com.bytedance.sdk.component.rs.hww.hww.hww().tq();
            hu huVar = this.f35005hv;
            tqVarTq.hww(huVar != null ? huVar.getMaterialMeta() : null, this.nod, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void hww(String str) {
        this.nod = str;
    }

    @Override // com.bytedance.sdk.component.rs.sd
    public void hww(View.OnTouchListener onTouchListener) {
        this.f35004hu = onTouchListener;
    }
}
