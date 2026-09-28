package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class h40 implements lc6 {
    public Canvas a = i40.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.lc6
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.lc6
    public final void b(c8n c8nVar, long j, long j2, long j3, long j4, zqz zqzVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapA = w70.a(c8nVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.a;
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void c(float f, float f2, float f3, float f4, float f5, float f6, boolean z, zqz zqzVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void d(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.lc6
    public final void e(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.lc6
    public final void f() {
        this.a.restore();
    }

    @Override // defpackage.lc6
    public final void h(c8n c8nVar, long j, zqz zqzVar) {
        this.a.drawBitmap(w70.a(c8nVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void j() {
        vc6.a(this.a, true);
    }

    @Override // defpackage.lc6
    public final void k(long j, long j2, zqz zqzVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, zqz zqzVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void m(bxz bxzVar, zqz zqzVar) {
        Canvas canvas = this.a;
        if (bxzVar instanceof j90) {
            canvas.drawPath(((j90) bxzVar).a, zqzVar.e());
        } else {
            zkh.a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.lc6
    public final void n(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.lc6
    public final void o(bxz bxzVar, int i) {
        Canvas canvas = this.a;
        if (bxzVar instanceof j90) {
            canvas.clipPath(((j90) bxzVar).a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            zkh.a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.lc6
    public final void p() {
        this.a.save();
    }

    @Override // defpackage.lc6
    public final void q() {
        vc6.a(this.a, false);
    }

    @Override // defpackage.lc6
    public final void r(float[] fArr) {
        if (fdv.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        t80.a(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.lc6
    public final void s(lk40 lk40Var, zqz zqzVar) {
        this.a.saveLayer(lk40Var.a, lk40Var.b, lk40Var.c, lk40Var.d, zqzVar.e(), 31);
    }

    @Override // defpackage.lc6
    public final void t(float f, long j, zqz zqzVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void u(float f, float f2, float f3, float f4, zqz zqzVar) {
        this.a.drawOval(f, f2, f3, f4, zqzVar.e());
    }

    @Override // defpackage.lc6
    public final void v(float f, float f2, float f3, float f4, zqz zqzVar) {
        this.a.drawRect(f, f2, f3, f4, zqzVar.e());
    }
}
