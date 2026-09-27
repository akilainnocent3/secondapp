package yads;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ij3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz2 f150656a;

    public ij3(yz2 yz2Var, yz2 yz2Var2) {
        this.f150656a = yz2Var;
    }

    public final Matrix a(float f10, float f11, gj3 gj3Var) {
        int iOrdinal = gj3Var.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new dr.o0();
        }
        yz2 yz2Var = this.f150656a;
        float f12 = yz2Var.f158539b / 2.0f;
        float f13 = yz2Var.f158540c / 2.0f;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, f12, f13);
        return matrix2;
    }
}
