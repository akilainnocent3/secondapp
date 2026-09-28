package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b800 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final d800 g;

    public b800(int i, String str, int i2, int i3, int i4, boolean z, d800 d800Var) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = d800Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b800)) {
            return false;
        }
        b800 b800Var = (b800) obj;
        return this.a == b800Var.a && Intrinsics.g(this.b, b800Var.b) && this.c == b800Var.c && this.d == b800Var.d && this.e == b800Var.e && this.f == b800Var.f && this.g == b800Var.g;
    }

    public final int hashCode() {
        int iA = mtg0.a(gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31, this.f);
        d800 d800Var = this.g;
        return iA + (d800Var == null ? 0 : d800Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "PaymentItemUI(id=", ", name=", this.b, ", image=");
        d5d.a(sbA, this.c, ", positionTab=", this.d, ", positionInnerTab=");
        sbA.append(this.e);
        sbA.append(", isToolTipIconVisible=");
        sbA.append(this.f);
        sbA.append(", label=");
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
