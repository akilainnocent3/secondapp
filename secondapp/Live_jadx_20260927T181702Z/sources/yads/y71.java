package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f158172f;

    public y71(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f158167a = str;
        this.f158168b = str2;
        this.f158169c = str3;
        this.f158170d = str4;
        this.f158171e = str5;
        this.f158172f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y71)) {
            return false;
        }
        y71 y71Var = (y71) obj;
        return kotlin.jvm.internal.m0.g(this.f158167a, y71Var.f158167a) && kotlin.jvm.internal.m0.g(this.f158168b, y71Var.f158168b) && kotlin.jvm.internal.m0.g(this.f158169c, y71Var.f158169c) && kotlin.jvm.internal.m0.g(this.f158170d, y71Var.f158170d) && kotlin.jvm.internal.m0.g(this.f158171e, y71Var.f158171e) && kotlin.jvm.internal.m0.g(this.f158172f, y71Var.f158172f);
    }

    public final int hashCode() {
        String str = this.f158167a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f158168b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f158169c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f158170d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f158171e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f158172f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "InstreamAdInfo(adId=" + this.f158167a + ", creativeId=" + this.f158168b + ", bannerId=" + this.f158169c + ", data=" + this.f158170d + ", advertiserInfo=" + this.f158171e + ", adParameters=" + this.f158172f + gi.j.f86771d;
    }
}
