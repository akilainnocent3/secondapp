package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class own {
    public final String a;
    public final String b;
    public final String c;

    public own(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof own)) {
            return false;
        }
        own ownVar = (own) obj;
        return this.a.equals(ownVar.a) && this.b.equals(ownVar.b) && this.c.equals(ownVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantRacingLeague(id=", this.a, ", iconUrl=", this.b, ", name="), this.c, ")");
    }
}
