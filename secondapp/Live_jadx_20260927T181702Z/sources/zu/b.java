package zu;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b<T, K> extends fr.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Iterator<T> f162477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.l<T, K> f162478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final HashSet<K> f162479d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@oy.l Iterator<? extends T> source, @oy.l ds.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(keySelector, "keySelector");
        this.f162477b = source;
        this.f162478c = keySelector;
        this.f162479d = new HashSet<>();
    }

    @Override // fr.c
    public void computeNext() {
        while (this.f162477b.hasNext()) {
            T next = this.f162477b.next();
            if (this.f162479d.add(this.f162478c.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
