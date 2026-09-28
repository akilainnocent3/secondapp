package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k6l implements jef, u12.a, tmp {
    public final String a;
    public final boolean b;
    public final w12 c;
    public final qkt<LinearGradient> d = new qkt<>();
    public final qkt<RadialGradient> e = new qkt<>();
    public final Path f;
    public final klr g;
    public final RectF h;
    public final ArrayList i;
    public final p6l j;
    public final h6l k;
    public final pxo l;
    public final zz10 m;
    public final zz10 n;
    public vuh0 o;
    public vuh0 p;
    public final iot q;
    public final int r;
    public u12<Float, Float> s;
    public float t;

    public k6l(iot iotVar, xmt xmtVar, w12 w12Var, j6l j6lVar) {
        Path path = new Path();
        this.f = path;
        this.g = new klr(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = w12Var;
        this.a = j6lVar.g;
        this.b = j6lVar.h;
        this.q = iotVar;
        this.j = j6lVar.a;
        path.setFillType(j6lVar.b);
        this.r = (int) (xmtVar.b() / 32.0f);
        u12<f6l, f6l> u12VarB = j6lVar.c.b();
        this.k = (h6l) u12VarB;
        u12VarB.a(this);
        w12Var.g(u12VarB);
        u12<Integer, Integer> u12VarB2 = j6lVar.d.b();
        this.l = (pxo) u12VarB2;
        u12VarB2.a(this);
        w12Var.g(u12VarB2);
        u12<PointF, PointF> u12VarB3 = j6lVar.e.b();
        this.m = (zz10) u12VarB3;
        u12VarB3.a(this);
        w12Var.g(u12VarB3);
        u12<PointF, PointF> u12VarB4 = j6lVar.f.b();
        this.n = (zz10) u12VarB4;
        u12VarB4.a(this);
        w12Var.g(u12VarB4);
        if (w12Var.n() != null) {
            zwh zwhVarB = ((be0) w12Var.n().a).b();
            this.s = zwhVarB;
            zwhVarB.a(this);
            w12Var.g(this.s);
        }
    }

    @Override // u12.a
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        for (int i = 0; i < list2.size(); i++) {
            cza czaVar = list2.get(i);
            if (czaVar instanceof jxz) {
                this.i.add((jxz) czaVar);
            }
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
    }

    @Override // defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((jxz) arrayList.get(i)).d(), matrix);
                i++;
            }
        }
    }

    public final int[] g(int[] iArr) {
        vuh0 vuh0Var = this.p;
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
        return this.a;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        PointF pointF = vot.a;
        if (obj == 4) {
            this.l.j(cptVar);
            return;
        }
        ColorFilter colorFilter = vot.I;
        w12 w12Var = this.c;
        if (obj == colorFilter) {
            vuh0 vuh0Var = this.o;
            if (vuh0Var != null) {
                w12Var.q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.o = vuh0Var2;
            vuh0Var2.a(this);
            w12Var.g(this.o);
            return;
        }
        if (obj == vot.J) {
            vuh0 vuh0Var3 = this.p;
            if (vuh0Var3 != null) {
                w12Var.q(vuh0Var3);
            }
            this.d.a();
            this.e.a();
            vuh0 vuh0Var4 = new vuh0(cptVar, null);
            this.p = vuh0Var4;
            vuh0Var4.a(this);
            w12Var.g(this.p);
            return;
        }
        if (obj == vot.e) {
            u12<Float, Float> u12Var = this.s;
            if (u12Var != null) {
                u12Var.j(cptVar);
                return;
            }
            vuh0 vuh0Var5 = new vuh0(cptVar, null);
            this.s = vuh0Var5;
            vuh0Var5.a(this);
            w12Var.g(this.s);
        }
    }

    @Override // defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        float[] fArr;
        int[] iArr;
        LinearGradient linearGradientB;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((jxz) arrayList.get(i2)).d(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        p6l p6lVar = this.j;
        p6l p6lVar2 = p6l.a;
        h6l h6lVar = this.k;
        zz10 zz10Var = this.n;
        zz10 zz10Var2 = this.m;
        if (p6lVar == p6lVar2) {
            long jK = k();
            qkt<LinearGradient> qktVar = this.d;
            linearGradientB = qktVar.b(jK);
            if (linearGradientB == null) {
                PointF pointFE = zz10Var2.e();
                PointF pointFE2 = zz10Var.e();
                f6l f6lVarE = h6lVar.e();
                int[] iArrG = g(f6lVarE.b);
                float[] fArr2 = f6lVarE.a;
                if (iArrG.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrG[0], iArrG[0]};
                } else {
                    iArr2 = iArrG;
                }
                linearGradientB = new LinearGradient(pointFE.x, pointFE.y, pointFE2.x, pointFE2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                qktVar.f(linearGradientB, jK);
            }
        } else {
            long jK2 = k();
            qkt<RadialGradient> qktVar2 = this.e;
            RadialGradient radialGradientB = qktVar2.b(jK2);
            if (radialGradientB != null) {
                linearGradientB = radialGradientB;
            } else {
                PointF pointFE3 = zz10Var2.e();
                PointF pointFE4 = zz10Var.e();
                f6l f6lVarE2 = h6lVar.e();
                int[] iArrG2 = g(f6lVarE2.b);
                float[] fArr3 = f6lVarE2.a;
                if (iArrG2.length < 2) {
                    iArr = new int[]{iArrG2[0], iArrG2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrG2;
                }
                float f = pointFE3.x;
                float f2 = pointFE3.y;
                float fHypot = (float) Math.hypot(pointFE4.x - f, pointFE4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                qktVar2.f(radialGradient, jK2);
                linearGradientB = radialGradient;
            }
        }
        linearGradientB.setLocalMatrix(matrix);
        klr klrVar = this.g;
        klrVar.setShader(linearGradientB);
        vuh0 vuh0Var = this.o;
        if (vuh0Var != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var.e());
        }
        u12<Float, Float> u12Var = this.s;
        if (u12Var != null) {
            float fFloatValue = u12Var.e().floatValue();
            if (fFloatValue == 0.0f) {
                klrVar.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                klrVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = this.l.e().intValue() / 100.0f;
        klrVar.setAlpha(rqv.c((int) (i * fIntValue)));
        if (sefVar != null) {
            sefVar.a((int) (fIntValue * 255.0f), klrVar);
        }
        canvas.drawPath(path, klrVar);
    }

    public final int k() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
