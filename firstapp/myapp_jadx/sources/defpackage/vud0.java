package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vud0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public vud0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vud0)) {
            return false;
        }
        vud0 vud0Var = (vud0) obj;
        return this.a.equals(vud0Var.a) && this.b == vud0Var.b && this.c == vud0Var.c && this.d == vud0Var.d && this.e == vud0Var.e && this.f == vud0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("StakeUiChecklistRow(stateKey=", this.a, ", expectMinusEnabled=", ", expectPlusEnabled=", this.b);
        nng.a(", expectAmountClickable=", ", expectChipsEnabled=", sbA, this.c, this.d);
        return lng.a(", expectGiftEnabled=", ")", sbA, this.e, this.f);
    }
}
