package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ck70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ck70(String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static ck70 a(ck70 ck70Var, String str) {
        String str2 = ck70Var.a;
        String str3 = ck70Var.b;
        String str4 = ck70Var.c;
        str4.getClass();
        str.getClass();
        return new ck70(str2, str3, str4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck70)) {
            return false;
        }
        ck70 ck70Var = (ck70) obj;
        return this.a.equals(ck70Var.a) && this.b.equals(ck70Var.b) && Intrinsics.g(this.c, ck70Var.c) && Intrinsics.g(this.d, ck70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("ScheduledFootballSpecifierSelection(matchdayId=", this.a, ", eventId=", this.b, ", marketType="), this.c, ", specifierType=", this.d, ")");
    }
}
