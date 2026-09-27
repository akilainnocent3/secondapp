package cj;

import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@qj.f("Use ImmutableRangeSet or TreeRangeSet")
@yi.c
@j4
public interface u9<C extends Comparable> {
    boolean a(C value);

    void b(r9<C> range);

    void clear();

    r9<C> d();

    boolean equals(@zq.a Object obj);

    u9<C> g();

    boolean h(r9<C> otherRange);

    int hashCode();

    boolean i(u9<C> other);

    boolean isEmpty();

    void j(r9<C> range);

    void k(Iterable<r9<C>> ranges);

    @zq.a
    r9<C> l(C value);

    boolean m(Iterable<r9<C>> other);

    boolean n(r9<C> otherRange);

    Set<r9<C>> o();

    Set<r9<C>> p();

    u9<C> q(r9<C> view);

    void r(Iterable<r9<C>> ranges);

    void s(u9<C> other);

    void t(u9<C> other);

    String toString();
}
