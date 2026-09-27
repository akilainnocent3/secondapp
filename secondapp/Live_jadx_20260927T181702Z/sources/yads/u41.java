package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f156269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13 f156270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f156271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f156272g;

    public /* synthetic */ u41(int i10, int i11, String str, String str2, int i12) {
        this(i10, i11, str, (i12 & 8) != 0 ? null : str2, null, true, null);
    }

    public final int a() {
        return this.f156267b;
    }

    public final int b() {
        return this.f156266a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u41)) {
            return false;
        }
        u41 u41Var = (u41) obj;
        return this.f156266a == u41Var.f156266a && this.f156267b == u41Var.f156267b && kotlin.jvm.internal.m0.g(this.f156268c, u41Var.f156268c) && kotlin.jvm.internal.m0.g(this.f156269d, u41Var.f156269d) && kotlin.jvm.internal.m0.g(this.f156270e, u41Var.f156270e) && this.f156271f == u41Var.f156271f && kotlin.jvm.internal.m0.g(this.f156272g, u41Var.f156272g);
    }

    public final int hashCode() {
        int iA = k4.a(this.f156268c, nd3.a(this.f156267b, this.f156266a * 31, 31), 31);
        String str = this.f156269d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        o13 o13Var = this.f156270e;
        int iA2 = (g8.a.a(this.f156271f) + ((iHashCode + (o13Var == null ? 0 : o13Var.hashCode())) * 31)) * 31;
        String str2 = this.f156272g;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.f156266a + ", height=" + this.f156267b + ", url=" + this.f156268c + ", sizeType=" + this.f156269d + ", smartCenterSettings=" + this.f156270e + ", preload=" + this.f156271f + ", preview=" + this.f156272g + gi.j.f86771d;
    }

    public u41(int i10, int i11, String str, String str2, o13 o13Var, boolean z10, String str3) {
        this.f156266a = i10;
        this.f156267b = i11;
        this.f156268c = str;
        this.f156269d = str2;
        this.f156270e = o13Var;
        this.f156271f = z10;
        this.f156272g = str3;
    }
}
