package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class g0q {
    public final boolean a;
    public final boolean b;
    public final String c;

    public g0q(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0q)) {
            return false;
        }
        g0q g0qVar = (g0q) obj;
        return this.a == g0qVar.a && this.b == g0qVar.b && this.c.equals(g0qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(cwz.a("LNBetPanelGiftState(enable=", ", userEnable=", ", amount=", this.a, this.b), this.c, ")");
    }
}
