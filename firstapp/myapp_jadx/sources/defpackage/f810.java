package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class f810 {
    public static final f810 c = new f810(3000, 10000);
    public final int a;
    public final int b;

    public f810(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f810)) {
            return false;
        }
        f810 f810Var = (f810) obj;
        return this.a == f810Var.a && this.b == f810Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return n36.a("PixBtgDepositPollingConfig(interval=", this.a, this.b, ", maxTotalDuration=", ")");
    }
}
