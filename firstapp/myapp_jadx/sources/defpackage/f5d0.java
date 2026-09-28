package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class f5d0 {
    public final n4d0 a;
    public final n4d0 b;
    public final boolean c;

    public f5d0(n4d0 n4d0Var, n4d0 n4d0Var2, boolean z) {
        this.a = n4d0Var;
        this.b = n4d0Var2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5d0)) {
            return false;
        }
        f5d0 f5d0Var = (f5d0) obj;
        return this.a.equals(f5d0Var.a) && this.b.equals(f5d0Var.b) && this.c == f5d0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltyStatsState(leftCardState=");
        sb.append(this.a);
        sb.append(", rightCardState=");
        sb.append(this.b);
        sb.append(", isDescriptionExpanded=");
        return mq0.a(sb, this.c, ")");
    }
}
