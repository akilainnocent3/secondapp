package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class w600 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public static final class a {
        public long a;
        public long b;
        public long c;
    }

    public w600(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final String toString() {
        StringBuilder sbA = q6a0.a(this.a, "PaymentConfig{minDeposit=", ", maxDeposit=");
        sbA.append(this.b);
        g41.a(this.c, ", minWithdraw=", ", maxWithdraw=", sbA);
        return nrz.a(this.d, "}", sbA);
    }
}
