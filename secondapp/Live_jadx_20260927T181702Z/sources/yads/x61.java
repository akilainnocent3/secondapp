package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157696a;

    public x61(String str) {
        this.f157696a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && kotlin.jvm.internal.m0.g(this.f157696a, ((x61) obj).f157696a);
    }

    public final int hashCode() {
        return this.f157696a.hashCode();
    }

    public final String toString() {
        return "Failure(message=" + this.f157696a + gi.j.f86771d;
    }
}
