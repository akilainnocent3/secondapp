package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gu90<E> extends s3<E> {
    public final E c;

    public gu90(E e, int i) {
        super(i, 1);
        this.c = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.a++;
            return this.c;
        }
        lrh0.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.a--;
            return this.c;
        }
        lrh0.a();
        return null;
    }
}
