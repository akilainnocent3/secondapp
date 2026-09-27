package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3 f149784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f149785b;

    public gu2(im3 im3Var, xy xyVar) {
        this.f149784a = im3Var;
        this.f149785b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        return kotlin.jvm.internal.m0.g(this.f149784a, gu2Var.f149784a) && this.f149785b == gu2Var.f149785b;
    }

    public final int hashCode() {
        return this.f149785b.hashCode() + (this.f149784a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f149784a + ", configurationSource=" + this.f149785b + gi.j.f86771d;
    }
}
