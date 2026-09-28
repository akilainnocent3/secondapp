package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fch0 implements fv0<tsr> {
    public final tsr a;
    public final ArrayList<tsr> b = new ArrayList<>();
    public tsr c;

    public fch0(tsr tsrVar) {
        this.a = tsrVar;
        this.c = tsrVar;
    }

    @Override // defpackage.fv0
    public final tsr b() {
        return this.c;
    }

    @Override // defpackage.fv0
    public final void c(int i, int i2, int i3) {
        this.c.V(i, i2, i3);
    }

    @Override // defpackage.fv0
    public final void clear() {
        this.b.clear();
        this.c = this.a;
        this.a.b0();
    }

    @Override // defpackage.fv0
    public final void d(int i, int i2) {
        this.c.c0(i, i2);
    }

    @Override // defpackage.fv0
    public final void e(int i, tsr tsrVar) {
    }

    @Override // defpackage.fv0
    public final void f() {
        wgz wgzVar = this.a.C;
        if (wgzVar != null) {
            wgzVar.z();
        }
    }

    @Override // defpackage.fv0
    public final void g(int i, tsr tsrVar) {
        this.c.M(i, tsrVar);
    }

    @Override // defpackage.fv0
    public final void h(tsr tsrVar) {
        this.b.add(this.c);
        this.c = tsrVar;
    }

    @Override // defpackage.fv0
    public final void i() {
        this.c.l();
    }

    @Override // defpackage.fv0
    public final void j() {
        ArrayList<tsr> arrayList = this.b;
        this.c = arrayList.remove(arrayList.size() - 1);
    }
}
