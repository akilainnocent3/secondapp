package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yxt {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final String j;
    public final boolean k;
    public final knc l;

    public yxt(String str, int i, String str2, long j, long j2, long j3, Long l, Long l2, Long l3, String str3, boolean z, knc kncVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = l;
        this.h = l2;
        this.i = l3;
        this.j = str3;
        this.k = z;
        this.l = kncVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxt)) {
            return false;
        }
        yxt yxtVar = (yxt) obj;
        return Intrinsics.g(this.a, yxtVar.a) && this.b == yxtVar.b && Intrinsics.g(this.c, yxtVar.c) && this.d == yxtVar.d && this.e == yxtVar.e && this.f == yxtVar.f && Intrinsics.g(this.g, yxtVar.g) && Intrinsics.g(this.h, yxtVar.h) && Intrinsics.g(this.i, yxtVar.i) && Intrinsics.g(this.j, yxtVar.j) && this.k == yxtVar.k && Intrinsics.g(this.l, yxtVar.l);
    }

    public final int hashCode() {
        int iA = f87.a(f87.a(f87.a(gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31), this.e, 31), this.f, 31);
        Long l = this.g;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.j;
        int iA2 = mtg0.a((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
        knc kncVar = this.l;
        return iA2 + (kncVar != null ? kncVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "LoyaltyReward(batchId=", this.a, ", status=", ", currency=");
        l.a(this.d, this.c, ", startTime=", sbA);
        g41.a(this.e, ", endTime=", ", potentialReward=", sbA);
        sbA.append(this.f);
        sbA.append(", claimedAmount=");
        sbA.append(this.g);
        sbA.append(", claimedTime=");
        sbA.append(this.h);
        sbA.append(", lastClaimedTime=");
        sbA.append(this.i);
        sbA.append(", userId=");
        sbA.append(this.j);
        sbA.append(", isDaily=");
        sbA.append(this.k);
        sbA.append(", dailyRecord=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}
