package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class god {
    public final kod a;
    public final long b;

    public god(kod kodVar, long j) {
        this.a = kodVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof god)) {
            return false;
        }
        god godVar = (god) obj;
        return this.a.equals(godVar.a) && this.b == godVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DepositAlertConfig(depositAlertConfig=" + this.a + ", lastUpdateTimestamp=" + this.b + ")";
    }
}
