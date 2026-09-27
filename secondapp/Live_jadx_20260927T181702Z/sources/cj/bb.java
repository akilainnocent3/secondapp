package cj;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public interface bb<K, V> extends ma<K, V> {
    @zq.a
    Comparator<? super V> H();

    @Override // cj.ma, cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Collection a(@zq.a Object key);

    @Override // cj.ma, cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Set a(@zq.a Object key);

    @Override // cj.ma, cj.w8
    @qj.a
    SortedSet<V> a(@zq.a Object key);

    @Override // cj.ma, cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Collection b(@n9 Object key, Iterable values);

    @Override // cj.ma, cj.w8
    @qj.a
    /* bridge */ /* synthetic */ Set b(@n9 Object key, Iterable values);

    @Override // cj.ma, cj.w8
    @qj.a
    SortedSet<V> b(@n9 K key, Iterable<? extends V> values);

    @Override // cj.ma, cj.w8
    Map<K, Collection<V>> d();

    @Override // cj.ma, cj.w8
    /* bridge */ /* synthetic */ Collection get(@n9 Object key);

    @Override // cj.ma, cj.w8
    /* bridge */ /* synthetic */ Set get(@n9 Object key);

    @Override // cj.ma, cj.w8
    SortedSet<V> get(@n9 K key);
}
