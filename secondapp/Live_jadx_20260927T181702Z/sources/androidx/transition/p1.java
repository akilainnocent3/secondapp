package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(29)
public class p1 extends o1 {
    @Override // androidx.transition.g1
    public float c(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.k1, androidx.transition.g1
    public void e(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.m1, androidx.transition.g1
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.g1
    public void g(@NonNull View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.o1, androidx.transition.g1
    public void h(@NonNull View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.k1, androidx.transition.g1
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.k1, androidx.transition.g1
    public void j(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
