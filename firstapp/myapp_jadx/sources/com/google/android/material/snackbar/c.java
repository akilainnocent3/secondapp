package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
