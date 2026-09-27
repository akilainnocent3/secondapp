package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class ha0 {

    @oy.l
    public static final ga0 Companion = new ga0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f150029b;

    public /* synthetic */ ha0(int i10, String str, double d10) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, fa0.f149033a.getDescriptor());
        }
        this.f150028a = str;
        this.f150029b = d10;
    }

    public final double a() {
        return this.f150029b;
    }

    public final String b() {
        return this.f150028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return kotlin.jvm.internal.m0.g(this.f150028a, ha0Var.f150028a) && Double.compare(this.f150029b, ha0Var.f150029b) == 0;
    }

    public final int hashCode() {
        return f0.i.a(this.f150029b) + (this.f150028a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f150028a + ", minCpm=" + this.f150029b + gi.j.f86771d;
    }
}
