package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ri1 implements gng {
    public final q21 a;
    public final long b;
    public final int c;
    public final Throwable d;

    public ri1(q21 q21Var, long j, int i, Throwable th) {
        this.a = q21Var;
        this.b = j;
        this.c = i;
        if (th != null) {
            this.d = th;
        } else {
            bmy.a("Null exception");
            throw null;
        }
    }

    @Override // defpackage.gng
    public final int a() {
        return this.c;
    }

    @Override // defpackage.gng
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ri1)) {
            return false;
        }
        ri1 ri1Var = (ri1) obj;
        return this.a.equals(ri1Var.a) && this.b == ri1Var.b && this.c == ri1Var.c && this.d.equals(ri1Var.d);
    }

    @Override // defpackage.gng
    public final m21 getAttributes() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.d.hashCode() ^ ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableExceptionEventData{attributes=" + this.a + ", epochNanos=" + this.b + ", totalAttributeCount=" + this.c + ", exception=" + this.d + "}";
    }
}
