package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h<T> implements Iterator<T>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final T[] f102730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102731c;

    public h(@oy.l T[] array) {
        m0.p(array, "array");
        this.f102730b = array;
    }

    @oy.l
    public final T[] a() {
        return this.f102730b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102731c < this.f102730b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f102730b;
            int i10 = this.f102731c;
            this.f102731c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102731c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
