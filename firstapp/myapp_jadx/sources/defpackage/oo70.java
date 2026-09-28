package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class oo70 implements Animator.AnimatorListener {
    public final /* synthetic */ mo70 a;

    public oo70(mo70 mo70Var) {
        this.a = mo70Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pgt.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
