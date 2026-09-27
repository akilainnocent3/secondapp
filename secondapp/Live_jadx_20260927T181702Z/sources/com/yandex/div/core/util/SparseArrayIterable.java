package com.yandex.div.core.util;

import es.a;
import f0.m3;
import java.util.Iterator;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, a {

    @l
    private final m3<T> array;

    public SparseArrayIterable(@l m3<T> m3Var) {
        this.array = m3Var;
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.array);
    }
}
