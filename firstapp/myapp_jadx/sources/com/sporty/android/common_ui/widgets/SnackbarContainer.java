package com.sporty.android.common_ui.widgets;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.b9p;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContainer extends ViewGroup implements Animator.AnimatorListener, Runnable, ValueAnimator.AnimatorUpdateListener {
    public TextView a;

    public SnackbarContainer(Context context) {
        super(context);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        postDelayed(this, 4000L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = iIntValue;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 1) {
            this.a = (TextView) getChildAt(0);
        } else {
            b9p.a("Must have exactly one child");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, getMeasuredHeight() - this.a.getMeasuredHeight(), this.a.getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        this.a.measure(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public SnackbarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
