package cj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@j4
@yi.b
@qj.f("Use Maps.difference")
public interface k8<K, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @qj.f("Use Maps.difference")
    public interface a<V> {
        @n9
        V a();

        @n9
        V b();

        boolean equals(@zq.a Object other);

        int hashCode();
    }

    Map<K, a<V>> a();

    Map<K, V> b();

    Map<K, V> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@zq.a Object object);

    int hashCode();
}
