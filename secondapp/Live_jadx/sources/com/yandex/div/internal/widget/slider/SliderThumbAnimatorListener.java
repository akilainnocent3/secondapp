package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import dr.w2;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SliderThumbAnimatorListener implements Animator.AnimatorListener {
    private boolean hasCanceled;

    @l
    private final ds.l<Boolean, w2> onAnimationEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderThumbAnimatorListener(@l ds.l<? super Boolean, w2> lVar) {
        this.onAnimationEnd = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@l Animator animator) {
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@l Animator animator) {
        this.onAnimationEnd.invoke(Boolean.valueOf(this.hasCanceled));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@l Animator animator) {
        this.hasCanceled = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@l Animator animator) {
    }
}
