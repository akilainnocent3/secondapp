package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ssq {
    public final String a;
    public final String b;
    public final String c;
    public final atq d;
    public final int e;
    public final String f;
    public final qcn<yxq> g;

    public ssq(String str, String str2, String str3, atq atqVar, int i, String str4, qcn<yxq> qcnVar) {
        str.getClass();
        str2.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = atqVar;
        this.e = i;
        this.f = str4;
        this.g = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssq)) {
            return false;
        }
        ssq ssqVar = (ssq) obj;
        return Intrinsics.g(this.a, ssqVar.a) && Intrinsics.g(this.b, ssqVar.b) && Intrinsics.g(this.c, ssqVar.c) && this.d == ssqVar.d && this.e == ssqVar.e && Intrinsics.g(this.f, ssqVar.f) && Intrinsics.g(this.g, ssqVar.g);
    }

    public final int hashCode() {
        int iA = gpp.a(this.e, (this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
        String str = this.f;
        return this.g.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNMarket(marketId=", this.a, ", marketName=", this.b, ", description=");
        sbA.append(this.c);
        sbA.append(", type=");
        sbA.append(this.d);
        sbA.append(", userPickCount=");
        f78.b(this.e, ", specifier=", this.f, ", outcomes=", sbA);
        return ts3.a(sbA, this.g, ")");
    }

    public ssq() {
        this(0);
    }

    public ssq(int i) {
        this("", "", "", atq.SNM, 0, null, n1a0.c);
    }
}
