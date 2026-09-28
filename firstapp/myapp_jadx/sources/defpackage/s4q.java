package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s4q {
    public final String a;
    public final String b;
    public final int c;
    public final glq d;
    public final boolean e;
    public final qcn<hsq> f;

    public s4q(String str, String str2, int i, glq glqVar, boolean z, uf00 uf00Var) {
        str.getClass();
        str2.getClass();
        glqVar.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = glqVar;
        this.e = z;
        this.f = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4q)) {
            return false;
        }
        s4q s4qVar = (s4q) obj;
        return Intrinsics.g(this.a, s4qVar.a) && Intrinsics.g(this.b, s4qVar.b) && this.c == s4qVar.c && Intrinsics.g(this.d, s4qVar.d) && this.e == s4qVar.e && Intrinsics.g(this.f, s4qVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a((this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNCountryItemState(countryCode=", this.a, ", name=", this.b, ", countryIndex=");
        sbA.append(this.c);
        sbA.append(", countryFlag=");
        sbA.append(this.d);
        sbA.append(", isOpen=");
        sbA.append(this.e);
        sbA.append(", lotteries=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
