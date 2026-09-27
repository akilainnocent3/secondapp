package fj;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public abstract class u<N, E> implements n1<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<E, N> f84668a;

    public u(Map<E, N> incidentEdgeMap) {
        this.f84668a = (Map) zi.l0.E(incidentEdgeMap);
    }

    @Override // fj.n1
    public Set<N> b() {
        return a();
    }

    @Override // fj.n1
    public Set<N> c() {
        return a();
    }

    @Override // fj.n1
    public N d(E edge) {
        N n10 = this.f84668a.get(edge);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // fj.n1
    public Set<E> e() {
        return k();
    }

    @Override // fj.n1
    public N f(E edge) {
        N nRemove = this.f84668a.remove(edge);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // fj.n1
    public Set<E> g() {
        return k();
    }

    @Override // fj.n1
    @zq.a
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return f(edge);
    }

    @Override // fj.n1
    public void i(E edge, N node) {
        zi.l0.g0(this.f84668a.put(edge, node) == null);
    }

    @Override // fj.n1
    public void j(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        i(edge, node);
    }

    @Override // fj.n1
    public Set<E> k() {
        return Collections.unmodifiableSet(this.f84668a.keySet());
    }
}
