package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nm70 {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;

    public nm70(String str, String str2, String str3, BigDecimal bigDecimal) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm70)) {
            return false;
        }
        nm70 nm70Var = (nm70) obj;
        return this.a.equals(nm70Var.a) && Intrinsics.g(this.b, nm70Var.b) && this.c.equals(nm70Var.c) && this.d.equals(nm70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballWinningInfo(sportId=", this.a, ", ticketId=", this.b, ", currency=");
        sbA.append(this.c);
        sbA.append(", winningAmount=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
