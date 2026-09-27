package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt2 f150308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f150309b;

    public hu2(nt2 nt2Var, xy xyVar) {
        this.f150308a = nt2Var;
        this.f150309b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu2)) {
            return false;
        }
        hu2 hu2Var = (hu2) obj;
        return kotlin.jvm.internal.m0.g(this.f150308a, hu2Var.f150308a) && this.f150309b == hu2Var.f150309b;
    }

    public final int hashCode() {
        return this.f150309b.hashCode() + (this.f150308a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.f150308a + ", configurationSource=" + this.f150309b + gi.j.f86771d;
    }
}
