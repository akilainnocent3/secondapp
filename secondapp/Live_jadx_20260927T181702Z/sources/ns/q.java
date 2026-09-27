package ns;

import dr.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface q<T, V> extends o<V>, ds.l<T, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T, V> extends o.c<V>, ds.l<T, V> {
    }

    V get(T t10);

    @l1(version = "1.1")
    @oy.m
    Object getDelegate(T t10);

    @Override // ns.o
    @oy.l
    a<T, V> getGetter();
}
