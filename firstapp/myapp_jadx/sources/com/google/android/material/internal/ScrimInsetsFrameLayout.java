package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.g9i0;
import defpackage.gof0;
import defpackage.l8j0;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.ymn;
import defpackage.zmy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    public Drawable a;
    public Rect b;
    public final Rect c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;

    public class a implements zmy {
        public a() {
        }

        @Override // defpackage.zmy
        public final l8j0 b(View view, l8j0 l8j0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            Rect rect = scrimInsetsFrameLayout.b;
            if (rect == null) {
                rect = new Rect();
                scrimInsetsFrameLayout.b = rect;
            }
            int iB = l8j0Var.b();
            l8j0.l lVar = l8j0Var.a;
            rect.set(iB, l8j0Var.d(), l8j0Var.c(), l8j0Var.a());
            scrimInsetsFrameLayout.e(l8j0Var);
            scrimInsetsFrameLayout.setWillNotDraw(lVar.l().equals(ymn.e) || scrimInsetsFrameLayout.a == null);
            scrimInsetsFrameLayout.postInvalidateOnAnimation();
            return lVar.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        this.f = true;
        this.i = true;
        TypedArray typedArrayD = gof0.d(context, attributeSet, pk30.W, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.a = typedArrayD.getDrawable(0);
        typedArrayD.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(this, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b == null || this.a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z = this.d;
        Rect rect = this.c;
        if (z) {
            rect.set(0, 0, width, this.b.top);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.e) {
            rect.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.f) {
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.i) {
            Rect rect3 = this.b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.i = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.a = drawable;
    }

    public void e(l8j0 l8j0Var) {
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }
}
