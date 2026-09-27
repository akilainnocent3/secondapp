package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class hu1 {

    @oy.l
    public static final gu1 Companion = new gu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu1 f150306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu1 f150307b;

    public /* synthetic */ hu1(int i10, mu1 mu1Var, pu1 pu1Var) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, fu1.f149246a.getDescriptor());
        }
        this.f150306a = mu1Var;
        this.f150307b = pu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu1)) {
            return false;
        }
        hu1 hu1Var = (hu1) obj;
        return kotlin.jvm.internal.m0.g(this.f150306a, hu1Var.f150306a) && kotlin.jvm.internal.m0.g(this.f150307b, hu1Var.f150307b);
    }

    public final int hashCode() {
        int iHashCode = this.f150306a.hashCode() * 31;
        pu1 pu1Var = this.f150307b;
        return iHashCode + (pu1Var == null ? 0 : pu1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f150306a + ", response=" + this.f150307b + gi.j.f86771d;
    }

    public hu1(mu1 mu1Var, pu1 pu1Var) {
        this.f150306a = mu1Var;
        this.f150307b = pu1Var;
    }
}
