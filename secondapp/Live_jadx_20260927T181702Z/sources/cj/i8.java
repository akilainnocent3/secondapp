package cj;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public interface i8<K, V> extends w8<K, V> {
    @Override // cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Collection a(@zq.a Object key);

    @Override // cj.w8
    @qj.a
    List<V> a(@zq.a Object key);

    @Override // cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Collection b(@n9 Object key, Iterable values);

    @Override // cj.w8
    @qj.a
    List<V> b(@n9 K key, Iterable<? extends V> values);

    @Override // cj.w8
    Map<K, Collection<V>> d();

    @Override // cj.w8
    boolean equals(@zq.a Object obj);

    @Override // cj.w8
    /* bridge */ /* synthetic */ Collection get(@n9 Object key);

    @Override // cj.w8
    List<V> get(@n9 K key);
}
