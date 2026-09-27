package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class dx0 {

    @oy.l
    public static final cx0 Companion = new cx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f148403d;

    public /* synthetic */ dx0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            dw.g2.b(i10, 15, bx0.f147385a.getDescriptor());
        }
        this.f148400a = str;
        this.f148401b = str2;
        this.f148402c = str3;
        this.f148403d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0)) {
            return false;
        }
        dx0 dx0Var = (dx0) obj;
        return kotlin.jvm.internal.m0.g(this.f148400a, dx0Var.f148400a) && kotlin.jvm.internal.m0.g(this.f148401b, dx0Var.f148401b) && kotlin.jvm.internal.m0.g(this.f148402c, dx0Var.f148402c) && kotlin.jvm.internal.m0.g(this.f148403d, dx0Var.f148403d);
    }

    public final int hashCode() {
        return this.f148403d.hashCode() + k4.a(this.f148402c, k4.a(this.f148401b, this.f148400a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FontUrls(regular=" + this.f148400a + ", bold=" + this.f148401b + ", light=" + this.f148402c + ", medium=" + this.f148403d + gi.j.f86771d;
    }
}
