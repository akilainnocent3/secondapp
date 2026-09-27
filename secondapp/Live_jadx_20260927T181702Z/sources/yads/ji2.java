package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ji2 implements yp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f151109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f151110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f151111c;

    public ji2(ny0 ny0Var, Object obj, long j10) {
        this.f151109a = ny0Var;
        this.f151110b = obj;
        this.f151111c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return kotlin.jvm.internal.m0.g(this.f151109a, ji2Var.f151109a) && kotlin.jvm.internal.m0.g(this.f151110b, ji2Var.f151110b) && this.f151111c == ji2Var.f151111c;
    }

    public final int hashCode() {
        Object obj = this.f151109a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f151110b;
        return f0.p.a(this.f151111c) + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedItem(params=" + this.f151109a + ", item=" + this.f151110b + ", expiresAtTimestampMillis=" + this.f151111c + gi.j.f86771d;
    }
}
