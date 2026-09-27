package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ol1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl1 f153553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f153554b;

    public ol1(kl1 kl1Var, kl1 kl1Var2) {
        this.f153553a = kl1Var;
        this.f153554b = kl1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return kotlin.jvm.internal.m0.g(this.f153553a, ol1Var.f153553a) && kotlin.jvm.internal.m0.g(this.f153554b, ol1Var.f153554b);
    }

    public final int hashCode() {
        int iHashCode = this.f153553a.hashCode() * 31;
        kl1 kl1Var = this.f153554b;
        return iHashCode + (kl1Var == null ? 0 : kl1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.f153553a + ", fallback=" + this.f153554b + gi.j.f86771d;
    }
}
