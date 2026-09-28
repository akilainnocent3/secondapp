package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ral extends x6j0 {
    @Override // defpackage.x6j0, defpackage.smd
    public final void a(smd smdVar) {
        zmd zmdVar = this.h;
        if (zmdVar.c && !zmdVar.j) {
            zmdVar.d((int) ((((zmd) zmdVar.l.get(0)).g * ((qal) this.b).v0) + 0.5f));
        }
    }

    @Override // defpackage.x6j0
    public final void d() {
        ixa ixaVar = this.b;
        qal qalVar = (qal) ixaVar;
        int i = qalVar.w0;
        int i2 = qalVar.x0;
        int i3 = qalVar.z0;
        zmd zmdVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                zmdVar.l.add(ixaVar.W.d.h);
                this.b.W.d.h.k.add(zmdVar);
                zmdVar.f = i;
            } else if (i2 != -1) {
                zmdVar.l.add(ixaVar.W.d.i);
                this.b.W.d.i.k.add(zmdVar);
                zmdVar.f = -i2;
            } else {
                zmdVar.b = true;
                zmdVar.l.add(ixaVar.W.d.i);
                this.b.W.d.i.k.add(zmdVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            zmdVar.l.add(ixaVar.W.e.h);
            this.b.W.e.h.k.add(zmdVar);
            zmdVar.f = i;
        } else if (i2 != -1) {
            zmdVar.l.add(ixaVar.W.e.i);
            this.b.W.e.i.k.add(zmdVar);
            zmdVar.f = -i2;
        } else {
            zmdVar.b = true;
            zmdVar.l.add(ixaVar.W.e.i);
            this.b.W.e.i.k.add(zmdVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.x6j0
    public final void e() {
        ixa ixaVar = this.b;
        int i = ((qal) ixaVar).z0;
        zmd zmdVar = this.h;
        if (i == 1) {
            ixaVar.b0 = zmdVar.g;
        } else {
            ixaVar.c0 = zmdVar.g;
        }
    }

    @Override // defpackage.x6j0
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.x6j0
    public final boolean k() {
        return false;
    }

    public final void m(zmd zmdVar) {
        zmd zmdVar2 = this.h;
        zmdVar2.k.add(zmdVar);
        zmdVar.l.add(zmdVar2);
    }
}
