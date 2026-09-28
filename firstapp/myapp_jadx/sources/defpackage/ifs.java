package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ifs extends AnimatorListenerAdapter {
    public final /* synthetic */ jfs a;

    public ifs(jfs jfsVar) {
        this.a = jfsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        jfs jfsVar = this.a;
        jfsVar.f = (jfsVar.f + 1) % jfsVar.e.e.length;
        jfsVar.g = true;
    }
}
