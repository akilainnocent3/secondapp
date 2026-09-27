package cj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public interface x<K, V> extends Map<K, V> {
    @qj.a
    @zq.a
    V j0(@n9 K key, @n9 V value);

    @qj.a
    @zq.a
    V put(@n9 K key, @n9 V value);

    void putAll(Map<? extends K, ? extends V> map);

    /* bridge */ /* synthetic */ Collection values();

    Set<V> values();

    x<V, K> z0();
}
