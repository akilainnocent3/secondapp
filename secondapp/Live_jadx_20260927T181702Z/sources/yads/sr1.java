package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr1 f155535b;

    public sr1(String str, rr1 rr1Var) {
        this.f155534a = str;
        this.f155535b = rr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr1)) {
            return false;
        }
        sr1 sr1Var = (sr1) obj;
        return kotlin.jvm.internal.m0.g(this.f155534a, sr1Var.f155534a) && this.f155535b == sr1Var.f155535b;
    }

    public final int hashCode() {
        return this.f155535b.hashCode() + (this.f155534a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.f155534a + ", type=" + this.f155535b + gi.j.f86771d;
    }
}
