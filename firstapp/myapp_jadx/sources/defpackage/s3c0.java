package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes8.dex */
public final class s3c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ValueAnimator c;

    public s3c0(yp40 yp40Var, boolean z, ValueAnimator valueAnimator) {
        this.a = yp40Var;
        this.b = z;
        this.c = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
        yp40 yp40Var = this.a;
        if (yp40Var.a && this.b) {
            yp40Var.a = false;
            this.c.setFloatValues(1.0f, 0.0f);
        }
    }
}
