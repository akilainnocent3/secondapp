package ws;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface z extends b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<D extends z> {
        @oy.l
        a<D> a(@oy.l wt.f fVar);

        @oy.l
        a<D> b(@oy.l u uVar);

        @oy.m
        D build();

        @oy.l
        <V> a<D> c(@oy.l ws.a.InterfaceC1510a<V> interfaceC1510a, V v10);

        @oy.l
        a<D> d();

        @oy.l
        a<D> e(@oy.l f0 f0Var);

        @oy.l
        a<D> f(@oy.l ou.g0 g0Var);

        @oy.l
        a<D> g();

        @oy.l
        a<D> h(@oy.l xs.g gVar);

        @oy.l
        a<D> i(boolean z10);

        @oy.l
        a<D> j(@oy.l List<g1> list);

        @oy.l
        a<D> k(@oy.m b bVar);

        @oy.l
        a<D> l(@oy.l b.a aVar);

        @oy.l
        a<D> m(@oy.l m mVar);

        @oy.l
        a<D> n();

        @oy.l
        a<D> o(@oy.l List<k1> list);

        @oy.l
        a<D> p();

        @oy.l
        a<D> q(@oy.l ou.n1 n1Var);

        @oy.l
        a<D> r(@oy.m y0 y0Var);

        @oy.l
        a<D> s(@oy.m y0 y0Var);

        @oy.l
        a<D> t();
    }

    boolean B();

    boolean B0();

    boolean U();

    @Override // ws.b, ws.a, ws.m
    @oy.l
    z a();

    @Override // ws.n, ws.m
    @oy.l
    m b();

    @oy.m
    z c(@oy.l ou.p1 p1Var);

    @Override // ws.b, ws.a
    @oy.l
    Collection<? extends z> e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    @oy.l
    a<? extends z> o();

    @oy.m
    z v0();
}
