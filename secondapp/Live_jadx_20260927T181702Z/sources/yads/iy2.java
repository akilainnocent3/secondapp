package yads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class iy2 extends lx implements Set {
    public iy2(Set set, og2 og2Var) {
        super(set, og2Var);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return ly2.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return ly2.a(this);
    }
}
