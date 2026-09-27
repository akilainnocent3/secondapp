package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157356c;

    public wf0(String str, String str2, String str3) {
        this.f157354a = str;
        this.f157355b = str2;
        this.f157356c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf0.class == obj.getClass()) {
            wf0 wf0Var = (wf0) obj;
            if (ib3.a(this.f157354a, wf0Var.f157354a) && ib3.a(this.f157355b, wf0Var.f157355b) && ib3.a(this.f157356c, wf0Var.f157356c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f157354a.hashCode() * 31;
        String str = this.f157355b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f157356c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
