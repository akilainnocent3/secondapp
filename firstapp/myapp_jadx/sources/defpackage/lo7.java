package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class lo7 implements Animator.AnimatorListener {
    public final /* synthetic */ mo7.a a;
    public final /* synthetic */ mo7 b;

    public lo7(mo7 mo7Var, mo7.a aVar) {
        this.b = mo7Var;
        this.a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        mo7 mo7Var = this.b;
        mo7.a aVar = this.a;
        mo7Var.a(1.0f, aVar, true);
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        if (!mo7Var.f) {
            mo7Var.e += 1.0f;
            return;
        }
        mo7Var.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.n) {
            aVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
