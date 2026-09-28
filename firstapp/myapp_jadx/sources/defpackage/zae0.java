package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class zae0 extends a62 {
    public final w12 q;
    public final String r;
    public final boolean s;
    public final o58 t;
    public vuh0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public zae0(iot iotVar, w12 w12Var, ly80 ly80Var) {
        int iOrdinal = ly80Var.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = ly80Var.h.ordinal();
        super(iotVar, w12Var, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, ly80Var.i, ly80Var.e, ly80Var.f, ly80Var.c, ly80Var.b);
        this.q = w12Var;
        this.r = ly80Var.a;
        this.s = ly80Var.j;
        u12<Integer, Integer> u12VarB = ly80Var.d.b();
        this.t = (o58) u12VarB;
        u12VarB.a(this);
        w12Var.g(u12VarB);
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.r;
    }

    @Override // defpackage.a62, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        PointF pointF = vot.a;
        o58 o58Var = this.t;
        if (obj == 2) {
            o58Var.j(cptVar);
            return;
        }
        if (obj == vot.I) {
            vuh0 vuh0Var = this.u;
            w12 w12Var = this.q;
            if (vuh0Var != null) {
                w12Var.q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.u = vuh0Var2;
            vuh0Var2.a(this);
            w12Var.g(o58Var);
        }
    }

    @Override // defpackage.a62, defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        if (this.s) {
            return;
        }
        o58 o58Var = this.t;
        int iL = o58Var.l(o58Var.c.b(), o58Var.c());
        klr klrVar = this.i;
        klrVar.setColor(iL);
        vuh0 vuh0Var = this.u;
        if (vuh0Var != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var.e());
        }
        super.j(canvas, matrix, i, sefVar);
    }
}
