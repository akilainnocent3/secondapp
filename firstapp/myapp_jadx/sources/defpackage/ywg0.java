package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ywg0 implements cza, u12.a {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final oy80.a c;
    public final zwh d;
    public final zwh e;
    public final zwh f;

    public ywg0(w12 w12Var, oy80 oy80Var) {
        this.a = oy80Var.e;
        this.c = oy80Var.a;
        zwh zwhVarB = oy80Var.b.b();
        this.d = zwhVarB;
        zwh zwhVarB2 = oy80Var.c.b();
        this.e = zwhVarB2;
        zwh zwhVarB3 = oy80Var.d.b();
        this.f = zwhVarB3;
        w12Var.g(zwhVarB);
        w12Var.g(zwhVarB2);
        w12Var.g(zwhVarB3);
        zwhVarB.a(this);
        zwhVarB2.a(this);
        zwhVarB3.a(this);
    }

    @Override // u12.a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((u12.a) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(u12.a aVar) {
        this.b.add(aVar);
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
    }
}
