package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class x5i extends jkd0 {

    public class a extends wk40 {
        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.d(fArr, hkd0.P, new Integer[]{0, 0, 255, 255, 0, 0});
            ikd0Var.d(fArr, hkd0.I, new Integer[]{-180, -180, 0, 0, 0, 0});
            ikd0Var.d(fArr, hkd0.K, new Integer[]{0, 0, 0, 0, 180, 180});
            ikd0Var.c = 2400L;
            ikd0Var.b = new LinearInterpolator();
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final void h(Canvas canvas) {
        Rect rectA = hkd0.a(getBounds());
        for (int i = 0; i < j(); i++) {
            int iSave = canvas.save();
            canvas.rotate((i * 90) + 45, rectA.centerX(), rectA.centerY());
            i(i).draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        a[] aVarArr = new a[4];
        for (int i = 0; i < 4; i++) {
            a aVar = new a();
            aVar.setAlpha(0);
            aVar.i = -180;
            aVarArr[i] = aVar;
            aVar.f = i * 300;
        }
        return aVarArr;
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iMin = Math.min(rectA.width(), rectA.height()) / 2;
        int i = rectA.left + iMin + 1;
        int i2 = rectA.top + iMin + 1;
        for (int i3 = 0; i3 < j(); i3++) {
            hkd0 hkd0VarI = i(i3);
            hkd0VarI.f(rectA.left, rectA.top, i, i2);
            Rect rect2 = hkd0VarI.E;
            hkd0VarI.d = rect2.right;
            hkd0VarI.e = rect2.bottom;
        }
    }
}
