package fj;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
@yi.a
@qj.f("Use NetworkBuilder to create a real instance")
public interface l1<N, E> extends v1<N>, p1<N> {
    Set<E> A(i0<N> endpoints);

    Set<E> C(N node);

    Set<E> D(E edge);

    boolean E();

    @zq.a
    E G(N nodeU, N nodeV);

    i0<N> I(E edge);

    @zq.a
    E J(i0<N> endpoints);

    @Override // fj.v1, fj.c2
    /* bridge */ /* synthetic */ Iterable a(Object node);

    @Override // fj.v1, fj.c2
    Set<N> a(N node);

    /* bridge */ /* synthetic */ Iterable b(Object node);

    @Override // fj.p1, fj.c2
    Set<N> b(N node);

    boolean c();

    boolean d(i0<N> endpoints);

    Set<N> e(N node);

    boolean equals(@zq.a Object object);

    Set<N> f();

    int g(N node);

    Set<E> h();

    int hashCode();

    boolean i(N nodeU, N nodeV);

    int j(N node);

    g0<N> k();

    int l(N node);

    boolean m();

    Set<E> n(N node);

    o0<N> s();

    Set<E> u(N nodeU, N nodeV);

    g0<E> x();

    Set<E> y(N node);
}
