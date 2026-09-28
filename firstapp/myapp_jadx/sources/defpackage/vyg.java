package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class vyg extends alx {
    public boolean b;
    public final e64 c;
    public final ArrayList d = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public vyg(e64 e64Var, boolean z) {
        this.b = false;
        this.c = e64Var;
        ((wyg) e64Var).b(this);
        this.b = z;
    }

    @Override // defpackage.c8l
    public final void b(alx alxVar, int i, int i2) {
        if (n(alxVar)) {
            this.a.a(this, i(alxVar) + i, i2);
        }
    }

    @Override // defpackage.alx
    public final w7l f(int i) {
        if (i == 0) {
            return this.c;
        }
        return (w7l) this.d.get(i - 1);
    }

    @Override // defpackage.c8l
    public final void g(alx alxVar, int i, int i2) {
        if (n(alxVar)) {
            this.a.b(this, i(alxVar) + i, i2);
        }
    }

    @Override // defpackage.alx
    public final int h() {
        return (this.b ? this.d.size() : 0) + 1;
    }

    @Override // defpackage.alx
    public final int j(w7l w7lVar) {
        if (w7lVar == this.c) {
            return 0;
        }
        int iIndexOf = this.d.indexOf(w7lVar);
        if (iIndexOf >= 0) {
            return iIndexOf + 1;
        }
        return -1;
    }

    public final void m(w7l w7lVar) {
        boolean z = this.b;
        ArrayList arrayList = this.d;
        if (!z) {
            arrayList.add(w7lVar);
            return;
        }
        int iA = a();
        arrayList.add(w7lVar);
        k(iA, 1);
    }

    public final boolean n(alx alxVar) {
        return this.b || alxVar == this.c;
    }

    public final void o() {
        int iA = a();
        this.b = !this.b;
        int iA2 = a();
        if (iA > iA2) {
            l(iA2, iA - iA2);
        } else {
            k(iA, iA2 - iA);
        }
    }
}
