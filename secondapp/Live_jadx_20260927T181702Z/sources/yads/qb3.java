package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb3 f154398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154400c;

    public qb3(pb3 pb3Var, String str, String str2) {
        this.f154398a = pb3Var;
        this.f154399b = str;
        this.f154400c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb3)) {
            return false;
        }
        qb3 qb3Var = (qb3) obj;
        return this.f154398a == qb3Var.f154398a && kotlin.jvm.internal.m0.g(this.f154399b, qb3Var.f154399b) && kotlin.jvm.internal.m0.g(this.f154400c, qb3Var.f154400c);
    }

    public final int hashCode() {
        int iHashCode = this.f154398a.hashCode() * 31;
        String str = this.f154399b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154400c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(status=" + this.f154398a + ", assetName=" + this.f154399b + ", description=" + this.f154400c + gi.j.f86771d;
    }
}
