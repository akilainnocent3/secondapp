package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dii0 {
    public final String a;
    public final String b;
    public final String c;

    public dii0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dii0)) {
            return false;
        }
        dii0 dii0Var = (dii0) obj;
        return this.a.equals(dii0Var.a) && this.b.equals(dii0Var.b) && this.c.equals(dii0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("VirtualLobbyGetStartedBottomCallToActionState(text=", this.a, ", redirectUrl=", this.b, ", updateRequiredAppVersion="), this.c, ")");
    }
}
