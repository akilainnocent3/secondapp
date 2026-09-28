package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h3x {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public h3x(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3x)) {
            return false;
        }
        h3x h3xVar = (h3x) obj;
        return this.a == h3xVar.a && Intrinsics.g(this.b, h3xVar.b) && this.c == h3xVar.c && Intrinsics.g(this.d, h3xVar.d) && Intrinsics.g(this.e, h3xVar.e) && Intrinsics.g(this.f, h3xVar.f) && Intrinsics.g(this.g, h3xVar.g) && Intrinsics.g(this.h, h3xVar.h) && Intrinsics.g(this.i, h3xVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.c, gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "NCEntity(id=", ", cursor=", this.b, ", category=");
        f78.b(this.c, ", sendTime=", this.d, ", title=", sbA);
        hxa.c(sbA, this.e, ", content=", this.f, ", bannerImageUrl=");
        hxa.c(sbA, this.g, ", buttonText=", this.h, ", buttonLink=");
        return uf80.a(sbA, this.i, ")");
    }
}
