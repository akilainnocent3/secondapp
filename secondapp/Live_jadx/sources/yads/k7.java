package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p03 f151417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r03 f151418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f151419c;

    public k7(p03 p03Var, r03 r03Var, long j10) {
        this.f151417a = p03Var;
        this.f151418b = r03Var;
        this.f151419c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f151417a == k7Var.f151417a && this.f151418b == k7Var.f151418b && this.f151419c == k7Var.f151419c;
    }

    public final int hashCode() {
        p03 p03Var = this.f151417a;
        int iHashCode = (p03Var == null ? 0 : p03Var.hashCode()) * 31;
        r03 r03Var = this.f151418b;
        return f0.p.a(this.f151419c) + ((iHashCode + (r03Var != null ? r03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f151417a + ", visibility=" + this.f151418b + ", delay=" + this.f151419c + gi.j.f86771d;
    }
}
