package f0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f2<K, V> implements Map.Entry<K, V>, es.g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Object[] f81894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Object[] f81895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81896d;

    public f2(@oy.l Object[] keys, @oy.l Object[] values, int i10) {
        kotlin.jvm.internal.m0.p(keys, "keys");
        kotlin.jvm.internal.m0.p(values, "values");
        this.f81894b = keys;
        this.f81895c = values;
        this.f81896d = i10;
    }

    public final int a() {
        return this.f81896d;
    }

    @oy.l
    public final Object[] d() {
        return this.f81894b;
    }

    @oy.l
    public final Object[] f() {
        return this.f81895c;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.f81894b[this.f81896d];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.f81895c[this.f81896d];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        Object[] objArr = this.f81895c;
        int i10 = this.f81896d;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void e() {
    }
}
