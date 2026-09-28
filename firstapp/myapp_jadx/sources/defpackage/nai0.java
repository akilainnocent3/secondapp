package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class nai0 extends mai0 {
    @Override // defpackage.jai0
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.jai0
    public final void b(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.kai0
    public final void c(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.kai0
    public final void d(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.kai0
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.lai0
    public final void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.mai0
    public final void g(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
