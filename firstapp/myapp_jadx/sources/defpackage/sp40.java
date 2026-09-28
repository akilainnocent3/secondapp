package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class sp40 {
    public final int a;
    public final int b;
    public final int c;

    public sp40(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp40)) {
            return false;
        }
        sp40 sp40Var = (sp40) obj;
        return this.a == sp40Var.a && this.b == sp40Var.b && this.c == sp40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", dy5.a("RedeemReminderKey(userId=", this.a, this.b, ", campaignId=", ", campaignTierId="));
    }
}
