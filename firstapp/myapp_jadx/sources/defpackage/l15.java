package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class l15 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final c45 e;
    public final int f;

    public l15(boolean z, boolean z2, boolean z3, boolean z4, c45 c45Var, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = c45Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l15)) {
            return false;
        }
        l15 l15Var = (l15) obj;
        return this.a == l15Var.a && this.b == l15Var.b && this.c == l15Var.c && this.d == l15Var.d && this.e == l15Var.e && this.f == l15Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BookingPanelTabData(codeHubEnable=", ", recentCodeEnable=", ", multiMakerEnable=", this.a, this.b);
        nng.a(", swipeBetEnable=", ", showBottomButton=", sbA, this.c, this.d);
        sbA.append(this.e);
        sbA.append(", tabCount=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
