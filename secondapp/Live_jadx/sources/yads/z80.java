package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z80 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158651a;

    public z80(String str) {
        this.f158651a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && kotlin.jvm.internal.m0.g(this.f158651a, ((z80) obj).f158651a);
    }

    public final int hashCode() {
        return this.f158651a.hashCode();
    }

    public final String toString() {
        return "OnAdUnitClick(id=" + this.f158651a + gi.j.f86771d;
    }
}
