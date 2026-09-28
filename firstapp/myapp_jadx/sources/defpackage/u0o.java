package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u0o {
    public final int a;
    public final int b;
    public final String c;

    public u0o(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0o)) {
            return false;
        }
        u0o u0oVar = (u0o) obj;
        return this.a == u0oVar.a && this.b == u0oVar.b && this.c.equals(u0oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uf80.a(dy5.a("InstantRacingRaceRankState(rank=", this.a, this.b, ", racerNumber=", ", racerNumberUrl="), this.c, ")");
    }
}
