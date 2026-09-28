package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e150<E> extends tcn<E> {
    public static final Object[] w;
    public static final e150<Object> y;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int i;
    public final transient int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        y = new e150<>(0, 0, 0, objArr, objArr);
    }

    public e150(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.i = i2;
        this.v = i3;
    }

    @Override // defpackage.jcn
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.v;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.jcn
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.jcn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iK = r58.k(obj);
                while (true) {
                    int i = iK & this.i;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iK = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jcn
    public final int d() {
        return this.v;
    }

    @Override // defpackage.jcn
    public final int e() {
        return 0;
    }

    @Override // defpackage.jcn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jcn
    /* JADX INFO: renamed from: h */
    public final lgh0 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.tcn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.tcn
    public final pcn<E> l() {
        return pcn.i(this.v, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }
}
