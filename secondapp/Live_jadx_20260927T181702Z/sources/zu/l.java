package zu;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l<T1, T2, V> implements m<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T1> f162579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final m<T2> f162580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.p<T1, T2, V> f162581c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<V>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T1> f162582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T2> f162583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<T1, T2, V> f162584d;

        public a(l<T1, T2, V> lVar) {
            this.f162584d = lVar;
            this.f162582b = lVar.f162579a.iterator();
            this.f162583c = lVar.f162580b.iterator();
        }

        public final Iterator<T1> a() {
            return this.f162582b;
        }

        public final Iterator<T2> b() {
            return this.f162583c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f162582b.hasNext() && this.f162583c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f162584d.f162581c.invoke(this.f162582b.next(), this.f162583c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@oy.l m<? extends T1> sequence1, @oy.l m<? extends T2> sequence2, @oy.l ds.p<? super T1, ? super T2, ? extends V> transform) {
        kotlin.jvm.internal.m0.p(sequence1, "sequence1");
        kotlin.jvm.internal.m0.p(sequence2, "sequence2");
        kotlin.jvm.internal.m0.p(transform, "transform");
        this.f162579a = sequence1;
        this.f162580b = sequence2;
        this.f162581c = transform;
    }

    @Override // zu.m
    @oy.l
    public Iterator<V> iterator() {
        return new a(this);
    }
}
