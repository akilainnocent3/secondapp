package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cr3 {
    public final boolean a;
    public final aut b;

    public cr3(boolean z, aut autVar) {
        float f = ivt.a;
        this.a = z;
        this.b = autVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cr3) {
            cr3 cr3Var = (cr3) obj;
            if (this.a != cr3Var.a || this.b != cr3Var.b) {
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
        StringBuilder sb = new StringBuilder("BetslipMissionScrollState(pending=");
        sb.append(this.a);
        sb.append(", onConsumed=");
        sb.append(this.b);
        sb.append(", topOffset=");
        return uf80.a(sb, strC, ")");
    }
}
