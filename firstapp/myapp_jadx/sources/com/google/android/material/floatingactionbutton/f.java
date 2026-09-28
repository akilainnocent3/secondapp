package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ g.d b;
    public final /* synthetic */ g c;

    public f(g gVar, boolean z, d dVar) {
        this.c = gVar;
        this.a = z;
        this.b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.c;
        gVar.r = 0;
        gVar.m = null;
        g.d dVar = this.b;
        if (dVar != null) {
            ((d) dVar).a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g gVar = this.c;
        gVar.v.a(0, this.a);
        gVar.r = 2;
        gVar.m = animator;
    }
}
