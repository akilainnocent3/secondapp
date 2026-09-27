package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class py2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f154191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy2 f154194d;

    public py2(int i10, long j10, qy2 qy2Var, String str) {
        this.f154191a = j10;
        this.f154192b = str;
        this.f154193c = i10;
        this.f154194d = qy2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py2)) {
            return false;
        }
        py2 py2Var = (py2) obj;
        return this.f154191a == py2Var.f154191a && kotlin.jvm.internal.m0.g(this.f154192b, py2Var.f154192b) && this.f154193c == py2Var.f154193c && this.f154194d == py2Var.f154194d;
    }

    public final int hashCode() {
        int iA = f0.p.a(this.f154191a) * 31;
        String str = this.f154192b;
        return this.f154194d.hashCode() + nd3.a(this.f154193c, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f154191a + ", url=" + this.f154192b + ", visibilityPercent=" + this.f154193c + ", type=" + this.f154194d + gi.j.f86771d;
    }
}
