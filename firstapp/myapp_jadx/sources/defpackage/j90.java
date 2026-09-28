package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class j90 implements bxz {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public j90(Path path) {
        this.a = path;
    }

    @Override // defpackage.bxz
    public final void a(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.bxz
    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.bxz
    public final void c(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // defpackage.bxz
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bxz
    public final void d(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // defpackage.bxz
    public final void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.bxz
    public final void f(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.bxz
    public final void g(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.bxz
    public final lk40 getBounds() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new lk40(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.bxz
    public final void h(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.bxz
    public final void i(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.bxz
    public final void j() {
        this.a.rewind();
    }

    @Override // defpackage.bxz
    public final void k(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }

    @Override // defpackage.bxz
    public final void l(lz50 lz50Var) {
        bxz.a aVar = bxz.a.a;
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        float f = lz50Var.a;
        long j = lz50Var.h;
        long j2 = lz50Var.g;
        long j3 = lz50Var.f;
        long j4 = lz50Var.e;
        rectF.set(f, lz50Var.b, lz50Var.c, lz50Var.d);
        float[] fArr = this.c;
        if (fArr == null) {
            fArr = new float[8];
            this.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        this.a.addRoundRect(rectF2, fArr2, m90.c(aVar));
    }

    @Override // defpackage.bxz
    public final void m(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.bxz
    public final void n(lk40 lk40Var, bxz.a aVar) {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.set(lk40Var.a, lk40Var.b, lk40Var.c, lk40Var.d);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.addOval(rectF2, m90.c(aVar));
    }

    @Override // defpackage.bxz
    public final void p(lk40 lk40Var) {
        bxz.a aVar = bxz.a.a;
        float f = lk40Var.a;
        float f2 = lk40Var.d;
        float f3 = lk40Var.c;
        float f4 = lk40Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            m90.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.set(lk40Var.a, f4, f3, f2);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.addRect(rectF2, m90.c(aVar));
    }

    @Override // defpackage.bxz
    public final int q() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // defpackage.bxz
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.bxz
    public final void t(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final boolean u(bxz bxzVar, bxz bxzVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(bxzVar instanceof j90)) {
            zkh.a("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((j90) bxzVar).a;
        if (bxzVar2 instanceof j90) {
            return this.a.op(path, ((j90) bxzVar2).a, op);
        }
        zkh.a("Unable to obtain android.graphics.Path");
        return false;
    }
}
