package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class t50 {

    @oy.l
    public static final s50 Companion = new s50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f155700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f155701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f155702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f155703d;

    public /* synthetic */ t50(int i10, boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        if (15 != (i10 & 15)) {
            dw.g2.b(i10, 15, r50.f154756a.getDescriptor());
        }
        this.f155700a = z10;
        this.f155701b = bool;
        this.f155702c = bool2;
        this.f155703d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.f155700a == t50Var.f155700a && kotlin.jvm.internal.m0.g(this.f155701b, t50Var.f155701b) && kotlin.jvm.internal.m0.g(this.f155702c, t50Var.f155702c) && this.f155703d == t50Var.f155703d;
    }

    public final int hashCode() {
        int iA = g8.a.a(this.f155700a) * 31;
        Boolean bool = this.f155701b;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f155702c;
        return g8.a.a(this.f155703d) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f155700a + ", ageRestrictedUser=" + this.f155701b + ", hasUserConsent=" + this.f155702c + ", hasCmpValue=" + this.f155703d + gi.j.f86771d;
    }

    public t50(boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        this.f155700a = z10;
        this.f155701b = bool;
        this.f155702c = bool2;
        this.f155703d = z11;
    }
}
