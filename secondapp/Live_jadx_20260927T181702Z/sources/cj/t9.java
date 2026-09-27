package cj;

import java.lang.Comparable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@qj.f("Use ImmutableRangeMap or TreeRangeMap")
@yi.c
@j4
public interface t9<K extends Comparable, V> {
    void b(r9<K> range);

    void clear();

    r9<K> d();

    void e(r9<K> range, V value);

    boolean equals(@zq.a Object o10);

    Map<r9<K>, V> g();

    void h(r9<K> range, V value);

    int hashCode();

    @zq.a
    Map.Entry<r9<K>, V> i(K key);

    Map<r9<K>, V> j();

    t9<K, V> k(r9<K> range);

    @zq.a
    V l(K key);

    void m(t9<K, ? extends V> rangeMap);

    String toString();
}
