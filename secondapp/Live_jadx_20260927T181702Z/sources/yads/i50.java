package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h50 f150438c;

    public i50(String str, String str2, h50 h50Var) {
        this.f150436a = str;
        this.f150437b = str2;
        this.f150438c = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return kotlin.jvm.internal.m0.g(this.f150436a, i50Var.f150436a) && kotlin.jvm.internal.m0.g(this.f150437b, i50Var.f150437b) && this.f150438c == i50Var.f150438c;
    }

    public final int hashCode() {
        String str = this.f150436a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f150437b;
        return this.f150438c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f150436a + ", message=" + this.f150437b + ", type=" + this.f150438c + gi.j.f86771d;
    }
}
