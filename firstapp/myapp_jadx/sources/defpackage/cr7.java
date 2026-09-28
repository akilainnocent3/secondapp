package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class cr7 extends AnimatorListenerAdapter {
    public final /* synthetic */ dr7 a;

    public cr7(dr7 dr7Var) {
        this.a = dr7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.h(false);
    }
}
