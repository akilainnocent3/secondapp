package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dwz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;

    public /* synthetic */ dwz(int i) {
        this(false, false, false, false, false, false, (i & 64) != 0 ? 0 : 8, (i & 128) == 0 ? 64 : 0);
    }

    public final boolean a() {
        return this.a && this.b && this.c && this.d && this.e && this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwz)) {
            return false;
        }
        dwz dwzVar = (dwz) obj;
        return this.a == dwzVar.a && this.b == dwzVar.b && this.c == dwzVar.c && this.d == dwzVar.d && this.e == dwzVar.e && this.f == dwzVar.f && this.g == dwzVar.g && this.h == dwzVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + gpp.a(this.g, mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("PasswordStatus(conformsWithMinimumLength=", ", conformsWithMaximumLength=", ", containsNumber=", this.a, this.b);
        nng.a(", containsUppercaseCharacter=", ", containsLowercaseCharacter=", sbA, this.c, this.d);
        nng.a(", containsSpecialCharacter=", ", minimumLength=", sbA, this.e, this.f);
        return b7f.a(sbA, this.g, ", maximumLength=", this.h, ")");
    }

    public dwz(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
    }
}
