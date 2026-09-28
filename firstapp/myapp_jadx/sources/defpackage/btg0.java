package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class btg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ Transition b;

    public btg0(Transition transition, ox0 ox0Var) {
        this.b = transition;
        this.a = ox0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.E.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.E.add(animator);
    }
}
