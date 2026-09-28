package defpackage;

import android.animation.Animator;
import com.sportygames.roulette.util.HowToPlayView;

/* JADX INFO: loaded from: classes6.dex */
public final class vmm implements Animator.AnimatorListener {
    public final /* synthetic */ HowToPlayView a;

    public vmm(HowToPlayView howToPlayView) {
        this.a = howToPlayView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HowToPlayView howToPlayView = this.a;
        howToPlayView.setVisibility(8);
        howToPlayView.animate().setListener(null);
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
