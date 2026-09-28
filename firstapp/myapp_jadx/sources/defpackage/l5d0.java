package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;

/* JADX INFO: loaded from: classes2.dex */
public final class l5d0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public l5d0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5d0)) {
            return false;
        }
        l5d0 l5d0Var = (l5d0) obj;
        return this.a.equals(l5d0Var.a) && this.b.equals(l5d0Var.b) && this.c.equals(l5d0Var.c) && this.d.equals(l5d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("SportyPenaltyTeamInfoState(leftTeamNameText=", this.a, llGRV.XALHHyHhvQq, this.b, ", rightTeamNameText="), this.c, ", rightTeamLogoUrl=", this.d, ")");
    }
}
