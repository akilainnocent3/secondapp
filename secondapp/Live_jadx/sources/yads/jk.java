package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151132c;

    public jk(String str, String str2, String str3) {
        this.f151130a = str;
        this.f151131b = str2;
        this.f151132c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return kotlin.jvm.internal.m0.g(this.f151130a, jkVar.f151130a) && kotlin.jvm.internal.m0.g(this.f151131b, jkVar.f151131b) && kotlin.jvm.internal.m0.g(this.f151132c, jkVar.f151132c);
    }

    public final int hashCode() {
        return this.f151132c.hashCode() + k4.a(this.f151131b, this.f151130a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Attributes(campaignId=" + this.f151130a + ", bannerId=" + this.f151131b + ", placeId=" + this.f151132c + gi.j.f86771d;
    }
}
