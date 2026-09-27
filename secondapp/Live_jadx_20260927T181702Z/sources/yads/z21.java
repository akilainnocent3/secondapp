package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f158568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e31 f158570c;

    public z21(tg tgVar, String str, e31 e31Var) {
        this.f158568a = tgVar;
        this.f158569b = str;
        this.f158570c = e31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return kotlin.jvm.internal.m0.g(this.f158568a, z21Var.f158568a) && kotlin.jvm.internal.m0.g(this.f158569b, z21Var.f158569b) && this.f158570c == z21Var.f158570c;
    }

    public final int hashCode() {
        return this.f158570c.hashCode() + k4.a(this.f158569b, this.f158568a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f158568a + ", mauid=" + this.f158569b + ", identifiersType=" + this.f158570c + gi.j.f86771d;
    }
}
