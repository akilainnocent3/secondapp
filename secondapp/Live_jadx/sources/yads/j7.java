package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f150950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7 f150951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7 f150952c;

    public j7(long j10, k7 k7Var, l7 l7Var) {
        this.f150950a = j10;
        this.f150951b = k7Var;
        this.f150952c = l7Var;
    }

    public final long a() {
        return this.f150950a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.f150950a == j7Var.f150950a && kotlin.jvm.internal.m0.g(this.f150951b, j7Var.f150951b) && this.f150952c == j7Var.f150952c;
    }

    public final int hashCode() {
        int iA = f0.p.a(this.f150950a) * 31;
        k7 k7Var = this.f150951b;
        int iHashCode = (iA + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        l7 l7Var = this.f150952c;
        return iHashCode + (l7Var != null ? l7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f150950a + ", skip=" + this.f150951b + ", transitionPolicy=" + this.f150952c + gi.j.f86771d;
    }
}
