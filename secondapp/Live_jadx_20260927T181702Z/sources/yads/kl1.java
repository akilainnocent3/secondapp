package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jl1 f151589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f151591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f151592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f151593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f151594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f151595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f151596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f151597k;

    public kl1(String str, String str2, jl1 jl1Var, String str3, String str4, Float f10, int i10, int i11, int i12, String str5) {
        this.f151587a = str;
        this.f151588b = str2;
        this.f151589c = jl1Var;
        this.f151590d = str3;
        this.f151591e = str4;
        this.f151592f = f10;
        this.f151593g = i10;
        this.f151594h = i11;
        this.f151595i = i12;
        this.f151596j = str5;
        this.f151597k = kotlin.jvm.internal.m0.g(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return kotlin.jvm.internal.m0.g(this.f151587a, kl1Var.f151587a) && kotlin.jvm.internal.m0.g(this.f151588b, kl1Var.f151588b) && this.f151589c == kl1Var.f151589c && kotlin.jvm.internal.m0.g(this.f151590d, kl1Var.f151590d) && kotlin.jvm.internal.m0.g(this.f151591e, kl1Var.f151591e) && kotlin.jvm.internal.m0.g(this.f151592f, kl1Var.f151592f) && this.f151593g == kl1Var.f151593g && this.f151594h == kl1Var.f151594h && this.f151595i == kl1Var.f151595i && kotlin.jvm.internal.m0.g(this.f151596j, kl1Var.f151596j);
    }

    public final int hashCode() {
        int iHashCode = this.f151587a.hashCode() * 31;
        String str = this.f151588b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jl1 jl1Var = this.f151589c;
        int iHashCode3 = (iHashCode2 + (jl1Var == null ? 0 : jl1Var.hashCode())) * 31;
        String str2 = this.f151590d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f151591e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f151592f;
        int iA = nd3.a(this.f151595i, nd3.a(this.f151594h, nd3.a(this.f151593g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f151596j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.f151587a + ", id=" + this.f151588b + ", deliveryMethod=" + this.f151589c + ", mimeType=" + this.f151590d + ", codec=" + this.f151591e + ", vmafMetric=" + this.f151592f + ", height=" + this.f151593g + ", width=" + this.f151594h + ", bitrate=" + this.f151595i + ", apiFramework=" + this.f151596j + gi.j.f86771d;
    }
}
