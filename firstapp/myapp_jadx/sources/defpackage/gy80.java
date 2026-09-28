package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gy80 extends hy80.f {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public gy80(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // hy80.f
    public final void a(Matrix matrix, mx80 mx80Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((hy80.f) obj).a(this.d, mx80Var, i, canvas);
        }
    }
}
