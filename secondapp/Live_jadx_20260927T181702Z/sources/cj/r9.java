package cj;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@qj.j(containerOf = {"C"})
@j4
@yi.b
public final class r9<C extends Comparable> extends s9 implements zi.m0<C>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r9<Comparable> f24471d = new r9<>(d4.g(), d4.d());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f24472e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4<C> f24473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4<C> f24474c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24475a;

        static {
            int[] iArr = new int[y.values().length];
            f24475a = iArr;
            try {
                iArr[y.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24475a[y.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends m9<r9<?>> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m9<?> f24476d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f24477e = 0;

        @Override // cj.m9, java.util.Comparator
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public int compare(r9<?> left, r9<?> right) {
            return w3.n().i(left.f24473b, right.f24473b).i(left.f24474c, right.f24474c).m();
        }
    }

    public r9(d4<C> lowerBound, d4<C> upperBound) {
        this.f24473b = (d4) zi.l0.E(lowerBound);
        this.f24474c = (d4) zi.l0.E(upperBound);
        if (lowerBound.compareTo(upperBound) > 0 || lowerBound == d4.d() || upperBound == d4.g()) {
            throw new IllegalArgumentException("Invalid range: " + K(lowerBound, upperBound));
        }
    }

    public static <C extends Comparable<?>> r9<C> C(C lower, C upper) {
        return n(d4.e(lower), d4.h(upper));
    }

    public static <C extends Comparable<?>> r9<C> D(C lower, C upper) {
        return n(d4.e(lower), d4.e(upper));
    }

    public static <C extends Comparable<?>> r9<C> E(C lower, y lowerType, C upper, y upperType) {
        zi.l0.E(lowerType);
        zi.l0.E(upperType);
        y yVar = y.OPEN;
        return n(lowerType == yVar ? d4.e(lower) : d4.h(lower), upperType == yVar ? d4.h(upper) : d4.e(upper));
    }

    public static <C extends Comparable<?>> m9<r9<C>> G() {
        return (m9<r9<C>>) b.f24476d;
    }

    public static <C extends Comparable<?>> r9<C> I(C value) {
        return i(value, value);
    }

    public static String K(d4<?> lowerBound, d4<?> upperBound) {
        StringBuilder sb2 = new StringBuilder(16);
        lowerBound.k(sb2);
        sb2.append("..");
        upperBound.l(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> r9<C> L(C endpoint, y boundType) {
        int i10 = a.f24475a[boundType.ordinal()];
        if (i10 == 1) {
            return y(endpoint);
        }
        if (i10 == 2) {
            return g(endpoint);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> r9<C> d() {
        return (r9<C>) f24471d;
    }

    public static <C extends Comparable<?>> r9<C> f(C endpoint) {
        return n(d4.h(endpoint), d4.d());
    }

    public static <C extends Comparable<?>> r9<C> g(C endpoint) {
        return n(d4.g(), d4.e(endpoint));
    }

    public static <C extends Comparable<?>> r9<C> i(C lower, C upper) {
        return n(d4.h(lower), d4.e(upper));
    }

    public static <C extends Comparable<?>> r9<C> j(C lower, C upper) {
        return n(d4.h(lower), d4.h(upper));
    }

    public static int k(Comparable left, Comparable right) {
        return left.compareTo(right);
    }

    public static <C extends Comparable<?>> r9<C> n(d4<C> lowerBound, d4<C> upperBound) {
        return new r9<>(lowerBound, upperBound);
    }

    public static <C extends Comparable<?>> r9<C> o(C endpoint, y boundType) {
        int i10 = a.f24475a[boundType.ordinal()];
        if (i10 == 1) {
            return s(endpoint);
        }
        if (i10 == 2) {
            return f(endpoint);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> r9<C> p(Iterable<C> values) {
        zi.l0.E(values);
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (m9.E().equals(comparator) || comparator == null) {
                return i((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = values.iterator();
        Comparable comparable = (Comparable) zi.l0.E(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) zi.l0.E(it.next());
            comparable = (Comparable) m9.E().B(comparable, comparable3);
            comparable2 = (Comparable) m9.E().x(comparable2, comparable3);
        }
        return i(comparable, comparable2);
    }

    public static <C extends Comparable<?>> r9<C> s(C endpoint) {
        return n(d4.e(endpoint), d4.d());
    }

    public static <C extends Comparable<?>> r9<C> y(C endpoint) {
        return n(d4.g(), d4.h(endpoint));
    }

    public y A() {
        return this.f24473b.s();
    }

    public C B() {
        return (C) this.f24473b.m();
    }

    public Object H() {
        return equals(f24471d) ? d() : this;
    }

    public r9<C> J(r9<C> other) {
        int iCompareTo = this.f24473b.compareTo(other.f24473b);
        int iCompareTo2 = this.f24474c.compareTo(other.f24474c);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return n(iCompareTo <= 0 ? this.f24473b : other.f24473b, iCompareTo2 >= 0 ? this.f24474c : other.f24474c);
        }
        return other;
    }

    public d4<C> M() {
        return this.f24474c;
    }

    public y N() {
        return this.f24474c.t();
    }

    public C O() {
        return (C) this.f24474c.m();
    }

    @Override // zi.m0
    @Deprecated
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean apply(C input) {
        return l(input);
    }

    @Override // zi.m0
    public boolean equals(@zq.a Object object) {
        if (object instanceof r9) {
            r9 r9Var = (r9) object;
            if (this.f24473b.equals(r9Var.f24473b) && this.f24474c.equals(r9Var.f24474c)) {
                return true;
            }
        }
        return false;
    }

    public r9<C> h(i4<C> domain) {
        zi.l0.E(domain);
        d4<C> d4VarI = this.f24473b.i(domain);
        d4<C> d4VarI2 = this.f24474c.i(domain);
        return (d4VarI == this.f24473b && d4VarI2 == this.f24474c) ? this : n(d4VarI, d4VarI2);
    }

    public int hashCode() {
        return (this.f24473b.hashCode() * 31) + this.f24474c.hashCode();
    }

    public boolean l(C value) {
        zi.l0.E(value);
        return this.f24473b.o(value) && !this.f24474c.o(value);
    }

    public boolean m(Iterable<? extends C> values) {
        if (z7.C(values)) {
            return true;
        }
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (m9.E().equals(comparator) || comparator == null) {
                return l((Comparable) sortedSet.first()) && l((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = values.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean q(r9<C> other) {
        return this.f24473b.compareTo(other.f24473b) <= 0 && this.f24474c.compareTo(other.f24474c) >= 0;
    }

    public r9<C> r(r9<C> otherRange) {
        if (this.f24473b.compareTo(otherRange.f24474c) >= 0 || otherRange.f24473b.compareTo(this.f24474c) >= 0) {
            boolean z10 = this.f24473b.compareTo(otherRange.f24473b) < 0;
            r9<C> r9Var = z10 ? this : otherRange;
            if (!z10) {
                otherRange = this;
            }
            return n(r9Var.f24474c, otherRange.f24473b);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + otherRange);
    }

    public boolean t() {
        return this.f24473b != d4.g();
    }

    public String toString() {
        return K(this.f24473b, this.f24474c);
    }

    public boolean u() {
        return this.f24474c != d4.d();
    }

    public r9<C> v(r9<C> connectedRange) {
        int iCompareTo = this.f24473b.compareTo(connectedRange.f24473b);
        int iCompareTo2 = this.f24474c.compareTo(connectedRange.f24474c);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return connectedRange;
        }
        d4<C> d4Var = iCompareTo >= 0 ? this.f24473b : connectedRange.f24473b;
        d4<C> d4Var2 = iCompareTo2 <= 0 ? this.f24474c : connectedRange.f24474c;
        zi.l0.y(d4Var.compareTo(d4Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, connectedRange);
        return n(d4Var, d4Var2);
    }

    public boolean w(r9<C> other) {
        return this.f24473b.compareTo(other.f24474c) <= 0 && other.f24473b.compareTo(this.f24474c) <= 0;
    }

    public boolean x() {
        return this.f24473b.equals(this.f24474c);
    }

    public d4<C> z() {
        return this.f24473b;
    }
}
