package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class db extends jld0 {
    public final long a;
    public final int b;

    public db(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.a == dbVar.a && this.b == dbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ack(sessionId=");
        sb.append(this.a);
        sb.append(", rowNumber=");
        return rr1.b(sb, this.b, ')');
    }
}
