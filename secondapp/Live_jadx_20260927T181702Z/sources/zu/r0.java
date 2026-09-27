package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class r0<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, Boolean> f162612b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162614c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f162615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<T> f162616e;

        public a(r0<T> r0Var) {
            this.f162616e = r0Var;
            this.f162613b = r0Var.f162611a.iterator();
        }

        private final void a() {
            if (this.f162613b.hasNext()) {
                T next = this.f162613b.next();
                if (((Boolean) this.f162616e.f162612b.invoke(next)).booleanValue()) {
                    this.f162614c = 1;
                    this.f162615d = next;
                    return;
                }
            }
            this.f162614c = 0;
        }

        public final Iterator<T> b() {
            return this.f162613b;
        }

        public final T d() {
            return this.f162615d;
        }

        public final int e() {
            return this.f162614c;
        }

        public final void f(T t10) {
            this.f162615d = t10;
        }

        public final void g(int i10) {
            this.f162614c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f162614c == -1) {
                a();
            }
            return this.f162614c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f162614c == -1) {
                a();
            }
            if (this.f162614c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f162615d;
            this.f162615d = null;
            this.f162614c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r0(@oy.l m<? extends T> sequence, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        this.f162611a = sequence;
        this.f162612b = predicate;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
