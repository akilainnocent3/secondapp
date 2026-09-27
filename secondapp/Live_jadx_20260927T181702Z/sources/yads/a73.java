package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt2 f146694b;

    public a73(String str, kt2 kt2Var) {
        this.f146693a = str;
        this.f146694b = kt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a73)) {
            return false;
        }
        a73 a73Var = (a73) obj;
        return kotlin.jvm.internal.m0.g(this.f146693a, a73Var.f146693a) && this.f146694b == a73Var.f146694b;
    }

    public final int hashCode() {
        String str = this.f146693a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kt2 kt2Var = this.f146694b;
        return iHashCode + (kt2Var != null ? kt2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f146693a + ", stubReason=" + this.f146694b + gi.j.f86771d;
    }
}
