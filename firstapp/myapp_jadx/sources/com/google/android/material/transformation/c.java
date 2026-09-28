package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ com.google.android.material.circularreveal.c a;

    public c(com.google.android.material.circularreveal.c cVar) {
        this.a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.circularreveal.c cVar = this.a;
        com.google.android.material.circularreveal.c.d revealInfo = cVar.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        cVar.setRevealInfo(revealInfo);
    }
}
