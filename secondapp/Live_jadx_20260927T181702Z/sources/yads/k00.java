package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151333b;

    public k00(String str, String str2) {
        this.f151332a = str;
        this.f151333b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return kotlin.jvm.internal.m0.g(this.f151332a, k00Var.f151332a) && kotlin.jvm.internal.m0.g(this.f151333b, k00Var.f151333b);
    }

    public final int hashCode() {
        String str = this.f151332a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f151333b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CoreCreative(creativeId=" + this.f151332a + ", campaignId=" + this.f151333b + gi.j.f86771d;
    }
}
