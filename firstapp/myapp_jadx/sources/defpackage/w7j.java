package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class w7j implements Animator.AnimatorListener {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ u6j b;
    public final /* synthetic */ ObjectAnimator c;

    public w7j(ImageView imageView, u6j u6jVar, ObjectAnimator objectAnimator) {
        this.a = imageView;
        this.b = u6jVar;
        this.c = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        try {
            new x7j(this.a, this.b, this.c).invoke();
        } catch (Exception unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
