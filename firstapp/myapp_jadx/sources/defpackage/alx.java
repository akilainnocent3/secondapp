package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class alx implements w7l, c8l {
    public final a a = new a();

    public static class a {
        public final ArrayList a = new ArrayList();

        public final void a(alx alxVar, int i, int i2) {
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c8l) arrayList.get(size)).b(alxVar, i, i2);
            }
        }

        public final void b(alx alxVar, int i, int i2) {
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c8l) arrayList.get(size)).g(alxVar, i, i2);
            }
        }
    }

    @Override // defpackage.w7l
    public final int a() {
        int iA = 0;
        for (int i = 0; i < h(); i++) {
            iA += f(i).a();
        }
        return iA;
    }

    @Override // defpackage.w7l
    public final void c(c8l c8lVar) {
        a aVar = this.a;
        synchronized (aVar.a) {
            try {
                if (aVar.a.contains(c8lVar)) {
                    throw new IllegalStateException("Observer " + c8lVar + " is already registered.");
                }
                aVar.a.add(c8lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w7l
    public final int d(y2p y2pVar) {
        int iA = 0;
        for (int i = 0; i < h(); i++) {
            w7l w7lVarF = f(i);
            int iD = w7lVarF.d(y2pVar);
            if (iD >= 0) {
                return iD + iA;
            }
            iA += w7lVarF.a();
        }
        return -1;
    }

    @Override // defpackage.w7l
    public final void e(c8l c8lVar) {
        a aVar = this.a;
        synchronized (aVar.a) {
            aVar.a.remove(aVar.a.indexOf(c8lVar));
        }
    }

    public abstract w7l f(int i);

    @Override // defpackage.w7l
    public final e64 getItem(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < h()) {
            w7l w7lVarF = f(i2);
            int iA = w7lVarF.a() + i3;
            if (iA > i) {
                return w7lVarF.getItem(i - i3);
            }
            i2++;
            i3 = iA;
        }
        StringBuilder sbA = efe0.a(i, "Wanted item at ", " but there are only ");
        sbA.append(a());
        sbA.append(" items");
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public abstract int h();

    public final int i(w7l w7lVar) {
        int iJ = j(w7lVar);
        int iA = 0;
        for (int i = 0; i < iJ; i++) {
            iA += f(i).a();
        }
        return iA;
    }

    public abstract int j(w7l w7lVar);

    public final void k(int i, int i2) {
        this.a.a(this, i, i2);
    }

    public final void l(int i, int i2) {
        this.a.b(this, i, i2);
    }
}
