package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z8d implements bjs.a, xlw.a {
    @Override // xlw.a
    public void a(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // bjs.a
    public void invoke(Object obj) {
    }
}
