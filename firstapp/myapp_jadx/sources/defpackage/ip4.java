package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ip4 {
    public final long a;

    public ip4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip4) && this.a == ((ip4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return uvh.a(new StringBuilder("BonusCupSpawnRequestPayload(sessionId="), this.a, ')');
    }
}
