package zi;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(serializable = true)
@qj.f("Use Optional.of(value) or Optional.absent()")
@k
public abstract class g0<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f161724b = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Iterable<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f161725b;

        /* JADX INFO: renamed from: zi.g0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1583a extends b<T> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<? extends g0<? extends T>> f161726d;

            public C1583a() {
                this.f161726d = (Iterator) l0.E(a.this.f161725b.iterator());
            }

            @Override // zi.b
            @zq.a
            public T a() {
                while (this.f161726d.hasNext()) {
                    g0<? extends T> next = this.f161726d.next();
                    if (next.j()) {
                        return next.i();
                    }
                }
                return b();
            }
        }

        public a(final Iterable val$optionals) {
            this.f161725b = val$optionals;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C1583a();
        }
    }

    public static <T> g0<T> d() {
        return zi.a.s();
    }

    public static <T> g0<T> h(@zq.a T nullableReference) {
        return nullableReference == null ? d() : new o0(nullableReference);
    }

    public static <T> g0<T> k(T reference) {
        return new o0(l0.E(reference));
    }

    public static <T> Iterable<T> p(final Iterable<? extends g0<? extends T>> optionals) {
        l0.E(optionals);
        return new a(optionals);
    }

    public abstract boolean equals(@zq.a Object object);

    public abstract Set<T> g();

    public abstract int hashCode();

    public abstract T i();

    public abstract boolean j();

    public abstract T l(T defaultValue);

    public abstract T m(u0<? extends T> supplier);

    public abstract g0<T> n(g0<? extends T> secondChoice);

    @zq.a
    public abstract T o();

    public abstract <V> g0<V> q(t<? super T, V> function);

    public abstract String toString();
}
