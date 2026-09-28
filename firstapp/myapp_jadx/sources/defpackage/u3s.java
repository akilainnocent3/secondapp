package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u3s {
    public final int a;
    public final v3s b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public u3s(int i, v3s v3sVar, String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = v3sVar;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3s)) {
            return false;
        }
        u3s u3sVar = (u3s) obj;
        return this.a == u3sVar.a && this.b == u3sVar.b && this.c.equals(u3sVar.c) && this.d.equals(u3sVar.d) && this.e == u3sVar.e && this.f == u3sVar.f && this.g == u3sVar.g && this.h == u3sVar.h && this.i == u3sVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gmf0.a(gmf0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeagueStatsTeamInfo(position=");
        sb.append(this.a);
        sb.append(", trend=");
        sb.append(this.b);
        sb.append(", logoUrl=");
        hxa.c(sb, this.c, ", name=", this.d, ", played=");
        d5d.a(sb, this.e, ", won=", this.f, ", drawn=");
        d5d.a(sb, this.g, ", lost=", this.h, ", points=");
        return zk1.a(this.i, ")", sb);
    }
}
