package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class wxi0 extends jkd0 {

    public class a extends wk40 {
        public final int T;

        public a(int i) {
            this.T = i;
        }

        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            int i = 0;
            ikd0Var.d(fArr, hkd0.J, new Integer[]{0, -90, -179, -180, -270, -360});
            Float fValueOf = Float.valueOf(0.0f);
            Float fValueOf2 = Float.valueOf(0.75f);
            ikd0Var.c(fArr, hkd0.L, new Float[]{fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf});
            ikd0Var.c(fArr, hkd0.M, new Float[]{fValueOf, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf});
            Float fValueOf3 = Float.valueOf(1.0f);
            Float fValueOf4 = Float.valueOf(0.5f);
            ikd0Var.c(fArr, hkd0.O, new Float[]{fValueOf3, fValueOf4, fValueOf3, fValueOf3, fValueOf4, fValueOf3});
            ikd0Var.c = 1800L;
            ikd0Var.b(fArr);
            int i2 = this.T;
            if (i2 < 0) {
                Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            } else {
                i = i2;
            }
            ikd0Var.d = i;
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        return new hkd0[]{new a(0), new a(3)};
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect rectA = hkd0.a(rect);
        super.onBoundsChange(rectA);
        for (int i = 0; i < j(); i++) {
            hkd0 hkd0VarI = i(i);
            int i2 = rectA.left;
            hkd0VarI.f(i2, rectA.top, (rectA.width() / 4) + i2, (rectA.height() / 4) + rectA.top);
        }
    }

    @Override // defpackage.jkd0
    public final void k(hkd0... hkd0VarArr) {
    }
}
