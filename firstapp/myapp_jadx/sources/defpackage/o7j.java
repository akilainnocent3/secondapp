package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class o7j implements Animator.AnimatorListener {
    public final /* synthetic */ u6j a;

    public o7j(u6j u6jVar) {
        this.a = u6jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        final u6j u6jVar = this.a;
        final View view = null;
        if (((Number) u6jVar.t0().L.getValue()).intValue() == 0) {
            ajh ajhVarL1 = u6jVar.l1();
            if (ajhVarL1 != null) {
                view = ajhVarL1.v;
            }
        } else {
            ajh ajhVarL2 = u6jVar.l1();
            if (ajhVarL2 != null) {
                view = ajhVarL2.i;
            }
        }
        if (view == null) {
            return;
        }
        u6jVar.G0 = view.animate().scaleY(1.0f).setDuration(800L).withStartAction(new Runnable() { // from class: t5j
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        }).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v5j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                u6jVar.H0 = Long.valueOf(valueAnimator.getCurrentPlayTime() + 100);
            }
        }).withEndAction(new Runnable(u6jVar, view) { // from class: w5j
            public final /* synthetic */ View a;

            {
                this.a = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view2 = this.a;
                view2.setPivotY(view2.getY());
                view2.animate().scaleY(0.0f).setDuration(100L);
            }
        });
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
