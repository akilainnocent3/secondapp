package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.a.i;
        snackbarBaseLayout.setScaleX(fFloatValue);
        snackbarBaseLayout.setScaleY(fFloatValue);
    }
}
