package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class chj0 {
    public final qhj0 a;
    public final long b;

    public chj0(qhj0 qhj0Var, long j) {
        this.a = qhj0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj0)) {
            return false;
        }
        chj0 chj0Var = (chj0) obj;
        return this.a.equals(chj0Var.a) && this.b == chj0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithdrawAlertConfig(withdrawAlertConfig=" + this.a + ", lastUpdateTimestamp=" + this.b + ")";
    }
}
