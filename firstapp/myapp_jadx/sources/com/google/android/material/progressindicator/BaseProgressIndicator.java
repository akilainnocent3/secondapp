package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import defpackage.cfn;
import defpackage.dbe;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.ik0;
import defpackage.j42;
import defpackage.kef;
import defpackage.pk30;
import defpackage.tcv;
import defpackage.vbv;
import defpackage.xdf;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseProgressIndicator<S extends j42> extends ProgressBar {
    public static final /* synthetic */ int C = 0;
    public final c A;
    public final d B;
    public final S a;
    public int b;
    public boolean c;
    public final boolean d;
    public final int e;
    public ik0 f;
    public boolean i;
    public int v;
    public boolean w;
    public final a y;
    public final b z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BaseProgressIndicator.C;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.e > 0) {
                SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BaseProgressIndicator.C;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            ((xdf) baseProgressIndicator.getCurrentDrawable()).d(false, false, true);
            if (baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) {
                if (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible()) {
                    baseProgressIndicator.setVisibility(4);
                }
            }
        }
    }

    public class c extends zd0 {
        public c() {
        }

        @Override // defpackage.zd0
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.b, baseProgressIndicator.c);
        }
    }

    public class d extends zd0 {
        public d() {
        }

        @Override // defpackage.zd0
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.i) {
                return;
            }
            baseProgressIndicator.setVisibility(baseProgressIndicator.v);
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.i = false;
        this.v = 4;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        this.B = new d();
        Context context2 = getContext();
        this.a = (S) a(context2, attributeSet);
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.d, i, i2, new int[0]);
        typedArrayD.getInt(7, -1);
        this.e = Math.min(typedArrayD.getInt(5, -1), 1000);
        typedArrayD.recycle();
        this.f = new ik0();
        this.d = true;
    }

    private kef<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().C;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().C;
    }

    public abstract S a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().D.d(this.A);
    }

    public final boolean c() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.h;
    }

    @Override // android.widget.ProgressBar
    public cfn<S> getIndeterminateDrawable() {
        return (cfn) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.i;
    }

    @Override // android.widget.ProgressBar
    public dbe<S> getProgressDrawable() {
        return (dbe) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.g;
    }

    public int getTrackColor() {
        return this.a.f;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.a.c;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public int getWaveAmplitude() {
        return this.a.l;
    }

    public int getWaveSpeed() {
        return this.a.m;
    }

    public int getWavelengthDeterminate() {
        return this.a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.a.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        dbe<S> progressDrawable = getProgressDrawable();
        d dVar = this.B;
        if (progressDrawable != null) {
            dbe<S> progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.i;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.i = arrayList;
            }
            if (!arrayList.contains(dVar)) {
                progressDrawable2.i.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            cfn<S> indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.i;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.i = arrayList2;
            }
            if (!arrayList2.contains(dVar)) {
                indeterminateDrawable.i.add(dVar);
            }
        }
        if (c()) {
            if (this.e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.z);
        removeCallbacks(this.y);
        ((xdf) getCurrentDrawable()).d(false, false, false);
        cfn<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.B;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(dVar);
            getIndeterminateDrawable().D.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            kef<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.d) {
            ((xdf) getCurrentDrawable()).d(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.d) {
            ((xdf) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(ik0 ik0Var) {
        this.f = ik0Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = ik0Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = ik0Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            xdf xdfVar = (xdf) getCurrentDrawable();
            if (xdfVar != null) {
                xdfVar.d(false, false, false);
            }
            super.setIndeterminate(z);
            xdf xdfVar2 = (xdf) getCurrentDrawable();
            if (xdfVar2 != null) {
                xdfVar2.d(c(), false, false);
            }
            if ((xdfVar2 instanceof cfn) && c()) {
                ((cfn) xdfVar2).D.f();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        S s = this.a;
        if (s.n != f) {
            s.n = f;
            getIndeterminateDrawable().D.c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof cfn) {
            ((xdf) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.w) {
            hb5.a("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vbv.c(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.e = iArr;
        getIndeterminateDrawable().D.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        S s = this.a;
        if (s.i != i) {
            s.i = i;
            s.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = z;
            this.i = true;
            if (getIndeterminateDrawable().isVisible()) {
                ik0 ik0Var = this.f;
                ContentResolver contentResolver = getContext().getContentResolver();
                ik0Var.getClass();
                if (ik0.a(contentResolver) != 0.0f) {
                    getIndeterminateDrawable().D.e();
                    return;
                }
            }
            this.A.a(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof dbe) {
            dbe dbeVar = (dbe) drawable;
            dbeVar.d(false, false, false);
            super.setProgressDrawable(dbeVar);
            dbeVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.w) {
            hb5.a("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.a;
        if (s.f != i) {
            s.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.a;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
            s.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        S s = this.a;
        if (s.c != f) {
            s.c = Math.min(f, 0.5f);
            s.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        S s = this.a;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.v = i;
        } else {
            hb5.a("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        S s = this.a;
        if (s.l != i) {
            s.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        S s = this.a;
        s.m = i;
        dbe<S> progressDrawable = getProgressDrawable();
        boolean z = s.m != 0;
        ValueAnimator valueAnimator = progressDrawable.I;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        S s = this.a;
        if (s.j != i) {
            s.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        S s = this.a;
        if (s.k != i) {
            s.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
