package zi;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public abstract class m<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends m<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f161751b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f161752c = 1;

        @Override // zi.m
        public boolean a(Object a10, Object b10) {
            return a10.equals(b10);
        }

        @Override // zi.m
        public int b(Object o10) {
            return o10.hashCode();
        }

        public final Object l() {
            return f161751b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<T> implements m0<T>, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f161753d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m<T> f161754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.a
        public final T f161755c;

        public c(m<T> equivalence, @zq.a T target) {
            this.f161754b = (m) l0.E(equivalence);
            this.f161755c = target;
        }

        @Override // zi.m0
        public boolean apply(@zq.a T input) {
            return this.f161754b.e(input, this.f161755c);
        }

        @Override // zi.m0
        public boolean equals(@zq.a Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f161754b.equals(cVar.f161754b) && f0.a(this.f161755c, cVar.f161755c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return f0.b(this.f161754b, this.f161755c);
        }

        public String toString() {
            return this.f161754b + ".equivalentTo(" + this.f161755c + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends m<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f161756b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f161757c = 1;

        private Object l() {
            return f161756b;
        }

        @Override // zi.m
        public boolean a(Object a10, Object b10) {
            return false;
        }

        @Override // zi.m
        public int b(Object o10) {
            return System.identityHashCode(o10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f161758d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m<? super T> f161759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @i0
        public final T f161760c;

        @i0
        public T d() {
            return this.f161760c;
        }

        public boolean equals(@zq.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f161759b.equals(eVar.f161759b)) {
                return this.f161759b.e(this.f161760c, eVar.f161760c);
            }
            return false;
        }

        public int hashCode() {
            return this.f161759b.g(this.f161760c);
        }

        public String toString() {
            return this.f161759b + ".wrap(" + this.f161760c + gi.j.f86771d;
        }

        public e(m<? super T> equivalence, @i0 T reference) {
            this.f161759b = (m) l0.E(equivalence);
            this.f161760c = reference;
        }
    }

    public static m<Object> d() {
        return b.f161751b;
    }

    public static m<Object> h() {
        return d.f161756b;
    }

    @qj.g
    public abstract boolean a(T a10, T b10);

    @qj.g
    public abstract int b(T t10);

    public final boolean e(@zq.a T a10, @zq.a T b10) {
        if (a10 == b10) {
            return true;
        }
        if (a10 == null || b10 == null) {
            return false;
        }
        return a(a10, b10);
    }

    public final m0<T> f(@zq.a T target) {
        return new c(this, target);
    }

    public final int g(@zq.a T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }

    public final <F> m<F> i(t<? super F, ? extends T> function) {
        return new u(function, this);
    }

    @yi.b(serializable = true)
    public final <S extends T> m<Iterable<S>> j() {
        return new h0(this);
    }

    public final <S extends T> e<S> k(@i0 S reference) {
        return new e<>(reference);
    }
}
