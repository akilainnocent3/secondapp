package yads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f extends ja3 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148893c;

    public f(int i10, int i11) {
        ng2.b(i11, i10);
        this.f148892b = i10;
        this.f148893c = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f148893c < this.f148892b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f148893c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f148893c;
        this.f148893c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f148893c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f148893c - 1;
        this.f148893c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f148893c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
