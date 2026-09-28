package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pt5 implements ot5 {
    public final float[] a;
    public final int[] b = new int[2];

    public pt5(float[] fArr) {
        this.a = fArr;
    }

    @Override // defpackage.ot5
    public final void a(View view, float[] fArr) {
        ddv.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.a;
        if (z) {
            b((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            q50.a aVar = q50.a;
            ddv.d(fArr2);
            ddv.h(fArr2, f, f2);
            q50.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            ddv.d(fArr2);
            ddv.h(fArr2, left, top);
            q50.b(fArr, fArr2);
        } else {
            int[] iArr = this.b;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            q50.a aVar2 = q50.a;
            ddv.d(fArr2);
            ddv.h(fArr2, f3, f4);
            q50.b(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            ddv.d(fArr2);
            ddv.h(fArr2, f5, f6);
            q50.b(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        t80.b(matrix, fArr2);
        q50.b(fArr, fArr2);
    }
}
