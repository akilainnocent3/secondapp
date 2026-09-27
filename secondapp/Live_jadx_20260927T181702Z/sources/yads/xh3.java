package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xh3 extends zh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo f157879a;

    public xh3(mo moVar) {
        super(0);
        this.f157879a = moVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh3) && kotlin.jvm.internal.m0.g(this.f157879a, ((xh3) obj).f157879a);
    }

    public final int hashCode() {
        return this.f157879a.hashCode();
    }

    public final String toString() {
        return "ExoPlayerMediaSource(source=" + this.f157879a + gi.j.f86771d;
    }
}
