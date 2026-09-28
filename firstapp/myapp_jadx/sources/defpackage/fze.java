package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class fze extends jkd0 {

    public class a extends co7 {
        public a() {
            setAlpha(153);
            g(0.0f);
        }

        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.c(fArr, hkd0.O, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
            ikd0Var.c = 2000L;
            ikd0Var.b(fArr);
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final void k(hkd0... hkd0VarArr) {
        hkd0VarArr[1].f = 1000;
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        return new hkd0[]{new a(), new a()};
    }
}
