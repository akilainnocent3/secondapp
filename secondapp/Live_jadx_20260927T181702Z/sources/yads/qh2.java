package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class qh2 {

    @oy.l
    public static final ph2 Companion = new ph2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154467b;

    public /* synthetic */ qh2(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, oh2.f153499a.getDescriptor());
        }
        this.f154466a = str;
        this.f154467b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return kotlin.jvm.internal.m0.g(this.f154466a, qh2Var.f154466a) && kotlin.jvm.internal.m0.g(this.f154467b, qh2Var.f154467b);
    }

    public final int hashCode() {
        return this.f154467b.hashCode() + (this.f154466a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchedMediationNetworkWinner(networkName=" + this.f154466a + ", networkAdUnit=" + this.f154467b + gi.j.f86771d;
    }

    public qh2(String str, String str2) {
        this.f154466a = str;
        this.f154467b = str2;
    }
}
