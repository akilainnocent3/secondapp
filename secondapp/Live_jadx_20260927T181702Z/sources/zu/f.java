package zu;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class f<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, Boolean> f162489b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162491c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f162492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f<T> f162493e;

        public a(f<T> fVar) {
            this.f162493e = fVar;
            this.f162490b = fVar.f162488a.iterator();
        }

        private final void a() {
            while (this.f162490b.hasNext()) {
                T next = this.f162490b.next();
                if (!((Boolean) this.f162493e.f162489b.invoke(next)).booleanValue()) {
                    this.f162492d = next;
                    this.f162491c = 1;
                    return;
                }
            }
            this.f162491c = 0;
        }

        public final int b() {
            return this.f162491c;
        }

        public final Iterator<T> d() {
            return this.f162490b;
        }

        public final T e() {
            return this.f162492d;
        }

        public final void f(int i10) {
            this.f162491c = i10;
        }

        public final void g(T t10) {
            this.f162492d = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f162491c == -1) {
                a();
            }
            return this.f162491c == 1 || this.f162490b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f162491c == -1) {
                a();
            }
            if (this.f162491c != 1) {
                return this.f162490b.next();
            }
            T t10 = this.f162492d;
            this.f162492d = null;
            this.f162491c = 0;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@oy.l m<? extends T> sequence, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        this.f162488a = sequence;
        this.f162489b = predicate;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
