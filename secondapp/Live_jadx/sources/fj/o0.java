package fj;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
@yi.a
@qj.f("Use GraphBuilder to create a real instance")
public interface o0<N> extends y<N> {
    @Override // fj.y, fj.v1, fj.c2
    /* bridge */ /* synthetic */ Iterable a(Object node);

    @Override // fj.y, fj.v1, fj.c2
    Set<N> a(N node);

    @Override // fj.y, fj.p1, fj.c2
    /* bridge */ /* synthetic */ Iterable b(Object node);

    @Override // fj.y, fj.p1, fj.c2
    Set<N> b(N node);

    @Override // fj.y, fj.c2
    boolean c();

    @Override // fj.y, fj.c2
    boolean d(i0<N> endpoints);

    @Override // fj.y, fj.c2
    Set<N> e(N node);

    boolean equals(@zq.a Object object);

    @Override // fj.y, fj.c2
    Set<N> f();

    @Override // fj.y
    int g(N node);

    @Override // fj.y
    Set<i0<N>> h();

    int hashCode();

    @Override // fj.y, fj.c2
    boolean i(N nodeU, N nodeV);

    @Override // fj.y
    int j(N node);

    @Override // fj.y, fj.c2
    g0<N> k();

    @Override // fj.y
    int l(N node);

    @Override // fj.y, fj.c2
    boolean m();

    @Override // fj.y, fj.c2
    Set<i0<N>> n(N node);

    @Override // fj.y, fj.c2
    g0<N> q();
}
