package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kq2 extends sa2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa2 f151657b;

    public kq2(sa2 sa2Var) {
        this.f151657b = (sa2) ng2.a(sa2Var);
    }

    @Override // yads.sa2
    public final sa2 a() {
        return this.f151657b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f151657b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq2) {
            return this.f151657b.equals(((kq2) obj).f151657b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f151657b.hashCode();
    }

    public final String toString() {
        return this.f151657b + ".reverse()";
    }
}
