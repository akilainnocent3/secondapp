package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class ih2 {

    @oy.l
    public static final hh2 Companion = new hh2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh2 f150633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gi2 f150634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ai2 f150635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f150636e;

    public /* synthetic */ ih2(int i10, String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        if (31 != (i10 & 31)) {
            dw.g2.b(i10, 31, gh2.f149612a.getDescriptor());
        }
        this.f150632a = str;
        this.f150633b = qh2Var;
        this.f150634c = gi2Var;
        this.f150635d = ai2Var;
        this.f150636e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return kotlin.jvm.internal.m0.g(this.f150632a, ih2Var.f150632a) && kotlin.jvm.internal.m0.g(this.f150633b, ih2Var.f150633b) && kotlin.jvm.internal.m0.g(this.f150634c, ih2Var.f150634c) && kotlin.jvm.internal.m0.g(this.f150635d, ih2Var.f150635d) && kotlin.jvm.internal.m0.g(this.f150636e, ih2Var.f150636e);
    }

    public final int hashCode() {
        int iHashCode = this.f150632a.hashCode() * 31;
        qh2 qh2Var = this.f150633b;
        int iHashCode2 = (iHashCode + (qh2Var == null ? 0 : qh2Var.hashCode())) * 31;
        gi2 gi2Var = this.f150634c;
        int iHashCode3 = (this.f150635d.hashCode() + ((iHashCode2 + (gi2Var == null ? 0 : gi2Var.hashCode())) * 31)) * 31;
        String str = this.f150636e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.f150632a + ", networkWinner=" + this.f150633b + ", revenue=" + this.f150634c + ", result=" + this.f150635d + ", networkAdInfo=" + this.f150636e + gi.j.f86771d;
    }

    public ih2(String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        this.f150632a = str;
        this.f150633b = qh2Var;
        this.f150634c = gi2Var;
        this.f150635d = ai2Var;
        this.f150636e = str2;
    }
}
