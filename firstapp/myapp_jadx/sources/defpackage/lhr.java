package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class lhr {
    public final long a;
    public final long b;

    public lhr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhr)) {
            return false;
        }
        lhr lhrVar = (lhr) obj;
        return this.a == lhrVar.a && this.b == lhrVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nrz.a(this.b, ")", q6a0.a(this.a, "LNStreamTime(time=", ", targetElapsedRealtimeMillis="));
    }
}
