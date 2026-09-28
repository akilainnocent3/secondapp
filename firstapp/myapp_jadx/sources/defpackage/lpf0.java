package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class lpf0 extends jkd0 {

    public class a extends co7 {
        public a() {
            g(0.0f);
        }

        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            Float fValueOf = Float.valueOf(0.0f);
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.c(fArr, hkd0.O, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf});
            ikd0Var.c = 1400L;
            ikd0Var.b(fArr);
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final void k(hkd0... hkd0VarArr) {
        hkd0VarArr[1].f = 160;
        hkd0VarArr[2].f = 320;
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        return new hkd0[]{new a(), new a(), new a()};
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iWidth = rectA.width() / 8;
        int iCenterY = rectA.centerY() - iWidth;
        int iCenterY2 = rectA.centerY() + iWidth;
        for (int i = 0; i < j(); i++) {
            int iWidth2 = ((rectA.width() * i) / 3) + rectA.left;
            i(i).f(iWidth2, iCenterY, (iWidth * 2) + iWidth2, iCenterY2);
        }
    }
}
