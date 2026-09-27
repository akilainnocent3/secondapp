package com.yandex.div.core.util;

import es.a;
import f0.m3;
import java.util.Iterator;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class SparseArrayIterator<T> implements Iterator<T>, a {

    @l
    private final m3<T> array;
    private int index;

    public SparseArrayIterator(@l m3<T> m3Var) {
        this.array = m3Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.y() > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        m3<T> m3Var = this.array;
        int i10 = this.index;
        this.index = i10 + 1;
        return m3Var.z(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
