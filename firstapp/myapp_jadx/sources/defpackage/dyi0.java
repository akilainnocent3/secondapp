package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class dyi0 extends jkd0 {

    public class a extends wk40 {
        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            Float fValueOf = Float.valueOf(0.4f);
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.c(fArr, hkd0.N, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf});
            ikd0Var.c = 1200L;
            ikd0Var.b(fArr);
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        a[] aVarArr = new a[5];
        for (int i = 0; i < 5; i++) {
            a aVar = new a();
            aVar.c = 0.4f;
            aVarArr[i] = aVar;
            aVar.f = (i * 100) + 600;
        }
        return aVarArr;
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iWidth = rectA.width() / j();
        int iWidth2 = ((rectA.width() / 5) * 3) / 5;
        for (int i = 0; i < j(); i++) {
            hkd0 hkd0VarI = i(i);
            int i2 = (iWidth / 5) + (i * iWidth) + rectA.left;
            hkd0VarI.f(i2, rectA.top, i2 + iWidth2, rectA.bottom);
        }
    }
}
