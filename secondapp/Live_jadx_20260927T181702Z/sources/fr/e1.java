package fr;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e1<T> implements Iterator<c1<? extends T>>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Iterator<T> f85106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85107c;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(@oy.l Iterator<? extends T> iterator) {
        kotlin.jvm.internal.m0.p(iterator, "iterator");
        this.f85106b = iterator;
    }

    @Override // java.util.Iterator
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c1<T> next() {
        int i10 = this.f85107c;
        this.f85107c = i10 + 1;
        if (i10 < 0) {
            h0.b0();
        }
        return new c1<>(i10, this.f85106b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85106b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
