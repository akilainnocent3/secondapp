package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r40 f150931d;

    public j40(String str, String str2, String str3, r40 r40Var) {
        this.f150928a = str;
        this.f150929b = str2;
        this.f150930c = str3;
        this.f150931d = r40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return kotlin.jvm.internal.m0.g(this.f150928a, j40Var.f150928a) && kotlin.jvm.internal.m0.g(this.f150929b, j40Var.f150929b) && kotlin.jvm.internal.m0.g(this.f150930c, j40Var.f150930c) && kotlin.jvm.internal.m0.g(this.f150931d, j40Var.f150931d);
    }

    public final int hashCode() {
        return this.f150931d.f154750a.hashCode() + k4.a(this.f150930c, k4.a(this.f150929b, this.f150928a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f150928a + ", format=" + this.f150929b + ", adUnitId=" + this.f150930c + ", mediation=" + this.f150931d + gi.j.f86771d;
    }
}
