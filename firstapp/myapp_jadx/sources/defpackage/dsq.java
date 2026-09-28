package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dsq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final qcn<esq> h;

    public dsq(String str, String str2, String str3, String str4, String str5, long j, long j2, qcn<esq> qcnVar) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = j2;
        this.h = qcnVar;
    }

    public static dsq a(dsq dsqVar, String str, long j, long j2, qcn qcnVar, int i) {
        String str2 = dsqVar.a;
        String str3 = dsqVar.b;
        String str4 = dsqVar.c;
        String str5 = dsqVar.d;
        if ((i & 16) != 0) {
            str = dsqVar.e;
        }
        String str6 = str;
        if ((i & 32) != 0) {
            j = dsqVar.f;
        }
        long j3 = j;
        long j4 = (i & 64) != 0 ? dsqVar.g : j2;
        qcn qcnVar2 = (i & 128) != 0 ? dsqVar.h : qcnVar;
        str2.getClass();
        str3.getClass();
        str5.getClass();
        str6.getClass();
        qcnVar2.getClass();
        return new dsq(str2, str3, str4, str5, str6, j3, j4, qcnVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsq)) {
            return false;
        }
        dsq dsqVar = (dsq) obj;
        return Intrinsics.g(this.a, dsqVar.a) && Intrinsics.g(this.b, dsqVar.b) && Intrinsics.g(this.c, dsqVar.c) && Intrinsics.g(this.d, dsqVar.d) && Intrinsics.g(this.e, dsqVar.e) && this.f == dsqVar.f && this.g == dsqVar.g && Intrinsics.g(this.h, dsqVar.h);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.h.hashCode() + f87.a(f87.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNLotterySimpleData(id=", this.a, ", countryCode=", this.b, ", logoUrl=");
        hxa.c(sbA, this.c, ", name=", this.d, ", drawId=");
        l.a(this.f, this.e, ", drawTime=", sbA);
        g41.a(this.g, ", drawTimeForElapsedRealtime=", ", streams=", sbA);
        return ts3.a(sbA, this.h, ")");
    }
}
