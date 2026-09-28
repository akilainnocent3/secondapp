package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iu5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public iu5(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = ((((long) i3) * 86400000) + j) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu5)) {
            return false;
        }
        iu5 iu5Var = (iu5) obj;
        return this.a == iu5Var.a && this.b == iu5Var.b && this.c == iu5Var.c && this.d == iu5Var.d && this.e == iu5Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return uvh.a(sb, this.e, ')');
    }
}
