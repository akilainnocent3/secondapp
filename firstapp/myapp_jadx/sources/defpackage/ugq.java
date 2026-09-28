package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ugq {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public ugq(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugq)) {
            return false;
        }
        ugq ugqVar = (ugq) obj;
        long j = ugqVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, ugqVar.b) && nbh0.a(this.c, ugqVar.c) && nbh0.a(this.d, ugqVar.d) && nbh0.a(this.e, ugqVar.e) && nbh0.a(this.f, ugqVar.f) && nbh0.a(this.g, ugqVar.g) && nbh0.a(this.h, ugqVar.h);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.h) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String strI = j58.i(this.a);
        String strI2 = j58.i(this.b);
        String strI3 = j58.i(this.c);
        String strI4 = j58.i(this.d);
        String strI5 = j58.i(this.e);
        String strI6 = j58.i(this.f);
        String strI7 = j58.i(this.g);
        String strI8 = j58.i(this.h);
        StringBuilder sbA = ux5.a("LNHistoryColor(iconColor=", strI, ", winTypeTagBg=", strI2, ", winTypeTagText=");
        hxa.c(sbA, strI3, ", totalReturnAmountColor=", strI4, ", selectionTitleBg=");
        hxa.c(sbA, strI5, ", selectionResultColor=", strI6, ", historyCardTitleBg=");
        return kwi.a(sbA, strI7, ", detailResultTextColor=", strI8, ")");
    }
}
