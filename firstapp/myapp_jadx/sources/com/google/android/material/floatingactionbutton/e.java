package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g.d c;
    public final /* synthetic */ g d;

    public e(g gVar, boolean z, d dVar) {
        this.d = gVar;
        this.b = z;
        this.c = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.d;
        gVar.r = 0;
        gVar.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = gVar.v;
        boolean z = this.b;
        floatingActionButton.a(z ? 8 : 4, z);
        g.d dVar = this.c;
        if (dVar != null) {
            d dVar2 = (d) dVar;
            dVar2.a.a(dVar2.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        g gVar = this.d;
        gVar.v.a(0, this.b);
        gVar.r = 1;
        gVar.m = animator;
        this.a = false;
    }
}
