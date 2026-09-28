package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lcc0 {
    public final String a;
    public final String b;

    public lcc0(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcc0)) {
            return false;
        }
        lcc0 lcc0Var = (lcc0) obj;
        return this.a.equals(lcc0Var.a) && Intrinsics.g(this.b, lcc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsExpansion(marketCategoryId=", this.a, ", marketType=", this.b, ")");
    }
}
