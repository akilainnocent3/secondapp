package fw;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n381#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Map<bw.f, Map<a<Object>, Object>> f85372a = z.a(16);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {
    }

    @oy.m
    public final <T> T a(@oy.l bw.f descriptor, @oy.l a<T> key) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(key, "key");
        Map<a<Object>, Object> map = this.f85372a.get(descriptor);
        T t10 = map != null ? (T) map.get(key) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @oy.l
    public final <T> T b(@oy.l bw.f descriptor, @oy.l a<T> key, @oy.l ds.a<? extends T> defaultValue) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        T t10 = (T) a(descriptor, key);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = defaultValue.invoke();
        c(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void c(@oy.l bw.f descriptor, @oy.l a<T> key, @oy.l T value) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        Map<bw.f, Map<a<Object>, Object>> map = this.f85372a;
        Map<a<Object>, Object> mapA = map.get(descriptor);
        if (mapA == null) {
            mapA = z.a(2);
            map.put(descriptor, mapA);
        }
        mapA.put(key, value);
    }
}
