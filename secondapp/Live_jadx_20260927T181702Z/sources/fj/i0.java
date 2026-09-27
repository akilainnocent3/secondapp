package fj;

import cj.a8;
import cj.gc;
import com.ironsource.C4235d4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
@qj.j(containerOf = {"N"})
@yi.a
public abstract class i0<N> implements Iterable<N> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f84597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f84598c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<N> extends i0<N> {
        @Override // fj.i0
        public boolean d() {
            return true;
        }

        @Override // fj.i0
        public boolean equals(@zq.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return d() == i0Var.d() && l().equals(i0Var.l()) && m().equals(i0Var.m());
        }

        @Override // fj.i0
        public int hashCode() {
            return zi.f0.b(l(), m());
        }

        @Override // fj.i0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // fj.i0
        public N l() {
            return f();
        }

        @Override // fj.i0
        public N m() {
            return g();
        }

        public String toString() {
            return "<" + l() + " -> " + m() + ">";
        }

        public b(N source, N target) {
            super(source, target);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<N> extends i0<N> {
        @Override // fj.i0
        public boolean d() {
            return false;
        }

        @Override // fj.i0
        public boolean equals(@zq.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            if (d() != i0Var.d()) {
                return false;
            }
            if (f().equals(i0Var.f())) {
                return g().equals(i0Var.g());
            }
            return f().equals(i0Var.g()) && g().equals(i0Var.f());
        }

        @Override // fj.i0
        public int hashCode() {
            return f().hashCode() + g().hashCode();
        }

        @Override // fj.i0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // fj.i0
        public N l() {
            throw new UnsupportedOperationException(r0.f84639o);
        }

        @Override // fj.i0
        public N m() {
            throw new UnsupportedOperationException(r0.f84639o);
        }

        public String toString() {
            return C4235d4.j.f61460d + f() + ", " + g() + C4235d4.j.f61462e;
        }

        public c(N nodeU, N nodeV) {
            super(nodeU, nodeV);
        }
    }

    public static <N> i0<N> h(o0<?> graph, N nodeU, N nodeV) {
        return graph.c() ? j(nodeU, nodeV) : n(nodeU, nodeV);
    }

    public static <N> i0<N> i(l1<?, ?> network, N nodeU, N nodeV) {
        return network.c() ? j(nodeU, nodeV) : n(nodeU, nodeV);
    }

    public static <N> i0<N> j(N source, N target) {
        return new b(source, target);
    }

    public static <N> i0<N> n(N nodeU, N nodeV) {
        return new c(nodeV, nodeU);
    }

    public final N a(N node) {
        if (node.equals(this.f84597b)) {
            return this.f84598c;
        }
        if (node.equals(this.f84598c)) {
            return this.f84597b;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + node);
    }

    public abstract boolean d();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final gc<N> iterator() {
        return a8.A(this.f84597b, this.f84598c);
    }

    public abstract boolean equals(@zq.a Object obj);

    public final N f() {
        return this.f84597b;
    }

    public final N g() {
        return this.f84598c;
    }

    public abstract int hashCode();

    public abstract N l();

    public abstract N m();

    public i0(N n10, N n11) {
        this.f84597b = (N) zi.l0.E(n10);
        this.f84598c = (N) zi.l0.E(n11);
    }
}
