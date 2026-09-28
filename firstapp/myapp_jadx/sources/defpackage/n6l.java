package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class n6l extends a62 {
    public vuh0 A;
    public final String q;
    public final boolean r;
    public final qkt<LinearGradient> s;
    public final qkt<RadialGradient> t;
    public final RectF u;
    public final p6l v;
    public final int w;
    public final h6l x;
    public final zz10 y;
    public final zz10 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n6l(iot iotVar, w12 w12Var, m6l m6lVar) {
        int iOrdinal = m6lVar.h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = m6lVar.i.ordinal();
        super(iotVar, w12Var, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, m6lVar.j, m6lVar.d, m6lVar.g, m6lVar.k, m6lVar.l);
        this.s = new qkt<>();
        this.t = new qkt<>();
        this.u = new RectF();
        this.q = m6lVar.a;
        this.v = m6lVar.b;
        this.r = m6lVar.m;
        this.w = (int) (iotVar.a.b() / 32.0f);
        u12<f6l, f6l> u12VarB = m6lVar.c.b();
        this.x = (h6l) u12VarB;
        u12VarB.a(this);
        w12Var.g(u12VarB);
        u12<PointF, PointF> u12VarB2 = m6lVar.e.b();
        this.y = (zz10) u12VarB2;
        u12VarB2.a(this);
        w12Var.g(u12VarB2);
        u12<PointF, PointF> u12VarB3 = m6lVar.f.b();
        this.z = (zz10) u12VarB3;
        u12VarB3.a(this);
        w12Var.g(u12VarB3);
    }

    public final int[] g(int[] iArr) {
        vuh0 vuh0Var = this.A;
        if (vuh0Var != null) {
            Integer[] numArr = (Integer[]) vuh0Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.q;
    }

    @Override // defpackage.a62, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        if (obj == vot.J) {
            vuh0 vuh0Var = this.A;
            w12 w12Var = this.f;
            if (vuh0Var != null) {
                w12Var.q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.A = vuh0Var2;
            vuh0Var2.a(this);
            w12Var.g(this.A);
        }
    }

    @Override // defpackage.a62, defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        RadialGradient radialGradientB;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        f(this.u, matrix, false);
        p6l p6lVar = this.v;
        p6l p6lVar2 = p6l.a;
        h6l h6lVar = this.x;
        zz10 zz10Var = this.z;
        zz10 zz10Var2 = this.y;
        if (p6lVar == p6lVar2) {
            long jK = k();
            qkt<LinearGradient> qktVar = this.s;
            radialGradientB = qktVar.b(jK);
            if (radialGradientB == null) {
                PointF pointFE = zz10Var2.e();
                PointF pointFE2 = zz10Var.e();
                f6l f6lVarE = h6lVar.e();
                radialGradient = new LinearGradient(pointFE.x, pointFE.y, pointFE2.x, pointFE2.y, g(f6lVarE.b), f6lVarE.a, Shader.TileMode.CLAMP);
                qktVar.f(radialGradient, jK);
                radialGradientB = radialGradient;
            }
        } else {
            long jK2 = k();
            qkt<RadialGradient> qktVar2 = this.t;
            radialGradientB = qktVar2.b(jK2);
            if (radialGradientB == null) {
                PointF pointFE3 = zz10Var2.e();
                PointF pointFE4 = zz10Var.e();
                f6l f6lVarE2 = h6lVar.e();
                int[] iArrG = g(f6lVarE2.b);
                float[] fArr = f6lVarE2.a;
                float f = pointFE3.x;
                float f2 = pointFE3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointFE4.x - f, pointFE4.y - f2), iArrG, fArr, Shader.TileMode.CLAMP);
                qktVar2.f(radialGradient, jK2);
                radialGradientB = radialGradient;
            }
        }
        this.i.setShader(radialGradientB);
        super.j(canvas, matrix, i, sefVar);
    }

    public final int k() {
        float f = this.y.d;
        float f2 = this.w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.z.d * f2);
        int iRound3 = Math.round(this.x.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
