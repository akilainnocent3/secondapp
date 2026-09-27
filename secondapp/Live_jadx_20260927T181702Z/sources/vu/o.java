package vu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class o<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final T f141623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141624c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f141625b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o<T> f141626c;

        public a(o<T> oVar) {
            this.f141626c = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f141625b;
        }

        @Override // java.util.Iterator
        @oy.l
        public T next() {
            if (!this.f141625b) {
                throw new NoSuchElementException();
            }
            this.f141625b = false;
            return this.f141626c.g();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@oy.l T value, int i10) {
        super(null);
        m0.p(value, "value");
        this.f141623b = value;
        this.f141624c = i10;
    }

    @Override // vu.c
    public int d() {
        return 1;
    }

    @Override // vu.c
    public void e(int i10, @oy.l T value) {
        m0.p(value, "value");
        throw new IllegalStateException();
    }

    public final int f() {
        return this.f141624c;
    }

    @oy.l
    public final T g() {
        return this.f141623b;
    }

    @Override // vu.c
    @oy.m
    public T get(int i10) {
        if (i10 == this.f141624c) {
            return this.f141623b;
        }
        return null;
    }

    @Override // vu.c, java.lang.Iterable
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
