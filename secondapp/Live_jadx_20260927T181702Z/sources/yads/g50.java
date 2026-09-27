package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class g50 {

    @oy.l
    public static final f50 Companion = new f50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149401c;

    public /* synthetic */ g50(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f149399a = null;
        } else {
            this.f149399a = str;
        }
        if ((i10 & 2) == 0) {
            this.f149400b = null;
        } else {
            this.f149400b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f149401c = null;
        } else {
            this.f149401c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return kotlin.jvm.internal.m0.g(this.f149399a, g50Var.f149399a) && kotlin.jvm.internal.m0.g(this.f149400b, g50Var.f149400b) && kotlin.jvm.internal.m0.g(this.f149401c, g50Var.f149401c);
    }

    public final int hashCode() {
        String str = this.f149399a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f149400b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149401c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAlert(title=" + this.f149399a + ", message=" + this.f149400b + ", type=" + this.f149401c + gi.j.f86771d;
    }
}
