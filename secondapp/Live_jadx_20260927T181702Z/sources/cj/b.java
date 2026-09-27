package cj;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class b<E> extends hc<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23398c;

    public b(int size) {
        this(size, 0);
    }

    @n9
    public abstract E a(int index);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23398c < this.f23397b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23398c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @n9
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23398c;
        this.f23398c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23398c;
    }

    @Override // java.util.ListIterator
    @n9
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23398c - 1;
        this.f23398c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23398c - 1;
    }

    public b(int size, int position) {
        zi.l0.d0(position, size);
        this.f23397b = size;
        this.f23398c = position;
    }
}
