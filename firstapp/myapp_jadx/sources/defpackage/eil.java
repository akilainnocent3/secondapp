package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class eil {
    public final float a;
    public final float b;
    public final i060 c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public eil(float f, float f2, i060 i060Var, long j, long j2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = i060Var;
        this.d = j;
        this.e = j2;
        this.f = f3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eil)) {
            return false;
        }
        eil eilVar = (eil) obj;
        return g7f.b(this.a, eilVar.a) && g7f.b(this.b, eilVar.b) && this.c.equals(eilVar.c) && omf0.a(this.d, eilVar.d) && omf0.a(this.e, eilVar.e) && g7f.b(this.f, eilVar.f) && g7f.b(this.g, eilVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + tvh.a(this.b, Float.hashCode(this.a) * 31, 31)) * 31;
        pmf0[] pmf0VarArr = omf0.b;
        return Float.hashCode(this.g) + tvh.a(this.f, f87.a(f87.a(iHashCode, this.d, 31), this.e, 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strF = omf0.f(this.d);
        String strF2 = omf0.f(this.e);
        String strC3 = g7f.c(this.f);
        String strC4 = g7f.c(this.g);
        StringBuilder sbA = ux5.a("HeaderTabMetrics(height=", strC, ", cornerRadius=", strC2, ", shape=");
        sbA.append(this.c);
        sbA.append(", textSize=");
        sbA.append(strF);
        sbA.append(", lineHeight=");
        hxa.c(sbA, strF2, ", horizontalPadding=", strC3, ", borderWidth=");
        return uf80.a(sbA, strC4, ")");
    }
}
