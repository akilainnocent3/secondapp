package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157711b;

    public x8(boolean z10, int i10) {
        this.f157710a = i10;
        this.f157711b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return this.f157710a == x8Var.f157710a && this.f157711b == x8Var.f157711b;
    }

    public final int hashCode() {
        return g8.a.a(this.f157711b) + (this.f157710a * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f157710a + ", disabled=" + this.f157711b + gi.j.f86771d;
    }
}
