package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v1f {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final u1f d;
    public final ArrayList e;
    public final String f;

    public v1f(String str, String str2, BigDecimal bigDecimal, u1f u1fVar, ArrayList arrayList, String str3) {
        bigDecimal.getClass();
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = u1fVar;
        this.e = arrayList;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1f)) {
            return false;
        }
        v1f v1fVar = (v1f) obj;
        return this.a.equals(v1fVar.a) && Intrinsics.g(this.b, v1fVar.b) && Intrinsics.g(this.c, v1fVar.c) && this.d.equals(v1fVar.d) && this.e.equals(v1fVar.e) && Intrinsics.g(this.f, v1fVar.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(-709302610, 31, this.a);
        String str = this.b;
        int iA2 = vt5.a(this.e, (this.d.hashCode() + dd3.a(this.c, (iA + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31);
        String str2 = this.f;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DoubleOrNothingHostGameResult(sportId=sr:sport:3, sourceTicketId=", this.a, ", ticketNumber=", this.b, ", totalReturn=");
        sbA.append(this.c);
        sbA.append(", eventInfo=");
        sbA.append(this.d);
        sbA.append(", betOdds=");
        sbA.append(this.e);
        sbA.append(", challengeId=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
