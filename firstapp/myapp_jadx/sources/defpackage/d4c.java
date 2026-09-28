package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes.dex */
public final class d4c extends jkd0 {

    public class a extends wk40 {
        @Override // defpackage.hkd0
        public final ValueAnimator d() {
            Float fValueOf = Float.valueOf(1.0f);
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            ikd0 ikd0Var = new ikd0(this);
            ikd0Var.c(fArr, hkd0.O, new Float[]{fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf});
            ikd0Var.c = 1300L;
            ikd0Var.b(fArr);
            return ikd0Var.a();
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        int[] iArr = {r.d.DEFAULT_DRAG_ANIMATION_DURATION, 300, 400, 100, r.d.DEFAULT_DRAG_ANIMATION_DURATION, 300, 0, 100, r.d.DEFAULT_DRAG_ANIMATION_DURATION};
        a[] aVarArr = new a[9];
        for (int i = 0; i < 9; i++) {
            a aVar = new a();
            aVarArr[i] = aVar;
            aVar.f = iArr[i];
        }
        return aVarArr;
    }

    @Override // defpackage.jkd0, defpackage.hkd0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = hkd0.a(rect);
        int iWidth = (int) (rectA.width() * 0.33f);
        int iHeight = (int) (rectA.height() * 0.33f);
        for (int i = 0; i < j(); i++) {
            int i2 = ((i % 3) * iWidth) + rectA.left;
            int i3 = ((i / 3) * iHeight) + rectA.top;
            i(i).f(i2, i3, i2 + iWidth, i3 + iHeight);
        }
    }
}
