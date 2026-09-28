package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xil extends x6j0 {
    @Override // defpackage.x6j0, defpackage.smd
    public final void a(smd smdVar) {
        vx1 vx1Var = (vx1) this.b;
        int i = vx1Var.x0;
        zmd zmdVar = this.h;
        ArrayList arrayList = zmdVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((zmd) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            zmdVar.d(i3 + vx1Var.z0);
        } else {
            zmdVar.d(i2 + vx1Var.z0);
        }
    }

    @Override // defpackage.x6j0
    public final void d() {
        ixa ixaVar = this.b;
        if (ixaVar instanceof vx1) {
            zmd zmdVar = this.h;
            zmdVar.b = true;
            ArrayList arrayList = zmdVar.l;
            vx1 vx1Var = (vx1) ixaVar;
            int i = vx1Var.x0;
            boolean z = vx1Var.y0;
            int i2 = 0;
            if (i == 0) {
                zmdVar.e = zmd.a.d;
                while (i2 < vx1Var.w0) {
                    ixa ixaVar2 = vx1Var.v0[i2];
                    if (z || ixaVar2.j0 != 8) {
                        zmd zmdVar2 = ixaVar2.d.h;
                        zmdVar2.k.add(zmdVar);
                        arrayList.add(zmdVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                zmdVar.e = zmd.a.e;
                while (i2 < vx1Var.w0) {
                    ixa ixaVar3 = vx1Var.v0[i2];
                    if (z || ixaVar3.j0 != 8) {
                        zmd zmdVar3 = ixaVar3.d.i;
                        zmdVar3.k.add(zmdVar);
                        arrayList.add(zmdVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                zmdVar.e = zmd.a.f;
                while (i2 < vx1Var.w0) {
                    ixa ixaVar4 = vx1Var.v0[i2];
                    if (z || ixaVar4.j0 != 8) {
                        zmd zmdVar4 = ixaVar4.e.h;
                        zmdVar4.k.add(zmdVar);
                        arrayList.add(zmdVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            zmdVar.e = zmd.a.i;
            while (i2 < vx1Var.w0) {
                ixa ixaVar5 = vx1Var.v0[i2];
                if (z || ixaVar5.j0 != 8) {
                    zmd zmdVar5 = ixaVar5.e.i;
                    zmdVar5.k.add(zmdVar);
                    arrayList.add(zmdVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.x6j0
    public final void e() {
        ixa ixaVar = this.b;
        if (ixaVar instanceof vx1) {
            int i = ((vx1) ixaVar).x0;
            zmd zmdVar = this.h;
            if (i == 0 || i == 1) {
                ixaVar.b0 = zmdVar.g;
            } else {
                ixaVar.c0 = zmdVar.g;
            }
        }
    }

    @Override // defpackage.x6j0
    public final void f() {
        this.c = null;
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
