package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c870 {
    public final String a;
    public final String b;
    public final String c;

    public c870(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c870)) {
            return false;
        }
        c870 c870Var = (c870) obj;
        return Intrinsics.g(this.a, c870Var.a) && this.b.equals(c870Var.b) && Intrinsics.g(this.c, c870Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("ScheduledFootballLeagueTabState(leagueId=", this.a, ", leagueLogoUrl=", this.b, ", leagueNameText="), this.c, ")");
    }
}
