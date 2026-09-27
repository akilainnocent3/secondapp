package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151901a;

    public l90(String str) {
        this.f151901a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l90) {
            return kotlin.jvm.internal.m0.g(kj.d.f102469g, kj.d.f102469g) && kotlin.jvm.internal.m0.g(this.f151901a, ((l90) obj).f151901a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f151901a.hashCode() + 562735108;
    }

    public final String toString() {
        return "Warning(title=" + kj.d.f102469g + ", message=" + this.f151901a + gi.j.f86771d;
    }
}
