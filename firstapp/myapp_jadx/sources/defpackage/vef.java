package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class vef implements u12.a {
    public final w12 a;
    public final w12 b;
    public final o58 c;
    public final zwh d;
    public final zwh e;
    public final zwh f;
    public final zwh g;
    public Matrix h;

    public class a extends cpt<Float> {
        public final /* synthetic */ cpt c;

        public a(cpt cptVar) {
            this.c = cptVar;
        }

        @Override // defpackage.cpt
        public final Float a(oot<Float> ootVar) {
            Float f = (Float) this.c.b;
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public vef(w12 w12Var, w12 w12Var2, tef tefVar) {
        this.b = w12Var;
        this.a = w12Var2;
        u12<?, ?> u12VarB = tefVar.a.b();
        this.c = (o58) u12VarB;
        u12VarB.a(this);
        w12Var2.g(u12VarB);
        zwh zwhVarB = tefVar.b.b();
        this.d = zwhVarB;
        zwhVarB.a(this);
        w12Var2.g(zwhVarB);
        zwh zwhVarB2 = tefVar.c.b();
        this.e = zwhVarB2;
        zwhVarB2.a(this);
        w12Var2.g(zwhVarB2);
        zwh zwhVarB3 = tefVar.d.b();
        this.f = zwhVarB3;
        zwhVarB3.a(this);
        w12Var2.g(zwhVarB3);
        zwh zwhVarB4 = tefVar.e.b();
        this.g = zwhVarB4;
        zwhVarB4.a(this);
        w12Var2.g(zwhVarB4);
    }

    @Override // u12.a
    public final void a() {
        this.b.a();
    }

    public final sef b(Matrix matrix, int i) {
        float fL = this.e.l() * 0.017453292f;
        float fFloatValue = this.f.e().floatValue();
        double d = fL;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.g.e().floatValue();
        int iIntValue = this.c.e().intValue();
        int iArgb = Color.argb(Math.round((this.d.e().floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        sef sefVar = new sef();
        sefVar.a = fFloatValue2 * 0.33f;
        sefVar.b = fSin;
        sefVar.c = fCos;
        sefVar.d = iArgb;
        sefVar.e = null;
        sefVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        sefVar.c(this.h);
        return sefVar;
    }

    public final void c(cpt<Float> cptVar) {
        this.d.j(new a(cptVar));
    }
}
