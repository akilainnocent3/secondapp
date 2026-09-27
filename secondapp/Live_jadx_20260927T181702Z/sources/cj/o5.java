package cj;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class o5<E> extends m5<E> implements ListIterator<E> {
    @Override // cj.m5, cj.w5
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> h2();

    @Override // java.util.ListIterator
    public void add(@n9 E element) {
        h2().add(element);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return h2().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return h2().nextIndex();
    }

    @Override // java.util.ListIterator
    @qj.a
    @n9
    public E previous() {
        return h2().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return h2().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@n9 E element) {
        h2().set(element);
    }
}
