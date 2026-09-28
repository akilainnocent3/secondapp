package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class d7o {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public d7o(int i, String str, String str2, String str3, String str4, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7o)) {
            return false;
        }
        d7o d7oVar = (d7o) obj;
        return this.a == d7oVar.a && this.b.equals(d7oVar.b) && this.c == d7oVar.c && this.d.equals(d7oVar.d) && this.e.equals(d7oVar.e) && this.f.equals(d7oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(mtg0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "InstantVirtualShowOffRoundSelection(resultIconResId=", ", outcomeTagString=", this.b, ", isBetBuilder=");
        mng.a(", marketTitle=", this.d, ", outcomeDesc=", sbA, this.c);
        return kwi.a(sbA, this.e, ", outcomeOdds=", this.f, ")");
    }
}
