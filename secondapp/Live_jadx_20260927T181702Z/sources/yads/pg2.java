package yads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pg2 implements og2, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153936b;

    public pg2(List list) {
        this.f153936b = list;
    }

    @Override // yads.og2
    public final boolean apply(Object obj) {
        for (int i10 = 0; i10 < this.f153936b.size(); i10++) {
            if (!((og2) this.f153936b.get(i10)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pg2) {
            return this.f153936b.equals(((pg2) obj).f153936b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f153936b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f153936b;
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(fw.b.f85380g);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
