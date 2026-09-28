package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public final class sx80 {
    public final hy80[] a = new hy80[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final hy80 g = new hy80();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();

    public static class a {
        public static final sx80 a = new sx80();
    }

    public sx80() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new hy80();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(rx80 rx80Var, float[] fArr, float f, RectF rectF, fcv.b bVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        hy80[] hy80VarArr;
        char c;
        Matrix[] matrixArr2;
        vlf vlfVar;
        char c2;
        x4b up7Var;
        z4b z4bVar;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            hy80VarArr = this.a;
            c = 0;
            matrixArr2 = this.b;
            if (i2 >= 4) {
                break;
            }
            if (fArr != null) {
                up7Var = new up7(fArr[i2]);
            } else if (i2 == 1) {
                up7Var = rx80Var.g;
            } else if (i2 != 2) {
                up7Var = i2 != 3 ? rx80Var.f : rx80Var.e;
            } else {
                up7Var = rx80Var.h;
            }
            if (i2 == 1) {
                z4bVar = rx80Var.c;
            } else if (i2 != 2) {
                z4bVar = i2 != 3 ? rx80Var.b : rx80Var.a;
            } else {
                z4bVar = rx80Var.d;
            }
            hy80 hy80Var = hy80VarArr[i2];
            z4bVar.getClass();
            z4bVar.a(hy80Var, f, up7Var.a(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            hy80 hy80Var2 = hy80VarArr[i2];
            fArr2[0] = hy80Var2.c;
            fArr2[1] = hy80Var2.d;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c3 = 1;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            hy80 hy80Var3 = hy80VarArr[i4];
            fArr2[c] = hy80Var3.a;
            fArr2[c3] = hy80Var3.b;
            matrixArr2[i4].mapPoints(fArr2);
            if (i4 == 0) {
                path.moveTo(fArr2[c], fArr2[c3]);
            } else {
                path.lineTo(fArr2[c], fArr2[c3]);
            }
            hy80VarArr[i4].c(matrixArr2[i4], path);
            if (bVar != null) {
                hy80 hy80Var4 = hy80VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                fcv fcvVar = fcv.this;
                BitSet bitSet = fcvVar.e;
                hy80Var4.getClass();
                bitSet.set(i4, (boolean) c);
                hy80.f[] fVarArr = fcvVar.c;
                hy80Var4.b(hy80Var4.f);
                fVarArr[i4] = new gy80(new ArrayList(hy80Var4.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            hy80 hy80Var5 = hy80VarArr[i4];
            fArr2[0] = hy80Var5.c;
            fArr2[1] = hy80Var5.d;
            matrixArr2[i4].mapPoints(fArr2);
            hy80 hy80Var6 = hy80VarArr[i6];
            float f3 = hy80Var6.a;
            float[] fArr3 = this.i;
            fArr3[0] = f3;
            fArr3[1] = hy80Var6.b;
            matrixArr2[i6].mapPoints(fArr3);
            hy80[] hy80VarArr2 = hy80VarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            hy80 hy80Var7 = hy80VarArr2[i4];
            fArr2[0] = hy80Var7.c;
            fArr2[1] = hy80Var7.d;
            matrixArr2[i4].mapPoints(fArr2);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            hy80 hy80Var8 = this.g;
            hy80Var8.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                vlfVar = rx80Var.k;
            } else if (i4 != 2) {
                vlfVar = i4 != 3 ? rx80Var.j : rx80Var.i;
            } else {
                vlfVar = rx80Var.l;
            }
            vlfVar.b(fMax, fAbs, f, hy80Var8);
            Path path4 = this.j;
            path4.reset();
            hy80Var8.c(matrixArr[i4], path4);
            if (vlfVar.a() || b(path4, i4) || b(path4, i6)) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = hy80Var8.a;
                c3 = 1;
                fArr2[1] = hy80Var8.b;
                matrixArr[i4].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                hy80Var8.c(matrixArr[i4], path2);
            } else {
                hy80Var8.c(matrixArr[i4], path);
                c3 = 1;
            }
            if (bVar != null) {
                Matrix matrix2 = matrixArr[i4];
                fcv fcvVar2 = fcv.this;
                c2 = 0;
                fcvVar2.e.set(i4 + 4, false);
                hy80.f[] fVarArr2 = fcvVar2.d;
                hy80Var8.b(hy80Var8.f);
                fVarArr2[i4] = new gy80(new ArrayList(hy80Var8.h), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i4 = i5;
            c = c2;
            hy80VarArr = hy80VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
