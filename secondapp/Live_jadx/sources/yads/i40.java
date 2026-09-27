package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150420c;

    public i40(String str, String str2, String str3) {
        this.f150418a = str;
        this.f150419b = str2;
        this.f150420c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return kotlin.jvm.internal.m0.g(this.f150418a, i40Var.f150418a) && kotlin.jvm.internal.m0.g(this.f150419b, i40Var.f150419b) && kotlin.jvm.internal.m0.g(this.f150420c, i40Var.f150420c);
    }

    public final int hashCode() {
        return this.f150420c.hashCode() + k4.a(this.f150419b, this.f150418a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f150418a + ", format=" + this.f150419b + ", adUnitId=" + this.f150420c + gi.j.f86771d;
    }
}
