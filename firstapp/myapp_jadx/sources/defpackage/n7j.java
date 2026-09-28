package defpackage;

import android.animation.Animator;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class n7j implements Animator.AnimatorListener {
    public final /* synthetic */ u6j a;

    public n7j(u6j u6jVar) {
        this.a = u6jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u6j u6jVar = this.a;
        if (u6jVar.getContext() != null) {
            if (u6jVar.k0 == null) {
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    AppCompatTextView appCompatTextView = djhVar.w.D;
                    try {
                        appCompatTextView.setScaleX(0.0f);
                        appCompatTextView.setScaleY(0.0f);
                        appCompatTextView.setAlpha(0.75f);
                        appCompatTextView.setVisibility(0);
                        appCompatTextView.animate().scaleX(1.0f).setDuration(500L).setListener(null);
                        appCompatTextView.animate().scaleY(1.0f).setDuration(500L).setListener(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                r750.c(u6jVar.v0(), u6jVar.getString(R.string.sg_fruit_hunt_knife_miss));
                u6jVar.o0(new r6j(u6jVar));
                ej5.c(o8i0.d(u6jVar.t0()), null, null, new p7j(u6jVar, null), 3);
            }
            u6jVar.A0 = true;
        }
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
