package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3q {
    public final String a;
    public final qcn<Integer> b;
    public final qcn<Integer> c;

    public e3q(String str, uf00 uf00Var, uf00 uf00Var2) {
        str.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        this.a = str;
        this.b = uf00Var;
        this.c = uf00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3q)) {
            return false;
        }
        e3q e3qVar = (e3q) obj;
        return Intrinsics.g(this.a, e3qVar.a) && Intrinsics.g(this.b, e3qVar.b) && Intrinsics.g(this.c, e3qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNBettingOrder(ticketId=");
        sb.append(this.a);
        sb.append(", mainBalls=");
        sb.append(this.b);
        sb.append(", bonusBalls=");
        return ts3.a(sb, this.c, ")");
    }
}
