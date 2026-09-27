package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153589b;

    public oq1(String str, String str2) {
        this.f153588a = str;
        this.f153589b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq1)) {
            return false;
        }
        oq1 oq1Var = (oq1) obj;
        return kotlin.jvm.internal.m0.g(this.f153588a, oq1Var.f153588a) && kotlin.jvm.internal.m0.g(this.f153589b, oq1Var.f153589b);
    }

    public final int hashCode() {
        return this.f153589b.hashCode() + (this.f153588a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationAdapterSignature(format=" + this.f153588a + ", className=" + this.f153589b + gi.j.f86771d;
    }
}
