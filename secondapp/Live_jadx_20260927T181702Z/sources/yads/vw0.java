package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class vw0 {

    @oy.l
    public static final uw0 Companion = new uw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx0 f157104a;

    public /* synthetic */ vw0(int i10, dx0 dx0Var) {
        if (1 != (i10 & 1)) {
            dw.g2.b(i10, 1, tw0.f156096a.getDescriptor());
        }
        this.f157104a = dx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw0) && kotlin.jvm.internal.m0.g(this.f157104a, ((vw0) obj).f157104a);
    }

    public final int hashCode() {
        dx0 dx0Var = this.f157104a;
        if (dx0Var == null) {
            return 0;
        }
        return dx0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.f157104a + gi.j.f86771d;
    }
}
