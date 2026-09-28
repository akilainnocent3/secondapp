package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class lr7 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;

    public lr7(int i, int i2, int i3, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr7)) {
            return false;
        }
        lr7 lr7Var = (lr7) obj;
        return this.a == lr7Var.a && this.b == lr7Var.b && this.c == lr7Var.c && this.d == lr7Var.d && this.e == lr7Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, f87.a(gpp.a(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickEventPayload(sessionId=");
        sb.append(this.a);
        sb.append(", rowNumber=");
        sb.append(this.b);
        sb.append(", click=");
        sb.append(this.c);
        sb.append(", edgeOffset=");
        sb.append(this.d);
        sb.append(", stackerColumns=");
        return rr1.b(sb, this.e, ')');
    }
}
