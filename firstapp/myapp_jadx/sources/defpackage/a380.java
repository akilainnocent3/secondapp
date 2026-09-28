package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public final class a380 extends alx {
    public e64 b;
    public final ArrayList<w7l> c;
    public boolean d;

    public a380() {
        ArrayList arrayList = new ArrayList();
        this.c = new ArrayList<>();
        this.d = true;
        n(arrayList);
    }

    @Override // defpackage.c8l
    public final void b(alx alxVar, int i, int i2) {
        this.a.a(this, i(alxVar) + i, i2);
        q();
    }

    @Override // defpackage.alx
    public final w7l f(int i) {
        ArrayList<w7l> arrayList = this.c;
        if (i != arrayList.size()) {
            return arrayList.get(i);
        }
        e64 e64Var = this.b;
        if (e64Var != null && this.d) {
            return e64Var;
        }
        StringBuilder sbA = efe0.a(i, "Wanted group at position ", " but there are only ");
        sbA.append(h());
        sbA.append(" groups");
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // defpackage.c8l
    public final void g(alx alxVar, int i, int i2) {
        this.a.b(this, i(alxVar) + i, i2);
        q();
    }

    @Override // defpackage.alx
    public final int h() {
        return this.c.size() + ((this.b == null || !this.d) ? 0 : 1);
    }

    @Override // defpackage.alx
    public final int j(w7l w7lVar) {
        ArrayList<w7l> arrayList = this.c;
        int iIndexOf = arrayList.indexOf(w7lVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        int size = arrayList.size();
        e64 e64Var = this.b;
        if (e64Var != null && this.d && e64Var == w7lVar) {
            return size;
        }
        return -1;
    }

    public final void m(w7l w7lVar) {
        ArrayList<w7l> arrayList = this.c;
        int iA = j8l.a(arrayList);
        arrayList.add(w7lVar);
        k(iA, 1);
        q();
    }

    public final void n(Collection<? extends w7l> collection) {
        ArrayList arrayList = (ArrayList) collection;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w7l) obj).c(this);
        }
        ArrayList<w7l> arrayList2 = this.c;
        int iA = j8l.a(arrayList2);
        arrayList2.addAll(collection);
        k(iA, j8l.a(collection));
        q();
    }

    public final void o() {
        ArrayList<w7l> arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((w7l) obj).e(this);
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            w7l w7lVar = (w7l) obj2;
            int i3 = i(w7lVar);
            arrayList.remove(w7lVar);
            l(i3, w7lVar.a());
        }
        q();
    }

    public final int p() {
        e64 e64Var = this.b;
        if (e64Var == null || !this.d) {
            return 0;
        }
        e64Var.getClass();
        return 1;
    }

    public final void q() {
        ArrayList<w7l> arrayList = this.c;
        if (arrayList.isEmpty() || j8l.a(arrayList) == 0) {
            if (this.d) {
                return;
            }
            this.d = true;
            k(0, 0);
            k(j8l.a(arrayList), p());
            return;
        }
        if (this.d) {
            return;
        }
        this.d = true;
        k(0, 0);
        k(j8l.a(arrayList), p());
    }

    public final void r() {
        if (this.b == null) {
            return;
        }
        int iP = p();
        this.b = null;
        int iP2 = p();
        ArrayList<w7l> arrayList = this.c;
        if (iP > 0) {
            l(j8l.a(arrayList), iP);
        }
        if (iP2 > 0) {
            k(j8l.a(arrayList), iP2);
        }
    }
}
