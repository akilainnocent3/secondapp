package defpackage;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: loaded from: classes6.dex */
public final class lp80 implements Animation.AnimationListener {
    public final /* synthetic */ np80 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ScaleAnimation c;

    public lp80(np80 np80Var, String str, ScaleAnimation scaleAnimation) {
        this.a = np80Var;
        this.b = str;
        this.c = scaleAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.c.setDuration(500L);
        qp80 qp80Var = (qp80) this.a.b;
        if (qp80Var != null) {
            qp80Var.c.startAnimation(scaleAnimation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        qp80 qp80Var = (qp80) this.a.b;
        if (qp80Var != null) {
            qp80Var.c.setText(this.b);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
