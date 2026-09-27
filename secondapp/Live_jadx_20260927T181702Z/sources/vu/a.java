package vu;

import java.util.Iterator;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a<K, V> implements Iterable<V>, es.a {

    /* JADX INFO: renamed from: vu.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractC1492a<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final ns.d<? extends K> f141594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f141595b;

        public AbstractC1492a(@oy.l ns.d<? extends K> key, int i10) {
            m0.p(key, "key");
            this.f141594a = key;
            this.f141595b = i10;
        }

        @oy.m
        public final T a(@oy.l a<K, V> thisRef) {
            m0.p(thisRef, "thisRef");
            return thisRef.d().get(this.f141595b);
        }
    }

    @oy.l
    public abstract c<V> d();

    @oy.l
    public abstract s<K, V> e();

    public abstract void f(@oy.l ns.d<? extends K> dVar, @oy.l V v10);

    public final boolean isEmpty() {
        return d().d() == 0;
    }

    @Override // java.lang.Iterable
    @oy.l
    public final Iterator<V> iterator() {
        return d().iterator();
    }
}
