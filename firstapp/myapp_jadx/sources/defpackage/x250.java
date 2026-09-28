package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class x250 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public x250(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x250)) {
            return false;
        }
        x250 x250Var = (x250) obj;
        return this.a == x250Var.a && this.b == x250Var.b && this.c == x250Var.c && this.d == x250Var.d && this.e == x250Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("RemainingTimeState(days=", this.a, this.b, ", hours=", ", minutes=");
        d5d.a(sbA, this.c, ", seconds=", this.d, ", isExpired=");
        return mq0.a(sbA, this.e, ")");
    }
}
