package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class chi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public chi0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chi0)) {
            return false;
        }
        chi0 chi0Var = (chi0) obj;
        return this.a.equals(chi0Var.a) && this.b.equals(chi0Var.b) && this.c.equals(chi0Var.c) && this.d.equals(chi0Var.d) && this.e.equals(chi0Var.e) && this.f.equals(chi0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("VirtualLobbyEntranceCard(itemName=", this.a, ", displayName=", this.b, ", entranceLabel=");
        hxa.c(sbA, this.c, ", label=", this.d, ", imgUrl=");
        return kwi.a(sbA, this.e, ", cardResourceId=", this.f, ")");
    }
}
