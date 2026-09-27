package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class p50 {

    @oy.l
    public static final o50 Companion = new o50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153746b;

    public /* synthetic */ p50(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, n50.f152883a.getDescriptor());
        }
        this.f153745a = str;
        this.f153746b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return kotlin.jvm.internal.m0.g(this.f153745a, p50Var.f153745a) && kotlin.jvm.internal.m0.g(this.f153746b, p50Var.f153746b);
    }

    public final int hashCode() {
        return this.f153746b.hashCode() + (this.f153745a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.f153745a + ", value=" + this.f153746b + gi.j.f86771d;
    }
}
