package fr;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class j0 extends i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f85118b;

        public a(Enumeration<T> enumeration) {
            this.f85118b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f85118b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f85118b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @oy.l
    public static <T> Iterator<T> h0(@oy.l Enumeration<T> enumeration) {
        kotlin.jvm.internal.m0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
