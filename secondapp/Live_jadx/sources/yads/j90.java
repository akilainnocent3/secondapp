package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150975a;

    public j90(String str) {
        this.f150975a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && kotlin.jvm.internal.m0.g(this.f150975a, ((j90) obj).f150975a);
    }

    public final int hashCode() {
        return this.f150975a.hashCode();
    }

    public final String toString() {
        return "Message(text=" + this.f150975a + gi.j.f86771d;
    }
}
