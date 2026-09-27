package com.bytedance.adsdk.ugeno.rs.tq;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.ed;
import com.bytedance.adsdk.ugeno.vy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends FrameLayout {
    private vy hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Map<Integer, ed> f32621tq;

    public hww(Context context) {
        super(context);
    }

    public void hww(vy vyVar) {
        this.hww = vyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.ok();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, ed> map = this.f32621tq;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.hu();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vy vyVar2 = this.hww;
        if (vyVar2 != null) {
            vyVar2.hww(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        vy vyVar = this.hww;
        if (vyVar != null) {
            int[] iArrHww = vyVar.hww(i10, i11);
            super.onMeasure(iArrHww[0], iArrHww[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        vy vyVar2 = this.hww;
        if (vyVar2 != null) {
            vyVar2.hv();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.tq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setEventMap(Map<Integer, ed> map) {
        this.f32621tq = map;
    }
}
