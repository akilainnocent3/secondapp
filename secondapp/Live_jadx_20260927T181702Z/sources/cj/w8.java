package cj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@qj.f("Use ImmutableMultimap, HashMultimap, or another implementation")
@j4
public interface w8<K, V> {
    c9<K> R0();

    boolean R1(@zq.a @qj.c("K") Object key, @zq.a @qj.c(l3.a.X4) Object value);

    @qj.a
    Collection<V> a(@zq.a @qj.c("K") Object key);

    @qj.a
    Collection<V> b(@n9 K key, Iterable<? extends V> values);

    void clear();

    boolean containsKey(@zq.a @qj.c("K") Object key);

    boolean containsValue(@zq.a @qj.c(l3.a.X4) Object value);

    Map<K, Collection<V>> d();

    boolean equals(@zq.a Object obj);

    Collection<V> get(@n9 K key);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    @qj.a
    boolean l1(@n9 K key, Iterable<? extends V> values);

    Collection<Map.Entry<K, V>> m();

    @qj.a
    boolean o1(w8<? extends K, ? extends V> multimap);

    @qj.a
    boolean put(@n9 K key, @n9 V value);

    @qj.a
    boolean remove(@zq.a @qj.c("K") Object key, @zq.a @qj.c(l3.a.X4) Object value);

    int size();

    Collection<V> values();
}
