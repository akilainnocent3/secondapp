package vu;

import java.util.Iterator;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c<T> implements Iterable<T>, es.a {
    public /* synthetic */ c(x xVar) {
        this();
    }

    public abstract int d();

    public abstract void e(int i10, @oy.l T t10);

    @oy.m
    public abstract T get(int i10);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public c() {
    }
}
