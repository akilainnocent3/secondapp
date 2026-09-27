package fj;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
@yi.a
public interface c2<N, V> extends y<N> {
    @zq.a
    V B(i0<N> endpoints, @zq.a V defaultValue);

    @zq.a
    V F(N nodeU, N nodeV, @zq.a V defaultValue);

    @Override // fj.y, fj.v1, fj.c2
    /* bridge */ /* synthetic */ Iterable a(Object node);

    Set<N> a(N node);

    @Override // fj.y, fj.p1, fj.c2
    /* bridge */ /* synthetic */ Iterable b(Object node);

    Set<N> b(N node);

    boolean c();

    boolean d(i0<N> endpoints);

    Set<N> e(N node);

    boolean equals(@zq.a Object object);

    Set<N> f();

    @Override // fj.y
    int g(N node);

    @Override // fj.y
    Set<i0<N>> h();

    int hashCode();

    boolean i(N nodeU, N nodeV);

    @Override // fj.y
    int j(N node);

    g0<N> k();

    @Override // fj.y
    int l(N node);

    boolean m();

    Set<i0<N>> n(N node);

    g0<N> q();

    o0<N> s();
}
