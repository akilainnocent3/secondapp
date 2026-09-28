package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ih2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public ih2(String str, String str2, String str3, String str4, String str5, boolean z) {
        str.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return Intrinsics.g(this.a, ih2Var.a) && this.b.equals(ih2Var.b) && this.c.equals(ih2Var.c) && this.d.equals(ih2Var.d) && Intrinsics.g(this.e, ih2Var.e) && this.f == ih2Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetBuilderMarketSourceOutcome(marketId=", this.a, ", outcomeId=", this.b, ", lookupKey=");
        hxa.c(sbA, this.c, ", description=", this.d, ", odds=");
        return x9d.a(this.e, ", isEnabled=", ")", sbA, this.f);
    }
}
