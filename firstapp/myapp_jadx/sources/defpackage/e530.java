package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e530 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e530(String str, String str2, String str3, String str4, String str5) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e530)) {
            return false;
        }
        e530 e530Var = (e530) obj;
        return this.a.equals(e530Var.a) && this.b.equals(e530Var.b) && this.c.equals(e530Var.c) && this.d.equals(e530Var.d) && Intrinsics.g(this.e, e530Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PromotionBannerState(bodyText=", this.a, ", buttonText=", this.b, ", iconUrl=");
        hxa.c(sbA, this.c, ", backgroundUrl=", this.d, ", redirectUrl=");
        return uf80.a(sbA, this.e, ")");
    }
}
