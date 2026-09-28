package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ho7 extends AnimatorListenerAdapter {
    public final /* synthetic */ io7 a;

    public ho7(io7 io7Var) {
        this.a = io7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        io7 io7Var = this.a;
        io7Var.a();
        zd0 zd0Var = io7Var.j;
        if (zd0Var != null) {
            zd0Var.a(io7Var.a);
        }
    }
}
