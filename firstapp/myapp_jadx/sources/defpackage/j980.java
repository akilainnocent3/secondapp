package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class j980 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ j980(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j980)) {
            return false;
        }
        j980 j980Var = (j980) obj;
        return this.a == j980Var.a && this.b == j980Var.b && this.c == j980Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("SelectionReplacementOption(isUpMarket=", ", isEarlyGoalsMarket=", ", isNeverDownMarket=", this.a, this.b), this.c, ")");
    }

    public j980(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
