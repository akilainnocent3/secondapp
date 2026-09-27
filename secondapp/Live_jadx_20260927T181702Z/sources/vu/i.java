package vu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final i f141614b = new i();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator, es.a {
        @Override // java.util.Iterator
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i() {
        super(null);
    }

    @Override // vu.c
    public int d() {
        return 0;
    }

    @Override // vu.c
    @oy.m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // vu.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(int i10, @oy.l Void value) {
        m0.p(value, "value");
        throw new IllegalStateException();
    }

    @Override // vu.c, java.lang.Iterable
    @oy.l
    public Iterator iterator() {
        return new a();
    }
}
