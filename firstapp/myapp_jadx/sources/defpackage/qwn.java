package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qwn {
    public final jzn a;
    public final String b;
    public final String c;
    public final String d;
    public final dxn e;

    public qwn(jzn jznVar, String str, String str2, String str3, dxn dxnVar) {
        this.a = jznVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = dxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwn)) {
            return false;
        }
        qwn qwnVar = (qwn) obj;
        return this.a == qwnVar.a && this.b.equals(qwnVar.b) && this.c.equals(qwnVar.c) && this.d.equals(qwnVar.d) && this.e.equals(qwnVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingMarket(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", bannerTitles=");
        hxa.c(sb, this.c, ", guide=", this.d, ", layout=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
