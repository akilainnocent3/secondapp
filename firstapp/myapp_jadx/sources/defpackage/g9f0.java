package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class g9f0 {
    public final int a;
    public final bgg0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;

    public g9f0(int i, bgg0 bgg0Var, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        this.a = i;
        this.b = bgg0Var;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9f0)) {
            return false;
        }
        g9f0 g9f0Var = (g9f0) obj;
        return this.a == g9f0Var.a && this.b.equals(g9f0Var.b) && this.c == g9f0Var.c && this.d == g9f0Var.d && this.e == g9f0Var.e && this.f == g9f0Var.f && this.g == g9f0Var.g && this.h == g9f0Var.h && this.i == g9f0Var.i && this.j == g9f0Var.j && this.k == g9f0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + gpp.a(this.j, gpp.a(this.i, gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamStanding(position=");
        sb.append(this.a);
        sb.append(", team=");
        sb.append(this.b);
        sb.append(", played=");
        d5d.a(sb, this.c, ", won=", this.d, ", drawn=");
        d5d.a(sb, this.e, ", lost=", this.f, ", goalsFor=");
        d5d.a(sb, this.g, ", goalsAgainst=", this.h, ", goalsDifference=");
        d5d.a(sb, this.i, ", points=", this.j, ", stillInTournament=");
        return mq0.a(sb, this.k, ")");
    }
}
