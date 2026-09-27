package fj;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public abstract class c1<N> extends AbstractSet<i0<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f84556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y<N> f84557c;

    public c1(y<N> graph, N node) {
        this.f84557c = graph;
        this.f84556b = node;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zq.a Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f84557c.c()) {
            if (!i0Var.d()) {
                return false;
            }
            Object objL = i0Var.l();
            Object objM = i0Var.m();
            return (this.f84556b.equals(objL) && this.f84557c.a((Object) this.f84556b).contains(objM)) || (this.f84556b.equals(objM) && this.f84557c.b((Object) this.f84556b).contains(objL));
        }
        if (i0Var.d()) {
            return false;
        }
        Set<N> setE = this.f84557c.e(this.f84556b);
        Object objF = i0Var.f();
        Object objG = i0Var.g();
        return (this.f84556b.equals(objG) && setE.contains(objF)) || (this.f84556b.equals(objF) && setE.contains(objG));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@zq.a Object o10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f84557c.c() ? (this.f84557c.g(this.f84556b) + this.f84557c.l(this.f84556b)) - (this.f84557c.a((Object) this.f84556b).contains(this.f84556b) ? 1 : 0) : this.f84557c.e(this.f84556b).size();
    }
}
