package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mza implements jef, jxz, u12.a, smp {
    public final fly.a a;
    public final RectF b;
    public final fly c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final iot j;
    public ArrayList k;
    public final isg0 l;

    public mza(iot iotVar, w12 w12Var, String str, boolean z, ArrayList arrayList, qe0 qe0Var) {
        this.a = new fly.a();
        this.b = new RectF();
        this.c = new fly();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = iotVar;
        this.h = z;
        this.i = arrayList;
        if (qe0Var != null) {
            isg0 isg0Var = new isg0(qe0Var);
            this.l = isg0Var;
            isg0Var.a(w12Var);
            isg0Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cza czaVar = (cza) arrayList.get(size);
            if (czaVar instanceof n7l) {
                arrayList2.add((n7l) czaVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((n7l) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // u12.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            cza czaVar = (cza) arrayList.get(size2);
            czaVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(czaVar);
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        String str = this.g;
        if (!rmpVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            rmp rmpVar3 = new rmp(rmpVar2);
            rmpVar3.a.add(str);
            if (rmpVar.a(i, str)) {
                rmp rmpVar4 = new rmp(rmpVar3);
                rmpVar4.b = this;
                arrayList.add(rmpVar4);
            }
            rmpVar2 = rmpVar3;
        }
        if (!rmpVar.d(i, str)) {
            return;
        }
        int iB = rmpVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            cza czaVar = (cza) arrayList2.get(i2);
            if (czaVar instanceof smp) {
                ((smp) czaVar).c(rmpVar, iB, arrayList, rmpVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.jxz
    public final Path d() {
        Matrix matrix = this.d;
        matrix.reset();
        isg0 isg0Var = this.l;
        if (isg0Var != null) {
            matrix.set(isg0Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cza czaVar = (cza) arrayList.get(size);
                if (czaVar instanceof jxz) {
                    path.addPath(((jxz) czaVar).d(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        isg0 isg0Var = this.l;
        if (isg0Var != null) {
            matrix2.preConcat(isg0Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cza czaVar = (cza) arrayList.get(size);
            if (czaVar instanceof jef) {
                ((jef) czaVar).f(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List<jxz> g() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                cza czaVar = (cza) arrayList.get(i);
                if (czaVar instanceof jxz) {
                    this.k.add((jxz) czaVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.cza
    public final String getName() {
        throw null;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        isg0 isg0Var = this.l;
        if (isg0Var != null) {
            isg0Var.c(cptVar, obj);
        }
    }

    @Override // defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        isg0 isg0Var = this.l;
        if (isg0Var != null) {
            matrix2.preConcat(isg0Var.e());
            u12<Integer, Integer> u12Var = isg0Var.p;
            i = (int) (((((u12Var == null ? 100 : u12Var.e().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        iot iotVar = this.j;
        boolean z = (iotVar.I && k() && i != 255) || (sefVar != null && iotVar.J && k());
        int i2 = z ? 255 : i;
        fly flyVar = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(rectF, matrix, true);
            fly.a aVar = this.a;
            aVar.a = i;
            if (sefVar != null) {
                if (Color.alpha(sefVar.d) > 0) {
                    aVar.b = sefVar;
                } else {
                    aVar.b = null;
                }
                sefVar = null;
            } else {
                aVar.b = null;
            }
            canvas = flyVar.e(canvas, rectF, aVar);
        } else if (sefVar != null) {
            sef sefVar2 = new sef(sefVar);
            sefVar2.b(i2);
            sefVar = sefVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof jef) {
                ((jef) obj).j(canvas, matrix2, i2, sefVar);
            }
        }
        if (z) {
            flyVar.c();
        }
    }

    public final boolean k() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof jef) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public mza(iot iotVar, w12 w12Var, ay80 ay80Var, xmt xmtVar) {
        qe0 qe0Var;
        String str = ay80Var.a;
        boolean z = ay80Var.c;
        List<a0b> list = ay80Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            cza czaVarA = list.get(i2).a(iotVar, xmtVar, w12Var);
            if (czaVarA != null) {
                arrayList.add(czaVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                qe0Var = null;
                break;
            }
            a0b a0bVar = list.get(i);
            if (a0bVar instanceof qe0) {
                qe0Var = (qe0) a0bVar;
                break;
            }
            i++;
        }
        this(iotVar, w12Var, str, z, arrayList, qe0Var);
    }
}
