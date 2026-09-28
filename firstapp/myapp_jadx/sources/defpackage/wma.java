package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wma extends w12 {
    public u12<Float, Float> D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final fly I;
    public final fly.a J;
    public float K;
    public boolean L;
    public final vef M;

    public wma(iot iotVar, drr drrVar, List<drr> list, xmt xmtVar) {
        int i;
        w12 w12Var;
        w12 wmaVar;
        super(iotVar, drrVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new fly();
        this.J = new fly.a();
        this.L = true;
        be0 be0Var = drrVar.s;
        if (be0Var != null) {
            zwh zwhVarB = be0Var.b();
            this.D = zwhVarB;
            g(zwhVarB);
            this.D.a(this);
        } else {
            this.D = null;
        }
        qkt qktVar = new qkt(xmtVar.j.size());
        int size = list.size() - 1;
        w12 w12Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            drr drrVar2 = list.get(size);
            int iOrdinal = drrVar2.e.ordinal();
            if (iOrdinal == 0) {
                wmaVar = new wma(iotVar, drrVar2, (List) xmtVar.c.get(drrVar2.g), xmtVar);
            } else if (iOrdinal == 1) {
                wmaVar = new toa0(iotVar, drrVar2);
            } else if (iOrdinal == 2) {
                wmaVar = new i9n(iotVar, drrVar2);
            } else if (iOrdinal == 3) {
                wmaVar = new g5y(iotVar, drrVar2);
            } else if (iOrdinal == 4) {
                wmaVar = new ey80(iotVar, drrVar2, this, xmtVar);
            } else if (iOrdinal != 5) {
                lgt.b("Unknown layer type " + drrVar2.e);
                wmaVar = null;
            } else {
                wmaVar = new pkf0(iotVar, drrVar2);
            }
            if (wmaVar != null) {
                qktVar.f(wmaVar, wmaVar.p.d);
                if (w12Var2 != null) {
                    w12Var2.s = wmaVar;
                    w12Var2 = null;
                } else {
                    this.E.add(0, wmaVar);
                    int iOrdinal2 = drrVar2.u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        w12Var2 = wmaVar;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < qktVar.h(); i++) {
            w12 w12Var3 = (w12) qktVar.b(qktVar.e(i));
            if (w12Var3 != null && (w12Var = (w12) qktVar.b(w12Var3.p.f)) != null) {
                w12Var3.t = w12Var;
            }
        }
        tef tefVar = this.p.x;
        if (tefVar != null) {
            this.M = new vef(this, this, tefVar);
        }
    }

    @Override // defpackage.w12, defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((w12) arrayList.get(size)).f(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.w12, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        if (obj == vot.C) {
            vuh0 vuh0Var = new vuh0(cptVar, null);
            this.D = vuh0Var;
            vuh0Var.a(this);
            g(this.D);
            return;
        }
        vef vefVar = this.M;
        if (obj == 5 && vefVar != null) {
            vefVar.c.j(cptVar);
            return;
        }
        if (obj == vot.E && vefVar != null) {
            vefVar.c(cptVar);
            return;
        }
        if (obj == vot.F && vefVar != null) {
            vefVar.e.j(cptVar);
            return;
        }
        if (obj == vot.G && vefVar != null) {
            vefVar.f.j(cptVar);
        } else {
            if (obj != vot.H || vefVar == null) {
                return;
            }
            vefVar.g.j(cptVar);
        }
    }

    @Override // defpackage.w12
    public final void m(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        Canvas canvasE;
        vef vefVar = this.M;
        int i2 = 0;
        boolean z = (sefVar == null && vefVar == null) ? false : true;
        iot iotVar = this.o;
        boolean z2 = iotVar.I;
        ArrayList arrayList = this.E;
        boolean z3 = (z2 && arrayList.size() > 1 && i != 255) || (z && iotVar.J);
        int i3 = z3 ? 255 : i;
        if (vefVar != null) {
            sefVar = vefVar.b(matrix, i3);
        }
        boolean z4 = this.L;
        drr drrVar = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(drrVar.c)) {
            rectF.set(0.0f, 0.0f, drrVar.o, drrVar.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                RectF rectF2 = this.H;
                ((w12) obj).f(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        fly flyVar = this.I;
        if (z3) {
            fly.a aVar = this.J;
            aVar.b = null;
            aVar.a = i;
            if (sefVar != null) {
                if (Color.alpha(sefVar.d) > 0) {
                    aVar.b = sefVar;
                } else {
                    aVar.b = null;
                }
                sefVar = null;
            }
            canvasE = flyVar.e(canvas, rectF, aVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((w12) arrayList.get(size2)).j(canvasE, matrix, i3, sefVar);
            }
        }
        if (z3) {
            flyVar.c();
        }
        canvas.restore();
    }

    @Override // defpackage.w12
    public final void r(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((w12) arrayList2.get(i2)).c(rmpVar, i, arrayList, rmpVar2);
            i2++;
        }
    }

    @Override // defpackage.w12
    public final void s(boolean z) {
        super.s(z);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w12) obj).s(z);
        }
    }

    @Override // defpackage.w12
    public final void t(float f) {
        this.K = f;
        super.t(f);
        u12<Float, Float> u12Var = this.D;
        drr drrVar = this.p;
        if (u12Var != null) {
            xmt xmtVar = this.o.a;
            f = ((u12Var.e().floatValue() * drrVar.b.n) - drrVar.b.l) / ((xmtVar.m - xmtVar.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = drrVar.n;
            xmt xmtVar2 = drrVar.b;
            f -= f2 / (xmtVar2.m - xmtVar2.l);
        }
        if (drrVar.m != 0.0f && !"__container".equals(drrVar.c)) {
            f /= drrVar.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((w12) arrayList.get(size)).t(f);
        }
    }
}
