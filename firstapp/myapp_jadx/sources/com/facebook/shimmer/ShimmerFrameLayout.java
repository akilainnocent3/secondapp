package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import defpackage.lk30;
import defpackage.n590;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint a;
    public final n590 b;
    public boolean c;
    public boolean d;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new n590();
        this.c = true;
        this.d = false;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        a.b c0188a;
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            b(new a.C0188a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lk30.a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                c0188a = new a.c();
                c0188a.a.p = false;
            } else {
                c0188a = new a.C0188a();
            }
            b(c0188a.b(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void b(a aVar) {
        boolean zIsStarted;
        n590 n590Var = this.b;
        n590Var.f = aVar;
        if (aVar != null) {
            PorterDuff.Mode mode = aVar.q;
            if (mode == null) {
                mode = aVar.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN;
            }
            n590Var.b.setXfermode(new PorterDuffXfermode(mode));
        }
        n590Var.b();
        if (n590Var.f != null) {
            ValueAnimator valueAnimator = n590Var.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                n590Var.e.cancel();
                n590Var.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            a aVar2 = n590Var.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (aVar2.u / aVar2.t) + 1.0f);
            n590Var.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            n590Var.e.setRepeatMode(n590Var.f.s);
            n590Var.e.setStartDelay(n590Var.f.v);
            n590Var.e.setRepeatCount(n590Var.f.r);
            ValueAnimator valueAnimator2 = n590Var.e;
            a aVar3 = n590Var.f;
            valueAnimator2.setDuration(aVar3.t + aVar3.u);
            n590Var.e.addUpdateListener(n590Var.a);
            if (zIsStarted) {
                n590Var.e.start();
            }
        }
        n590Var.invalidateSelf();
        if (aVar == null || !aVar.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
    }

    public final void c() {
        this.c = true;
        n590 n590Var = this.b;
        ValueAnimator valueAnimator = n590Var.e;
        if (valueAnimator != null && !valueAnimator.isStarted() && n590Var.getCallback() != null) {
            n590Var.e.start();
        }
        invalidate();
    }

    public final void d() {
        this.d = false;
        n590 n590Var = this.b;
        ValueAnimator valueAnimator = n590Var.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        n590Var.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    public a getShimmer() {
        return this.b.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        n590 n590Var = this.b;
        if (n590Var == null) {
            return;
        }
        if (i == 0) {
            if (this.d) {
                n590Var.a();
                this.d = false;
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = n590Var.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        d();
        this.d = true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new n590();
        this.c = true;
        this.d = false;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new n590();
        this.c = true;
        this.d = false;
        a(context, attributeSet);
    }
}
