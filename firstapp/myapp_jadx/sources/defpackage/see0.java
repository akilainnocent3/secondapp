package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class see0 implements m4h {
    public final m4h a;
    public final ree0.a b;
    public final SparseArray<uee0> c = new SparseArray<>();
    public boolean d;

    public see0(m4h m4hVar, ree0.a aVar) {
        this.a = m4hVar;
        this.b = aVar;
    }

    @Override // defpackage.m4h
    public final void k(p480 p480Var) {
        this.a.k(p480Var);
    }

    @Override // defpackage.m4h
    public final void n() {
        this.a.n();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<uee0> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).i = true;
            i++;
        }
    }

    @Override // defpackage.m4h
    public final njg0 r(int i, int i2) {
        m4h m4hVar = this.a;
        if (i2 != 3) {
            this.d = true;
            return m4hVar.r(i, i2);
        }
        SparseArray<uee0> sparseArray = this.c;
        uee0 uee0Var = sparseArray.get(i);
        if (uee0Var != null) {
            return uee0Var;
        }
        uee0 uee0Var2 = new uee0(m4hVar.r(i, i2), this.b);
        sparseArray.put(i, uee0Var2);
        return uee0Var2;
    }
}
