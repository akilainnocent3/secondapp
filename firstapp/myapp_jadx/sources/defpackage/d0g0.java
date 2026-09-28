package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class d0g0 implements qx80 {
    public final ytw<ddv> a;
    public final qx80 b;
    public final qx80 c;
    public final j90 d = m90.a();
    public final j90 e = m90.a();
    public final j90 f = m90.a();

    public d0g0(ytw<ddv> ytwVar, qx80 qx80Var, qx80 qx80Var2) {
        this.a = ytwVar;
        this.b = qx80Var;
        this.c = qx80Var2;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        j90 j90Var = this.d;
        j90Var.reset();
        j90 j90Var2 = this.e;
        j90Var2.reset();
        j90 j90Var3 = this.f;
        j90Var3.reset();
        b9z b9zVarA = this.b.a(j, asrVar, mmdVar);
        b9z b9zVarA2 = this.c.a(j, asrVar, mmdVar);
        if (b9zVarA instanceof b9z.a) {
            bxz.r(j90Var, ((b9z.a) b9zVarA).a);
        } else if (b9zVarA instanceof b9z.c) {
            bxz.s(j90Var, ((b9z.c) b9zVarA).a);
        } else {
            if (!(b9zVarA instanceof b9z.b)) {
                uhc.a();
                return null;
            }
            bxz.o(j90Var, ((b9z.b) b9zVarA).a);
        }
        if (b9zVarA2 instanceof b9z.a) {
            bxz.r(j90Var3, ((b9z.a) b9zVarA2).a);
        } else if (b9zVarA2 instanceof b9z.c) {
            bxz.s(j90Var3, ((b9z.c) b9zVarA2).a);
        } else {
            if (!(b9zVarA2 instanceof b9z.b)) {
                uhc.a();
                return null;
            }
            bxz.o(j90Var3, ((b9z.b) b9zVarA2).a);
        }
        float[] fArr = this.a.getValue().a;
        Matrix matrix = j90Var3.d;
        if (matrix == null) {
            matrix = new Matrix();
            j90Var3.d = matrix;
        }
        t80.a(matrix, fArr);
        Path path = j90Var3.a;
        Matrix matrix2 = j90Var3.d;
        matrix2.getClass();
        path.transform(matrix2);
        j90Var2.u(j90Var, j90Var3, 2);
        return new b9z.a(j90Var2);
    }
}
