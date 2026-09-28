package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class b1h0 {
    public final Date a;
    public final Date b;
    public final String c;
    public final boolean d;

    public b1h0(Date date, Date date2, String str, boolean z) {
        this.a = date;
        this.b = date2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1h0)) {
            return false;
        }
        b1h0 b1h0Var = (b1h0) obj;
        return this.a.equals(b1h0Var.a) && this.b.equals(b1h0Var.b) && this.c.equals(b1h0Var.c) && this.d == b1h0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxDateRangeState(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", displayDateRange=");
        return x9d.a(this.c, ", isDefault=", ")", sb, this.d);
    }
}
