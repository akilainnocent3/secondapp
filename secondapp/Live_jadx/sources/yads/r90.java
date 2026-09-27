package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154819c;

    public r90(String str, String str2, String str3) {
        super(0);
        this.f154817a = str;
        this.f154818b = str2;
        this.f154819c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return kotlin.jvm.internal.m0.g(this.f154817a, r90Var.f154817a) && kotlin.jvm.internal.m0.g(this.f154818b, r90Var.f154818b) && kotlin.jvm.internal.m0.g(this.f154819c, r90Var.f154819c);
    }

    public final int hashCode() {
        return this.f154819c.hashCode() + k4.a(this.f154818b, this.f154817a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnit(name=" + this.f154817a + ", format=" + this.f154818b + ", id=" + this.f154819c + gi.j.f86771d;
    }
}
