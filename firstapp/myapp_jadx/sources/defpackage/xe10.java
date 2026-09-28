package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class xe10 {
    public final String a;
    public final String b;
    public final String c;

    public xe10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe10)) {
            return false;
        }
        xe10 xe10Var = (xe10) obj;
        return this.a.equals(xe10Var.a) && this.b.equals(xe10Var.b) && this.c.equals(xe10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("PixQrCodeResult(tradeId=", this.a, ", qrCode=", this.b, ", amount="), this.c, ")");
    }
}
