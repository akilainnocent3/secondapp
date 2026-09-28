package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rt3 {
    public final boolean a;
    public final but b;

    public rt3(boolean z, but butVar) {
        float f = ivt.a;
        this.a = z;
        this.b = butVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt3) {
            rt3 rt3Var = (rt3) obj;
            if (this.a != rt3Var.a || this.b != rt3Var.b) {
                return false;
            }
            float f = ivt.a;
            if (g7f.b(f, f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(ivt.a) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String strC = g7f.c(ivt.a);
        StringBuilder sb = new StringBuilder("BetslipSectionScrollState(pending=");
        sb.append(this.a);
        sb.append(", onConsumed=");
        sb.append(this.b);
        sb.append(", topOffset=");
        return uf80.a(sb, strC, ")");
    }
}
