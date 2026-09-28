package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class lfs extends AnimatorListenerAdapter {
    public final /* synthetic */ mfs a;

    public lfs(mfs mfsVar) {
        this.a = mfsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        mfs mfsVar = this.a;
        mfsVar.a();
        zd0 zd0Var = mfsVar.j;
        if (zd0Var != null) {
            zd0Var.a(mfsVar.a);
        }
    }
}
