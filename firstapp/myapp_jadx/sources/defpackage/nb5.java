package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nb5<T> extends r3<T> {
    public final T[] c;

    /* JADX WARN: Multi-variable type inference failed */
    public nb5(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            lrh0.a();
            return null;
        }
        int i = this.a - 1;
        this.a = i;
        return this.c[i];
    }
}
