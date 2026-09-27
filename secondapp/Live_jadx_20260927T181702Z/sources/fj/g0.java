package fj;

import cj.m9;
import cj.n8;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
@qj.j
@yi.a
public final class g0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f84581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public final Comparator<T> f84582b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public g0(a type, @zq.a Comparator<T> comparator) {
        this.f84581a = (a) zi.l0.E(type);
        this.f84582b = comparator;
        zi.l0.g0((type == a.SORTED) == (comparator != null));
    }

    public static <S> g0<S> d() {
        return new g0<>(a.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> g0<S> e() {
        return new g0<>(a.SORTED, m9.E());
    }

    public static <S> g0<S> f(Comparator<S> comparator) {
        return new g0<>(a.SORTED, (Comparator) zi.l0.E(comparator));
    }

    public static <S> g0<S> g() {
        return new g0<>(a.STABLE, null);
    }

    public static <S> g0<S> i() {
        return new g0<>(a.UNORDERED, null);
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.f84582b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public <K extends T, V> Map<K, V> c(int expectedSize) {
        int iOrdinal = this.f84581a.ordinal();
        if (iOrdinal == 0) {
            return n8.a0(expectedSize);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return n8.e0(expectedSize);
        }
        if (iOrdinal == 3) {
            return n8.g0(b());
        }
        throw new AssertionError();
    }

    public boolean equals(@zq.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f84581a == g0Var.f84581a && zi.f0.a(this.f84582b, g0Var.f84582b);
    }

    public a h() {
        return this.f84581a;
    }

    public int hashCode() {
        return zi.f0.b(this.f84581a, this.f84582b);
    }

    public String toString() {
        zi.d0.b bVarF = zi.d0.c(this).f("type", this.f84581a);
        Comparator<T> comparator = this.f84582b;
        if (comparator != null) {
            bVarF.f("comparator", comparator);
        }
        return bVarF.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T1 extends T> g0<T1> a() {
        return this;
    }
}
