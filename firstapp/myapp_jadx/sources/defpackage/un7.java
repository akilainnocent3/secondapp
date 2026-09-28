package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class un7 extends yn7 {

    public class a extends co7 {
        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.5f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.c(fArr, hkd0.O, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
            ikd0Var.c = 1200L;
            ikd0Var.b(fArr);
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        a[] aVarArr = new a[12];
        for (int i = 0; i < 12; i++) {
            a aVar = new a();
            aVar.g(0.0f);
            aVarArr[i] = aVar;
            aVar.f = i * 100;
        }
        return aVarArr;
    }
}
