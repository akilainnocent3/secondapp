package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class nwn {
    public final String a;
    public final String b;
    public final String c;

    public nwn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwn)) {
            return false;
        }
        nwn nwnVar = (nwn) obj;
        return this.a.equals(nwnVar.a) && this.b.equals(nwnVar.b) && this.c.equals(nwnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantRacingGameType(id=", this.a, ", name=", this.b, ", type="), this.c, ")");
    }
}
