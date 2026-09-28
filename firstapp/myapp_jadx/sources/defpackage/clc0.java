package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class clc0 {
    public static final clc0 h = new clc0("", "", 0, "", "", 0, null);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final qeo g;

    public clc0(String str, String str2, int i, String str3, String str4, int i2, qeo qeoVar) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = qeoVar;
    }

    public static clc0 a(clc0 clc0Var, int i, int i2, int i3) {
        String str = clc0Var.a;
        String str2 = clc0Var.b;
        if ((i3 & 4) != 0) {
            i = clc0Var.c;
        }
        int i4 = i;
        String str3 = clc0Var.d;
        String str4 = clc0Var.e;
        if ((i3 & 32) != 0) {
            i2 = clc0Var.f;
        }
        int i5 = i2;
        qeo qeoVar = (i3 & 64) != 0 ? clc0Var.g : null;
        clc0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new clc0(str, str2, i4, str3, str4, i5, qeoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clc0)) {
            return false;
        }
        clc0 clc0Var = (clc0) obj;
        return Intrinsics.g(this.a, clc0Var.a) && Intrinsics.g(this.b, clc0Var.b) && this.c == clc0Var.c && Intrinsics.g(this.d, clc0Var.d) && Intrinsics.g(this.e, clc0Var.e) && this.f == clc0Var.f && Intrinsics.g(this.g, clc0Var.g);
    }

    public final int hashCode() {
        int iA = gpp.a(this.f, gmf0.a(gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
        qeo qeoVar = this.g;
        return iA + (qeoVar == null ? 0 : qeoVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsSettlementEventState(homeTeamName=", this.a, ", homeTeamLogoUrl=", this.b, ", homeTeamFinalScore=");
        f78.b(this.c, ", awayTeamName=", this.d, ", awayTeamLogoUrl=", sbA);
        wxa.b(this.f, this.e, ", awayTeamFinalScore=", ", footballScoreInfoState=", sbA);
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
