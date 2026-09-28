package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class qqf0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public qqf0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqf0)) {
            return false;
        }
        qqf0 qqf0Var = (qqf0) obj;
        return this.a.equals(qqf0Var.a) && this.b.equals(qqf0Var.b) && this.c == qqf0Var.c && this.d == qqf0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return b7f.a(ux5.a("TicketStats(desc=", this.a, ", title=", this.b, ", value="), this.c, ", valueType=", this.d, ")");
    }
}
