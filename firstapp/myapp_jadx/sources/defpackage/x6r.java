package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x6r {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final qcn<y6r> i;
    public final qcn<esq> j;

    /* JADX WARN: Multi-variable type inference failed */
    public x6r(String str, String str2, String str3, long j, String str4, String str5, boolean z, boolean z2, qcn<? extends y6r> qcnVar, qcn<esq> qcnVar2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = qcnVar;
        this.j = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6r)) {
            return false;
        }
        x6r x6rVar = (x6r) obj;
        return Intrinsics.g(this.a, x6rVar.a) && Intrinsics.g(this.b, x6rVar.b) && Intrinsics.g(this.c, x6rVar.c) && this.d == x6rVar.d && this.e.equals(x6rVar.e) && Intrinsics.g(this.f, x6rVar.f) && this.g == x6rVar.g && this.h == x6rVar.h && Intrinsics.g(this.i, x6rVar.i) && Intrinsics.g(this.j, x6rVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + shu.a(this.i, mtg0.a(mtg0.a(gmf0.a(gmf0.a(f87.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNResultItem(drawId=", this.a, ", lotteryId=", this.b, ", name=");
        l.a(this.d, this.c, ", drawTime=", sbA);
        hxa.c(sbA, ", flag=", this.e, ", countryCode=", this.f);
        u8.a(", isFavorite=", ", isCanceled=", sbA, this.g, this.h);
        sbA.append(", results=");
        sbA.append(this.i);
        sbA.append(", streams=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
