package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.d0 a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;

    public i(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.d0 d0Var) {
        this.d = hVar;
        this.a = d0Var;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        h hVar = this.d;
        RecyclerView.d0 d0Var = this.a;
        hVar.h(d0Var);
        hVar.q.remove(d0Var);
        hVar.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
