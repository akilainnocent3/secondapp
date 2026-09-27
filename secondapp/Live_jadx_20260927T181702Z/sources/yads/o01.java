package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f153287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f153288b;

    public o01(boolean z10, sg2 sg2Var) {
        this.f153287a = z10;
        this.f153288b = sg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return this.f153287a == o01Var.f153287a && kotlin.jvm.internal.m0.g(this.f153288b, o01Var.f153288b);
    }

    public final int hashCode() {
        int iA = g8.a.a(this.f153287a) * 31;
        sg2 sg2Var = this.f153288b;
        return iA + (sg2Var == null ? 0 : sg2Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f153287a + ", handledPackage=" + this.f153288b + gi.j.f86771d;
    }
}
