package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n7o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<u7o> g;

    public n7o(String str, String str2, String str3, String str4, String str5, String str6, List<u7o> list) {
        bt6.a(str, str4, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7o)) {
            return false;
        }
        n7o n7oVar = (n7o) obj;
        return Intrinsics.g(this.a, n7oVar.a) && this.b.equals(n7oVar.b) && this.c.equals(n7oVar.c) && Intrinsics.g(this.d, n7oVar.d) && this.e.equals(n7oVar.e) && Intrinsics.g(this.f, n7oVar.f) && Intrinsics.g(this.g, n7oVar.g);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantVirtualShowOffTicketInfo(ticketId=", this.a, ", createTime=", this.b, ", totalReturn=");
        hxa.c(sbA, this.c, ", totalOdds=", this.d, ", totalStake=");
        hxa.c(sbA, this.e, ", totalBonus=", this.f, ", selections=");
        return ng1.a(sbA, this.g, ")");
    }
}
