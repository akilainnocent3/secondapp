package vu;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n<K, V, T extends V> extends a.AbstractC1492a<K, V, T> implements js.e<a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@oy.l ns.d<? extends K> key, int i10) {
        super(key, i10);
        m0.p(key, "key");
    }

    @Override // js.e
    @oy.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T getValue(@oy.l a<K, V> thisRef, @oy.l ns.o<?> property) {
        m0.p(thisRef, "thisRef");
        m0.p(property, "property");
        return a(thisRef);
    }
}
