package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class zj4 {
    public final long a;
    public final int b;
    public final bk4 c;
    public final ek4 d;

    public zj4(long j, int i, bk4 bk4Var, ek4 ek4Var) {
        this.a = j;
        this.b = i;
        this.c = bk4Var;
        this.d = ek4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj4)) {
            return false;
        }
        zj4 zj4Var = (zj4) obj;
        return this.a == zj4Var.a && this.b == zj4Var.b && this.c == zj4Var.c && this.d == zj4Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gpp.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "BonusCupEventPayload(sessionId=" + this.a + ", objectId=" + this.b + ", eventType=" + this.c + ", objectType=" + this.d + ')';
    }
}
