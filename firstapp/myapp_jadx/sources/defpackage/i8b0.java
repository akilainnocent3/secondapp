package defpackage;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes6.dex */
public final class i8b0 implements Animation.AnimationListener {
    public final /* synthetic */ b8b0 a;

    public i8b0(b8b0 b8b0Var) {
        this.a = b8b0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        b8b0 b8b0Var = this.a;
        if (b8b0Var.f0) {
            return;
        }
        b8b0Var.M0(false);
        b8b0Var.e0 = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.e0 = true;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
