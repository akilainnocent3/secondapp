package defpackage;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class kk0 implements Animator.AnimatorPauseListener {
    final /* synthetic */ Function1<Animator, Unit> a;
    final /* synthetic */ Function1<Animator, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public kk0(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2) {
        this.a = function1;
        this.b = function2;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        this.b.invoke(animator);
    }
}
