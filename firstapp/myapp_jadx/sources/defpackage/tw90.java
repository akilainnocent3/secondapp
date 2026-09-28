package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class tw90<E> extends tcn<E> {
    public final transient E d;

    public tw90(E e) {
        e.getClass();
        this.d = e;
    }

    @Override // defpackage.tcn, defpackage.jcn
    public final pcn<E> a() {
        return pcn.n(this.d);
    }

    @Override // defpackage.jcn
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.jcn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.jcn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jcn
    /* JADX INFO: renamed from: h */
    public final lgh0 iterator() {
        return new w3p(this.d);
    }

    @Override // defpackage.tcn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
