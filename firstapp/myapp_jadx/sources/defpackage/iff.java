package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class iff extends AnimatorListenerAdapter {
    public final /* synthetic */ jff a;

    public iff(jff jffVar) {
        this.a = jffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jff jffVar = this.a;
        jffVar.p();
        jffVar.r.start();
    }
}
