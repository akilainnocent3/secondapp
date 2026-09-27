package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class ka0 {

    @oy.l
    public static final ja0 Companion = new ja0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151449b;

    public /* synthetic */ ka0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, ia0.f150493a.getDescriptor());
        }
        this.f151448a = str;
        this.f151449b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return kotlin.jvm.internal.m0.g(this.f151448a, ka0Var.f151448a) && kotlin.jvm.internal.m0.g(this.f151449b, ka0Var.f151449b);
    }

    public final int hashCode() {
        return this.f151449b.hashCode() + (this.f151448a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCurrency(name=" + this.f151448a + ", symbol=" + this.f151449b + gi.j.f86771d;
    }
}
