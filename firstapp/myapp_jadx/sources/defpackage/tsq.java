package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tsq {
    public final String a;
    public final String b;
    public final qcn<ssq> c;

    public tsq(uf00 uf00Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsq)) {
            return false;
        }
        tsq tsqVar = (tsq) obj;
        return Intrinsics.g(this.a, tsqVar.a) && Intrinsics.g(this.b, tsqVar.b) && Intrinsics.g(this.c, tsqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ts3.a(ux5.a("LNMarketGroup(id=", this.a, ", name=", this.b, ", market="), this.c, ")");
    }
}
