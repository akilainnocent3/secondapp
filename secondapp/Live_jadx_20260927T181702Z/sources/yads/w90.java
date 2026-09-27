package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157246a;

    public w90(String str) {
        super(0);
        this.f157246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && kotlin.jvm.internal.m0.g(this.f157246a, ((w90) obj).f157246a);
    }

    public final int hashCode() {
        return this.f157246a.hashCode();
    }

    public final String toString() {
        return "Header(text=" + this.f157246a + gi.j.f86771d;
    }
}
