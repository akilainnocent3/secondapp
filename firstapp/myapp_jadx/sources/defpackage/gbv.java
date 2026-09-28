package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class gbv extends AnimatorListenerAdapter {
    public final /* synthetic */ hbv a;

    public gbv(hbv hbvVar) {
        this.a = hbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hbv hbvVar = this.a;
        hbvVar.b.setTranslationY(0.0f);
        hbvVar.c(0.0f);
    }
}
