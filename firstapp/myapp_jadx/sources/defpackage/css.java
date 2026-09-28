package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes5.dex */
public final class css extends AnimatorListenerAdapter {
    public final /* synthetic */ w4p a;

    public css(w4p w4pVar) {
        this.a = w4pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        super.onAnimationEnd(animator);
        w4p w4pVar = this.a;
        if (w4pVar.f.getAlpha() == 1.0f) {
            w4pVar.e.setAlpha(0.0f);
        } else {
            w4pVar.f.setAlpha(0.0f);
        }
    }
}
