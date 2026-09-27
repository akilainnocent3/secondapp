package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149023a;

    public f90(String str) {
        this.f149023a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && kotlin.jvm.internal.m0.g(this.f149023a, ((f90) obj).f149023a);
    }

    public final int hashCode() {
        return this.f149023a.hashCode();
    }

    public final String toString() {
        return "OnWarningButtonClick(waring=" + this.f149023a + gi.j.f86771d;
    }
}
