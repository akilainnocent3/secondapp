package zu;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s0<T, R> implements m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.p<Integer, T, R> f162619b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<R>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s0<T, R> f162622d;

        public a(s0<T, R> s0Var) {
            this.f162622d = s0Var;
            this.f162620b = s0Var.f162618a.iterator();
        }

        public final int a() {
            return this.f162621c;
        }

        public final Iterator<T> b() {
            return this.f162620b;
        }

        public final void d(int i10) {
            this.f162621c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f162620b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            ds.p pVar = this.f162622d.f162619b;
            int i10 = this.f162621c;
            this.f162621c = i10 + 1;
            if (i10 < 0) {
                fr.h0.b0();
            }
            return (R) pVar.invoke(Integer.valueOf(i10), this.f162620b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@oy.l m<? extends T> sequence, @oy.l ds.p<? super Integer, ? super T, ? extends R> transformer) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(transformer, "transformer");
        this.f162618a = sequence;
        this.f162619b = transformer;
    }

    @Override // zu.m
    @oy.l
    public Iterator<R> iterator() {
        return new a(this);
    }
}
