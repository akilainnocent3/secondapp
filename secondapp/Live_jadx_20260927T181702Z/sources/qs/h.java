package qs;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n73#2,2:97\n1#3:99\n*S KotlinDebug\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n*L\n90#1:97,2\n90#1:99\n*E\n"})
public final class h<V> extends a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ds.l<Class<?>, V> f122633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ConcurrentHashMap<Class<?>, V> f122634b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@oy.l ds.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.m0.p(compute, "compute");
        this.f122633a = compute;
        this.f122634b = new ConcurrentHashMap<>();
    }

    @Override // qs.a
    public void a() {
        this.f122634b.clear();
    }

    @Override // qs.a
    public V b(@oy.l Class<?> key) {
        kotlin.jvm.internal.m0.p(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f122634b;
        V v10 = (V) concurrentHashMap.get(key);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = this.f122633a.invoke(key);
        V v11 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v11 == null ? vInvoke : v11;
    }
}
