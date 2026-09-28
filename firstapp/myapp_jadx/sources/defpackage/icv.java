package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class icv extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jcv c;

    public icv(jcv jcvVar, boolean z, int i) {
        this.c = jcvVar;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jcv jcvVar = this.c;
        jcvVar.b.setTranslationX(0.0f);
        jcvVar.d(this.b, 0.0f, this.a);
    }
}
