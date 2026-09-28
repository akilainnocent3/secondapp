package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class ko7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ mo7.a a;
    public final /* synthetic */ mo7 b;

    public ko7(mo7 mo7Var, mo7.a aVar) {
        this.b = mo7Var;
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mo7.a aVar = this.a;
        mo7.d(fFloatValue, aVar);
        mo7 mo7Var = this.b;
        mo7Var.a(fFloatValue, aVar, false);
        mo7Var.invalidateSelf();
    }
}
