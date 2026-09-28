package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ r.f a;

    public t(r.f fVar) {
        this.a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.B = valueAnimator.getAnimatedFraction();
    }
}
