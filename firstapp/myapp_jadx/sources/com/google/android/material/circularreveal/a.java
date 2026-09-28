package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet a(c cVar, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(cVar, c.b.a, c.a.b, new c.d(f, f2, f3));
        c.d revealInfo = cVar.getRevealInfo();
        if (revealInfo == null) {
            ib5.a("Caller must set a non-null RevealInfo before calling this.");
            return null;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
