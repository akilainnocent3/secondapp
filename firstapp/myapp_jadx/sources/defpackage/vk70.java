package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vk70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public vk70(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk70)) {
            return false;
        }
        vk70 vk70Var = (vk70) obj;
        return this.a.equals(vk70Var.a) && this.b.equals(vk70Var.b) && this.c.equals(vk70Var.c) && this.d.equals(vk70Var.d) && this.e.equals(vk70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
