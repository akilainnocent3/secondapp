package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c3z<T> extends ncy<T> {
    public final mw0<T> w = new mw0<>();
    public transient a y;
    public transient a z;

    public static class a<K> extends ncy.a<K> {
        public final mw0<K> f;

        public a(c3z<K> c3zVar) {
            super(c3zVar);
            this.f = c3zVar.w;
        }

        @Override // ncy.a
        public final void a() {
            this.c = 0;
            this.a = this.b.a > 0;
        }

        @Override // ncy.a, java.util.Iterator
        public final K next() {
            if (!this.a) {
                lrh0.a();
                return null;
            }
            if (!this.e) {
                throw new qyj("#iterator() cannot be used nested.");
            }
            K k = this.f.get(this.c);
            int i = this.c + 1;
            this.c = i;
            this.a = i < this.b.a;
            return k;
        }

        @Override // ncy.a, java.util.Iterator
        public final void remove() {
            int i = this.c;
            if (i < 0) {
                ib5.a("next must be called before remove.");
                return;
            }
            int i2 = i - 1;
            this.c = i2;
            c3z c3zVar = (c3z) this.b;
            int iE = c3zVar.e(c3zVar.w.e(i2));
            if (iE < 0) {
                return;
            }
            T[] tArr = c3zVar.b;
            int i3 = c3zVar.f;
            int i4 = iE + 1;
            while (true) {
                int i5 = i4 & i3;
                T t = tArr[i5];
                if (t == null) {
                    tArr[iE] = null;
                    c3zVar.a--;
                    return;
                } else {
                    int iF = c3zVar.f(t);
                    if (((i5 - iF) & i3) > ((iE - iF) & i3)) {
                        tArr[iE] = t;
                        iE = i5;
                    }
                    i4 = i5 + 1;
                }
            }
        }
    }

    @Override // defpackage.ncy
    public final boolean add(T t) {
        if (!super.add(t)) {
            return false;
        }
        this.w.a(t);
        return true;
    }

    @Override // defpackage.ncy
    public final void b(int i) {
        this.w.clear();
        super.b(i);
    }

    @Override // defpackage.ncy
    public final void c(int i) {
        super.c(i);
        this.w.b(i);
    }

    @Override // defpackage.ncy
    public final void clear() {
        this.w.clear();
        super.clear();
    }

    @Override // defpackage.ncy
    public final boolean equals(Object obj) {
        if (obj instanceof ncy) {
            ncy ncyVar = (ncy) obj;
            if (ncyVar.a == this.a) {
                mw0<T> mw0Var = this.w;
                T[] tArr = mw0Var.a;
                int i = mw0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    T t = tArr[i2];
                    if (t != null && ncyVar.e(t) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ncy
    public final int hashCode() {
        int iHashCode = this.a;
        mw0<T> mw0Var = this.w;
        T[] tArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            if (t != null) {
                iHashCode = t.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    @Override // defpackage.ncy
    public final String j() {
        mw0<T> mw0Var = this.w;
        if (mw0Var.b == 0) {
            return "";
        }
        T[] tArr = mw0Var.a;
        j9e0 j9e0Var = new j9e0(32);
        T t = tArr[0];
        if (t == null) {
            j9e0Var.d();
        } else {
            j9e0Var.c(t.toString());
        }
        for (int i = 1; i < mw0Var.b; i++) {
            j9e0Var.c(", ");
            T t2 = tArr[i];
            if (t2 == null) {
                j9e0Var.d();
            } else {
                j9e0Var.c(t2.toString());
            }
        }
        return j9e0Var.toString();
    }

    @Override // defpackage.ncy, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final a<T> iterator() {
        if (this.y == null) {
            this.y = new a(this);
            this.z = new a(this);
        }
        a aVar = this.y;
        if (aVar.e) {
            this.z.a();
            a<T> aVar2 = this.z;
            aVar2.e = true;
            this.y.e = false;
            return aVar2;
        }
        aVar.a();
        a<T> aVar3 = this.y;
        aVar3.e = true;
        this.z.e = false;
        return aVar3;
    }

    @Override // defpackage.ncy
    public final String toString() {
        if (this.a == 0) {
            return "{}";
        }
        T[] tArr = this.w.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(tArr[0]);
        for (int i = 1; i < this.a; i++) {
            sb.append(", ");
            sb.append(tArr[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
