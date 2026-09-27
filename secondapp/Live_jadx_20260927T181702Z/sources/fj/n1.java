package fj;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public interface n1<N, E> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    N d(E edge);

    Set<E> e();

    @qj.a
    N f(E edge);

    Set<E> g();

    @qj.a
    @zq.a
    N h(E edge, boolean isSelfLoop);

    void i(E edge, N node);

    void j(E edge, N node, boolean isSelfLoop);

    Set<E> k();

    Set<E> l(N node);
}
