package fr;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d1<T> implements Iterable<c1<? extends T>>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.a<Iterator<T>> f85104b;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@oy.l ds.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.m0.p(iteratorFactory, "iteratorFactory");
        this.f85104b = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @oy.l
    public Iterator<c1<T>> iterator() {
        return new e1(this.f85104b.invoke());
    }
}
