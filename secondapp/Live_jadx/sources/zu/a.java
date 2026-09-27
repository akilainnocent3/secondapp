package zu;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final AtomicReference<m<T>> f162476a;

    public a(@oy.l m<? extends T> sequence) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        this.f162476a = new AtomicReference<>(sequence);
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        m<T> andSet = this.f162476a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
