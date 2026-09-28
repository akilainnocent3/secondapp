package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sk1 extends owd0 {
    public final long a;
    public final long b;
    public final long c;

    public sk1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.owd0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.owd0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.owd0
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof owd0)) {
            return false;
        }
        owd0 owd0Var = (owd0) obj;
        return this.a == owd0Var.b() && this.b == owd0Var.a() && this.c == owd0Var.c();
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return nrz.a(this.c, "}", sb);
    }
}
