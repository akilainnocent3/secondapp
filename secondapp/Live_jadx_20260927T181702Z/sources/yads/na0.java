package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class na0 {

    @oy.l
    public static final ma0 Companion = new ma0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152958b;

    public /* synthetic */ na0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            dw.g2.b(i10, 3, la0.f151910a.getDescriptor());
        }
        this.f152957a = str;
        this.f152958b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return kotlin.jvm.internal.m0.g(this.f152957a, na0Var.f152957a) && kotlin.jvm.internal.m0.g(this.f152958b, na0Var.f152958b);
    }

    public final int hashCode() {
        return this.f152958b.hashCode() + (this.f152957a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallParameter(name=" + this.f152957a + ", value=" + this.f152958b + gi.j.f86771d;
    }
}
