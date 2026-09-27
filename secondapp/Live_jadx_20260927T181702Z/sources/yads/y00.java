package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f158071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a10 f158072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10 f158073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a10 f158074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o10 f158075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f158076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f158077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f158078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f158079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f158080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f158081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f158082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f158083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f158084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f158085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f158086p;

    public y00(h10 h10Var, a10 a10Var, a10 a10Var2, a10 a10Var3, o10 o10Var, String str, String str2, String str3, String str4, String str5, Float f10, String str6, String str7, String str8, String str9, boolean z10) {
        this.f158071a = h10Var;
        this.f158072b = a10Var;
        this.f158073c = a10Var2;
        this.f158074d = a10Var3;
        this.f158075e = o10Var;
        this.f158076f = str;
        this.f158077g = str2;
        this.f158078h = str3;
        this.f158079i = str4;
        this.f158080j = str5;
        this.f158081k = f10;
        this.f158082l = str6;
        this.f158083m = str7;
        this.f158084n = str8;
        this.f158085o = str9;
        this.f158086p = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return kotlin.jvm.internal.m0.g(this.f158071a, y00Var.f158071a) && kotlin.jvm.internal.m0.g(this.f158072b, y00Var.f158072b) && kotlin.jvm.internal.m0.g(this.f158073c, y00Var.f158073c) && kotlin.jvm.internal.m0.g(this.f158074d, y00Var.f158074d) && kotlin.jvm.internal.m0.g(this.f158075e, y00Var.f158075e) && kotlin.jvm.internal.m0.g(this.f158076f, y00Var.f158076f) && kotlin.jvm.internal.m0.g(this.f158077g, y00Var.f158077g) && kotlin.jvm.internal.m0.g(this.f158078h, y00Var.f158078h) && kotlin.jvm.internal.m0.g(this.f158079i, y00Var.f158079i) && kotlin.jvm.internal.m0.g(this.f158080j, y00Var.f158080j) && kotlin.jvm.internal.m0.g(this.f158081k, y00Var.f158081k) && kotlin.jvm.internal.m0.g(this.f158082l, y00Var.f158082l) && kotlin.jvm.internal.m0.g(this.f158083m, y00Var.f158083m) && kotlin.jvm.internal.m0.g(this.f158084n, y00Var.f158084n) && kotlin.jvm.internal.m0.g(this.f158085o, y00Var.f158085o) && this.f158086p == y00Var.f158086p;
    }

    public final int hashCode() {
        h10 h10Var = this.f158071a;
        int iFloatToIntBits = (h10Var == null ? 0 : Float.floatToIntBits(h10Var.f149864a)) * 31;
        a10 a10Var = this.f158072b;
        int iHashCode = (iFloatToIntBits + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        a10 a10Var2 = this.f158073c;
        int iHashCode2 = (iHashCode + (a10Var2 == null ? 0 : a10Var2.hashCode())) * 31;
        a10 a10Var3 = this.f158074d;
        int iHashCode3 = (iHashCode2 + (a10Var3 == null ? 0 : a10Var3.hashCode())) * 31;
        o10 o10Var = this.f158075e;
        int iHashCode4 = (iHashCode3 + (o10Var == null ? 0 : o10Var.hashCode())) * 31;
        String str = this.f158076f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158077g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f158078h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f158079i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f158080j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f158081k;
        int iHashCode10 = (iHashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str6 = this.f158082l;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f158083m;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f158084n;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f158085o;
        return g8.a.a(this.f158086p) + ((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f158071a + ", favicon=" + this.f158072b + ", icon=" + this.f158073c + ", image=" + this.f158074d + ", closeButton=" + this.f158075e + ", age=" + this.f158076f + ", body=" + this.f158077g + ", callToAction=" + this.f158078h + ", domain=" + this.f158079i + ", price=" + this.f158080j + ", rating=" + this.f158081k + ", reviewCount=" + this.f158082l + ", sponsored=" + this.f158083m + ", title=" + this.f158084n + ", warning=" + this.f158085o + ", feedbackAvailable=" + this.f158086p + gi.j.f86771d;
    }
}
