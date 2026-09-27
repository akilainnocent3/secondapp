package zu;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t0<T, R> implements m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, R> f162625b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<R>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t0<T, R> f162627c;

        public a(t0<T, R> t0Var) {
            this.f162627c = t0Var;
            this.f162626b = t0Var.f162624a.iterator();
        }

        public final Iterator<T> a() {
            return this.f162626b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f162626b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f162627c.f162625b.invoke(this.f162626b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@oy.l m<? extends T> sequence, @oy.l ds.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(transformer, "transformer");
        this.f162624a = sequence;
        this.f162625b = transformer;
    }

    @oy.l
    public final <E> m<E> e(@oy.l ds.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.m0.p(iterator, "iterator");
        return new i(this.f162624a, this.f162625b, iterator);
    }

    @Override // zu.m
    @oy.l
    public Iterator<R> iterator() {
        return new a(this);
    }
}
