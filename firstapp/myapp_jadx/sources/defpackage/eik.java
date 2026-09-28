package defpackage;

import com.appsflyer.internal.l;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eik {
    public final String a;
    public final awk b;
    public final rvk c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final ArrayList k;
    public final boolean l;
    public final boolean m;

    public eik(String str, awk awkVar, rvk rvkVar, String str2, String str3, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = awkVar;
        this.c = rvkVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = arrayList;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eik)) {
            return false;
        }
        eik eikVar = (eik) obj;
        return Intrinsics.g(this.a, eikVar.a) && this.b == eikVar.b && this.c == eikVar.c && Intrinsics.g(this.d, eikVar.d) && Intrinsics.g(this.e, eikVar.e) && this.f == eikVar.f && this.g == eikVar.g && this.h == eikVar.h && this.i == eikVar.i && this.j == eikVar.j && this.k.equals(eikVar.k) && this.l == eikVar.l && this.m == eikVar.m;
    }

    public final int hashCode() {
        int iA = gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.m) + mtg0.a(vt5.a(this.k, f87.a(f87.a(f87.a(f87.a(f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gift(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        l.a(this.f, this.e, ", initialBalance=", sb);
        g41.a(this.g, ", currentBalance=", ", usableTime=", sb);
        sb.append(this.h);
        g41.a(this.i, ", expireTime=", ", leastOrderAmount=", sb);
        sb.append(this.j);
        sb.append(", applicableCategories=");
        sb.append(this.k);
        u8.a(", requiresBvnVerification=", ", isWorldCupPass=", sb, this.l, this.m);
        sb.append(")");
        return sb.toString();
    }
}
