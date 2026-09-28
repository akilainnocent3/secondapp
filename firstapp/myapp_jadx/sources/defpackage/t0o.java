package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class t0o {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public t0o(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0o)) {
            return false;
        }
        t0o t0oVar = (t0o) obj;
        return this.a == t0oVar.a && this.b.equals(t0oVar.b) && this.c.equals(t0oVar.c) && this.d.equals(t0oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(uqe0.a(this.a, "InstantRacingRaceRacerState(racerNumber=", ", racerNameText=", this.b, ", racerNumberUrl="), this.c, ", racerUrl=", this.d, ")");
    }
}
