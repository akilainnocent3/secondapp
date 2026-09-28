package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n080 {
    public final String a;
    public final String b;
    public final String c;

    public n080(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n080)) {
            return false;
        }
        n080 n080Var = (n080) obj;
        return Intrinsics.g(this.a, n080Var.a) && Intrinsics.g(this.b, n080Var.b) && Intrinsics.g(this.c, n080Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("SearchTournament(tournamentId=", this.a, ", tournamentName=", this.b, ", tournamentIcon="), this.c, ")");
    }
}
