package fr;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n108#1:112,6\n*E\n"})
public final class s1<K, V> implements r1<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<K, V> f85149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.l<K, V> f85150c;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(@oy.l Map<K, V> map, @oy.l ds.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.m0.p(map, "map");
        kotlin.jvm.internal.m0.p(lVar, "default");
        this.f85149b = map;
        this.f85150c = lVar;
    }

    @oy.l
    public Set<Map.Entry<K, V>> a() {
        return o().entrySet();
    }

    @oy.l
    public Set<K> b() {
        return o().keySet();
    }

    @Override // java.util.Map
    public void clear() {
        o().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return o().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return o().containsValue(obj);
    }

    public int d() {
        return o().size();
    }

    @oy.l
    public Collection<V> e() {
        return o().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@oy.m Object obj) {
        return o().equals(obj);
    }

    @Override // java.util.Map
    @oy.m
    public V get(Object obj) {
        return o().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return o().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return o().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // fr.i1
    public V l0(K k10) {
        Map<K, V> mapO = o();
        V v10 = mapO.get(k10);
        return (v10 != null || mapO.containsKey(k10)) ? v10 : this.f85150c.invoke(k10);
    }

    @Override // fr.r1, fr.i1
    @oy.l
    public Map<K, V> o() {
        return this.f85149b;
    }

    @Override // java.util.Map
    @oy.m
    public V put(K k10, V v10) {
        return o().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(@oy.l Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.m0.p(from, "from");
        o().putAll(from);
    }

    @Override // java.util.Map
    @oy.m
    public V remove(Object obj) {
        return o().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    @oy.l
    public String toString() {
        return o().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return e();
    }
}
