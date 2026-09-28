package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gbl implements ess {
    public final String a;
    public msr b;
    public AnimatorSet c;

    public gbl(msr msrVar, String str) {
        this.a = str;
        this.b = msrVar;
    }

    @Override // defpackage.ess
    public final void execute() {
        msr msrVar = this.b;
        if (msrVar == null) {
            return;
        }
        ConstraintLayout constraintLayout = msrVar.e;
        TextView textView = msrVar.K;
        msrVar.I.setText(this.a);
        sn5.f(textView, R.string.component_live_virtual_match_tracker__half_time, new Object[0]);
        ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", 0.0f, 1.0f).setDuration(1000L);
        duration.getClass();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 1.0f).setDuration(500L);
        duration2.getClass();
        duration2.addListener(new a(msrVar));
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 1.0f).setDuration(1000L);
        duration3.getClass();
        duration3.addListener(new b(msrVar));
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.0f).setDuration(1500L);
        duration4.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3, duration4);
        this.c = animatorSet;
        animatorSet.start();
    }

    @Override // defpackage.ess
    public final void release() {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b = null;
    }

    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ msr a;

        public a(msr msrVar) {
            this.a = msrVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.a.K.setText("45:00");
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

    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ msr a;

        public b(msr msrVar) {
            this.a = msrVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.a.K.setText("45:01");
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
}
