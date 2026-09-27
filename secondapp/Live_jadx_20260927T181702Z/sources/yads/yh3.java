package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yh3 extends zh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.s0 f158322a;

    public yh3(s5.s0 s0Var) {
        super(0);
        this.f158322a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh3) && kotlin.jvm.internal.m0.g(this.f158322a, ((yh3) obj).f158322a);
    }

    public final int hashCode() {
        return this.f158322a.hashCode();
    }

    public final String toString() {
        return "Media3MediaSource(source=" + this.f158322a + gi.j.f86771d;
    }
}
