package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gjr {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final knh0 f;

    public gjr(int i, String str, String str2, String str3, String str4, knh0 knh0Var) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        knh0Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = knh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjr)) {
            return false;
        }
        gjr gjrVar = (gjr) obj;
        return this.a == gjrVar.a && this.b.equals(gjrVar.b) && Intrinsics.g(this.c, gjrVar.c) && Intrinsics.g(this.d, gjrVar.d) && Intrinsics.g(this.e, gjrVar.e) && Intrinsics.g(this.f, gjrVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "LNWebViewData(titleRes=", ", url=", this.b, ", countryCode=");
        hxa.c(sbA, this.c, ", languageCode=", this.d, ", downloadSource=");
        sbA.append(this.e);
        sbA.append(", urlTool=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
