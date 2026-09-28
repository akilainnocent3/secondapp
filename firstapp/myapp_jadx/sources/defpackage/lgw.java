package defpackage;

import android.animation.Animator;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class lgw implements Animator.AnimatorListener {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ lid0 b;

    public lgw(yp40 yp40Var, lid0 lid0Var) {
        this.a = yp40Var;
        this.b = lid0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
        yp40 yp40Var = this.a;
        boolean z = yp40Var.a;
        yp40Var.a = !z;
        this.b.v.setImageResource(!z ? R.drawable.mm_green_breathe : R.drawable.mm_pink_breathe);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
