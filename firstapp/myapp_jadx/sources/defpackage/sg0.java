package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class sg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ rg0 a;

    public sg0(rg0 rg0Var) {
        this.a = rg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rg0 rg0Var = this.a;
        ArrayList arrayList = new ArrayList(rg0Var.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd0) arrayList.get(i)).a(rg0Var);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        rg0 rg0Var = this.a;
        ArrayList arrayList = new ArrayList(rg0Var.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd0) arrayList.get(i)).b(rg0Var);
        }
    }
}
