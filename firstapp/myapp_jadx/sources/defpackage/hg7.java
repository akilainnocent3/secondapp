package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hg7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg7)) {
            return false;
        }
        hg7 hg7Var = (hg7) obj;
        return this.a.equals(hg7Var.a) && this.b.equals(hg7Var.b) && this.c.equals(hg7Var.c) && this.d.equals(hg7Var.d) && this.e.equals(hg7Var.e) && this.f.equals(hg7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        StringBuilder sbA = ux5.a("ChatSocketData(hardReset=false, url=", str, ", userId=", str2, ", eventId=");
        hxa.c(sbA, str3, ", platform=", str4, ", appVersion=");
        return kwi.a(sbA, str5, ", deviceId=", str6, ")");
    }
}
