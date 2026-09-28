package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class da30 extends co7 {
    public da30() {
        g(0.0f);
    }

    @Override // defpackage.hkd0
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 1.0f};
        ikd0 ikd0Var = new ikd0(this);
        ikd0Var.c(fArr, hkd0.O, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
        ikd0Var.d(fArr, hkd0.P, new Integer[]{255, 0});
        ikd0Var.c = 1000L;
        ikd0Var.b(fArr);
        return ikd0Var.a();
    }
}
