package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import defpackage.eys;
import defpackage.fys;
import defpackage.gys;
import defpackage.hwh0;
import defpackage.ik0;
import defpackage.tcv;
import defpackage.th50;
import defpackage.vbv;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    public static final /* synthetic */ int c = 0;
    public final fys a;
    public final LoadingIndicatorSpec b;

    public LoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_LoadingIndicator), attributeSet, i);
        Context context2 = getContext();
        LoadingIndicatorSpec loadingIndicatorSpec = new LoadingIndicatorSpec(context2, attributeSet, i);
        gys gysVar = new gys(loadingIndicatorSpec);
        eys eysVar = new eys();
        eysVar.f = loadingIndicatorSpec;
        eysVar.h = new gys.a();
        fys fysVar = new fys(context2, loadingIndicatorSpec, gysVar, eysVar);
        Resources resources = context2.getResources();
        hwh0 hwh0Var = new hwh0();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        hwh0Var.a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        fysVar.v = hwh0Var;
        this.a = fysVar;
        fysVar.setCallback(this);
        this.b = fysVar.d.a;
        setAnimatorDurationScaleProvider(new ik0());
    }

    public final boolean a() {
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

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.b.e;
    }

    public int getContainerHeight() {
        return this.b.c;
    }

    public int getContainerWidth() {
        return this.b.b;
    }

    public fys getDrawable() {
        return this.a;
    }

    public int[] getIndicatorColor() {
        return this.b.d;
    }

    public int getIndicatorSize() {
        return this.b.a;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        gys gysVar = this.a.d;
        LoadingIndicatorSpec loadingIndicatorSpec = gysVar.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(loadingIndicatorSpec.c, loadingIndicatorSpec.a);
        LoadingIndicatorSpec loadingIndicatorSpec2 = gysVar.a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.a.a(a(), false, i == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.a.a(a(), false, i == 0);
    }

    public void setAnimatorDurationScaleProvider(ik0 ik0Var) {
        this.a.a = ik0Var;
    }

    public void setContainerColor(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.e != i) {
            loadingIndicatorSpec.e = i;
            invalidate();
        }
    }

    public void setContainerHeight(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.c != i) {
            loadingIndicatorSpec.c = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.b != i) {
            loadingIndicatorSpec.b = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vbv.c(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.b.d = iArr;
        eys eysVar = this.a.e;
        eysVar.a = 1;
        eysVar.a(0.0f);
        eysVar.h.a = eysVar.f.d[0];
        invalidate();
    }

    public void setIndicatorSize(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.a != i) {
            loadingIndicatorSpec.a = i;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context) {
        this(context, null);
    }
}
