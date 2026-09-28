package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cwk {
    public static final cwk g = new cwk(false, false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public cwk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwk)) {
            return false;
        }
        cwk cwkVar = (cwk) obj;
        return this.a == cwkVar.a && this.b == cwkVar.b && this.c == cwkVar.c && this.d == cwkVar.d && this.e == cwkVar.e && this.f == cwkVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("GiftUpTypeState(hasOneUpSupportSelections=", ", hasTwoUpSupportSelections=", ", hasOneUpActivatedCheckEventAvailable=", this.a, this.b);
        nng.a(", hasTwoUpActivatedCheckEventAvailable=", ", areAllSelectionsOneUpActivatedCheckEventAvailable=", sbA, this.c, this.d);
        return lng.a(", areAllSelectionsTwoUpActivatedCheckEventAvailable=", ")", sbA, this.e, this.f);
    }
}
