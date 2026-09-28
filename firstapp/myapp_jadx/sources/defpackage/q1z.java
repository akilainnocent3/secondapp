package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class q1z implements ess {
    public msr a;
    public AnimatorSet b;

    @Override // defpackage.ess
    public final void execute() {
        msr msrVar = this.a;
        if (msrVar == null) {
            return;
        }
        ConstraintLayout constraintLayout = msrVar.c;
        ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", 0.0f, 1.0f).setDuration(600L);
        duration.setStartDelay(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.0f).setDuration(1L);
        duration2.setStartDelay(1200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        this.b = animatorSet;
        animatorSet.start();
    }

    @Override // defpackage.ess
    public final void release() {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.a = null;
    }
}
