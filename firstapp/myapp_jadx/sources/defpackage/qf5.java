package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes5.dex */
public final class qf5 extends AnimatorListenerAdapter {
    public final /* synthetic */ rf5 a;

    public qf5(rf5 rf5Var) {
        this.a = rf5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.K = System.currentTimeMillis();
    }
}
