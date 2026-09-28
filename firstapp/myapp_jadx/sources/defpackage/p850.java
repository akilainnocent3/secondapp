package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p850 implements jef, jxz, n7l, u12.a, tmp {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final iot c;
    public final w12 d;
    public final String e;
    public final boolean f;
    public final zwh g;
    public final zwh h;
    public final isg0 i;
    public mza j;

    public p850(iot iotVar, w12 w12Var, o850 o850Var) {
        this.c = iotVar;
        this.d = w12Var;
        this.e = o850Var.a;
        this.f = o850Var.e;
        zwh zwhVarB = o850Var.b.b();
        this.g = zwhVarB;
        w12Var.g(zwhVarB);
        zwhVarB.a(this);
        zwh zwhVarB2 = o850Var.c.b();
        this.h = zwhVarB2;
        w12Var.g(zwhVarB2);
        zwhVarB2.a(this);
        qe0 qe0Var = o850Var.d;
        qe0Var.getClass();
        isg0 isg0Var = new isg0(qe0Var);
        this.i = isg0Var;
        isg0Var.a(w12Var);
        isg0Var.b(this);
    }

    @Override // u12.a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            cza czaVar = (cza) this.j.i.get(i2);
            if (czaVar instanceof tmp) {
                rqv.g(rmpVar, i, arrayList, rmpVar2, (tmp) czaVar);
            }
        }
    }

    @Override // defpackage.jxz
    public final Path d() {
        Path pathD = this.j.d();
        Path path = this.b;
        path.reset();
        float fFloatValue = this.g.e().floatValue();
        float fFloatValue2 = this.h.e().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path.addPath(pathD, matrix);
        }
        return path;
    }

    @Override // defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        this.j.f(rectF, matrix, z);
    }

    @Override // defpackage.n7l
    public final void g(ListIterator<cza> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new mza(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        if (this.i.c(cptVar, obj)) {
            return;
        }
        if (obj == vot.s) {
            this.g.j(cptVar);
        } else if (obj == vot.t) {
            this.h.j(cptVar);
        }
    }

    @Override // defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        float fFloatValue = this.g.e().floatValue();
        float fFloatValue2 = this.h.e().floatValue();
        isg0 isg0Var = this.i;
        float fFloatValue3 = isg0Var.v.e().floatValue() / 100.0f;
        float fFloatValue4 = isg0Var.w.e().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(isg0Var.f(f + fFloatValue2));
            this.j.j(canvas, matrix2, (int) (rqv.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), sefVar);
        }
    }
}
