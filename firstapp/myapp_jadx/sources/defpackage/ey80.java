package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ey80 extends w12 {
    public final mza D;
    public final wma E;
    public final vef F;

    public ey80(iot iotVar, drr drrVar, wma wmaVar, xmt xmtVar) {
        super(iotVar, drrVar);
        this.E = wmaVar;
        mza mzaVar = new mza(iotVar, this, new ay80("__container", false, drrVar.a), xmtVar);
        this.D = mzaVar;
        List<cza> list = Collections.EMPTY_LIST;
        mzaVar.b(list, list);
        tef tefVar = this.p.x;
        if (tefVar != null) {
            this.F = new vef(this, this, tefVar);
        }
    }

    @Override // defpackage.w12, defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        this.D.f(rectF, this.n, z);
    }

    @Override // defpackage.w12, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        PointF pointF = vot.a;
        vef vefVar = this.F;
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
        vef vefVar = this.F;
        if (vefVar != null) {
            sefVar = vefVar.b(matrix, i);
        }
        this.D.j(canvas, matrix, i, sefVar);
    }

    @Override // defpackage.w12
    public final gg4 n() {
        gg4 gg4Var = this.p.w;
        return gg4Var != null ? gg4Var : this.E.p.w;
    }

    @Override // defpackage.w12
    public final void r(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        this.D.c(rmpVar, i, arrayList, rmpVar2);
    }
}
