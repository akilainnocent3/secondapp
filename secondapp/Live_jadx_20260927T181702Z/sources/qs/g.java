package qs;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g<V> extends ClassValue<SoftReference<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final ds.l<Class<?>, V> f122632a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@oy.l ds.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.m0.p(compute, "compute");
        this.f122632a = compute;
    }

    @Override // java.lang.ClassValue
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(@oy.l Class<?> type) {
        kotlin.jvm.internal.m0.p(type, "type");
        return new SoftReference<>(this.f122632a.invoke(type));
    }

    @oy.l
    public final g<V> b() {
        return new g<>(this.f122632a);
    }
}
