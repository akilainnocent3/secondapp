package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class kfs extends AnimatorListenerAdapter {
    public final /* synthetic */ mfs a;

    public kfs(mfs mfsVar) {
        this.a = mfsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        mfs mfsVar = this.a;
        mfsVar.g = (mfsVar.g + 1) % mfsVar.f.e.length;
        mfsVar.h = true;
    }
}
