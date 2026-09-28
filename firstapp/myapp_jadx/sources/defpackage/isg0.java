package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class isg0 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public u12<PointF, PointF> l;
    public u12<?, PointF> m;
    public u12<cz60, cz60> n;
    public u12<Float, Float> o;
    public u12<Integer, Integer> p;
    public zwh q;
    public zwh r;
    public zwh s;
    public zwh t;
    public zwh u;
    public u12<?, Float> v;
    public u12<?, Float> w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public isg0(qe0 qe0Var) {
        fe0 fe0Var = qe0Var.a;
        this.l = fe0Var == null ? null : fe0Var.b();
        se0<PointF, PointF> se0Var = qe0Var.b;
        this.m = se0Var == null ? null : se0Var.b();
        ie0 ie0Var = qe0Var.c;
        this.n = ie0Var == null ? null : ie0Var.b();
        be0 be0Var = qe0Var.d;
        this.o = be0Var == null ? null : be0Var.b();
        be0 be0Var2 = qe0Var.f;
        this.q = be0Var2 == null ? null : be0Var2.b();
        this.x = qe0Var.m;
        be0 be0Var3 = qe0Var.h;
        this.s = be0Var3 == null ? null : be0Var3.b();
        be0 be0Var4 = qe0Var.i;
        this.t = be0Var4 == null ? null : be0Var4.b();
        be0 be0Var5 = qe0Var.j;
        this.u = be0Var5 == null ? null : be0Var5.b();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        be0 be0Var6 = qe0Var.g;
        this.r = be0Var6 == null ? null : be0Var6.b();
        de0 de0Var = qe0Var.e;
        if (de0Var != null) {
            this.p = de0Var.b();
        }
        be0 be0Var7 = qe0Var.k;
        if (be0Var7 != null) {
            this.v = be0Var7.b();
        } else {
            this.v = null;
        }
        be0 be0Var8 = qe0Var.l;
        if (be0Var8 != null) {
            this.w = be0Var8.b();
        } else {
            this.w = null;
        }
    }

    public final void a(w12 w12Var) {
        w12Var.g(this.p);
        w12Var.g(this.v);
        w12Var.g(this.w);
        w12Var.g(this.l);
        w12Var.g(this.m);
        w12Var.g(this.n);
        w12Var.g(this.o);
        w12Var.g(this.q);
        w12Var.g(this.r);
        w12Var.g(this.s);
        w12Var.g(this.t);
        w12Var.g(this.u);
    }

    public final void b(u12.a aVar) {
        u12<Integer, Integer> u12Var = this.p;
        if (u12Var != null) {
            u12Var.a(aVar);
        }
        u12<?, Float> u12Var2 = this.v;
        if (u12Var2 != null) {
            u12Var2.a(aVar);
        }
        u12<?, Float> u12Var3 = this.w;
        if (u12Var3 != null) {
            u12Var3.a(aVar);
        }
        u12<PointF, PointF> u12Var4 = this.l;
        if (u12Var4 != null) {
            u12Var4.a(aVar);
        }
        u12<?, PointF> u12Var5 = this.m;
        if (u12Var5 != null) {
            u12Var5.a(aVar);
        }
        u12<cz60, cz60> u12Var6 = this.n;
        if (u12Var6 != null) {
            u12Var6.a(aVar);
        }
        u12<Float, Float> u12Var7 = this.o;
        if (u12Var7 != null) {
            u12Var7.a(aVar);
        }
        zwh zwhVar = this.q;
        if (zwhVar != null) {
            zwhVar.a(aVar);
        }
        zwh zwhVar2 = this.r;
        if (zwhVar2 != null) {
            zwhVar2.a(aVar);
        }
        zwh zwhVar3 = this.s;
        if (zwhVar3 != null) {
            zwhVar3.a(aVar);
            this.s.a(new u12.a() { // from class: fsg0
                @Override // u12.a
                public final void a() {
                    this.a.k = true;
                }
            });
        }
        zwh zwhVar4 = this.t;
        if (zwhVar4 != null) {
            zwhVar4.a(aVar);
            this.t.a(new u12.a() { // from class: gsg0
                @Override // u12.a
                public final void a() {
                    this.a.k = true;
                }
            });
        }
        zwh zwhVar5 = this.u;
        if (zwhVar5 != null) {
            zwhVar5.a(aVar);
            this.u.a(new u12.a() { // from class: hsg0
                @Override // u12.a
                public final void a() {
                    this.a.k = true;
                }
            });
        }
    }

    public final boolean c(cpt cptVar, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == vot.a) {
            u12<PointF, PointF> u12Var = this.l;
            if (u12Var == null) {
                this.l = new vuh0(cptVar, new PointF());
                return true;
            }
            u12Var.j(cptVar);
            return true;
        }
        if (obj == vot.b) {
            u12<?, PointF> u12Var2 = this.m;
            if (u12Var2 == null) {
                this.m = new vuh0(cptVar, new PointF());
                return true;
            }
            u12Var2.j(cptVar);
            return true;
        }
        if (obj == vot.c) {
            u12<?, PointF> u12Var3 = this.m;
            if (u12Var3 instanceof beb0) {
                ((beb0) u12Var3).m = cptVar;
                return true;
            }
        }
        if (obj == vot.d) {
            u12<?, PointF> u12Var4 = this.m;
            if (u12Var4 instanceof beb0) {
                ((beb0) u12Var4).n = cptVar;
                return true;
            }
        }
        if (obj == vot.j) {
            u12<cz60, cz60> u12Var5 = this.n;
            if (u12Var5 == null) {
                this.n = new vuh0(cptVar, new cz60());
                return true;
            }
            u12Var5.j(cptVar);
            return true;
        }
        if (obj == vot.k) {
            u12<Float, Float> u12Var6 = this.o;
            if (u12Var6 == null) {
                this.o = new vuh0(cptVar, fValueOf2);
                return true;
            }
            u12Var6.j(cptVar);
            return true;
        }
        if (obj == 3) {
            u12<Integer, Integer> u12Var7 = this.p;
            if (u12Var7 == null) {
                this.p = new vuh0(cptVar, 100);
                return true;
            }
            u12Var7.j(cptVar);
            return true;
        }
        if (obj == vot.A) {
            u12<?, Float> u12Var8 = this.v;
            if (u12Var8 == null) {
                this.v = new vuh0(cptVar, fValueOf);
                return true;
            }
            u12Var8.j(cptVar);
            return true;
        }
        if (obj == vot.B) {
            u12<?, Float> u12Var9 = this.w;
            if (u12Var9 == null) {
                this.w = new vuh0(cptVar, fValueOf);
                return true;
            }
            u12Var9.j(cptVar);
            return true;
        }
        if (obj == vot.o) {
            zwh zwhVar = this.q;
            if (zwhVar == null) {
                zwhVar = new zwh(Collections.singletonList(new cpp(fValueOf2)));
                this.q = zwhVar;
            }
            zwhVar.j(cptVar);
            return true;
        }
        if (obj == vot.p) {
            zwh zwhVar2 = this.r;
            if (zwhVar2 == null) {
                zwhVar2 = new zwh(Collections.singletonList(new cpp(fValueOf2)));
                this.r = zwhVar2;
            }
            zwhVar2.j(cptVar);
            return true;
        }
        if (obj == vot.l) {
            zwh zwhVar3 = this.s;
            if (zwhVar3 == null) {
                zwhVar3 = new zwh(Collections.singletonList(new cpp(fValueOf2)));
                this.s = zwhVar3;
            }
            zwhVar3.j(cptVar);
            return true;
        }
        if (obj == vot.m) {
            zwh zwhVar4 = this.t;
            if (zwhVar4 == null) {
                zwhVar4 = new zwh(Collections.singletonList(new cpp(fValueOf2)));
                this.t = zwhVar4;
            }
            zwhVar4.j(cptVar);
            return true;
        }
        if (obj != vot.n) {
            return false;
        }
        zwh zwhVar5 = this.u;
        if (zwhVar5 == null) {
            zwhVar5 = new zwh(Collections.singletonList(new cpp(fValueOf2)));
            this.u = zwhVar5;
        }
        zwhVar5.j(cptVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        zwh zwhVar;
        zwh zwhVar2;
        PointF pointFE;
        cz60 cz60VarE;
        PointF pointFE2;
        Matrix matrix = this.a;
        matrix.reset();
        zwh zwhVar3 = this.s;
        if ((zwhVar3 == null || zwhVar3.l() == 0.0f) && (((zwhVar = this.t) == null || zwhVar.l() == 0.0f) && ((zwhVar2 = this.u) == null || zwhVar2.l() == 0.0f))) {
            u12<?, PointF> u12Var = this.m;
            if (u12Var != null && (pointFE2 = u12Var.e()) != null) {
                float f = pointFE2.x;
                if (f != 0.0f || pointFE2.y != 0.0f) {
                    matrix.preTranslate(f, pointFE2.y);
                }
            }
            if (!this.x) {
                u12<Float, Float> u12Var2 = this.o;
                if (u12Var2 != null) {
                    float fFloatValue = u12Var2 instanceof vuh0 ? u12Var2.e().floatValue() : ((zwh) u12Var2).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (u12Var != null) {
                float f2 = u12Var.d;
                PointF pointFE3 = u12Var.e();
                float f3 = pointFE3.x;
                float f4 = pointFE3.y;
                u12Var.i(1.0E-4f + f2);
                PointF pointFE4 = u12Var.e();
                u12Var.i(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointFE4.y - f4, pointFE4.x - f3)));
            }
            zwh zwhVar4 = this.q;
            if (zwhVar4 != null) {
                zwh zwhVar5 = this.r;
                float fCos = zwhVar5 == null ? 0.0f : (float) Math.cos(Math.toRadians((-zwhVar5.l()) + 90.0f));
                zwh zwhVar6 = this.r;
                float fSin = zwhVar6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-zwhVar6.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(zwhVar4.l()));
                d();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            u12<cz60, cz60> u12Var3 = this.n;
            if (u12Var3 != null && (cz60VarE = u12Var3.e()) != null) {
                float f6 = cz60VarE.a;
                if (f6 != 1.0f || cz60VarE.b != 1.0f) {
                    matrix.preScale(f6, cz60VarE.b);
                }
            }
            u12<PointF, PointF> u12Var4 = this.l;
            if (u12Var4 != null && (pointFE = u12Var4.e()) != null) {
                float f7 = pointFE.x;
                if (f7 != 0.0f || pointFE.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointFE.y);
                }
            }
        } else {
            zwh zwhVar7 = this.s;
            float fL = zwhVar7 != null ? zwhVar7.l() : 0.0f;
            zwh zwhVar8 = this.t;
            float fL2 = zwhVar8 != null ? zwhVar8.l() : 0.0f;
            zwh zwhVar9 = this.u;
            float fL3 = zwhVar9 != null ? zwhVar9.l() : 0.0f;
            if (this.k || fL != this.f || fL2 != this.g || fL3 != this.h) {
                this.f = fL;
                this.g = fL2;
                this.h = fL3;
                if (fL != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            u12<PointF, PointF> u12Var5 = this.l;
            PointF pointFE5 = u12Var5 == null ? null : u12Var5.e();
            u12<?, PointF> u12Var6 = this.m;
            PointF pointFE6 = u12Var6 == null ? null : u12Var6.e();
            u12<cz60, cz60> u12Var7 = this.n;
            cz60 cz60VarE2 = u12Var7 != null ? u12Var7.e() : null;
            float f8 = cz60VarE2 != null ? cz60VarE2.a : 1.0f;
            float f9 = cz60VarE2 != null ? cz60VarE2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointFE6 != null) {
                float f12 = pointFE6.x;
                if (f12 != 0.0f || pointFE6.y != 0.0f) {
                    matrix.preTranslate(f12, pointFE6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointFE5 != null) {
                float f13 = pointFE5.x;
                if (f13 != 0.0f || pointFE5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointFE5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        u12<?, PointF> u12Var = this.m;
        PointF pointFE = u12Var == null ? null : u12Var.e();
        u12<cz60, cz60> u12Var2 = this.n;
        cz60 cz60VarE = u12Var2 == null ? null : u12Var2.e();
        u12<PointF, PointF> u12Var3 = this.l;
        PointF pointFE2 = u12Var3 != null ? u12Var3.e() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointFE != null) {
            matrix.preTranslate(pointFE.x * f, pointFE.y * f);
        }
        zwh zwhVar = this.s;
        float fL = zwhVar != null ? zwhVar.l() * f : 0.0f;
        zwh zwhVar2 = this.t;
        float fL2 = zwhVar2 != null ? zwhVar2.l() * f : 0.0f;
        zwh zwhVar3 = this.u;
        float fL3 = zwhVar3 != null ? zwhVar3.l() * f : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            u12<Float, Float> u12Var4 = this.o;
            if (u12Var4 != null) {
                matrix.preRotate(u12Var4.e().floatValue() * f, pointFE2 == null ? 0.0f : pointFE2.x, pointFE2 != null ? pointFE2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointFE2 == null ? 0.0f : pointFE2.x, pointFE2 != null ? pointFE2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (cz60VarE != null) {
            double d = f;
            matrix.preScale((float) Math.pow(cz60VarE.a, d), (float) Math.pow(cz60VarE.b, d));
        }
        return matrix;
    }
}
