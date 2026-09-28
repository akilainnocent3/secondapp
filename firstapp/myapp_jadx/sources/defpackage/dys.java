package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class dys extends AnimatorListenerAdapter {
    public final /* synthetic */ eys a;

    public dys(eys eysVar) {
        this.a = eysVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        eys eysVar = this.a;
        ckd0 ckd0Var = eysVar.e;
        int i = eysVar.a + 1;
        eysVar.a = i;
        ckd0Var.d(i);
    }
}
