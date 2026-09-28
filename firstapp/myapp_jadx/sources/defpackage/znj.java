package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class znj {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public znj(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znj)) {
            return false;
        }
        znj znjVar = (znj) obj;
        return this.a == znjVar.a && this.b == znjVar.b && this.c == znjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("GameThemeFlags(isXmasTheme=", ", isFuguTheme=", ", isWorldCupTheme=", this.a, this.b), this.c, ")");
    }
}
