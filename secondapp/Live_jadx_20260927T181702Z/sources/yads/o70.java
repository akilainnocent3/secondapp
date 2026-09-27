package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y90 f153374b;

    public o70(y90 y90Var) {
        super(y90Var.c(), 0);
        this.f153374b = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && kotlin.jvm.internal.m0.g(this.f153374b, ((o70) obj).f153374b);
    }

    public final int hashCode() {
        return this.f153374b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.f153374b + gi.j.f86771d;
    }
}
