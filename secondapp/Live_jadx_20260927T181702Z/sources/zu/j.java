package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ds.a<T> f162516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, T> f162517b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f162518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162519c = -2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j<T> f162520d;

        public a(j<T> jVar) {
            this.f162520d = jVar;
        }

        private final void a() {
            T t10;
            if (this.f162519c == -2) {
                t10 = (T) this.f162520d.f162516a.invoke();
            } else {
                ds.l lVar = this.f162520d.f162517b;
                T t11 = this.f162518b;
                kotlin.jvm.internal.m0.m(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f162518b = t10;
            this.f162519c = t10 == null ? 0 : 1;
        }

        public final T b() {
            return this.f162518b;
        }

        public final int d() {
            return this.f162519c;
        }

        public final void e(T t10) {
            this.f162518b = t10;
        }

        public final void f(int i10) {
            this.f162519c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f162519c < 0) {
                a();
            }
            return this.f162519c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f162519c < 0) {
                a();
            }
            if (this.f162519c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f162518b;
            kotlin.jvm.internal.m0.n(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f162519c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@oy.l ds.a<? extends T> getInitialValue, @oy.l ds.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.m0.p(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.m0.p(getNextValue, "getNextValue");
        this.f162516a = getInitialValue;
        this.f162517b = getNextValue;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
