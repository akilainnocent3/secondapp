package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class kw50 extends co7 {
    @Override // defpackage.hkd0
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        ikd0 ikd0Var = new ikd0(this);
        ikd0Var.d(fArr, hkd0.I, new Integer[]{0, -180, -180});
        ikd0Var.d(fArr, hkd0.K, new Integer[]{0, 0, -180});
        ikd0Var.c = 1200L;
        ikd0Var.b(fArr);
        return ikd0Var.a();
    }
}
