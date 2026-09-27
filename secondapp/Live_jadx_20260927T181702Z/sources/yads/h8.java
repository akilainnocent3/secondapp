package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149967b;

    public h8(boolean z10, int i10) {
        this.f149966a = i10;
        this.f149967b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f149966a == h8Var.f149966a && this.f149967b == h8Var.f149967b;
    }

    public final int hashCode() {
        return g8.a.a(this.f149967b) + (this.f149966a * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f149966a + ", disabled=" + this.f149967b + gi.j.f86771d;
    }
}
