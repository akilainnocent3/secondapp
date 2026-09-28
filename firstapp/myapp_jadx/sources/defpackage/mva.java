package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;

/* JADX INFO: loaded from: classes.dex */
public final class mva extends AnimatorListenerAdapter {
    public final /* synthetic */ ConsecutiveScrollerLayout a;

    public mva(ConsecutiveScrollerLayout consecutiveScrollerLayout) {
        this.a = consecutiveScrollerLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (animator == null || animator.getDuration() != 0) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = this.a;
            consecutiveScrollerLayout.v = null;
            consecutiveScrollerLayout.b(false);
        }
    }
}
