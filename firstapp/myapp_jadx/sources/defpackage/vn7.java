package defpackage;

import android.view.animation.Animation;
import com.sportybet.plugin.realsports.betorder.calendar.view.customviews.CircleAnimationTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class vn7 implements Animation.AnimationListener {
    public final /* synthetic */ CircleAnimationTextView a;

    public vn7(CircleAnimationTextView circleAnimationTextView) {
        this.a = circleAnimationTextView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.F = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        CircleAnimationTextView circleAnimationTextView = this.a;
        circleAnimationTextView.F = true;
        circleAnimationTextView.G = System.currentTimeMillis();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
