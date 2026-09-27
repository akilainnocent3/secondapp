package cj;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class y5<E> extends f5<E> implements Set<E> {
    @Override // cj.f5
    public boolean c2(Collection<?> collection) {
        return na.I(this, (Collection) zi.l0.E(collection));
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@zq.a Object object) {
        return object == this || g2().equals(object);
    }

    @Override // cj.f5, cj.w5
    public abstract Set<E> g2();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return g2().hashCode();
    }

    public boolean standardEquals(@zq.a Object object) {
        return na.g(this, object);
    }

    public int standardHashCode() {
        return na.k(this);
    }
}
