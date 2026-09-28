package defpackage;

import android.graphics.Matrix;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yy80 {

    public static final class a {
        public final /* synthetic */ float[] a;
        public final /* synthetic */ Matrix b;

        public a(Matrix matrix, float[] fArr) {
            this.a = fArr;
            this.b = matrix;
        }

        public final long a(float f, float f2) {
            float[] fArr = this.a;
            fArr[0] = f;
            fArr[1] = f2;
            this.b.mapPoints(fArr);
            return ywh.a(fArr[0], fArr[1]);
        }
    }

    public static final p060 a(p060 p060Var, Matrix matrix) {
        p060Var.getClass();
        a aVar = new a(matrix, new float[2]);
        long j = a020.j(ywh.a(p060Var.b, p060Var.c), aVar);
        ngs ngsVarB = kotlin.collections.a.b();
        List<ubh> list = p060Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ngsVarB.add(list.get(i).a(aVar));
        }
        return new p060(kotlin.collections.a.a(ngsVarB), a020.d(j), a020.e(j));
    }
}
