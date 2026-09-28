package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes4.dex */
public final class v8h implements ValueAnimator.AnimatorUpdateListener {
    public final View a;
    public final View b;
    public final float[] c = new float[2];

    public v8h(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.a = actionMenuView;
        this.b = actionMenuView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.c;
        w8h.b(fFloatValue, fArr);
        View view = this.a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
