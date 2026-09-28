package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ux80 implements jxz, u12.a, tmp {
    public final String b;
    public final boolean c;
    public final iot d;
    public final dy80 e;
    public boolean f;
    public final Path a = new Path();
    public final qna g = new qna();

    public ux80(iot iotVar, w12 w12Var, iy80 iy80Var) {
        this.b = iy80Var.a;
        this.c = iy80Var.d;
        this.d = iotVar;
        dy80 dy80Var = new dy80((List) iy80Var.c.b);
        this.e = dy80Var;
        w12Var.g(dy80Var);
        dy80Var.a(this);
    }

    @Override // u12.a
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            cza czaVar = (cza) arrayList2.get(i);
            if (czaVar instanceof ywg0) {
                ywg0 ywg0Var = (ywg0) czaVar;
                if (ywg0Var.c == oy80.a.a) {
                    this.g.a.add(ywg0Var);
                    ywg0Var.c(this);
                } else if (!(czaVar instanceof fy80)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    fy80 fy80Var = (fy80) czaVar;
                    fy80Var.h(this);
                    arrayList.add(fy80Var);
                }
            } else if (!(czaVar instanceof fy80)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                fy80 fy80Var2 = (fy80) czaVar;
                fy80Var2.h(this);
                arrayList.add(fy80Var2);
            }
            i++;
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
    }

    @Override // defpackage.jxz
    public final Path d() {
        boolean z = this.f;
        dy80 dy80Var = this.e;
        Path path = this.a;
        if (z && dy80Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path pathE = dy80Var.e();
        if (pathE == null) {
            return path;
        }
        path.set(pathE);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f = true;
        return path;
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        if (obj == vot.N) {
            this.e.j(cptVar);
        }
    }
}
