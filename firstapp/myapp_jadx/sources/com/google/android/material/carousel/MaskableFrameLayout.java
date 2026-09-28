package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import defpackage.cdv;
import defpackage.dj0;
import defpackage.joy;
import defpackage.qy80;
import defpackage.rx80;
import defpackage.ry80;
import defpackage.sy80;
import defpackage.ty80;
import defpackage.wtu;
import defpackage.xtu;

/* JADX INFO: loaded from: classes4.dex */
public class MaskableFrameLayout extends FrameLayout implements wtu, qy80 {
    public static final /* synthetic */ int w = 0;
    public float a;
    public final RectF b;
    public final Rect c;
    public rx80 d;
    public final ry80 e;
    public Boolean f;
    public View.OnHoverListener i;
    public boolean v;

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        this.e = Build.VERSION.SDK_INT >= 33 ? new ty80(this) : new sy80(this);
        this.f = null;
        this.v = false;
        setShapeAppearanceModel(rx80.d(context, attributeSet, i, 0).a());
    }

    public final void a() {
        if (this.a != -1.0f) {
            float fB = dj0.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.a);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ry80 ry80Var = this.e;
        Path path = ry80Var.e;
        if (!ry80Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.a;
    }

    public rx80 getShapeAppearanceModel() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ry80 ry80Var = this.e;
            if (zBooleanValue != ry80Var.a) {
                ry80Var.a = zBooleanValue;
                ry80Var.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ry80 ry80Var = this.e;
        this.f = Boolean.valueOf(ry80Var.a);
        if (true != ry80Var.a) {
            ry80Var.a = true;
            ry80Var.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.b;
        if (!rectF.isEmpty() && ((action == 9 || action == 10 || action == 7) && !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.v && this.i != null) {
                motionEvent.setAction(10);
                this.i.onHover(this, motionEvent);
            }
            this.v = false;
            return false;
        }
        if (this.i != null) {
            if (!this.v && action == 7) {
                motionEvent.setAction(9);
                this.v = true;
            }
            if (action == 7 || action == 9) {
                this.v = true;
            }
            this.i.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Rect rect = this.c;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        float x = getX();
        RectF rectF = this.b;
        if (x > 0.0f) {
            rect.left = (int) (rect.left + rectF.left);
        }
        if (getY() > 0.0f) {
            rect.top = (int) (rect.top + rectF.top);
        }
        rect.right = Math.round(rectF.width()) + rect.left;
        rect.bottom = Math.round(rectF.height()) + rect.top;
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setForceCompatClipping(boolean z) {
        ry80 ry80Var = this.e;
        if (z != ry80Var.a) {
            ry80Var.a = z;
            ry80Var.a(this);
        }
    }

    @Override // defpackage.wtu
    public void setMaskRectF(RectF rectF) {
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        ry80 ry80Var = this.e;
        ry80Var.d = rectF2;
        ry80Var.c();
        ry80Var.a(this);
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fA = cdv.a(f, 0.0f, 1.0f);
        if (this.a != fA) {
            this.a = fA;
            a();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.i = onHoverListener;
    }

    @Override // defpackage.qy80
    public void setShapeAppearanceModel(rx80 rx80Var) {
        rx80 rx80VarI = rx80Var.i(new xtu());
        this.d = rx80VarI;
        ry80 ry80Var = this.e;
        ry80Var.c = rx80VarI;
        ry80Var.c();
        ry80Var.a(this);
    }

    public void setOnMaskChangedListener(joy joyVar) {
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }
}
