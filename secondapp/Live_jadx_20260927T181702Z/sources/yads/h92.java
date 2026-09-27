package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83 f150002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb3 f150003b;

    public h92(c83 c83Var, qb3 qb3Var) {
        this.f150002a = c83Var;
        this.f150003b = qb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h92)) {
            return false;
        }
        h92 h92Var = (h92) obj;
        return kotlin.jvm.internal.m0.g(this.f150002a, h92Var.f150002a) && kotlin.jvm.internal.m0.g(this.f150003b, h92Var.f150003b);
    }

    public final int hashCode() {
        return this.f150003b.hashCode() + (this.f150002a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f150002a + ", validationResult=" + this.f150003b + gi.j.f86771d;
    }
}
