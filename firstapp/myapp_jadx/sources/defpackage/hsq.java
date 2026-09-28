package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hsq {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final int e;
    public final glq f;
    public final glq g;
    public final glq h;
    public final String i;
    public final String j;
    public final fjr k;
    public final long l;
    public final qcn<jer> m;

    public hsq(String str, boolean z, String str2, String str3, int i, glq glqVar, glq glqVar2, glq glqVar3, String str4, String str5, fjr fjrVar, long j, qcn<jer> qcnVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        glqVar.getClass();
        glqVar2.getClass();
        glqVar3.getClass();
        str4.getClass();
        fjrVar.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = glqVar;
        this.g = glqVar2;
        this.h = glqVar3;
        this.i = str4;
        this.j = str5;
        this.k = fjrVar;
        this.l = j;
        this.m = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsq)) {
            return false;
        }
        hsq hsqVar = (hsq) obj;
        return Intrinsics.g(this.a, hsqVar.a) && this.b == hsqVar.b && Intrinsics.g(this.c, hsqVar.c) && Intrinsics.g(this.d, hsqVar.d) && this.e == hsqVar.e && Intrinsics.g(this.f, hsqVar.f) && Intrinsics.g(this.g, hsqVar.g) && Intrinsics.g(this.h, hsqVar.h) && Intrinsics.g(this.i, hsqVar.i) && Intrinsics.g(this.j, hsqVar.j) && Intrinsics.g(this.k, hsqVar.k) && this.l == hsqVar.l && Intrinsics.g(this.m, hsqVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + f87.a((this.k.hashCode() + gmf0.a(gmf0.a((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + gpp.a(this.e, gmf0.a(gmf0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31)) * 31)) * 31, 31, this.i), 31, this.j)) * 31, this.l, 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("LNLotteryUIState(id=", this.a, ", isFavorite=", ", countryCode=", this.b);
        hxa.c(sbA, this.c, ", countryName=", this.d, ", countryIndex=");
        sbA.append(this.e);
        sbA.append(", countryFlag=");
        sbA.append(this.f);
        sbA.append(", flag=");
        sbA.append(this.g);
        sbA.append(", backgroundUrl=");
        sbA.append(this.h);
        sbA.append(", name=");
        hxa.c(sbA, this.i, ", drawTime=", this.j, ", clock=");
        sbA.append(this.k);
        sbA.append(", drawTimeForElapsedRealtime=");
        sbA.append(this.l);
        sbA.append(", streamSchedule=");
        sbA.append(this.m);
        sbA.append(")");
        return sbA.toString();
    }

    public hsq() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hsq(int i) {
        glq.a aVar = glq.a.a;
        this("", false, "", "", -1, aVar, aVar, aVar, "", "", new fjr(), 0L, n1a0.c);
    }
}
