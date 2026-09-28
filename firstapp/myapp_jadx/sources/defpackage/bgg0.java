package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bgg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bgg0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgg0)) {
            return false;
        }
        bgg0 bgg0Var = (bgg0) obj;
        return Intrinsics.g(this.a, bgg0Var.a) && Intrinsics.g(this.b, bgg0Var.b) && Intrinsics.g(this.c, bgg0Var.c) && Intrinsics.g(this.d, bgg0Var.d);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return kwi.a(ux5.a("TournamentTeam(id=", this.a, ", name=", this.b, ", countryCode="), this.c, ", abbreviation=", this.d, ")");
    }
}
