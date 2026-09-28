package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cov {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final int f;

    public cov(String str, long j, long j2, boolean z, long j3, int i) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cov)) {
            return false;
        }
        cov covVar = (cov) obj;
        if (!Intrinsics.g(this.a, covVar.a)) {
            return false;
        }
        long j = covVar.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && nbh0.a(this.c, covVar.c) && this.d == covVar.d && this.e == covVar.e && this.f == covVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Integer.hashCode(this.f) + f87.a(mtg0.a(f87.a(f87.a(iHashCode, this.b, 31), this.c, 31), 31, this.d), this.e, 31);
    }

    public final String toString() {
        String strI = j58.i(this.b);
        String strI2 = j58.i(this.c);
        StringBuilder sbA = ux5.a("MessageOverlayState(message=", this.a, ", bgColor=", strI, ", textColor=");
        uts.b(strI2, ", networkToast=", ", duration=", sbA, this.d);
        to10.a(sbA, this.e, rarBonoqWB.GzbIGWNTe, this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
