package defpackage;

import android.animation.Animator;
import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class sn80 implements Animator.AnimatorListener {
    public final /* synthetic */ tn80 a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;

    public sn80(tn80 tn80Var, double d, double d2) {
        this.a = tn80Var;
        this.b = d;
        this.c = d2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tn80 tn80Var = this.a;
        Context context = tn80Var.getContext();
        if (context != null) {
            double d = this.b;
            double d2 = this.c;
            B b = tn80Var.b;
            if (d < d2) {
                wn80 wn80Var = (wn80) b;
                if (wn80Var != null) {
                    wn80Var.d.setShadowLayer(10.0f, 4.0f, 4.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_red));
                }
                wn80 wn80Var2 = (wn80) tn80Var.b;
                if (wn80Var2 != null) {
                    wn80Var2.d.setTextColor(context.getColor(R.color.sg_rush_house_coeff_red));
                }
            } else {
                wn80 wn80Var3 = (wn80) b;
                if (wn80Var3 != null) {
                    wn80Var3.d.setShadowLayer(10.0f, 4.0f, 4.0f, context.getColor(R.color.sg_rush_shadow_house_coeff_green));
                }
                wn80 wn80Var4 = (wn80) tn80Var.b;
                if (wn80Var4 != null) {
                    wn80Var4.d.setTextColor(context.getColor(R.color.sg_rush_house_coeff_green));
                }
            }
        }
        ej5.c(ebs.a(tn80Var.getLifecycle()), null, null, new vn80(tn80Var, 1200L, null), 3);
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
