package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g860 {
    public final qcn<lg6> a;
    public final String b;
    public final String c;

    public g860(uf00 uf00Var, String str, String str2) {
        uf00Var.getClass();
        str.getClass();
        str2.getClass();
        this.a = uf00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g860)) {
            return false;
        }
        g860 g860Var = (g860) obj;
        return Intrinsics.g(this.a, g860Var.a) && Intrinsics.g(this.b, g860Var.b) && Intrinsics.g(this.c, g860Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBBetHistoryCard(cardItems=");
        sb.append(this.a);
        sb.append(", bet=");
        sb.append(this.b);
        sb.append(", won=");
        return j26.a(sb, this.c, ')');
    }
}
