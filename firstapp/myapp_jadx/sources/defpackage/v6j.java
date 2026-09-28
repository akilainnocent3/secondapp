package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class v6j implements Animator.AnimatorListener {
    public final /* synthetic */ u6j a;
    public final /* synthetic */ ImageView b;

    public v6j(u6j u6jVar, ImageView imageView) {
        this.a = u6jVar;
        this.b = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        if (this.a.t0) {
            return;
        }
        this.b.clearColorFilter();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
