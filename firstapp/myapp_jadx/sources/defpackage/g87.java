package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class g87 extends jkd0 {

    public class a extends co7 {
        public a() {
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

    @Override // defpackage.jkd0, defpackage.hkd0
    public final ValueAnimator d() {
        ikd0 ikd0Var = new ikd0(this);
        ikd0Var.d(new float[]{0.0f, 1.0f}, hkd0.J, new Integer[]{0, 360});
        ikd0Var.c = 2000L;
        ikd0Var.b = new LinearInterpolator();
        return ikd0Var.a();
    }

    @Override // defpackage.jkd0
    public final void k(hkd0... hkd0VarArr) {
        hkd0VarArr[1].f = 1000;
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        return new hkd0[]{new a(), new a()};
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iWidth = (int) (rectA.width() * 0.6f);
        hkd0 hkd0VarI = i(0);
        int i = rectA.right;
        int i2 = rectA.top;
        hkd0VarI.f(i - iWidth, i2, i, i2 + iWidth);
        hkd0 hkd0VarI2 = i(1);
        int i3 = rectA.right;
        int i4 = rectA.bottom;
        hkd0VarI2.f(i3 - iWidth, i4 - iWidth, i3, i4);
    }
}
