package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class m50 {

    @oy.l
    public static final l50 Companion = new l50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152327d;

    public /* synthetic */ m50(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            dw.g2.b(i10, 15, k50.f151398a.getDescriptor());
        }
        this.f152324a = str;
        this.f152325b = str2;
        this.f152326c = str3;
        this.f152327d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return kotlin.jvm.internal.m0.g(this.f152324a, m50Var.f152324a) && kotlin.jvm.internal.m0.g(this.f152325b, m50Var.f152325b) && kotlin.jvm.internal.m0.g(this.f152326c, m50Var.f152326c) && kotlin.jvm.internal.m0.g(this.f152327d, m50Var.f152327d);
    }

    public final int hashCode() {
        return this.f152327d.hashCode() + k4.a(this.f152326c, k4.a(this.f152325b, this.f152324a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f152324a + ", appVersion=" + this.f152325b + ", system=" + this.f152326c + ", androidApiLevel=" + this.f152327d + gi.j.f86771d;
    }

    public m50(String str, String str2, String str3, String str4) {
        this.f152324a = str;
        this.f152325b = str2;
        this.f152326c = str3;
        this.f152327d = str4;
    }
}
