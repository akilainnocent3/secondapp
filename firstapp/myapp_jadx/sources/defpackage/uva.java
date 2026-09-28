package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class uva implements p480 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public uva(int i, int i2, long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            r480 r480Var = new r480(0L, j3);
            return new p480.a(r480Var, r480Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        r480 r480Var2 = new r480(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new p480.a(r480Var2, new r480((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new p480.a(r480Var2, r480Var2);
    }

    @Override // defpackage.p480
    public final boolean g() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.f;
    }
}
