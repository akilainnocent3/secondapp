package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152905b;

    public n70(String str) {
        super("Ad Units", 0);
        this.f152905b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n70) && kotlin.jvm.internal.m0.g(this.f152905b, ((n70) obj).f152905b);
    }

    public final int hashCode() {
        return this.f152905b.hashCode();
    }

    public final String toString() {
        return "AdUnit(unitId=" + this.f152905b + gi.j.f86771d;
    }
}
