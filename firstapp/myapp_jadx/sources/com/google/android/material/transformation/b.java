package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ com.google.android.material.circularreveal.c a;
    public final /* synthetic */ Drawable b;

    public b(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
        this.a = cVar;
        this.b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
