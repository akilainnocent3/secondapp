package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class go7 extends AnimatorListenerAdapter {
    public final /* synthetic */ io7 a;

    public go7(io7 io7Var) {
        this.a = io7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        io7 io7Var = this.a;
        io7Var.g = (io7Var.g + io7.l.length) % io7Var.f.e.length;
    }
}
