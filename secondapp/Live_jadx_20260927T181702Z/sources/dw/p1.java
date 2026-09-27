package dw;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class p1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public volatile SoftReference<T> f79645a = new SoftReference<>(null);

    public final synchronized T a(@oy.l ds.a<? extends T> factory) {
        kotlin.jvm.internal.m0.p(factory, "factory");
        T t10 = this.f79645a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        this.f79645a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
