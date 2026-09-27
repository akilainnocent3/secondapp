package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149245b;

    public fu0(String str, String str2) {
        this.f149244a = str;
        this.f149245b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu0)) {
            return false;
        }
        fu0 fu0Var = (fu0) obj;
        return kotlin.jvm.internal.m0.g(this.f149244a, fu0Var.f149244a) && kotlin.jvm.internal.m0.g(this.f149245b, fu0Var.f149245b);
    }

    public final int hashCode() {
        return this.f149245b.hashCode() + (this.f149244a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + this.f149244a + ", url=" + this.f149245b + gi.j.f86771d;
    }
}
