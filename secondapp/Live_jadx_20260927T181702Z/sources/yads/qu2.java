package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f154608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm0 f154609b;

    public qu2(rd rdVar, jm0 jm0Var) {
        this.f154608a = rdVar;
        this.f154609b = jm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu2)) {
            return false;
        }
        qu2 qu2Var = (qu2) obj;
        return kotlin.jvm.internal.m0.g(this.f154608a, qu2Var.f154608a) && kotlin.jvm.internal.m0.g(this.f154609b, qu2Var.f154609b);
    }

    public final int hashCode() {
        return this.f154609b.hashCode() + (this.f154608a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.f154608a + ", environmentConfiguration=" + this.f154609b + gi.j.f86771d;
    }
}
