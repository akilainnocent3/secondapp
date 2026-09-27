package zu;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c<T, K> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, K> f162482b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@oy.l m<? extends T> source, @oy.l ds.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(keySelector, "keySelector");
        this.f162481a = source;
        this.f162482b = keySelector;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new b(this.f162481a.iterator(), this.f162482b);
    }
}
