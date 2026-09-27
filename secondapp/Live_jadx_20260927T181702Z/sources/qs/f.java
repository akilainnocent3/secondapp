package qs;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ClassValueCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class f<V> extends a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public volatile g<V> f122631a;

    public f(@oy.l ds.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.m0.p(compute, "compute");
        this.f122631a = new g<>(compute);
    }

    @Override // qs.a
    public void a() {
        this.f122631a = this.f122631a.b();
    }

    @Override // qs.a
    public V b(@oy.l Class<?> key) {
        kotlin.jvm.internal.m0.p(key, "key");
        g<V> gVar = this.f122631a;
        V v10 = (V) ((SoftReference) gVar.get(key)).get();
        if (v10 != null) {
            return v10;
        }
        gVar.remove(key);
        V v11 = (V) ((SoftReference) gVar.get(key)).get();
        return v11 != null ? v11 : gVar.f122632a.invoke(key);
    }
}
