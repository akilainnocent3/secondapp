package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jde0 {
    public final String a;
    public final Date b;
    public final boolean c;
    public final String d;
    public final String e;

    public jde0(String str, Date date, boolean z, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = date;
        this.c = z;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jde0)) {
            return false;
        }
        jde0 jde0Var = (jde0) obj;
        return Intrinsics.g(this.a, jde0Var.a) && this.b.equals(jde0Var.b) && this.c == jde0Var.c && Intrinsics.g(this.d, jde0Var.d) && Intrinsics.g(this.e, jde0Var.e);
    }

    public final int hashCode() {
        int iA = mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribedEvent(eventId=");
        sb.append(this.a);
        sb.append(", fixtureStartTime=");
        sb.append(this.b);
        sb.append(", notificationEnabled=");
        mng.a(", homeTeamName=", this.d, ", awayTeamName=", sb, this.c);
        return uf80.a(sb, this.e, ")");
    }
}
