package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nye {
    public final boolean a;
    public final long b;
    public final int c;

    public nye(int i, long j, int i2) {
        boolean z = (i2 & 1) == 0;
        j = (i2 & 2) != 0 ? 0L : j;
        i = (i2 & 4) != 0 ? 0 : i;
        this.a = z;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nye)) {
            return false;
        }
        nye nyeVar = (nye) obj;
        return this.a == nyeVar.a && this.b == nyeVar.b && this.c == nyeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f87.a(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DomainAck(isNegativeAck=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", rowNumber=");
        return rr1.b(sb, this.c, ')');
    }

    public nye() {
        this(0, 0L, 7);
    }
}
