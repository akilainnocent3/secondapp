package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class gi2 {

    @oy.l
    public static final fi2 Companion = new fi2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f149627a;

    public gi2(double d10) {
        this.f149627a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi2) && Double.compare(this.f149627a, ((gi2) obj).f149627a) == 0;
    }

    public final int hashCode() {
        return f0.i.a(this.f149627a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f149627a + gi.j.f86771d;
    }

    public /* synthetic */ gi2(int i10, double d10) {
        if (1 != (i10 & 1)) {
            dw.g2.b(i10, 1, ei2.f148721a.getDescriptor());
        }
        this.f149627a = d10;
    }
}
