package cj;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class d4<C extends Comparable> implements Comparable<d4<C>>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f23495c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f23496b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23497a;

        static {
            int[] iArr = new int[y.values().length];
            f23497a = iArr;
            try {
                iArr[y.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23497a[y.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d4<Comparable<?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23498d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f23499e = 0;

        public b() {
            super("");
        }

        @Override // cj.d4
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // cj.d4, java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(d4<Comparable<?>> o10) {
            return o10 == this ? 0 : 1;
        }

        @Override // cj.d4
        public void k(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // cj.d4
        public void l(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // cj.d4
        public Comparable<?> m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // cj.d4
        public Comparable<?> n(i4<Comparable<?>> domain) {
            return domain.i();
        }

        @Override // cj.d4
        public boolean o(Comparable<?> value) {
            return false;
        }

        @Override // cj.d4
        public Comparable<?> q(i4<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // cj.d4
        public y s() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // cj.d4
        public y t() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        @Override // cj.d4
        public d4<Comparable<?>> u(y boundType, i4<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // cj.d4
        public d4<Comparable<?>> v(y boundType, i4<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        public final Object x() {
            return f23498d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<C extends Comparable> extends d4<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f23500d = 0;

        public c(C endpoint) {
            super((Comparable) zi.l0.E(endpoint));
        }

        @Override // cj.d4, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((d4) that);
        }

        @Override // cj.d4
        public int hashCode() {
            return ~this.f23496b.hashCode();
        }

        @Override // cj.d4
        public d4<C> i(i4<C> domain) {
            Comparable comparableQ = q(domain);
            return comparableQ != null ? d4.h(comparableQ) : d4.d();
        }

        @Override // cj.d4
        public void k(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f23496b);
        }

        @Override // cj.d4
        public void l(StringBuilder sb2) {
            sb2.append(this.f23496b);
            sb2.append(fw.b.f85385l);
        }

        @Override // cj.d4
        public C n(i4<C> domain) {
            return this.f23496b;
        }

        @Override // cj.d4
        public boolean o(C value) {
            return r9.k(this.f23496b, value) < 0;
        }

        @Override // cj.d4
        @zq.a
        public C q(i4<C> i4Var) {
            return (C) i4Var.k(this.f23496b);
        }

        @Override // cj.d4
        public y s() {
            return y.OPEN;
        }

        @Override // cj.d4
        public y t() {
            return y.CLOSED;
        }

        public String toString() {
            return to.c.userBaseDel + this.f23496b + ce.a.f23003h;
        }

        @Override // cj.d4
        public d4<C> u(y boundType, i4<C> domain) {
            int i10 = a.f23497a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableK = domain.k(this.f23496b);
                return comparableK == null ? d4.g() : d4.h(comparableK);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // cj.d4
        public d4<C> v(y boundType, i4<C> domain) {
            int i10 = a.f23497a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableK = domain.k(this.f23496b);
            return comparableK == null ? d4.d() : d4.h(comparableK);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends d4<Comparable<?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f23501d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f23502e = 0;

        public d() {
            super("");
        }

        private Object x() {
            return f23501d;
        }

        @Override // cj.d4
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // cj.d4
        public d4<Comparable<?>> i(i4<Comparable<?>> domain) {
            try {
                return d4.h(domain.j());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // cj.d4, java.lang.Comparable
        /* JADX INFO: renamed from: j */
        public int compareTo(d4<Comparable<?>> o10) {
            return o10 == this ? 0 : -1;
        }

        @Override // cj.d4
        public void k(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // cj.d4
        public void l(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // cj.d4
        public Comparable<?> m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // cj.d4
        public Comparable<?> n(i4<Comparable<?>> domain) {
            throw new AssertionError();
        }

        @Override // cj.d4
        public boolean o(Comparable<?> value) {
            return true;
        }

        @Override // cj.d4
        public Comparable<?> q(i4<Comparable<?>> domain) {
            return domain.j();
        }

        @Override // cj.d4
        public y s() {
            throw new IllegalStateException();
        }

        @Override // cj.d4
        public y t() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        @Override // cj.d4
        public d4<Comparable<?>> u(y boundType, i4<Comparable<?>> domain) {
            throw new IllegalStateException();
        }

        @Override // cj.d4
        public d4<Comparable<?>> v(y boundType, i4<Comparable<?>> domain) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<C extends Comparable> extends d4<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f23503d = 0;

        public e(C endpoint) {
            super((Comparable) zi.l0.E(endpoint));
        }

        @Override // cj.d4, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.compareTo((d4) that);
        }

        @Override // cj.d4
        public int hashCode() {
            return this.f23496b.hashCode();
        }

        @Override // cj.d4
        public void k(StringBuilder sb2) {
            sb2.append(fw.b.f85384k);
            sb2.append(this.f23496b);
        }

        @Override // cj.d4
        public void l(StringBuilder sb2) {
            sb2.append(this.f23496b);
            sb2.append(')');
        }

        @Override // cj.d4
        @zq.a
        public C n(i4<C> i4Var) {
            return (C) i4Var.m(this.f23496b);
        }

        @Override // cj.d4
        public boolean o(C value) {
            return r9.k(this.f23496b, value) <= 0;
        }

        @Override // cj.d4
        public C q(i4<C> domain) {
            return this.f23496b;
        }

        @Override // cj.d4
        public y s() {
            return y.CLOSED;
        }

        @Override // cj.d4
        public y t() {
            return y.OPEN;
        }

        public String toString() {
            return ce.a.f23003h + this.f23496b + to.c.userBaseDel;
        }

        @Override // cj.d4
        public d4<C> u(y boundType, i4<C> domain) {
            int i10 = a.f23497a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparableM = domain.m(this.f23496b);
            return comparableM == null ? d4.g() : new c(comparableM);
        }

        @Override // cj.d4
        public d4<C> v(y boundType, i4<C> domain) {
            int i10 = a.f23497a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparableM = domain.m(this.f23496b);
                return comparableM == null ? d4.d() : new c(comparableM);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }
    }

    public d4(C endpoint) {
        this.f23496b = endpoint;
    }

    public static <C extends Comparable> d4<C> d() {
        return b.f23498d;
    }

    public static <C extends Comparable> d4<C> e(C endpoint) {
        return new c(endpoint);
    }

    public static <C extends Comparable> d4<C> g() {
        return d.f23501d;
    }

    public static <C extends Comparable> d4<C> h(C endpoint) {
        return new e(endpoint);
    }

    public boolean equals(@zq.a Object obj) {
        if (obj instanceof d4) {
            try {
                if (compareTo((d4) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j */
    public int compareTo(d4<C> that) {
        if (that == g()) {
            return 1;
        }
        if (that == d()) {
            return -1;
        }
        int iK = r9.k(this.f23496b, that.f23496b);
        return iK != 0 ? iK : Boolean.compare(this instanceof c, that instanceof c);
    }

    public abstract void k(StringBuilder sb2);

    public abstract void l(StringBuilder sb2);

    public C m() {
        return this.f23496b;
    }

    @zq.a
    public abstract C n(i4<C> domain);

    public abstract boolean o(C value);

    @zq.a
    public abstract C q(i4<C> domain);

    public abstract y s();

    public abstract y t();

    public abstract d4<C> u(y boundType, i4<C> domain);

    public abstract d4<C> v(y boundType, i4<C> domain);

    public d4<C> i(i4<C> domain) {
        return this;
    }
}
