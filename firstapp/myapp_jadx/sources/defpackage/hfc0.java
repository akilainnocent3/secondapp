package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hfc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public hfc0(String str, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfc0)) {
            return false;
        }
        hfc0 hfc0Var = (hfc0) obj;
        return Intrinsics.g(this.a, hfc0Var.a) && this.b.equals(hfc0Var.b) && this.c.equals(hfc0Var.c) && this.d.equals(hfc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("SportyLegendsMarketOutcomeClickData(marketType=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ", lookupKey=", this.d, ")");
    }
}
