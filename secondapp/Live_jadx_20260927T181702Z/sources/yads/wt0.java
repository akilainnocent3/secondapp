package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157507a;

    public wt0(String str) {
        this.f157507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt0) && kotlin.jvm.internal.m0.g(this.f157507a, ((wt0) obj).f157507a);
    }

    public final int hashCode() {
        return this.f157507a.hashCode();
    }

    public final String toString() {
        return "FeedSessionData(value=" + this.f157507a + gi.j.f86771d;
    }
}
