package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes4.dex */
public final class pls implements Animator.AnimatorListener {
    public final /* synthetic */ qls a;

    public pls(qls qlsVar) {
        this.a = qlsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        qls qlsVar = this.a;
        qlsVar.b.b.setOnClickListener(new ols(qlsVar, 0));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
