package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes7.dex */
public final class c7j implements Animator.AnimatorListener {
    public final /* synthetic */ u6j a;

    public c7j(u6j u6jVar) {
        this.a = u6jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.N0();
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
