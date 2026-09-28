package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ea30 extends mt50 {
    public ea30() {
        g(0.0f);
    }

    @Override // defpackage.hkd0
    public final ValueAnimator d() {
        Float fValueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        ikd0 ikd0Var = new ikd0(this);
        ikd0Var.c(fArr, hkd0.O, new Float[]{Float.valueOf(0.0f), fValueOf, fValueOf});
        ikd0Var.d(fArr, hkd0.P, new Integer[]{255, 178, 0});
        ikd0Var.c = 1000L;
        fmp fmpVar = new fmp(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        fmpVar.b = fArr;
        ikd0Var.b = fmpVar;
        return ikd0Var.a();
    }
}
