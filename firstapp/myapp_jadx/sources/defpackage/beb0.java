package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class beb0 extends u12<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final zwh k;
    public final zwh l;
    public cpt<Float> m;
    public cpt<Float> n;

    public beb0(zwh zwhVar, zwh zwhVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = zwhVar;
        this.l = zwhVar2;
        i(this.d);
    }

    @Override // defpackage.u12
    public final PointF e() {
        return l();
    }

    @Override // defpackage.u12
    public final /* bridge */ /* synthetic */ PointF f(cpp<PointF> cppVar, float f) {
        return l();
    }

    @Override // defpackage.u12
    public final void i(float f) {
        zwh zwhVar = this.k;
        zwhVar.i(f);
        zwh zwhVar2 = this.l;
        zwhVar2.i(f);
        this.i.set(zwhVar.e().floatValue(), zwhVar2.e().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((u12.a) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    public final PointF l() {
        Float fB;
        Float fB2 = null;
        if (this.m != null) {
            zwh zwhVar = this.k;
            cpp cppVarB = zwhVar.c.b();
            if (cppVarB != null) {
                Float f = cppVarB.h;
                cpt<Float> cptVar = this.m;
                float f2 = cppVarB.g;
                fB = cptVar.b(f2, f == null ? f2 : f.floatValue(), (Float) cppVarB.b, (Float) cppVarB.c, zwhVar.c(), zwhVar.d(), zwhVar.d);
            } else {
                fB = null;
            }
        } else {
            fB = null;
        }
        if (this.n != null) {
            zwh zwhVar2 = this.l;
            cpp cppVarB2 = zwhVar2.c.b();
            if (cppVarB2 != null) {
                Float f3 = cppVarB2.h;
                cpt<Float> cptVar2 = this.n;
                float f4 = cppVarB2.g;
                fB2 = cptVar2.b(f4, f3 == null ? f4 : f3.floatValue(), (Float) cppVarB2.b, (Float) cppVarB2.c, zwhVar2.c(), zwhVar2.d(), zwhVar2.d);
            }
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (fB == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, fB2.floatValue());
        return pointF2;
    }
}
