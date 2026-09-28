package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ned implements xly {
    public final wly a;
    public final long b;
    public final long c;
    public final d8e0 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public final class a implements p480 {
        public a() {
        }

        @Override // defpackage.p480
        public final p480.a d(long j) {
            ned nedVar = ned.this;
            long j2 = (((long) nedVar.d.i) * j) / 1000000;
            long j3 = nedVar.b;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
            long j4 = nedVar.c;
            r480 r480Var = new r480(j, jrh0.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(nedVar.f)).longValue() + j3) - 30000, nedVar.b, j4 - 1));
            return new p480.a(r480Var, r480Var);
        }

        @Override // defpackage.p480
        public final boolean g() {
            return true;
        }

        @Override // defpackage.p480
        public final long k() {
            ned nedVar = ned.this;
            return (nedVar.f * 1000000) / ((long) nedVar.d.i);
        }
    }

    public ned(d8e0 d8e0Var, long j, long j2, long j3, long j4, boolean z) {
        ly0.b(j >= 0 && j2 > j);
        this.d = d8e0Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new wly();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.xly
    public final long a(l4h l4hVar) throws IOException {
        long j;
        long j2;
        int i = this.e;
        long j3 = this.c;
        wly wlyVar = this.a;
        if (i == 0) {
            long position = l4hVar.getPosition();
            this.g = position;
            this.e = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    j2 = -1;
                } else {
                    long position2 = l4hVar.getPosition();
                    if (wlyVar.b(l4hVar, this.j)) {
                        wlyVar.a(l4hVar, false);
                        l4hVar.e();
                        long j5 = this.h;
                        long j6 = wlyVar.b;
                        long j7 = j5 - j6;
                        j = 2;
                        int i2 = wlyVar.d + wlyVar.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.j = position2;
                                this.l = j6;
                            } else {
                                this.i = l4hVar.getPosition() + ((long) i2);
                                this.k = wlyVar.b;
                            }
                            long j8 = this.j;
                            long j9 = this.i;
                            if (j8 - j9 < 100000) {
                                this.j = j9;
                                j2 = j9;
                            } else {
                                long position3 = l4hVar.getPosition() - (((long) i2) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.j;
                                long j11 = this.i;
                                j2 = jrh0.j((((j10 - j11) * j7) / (this.l - this.k)) + position3, j11, j10 - 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = this.i;
                        if (j2 == position2) {
                            i08.a("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                    this.e = 3;
                }
                j = 2;
                if (j2 != -1) {
                    return j2;
                }
                this.e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    fm20.a();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                wlyVar.b(l4hVar, -1L);
                wlyVar.a(l4hVar, false);
                if (wlyVar.b > this.h) {
                    l4hVar.e();
                    this.e = 4;
                    return -(this.k + j);
                }
                l4hVar.l(wlyVar.d + wlyVar.e);
                this.i = l4hVar.getPosition();
                this.k = wlyVar.b;
            }
        }
        wlyVar.a = 0;
        wlyVar.b = 0L;
        wlyVar.c = 0;
        wlyVar.d = 0;
        wlyVar.e = 0;
        if (!wlyVar.b(l4hVar, -1L)) {
            throw new EOFException();
        }
        wlyVar.a(l4hVar, false);
        l4hVar.l(wlyVar.d + wlyVar.e);
        long j12 = wlyVar.b;
        while ((wlyVar.a & 4) != 4 && wlyVar.b(l4hVar, -1L) && l4hVar.getPosition() < j3 && wlyVar.a(l4hVar, true)) {
            try {
                l4hVar.l(wlyVar.d + wlyVar.e);
                j12 = wlyVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j12;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.xly
    public final p480 b() {
        if (this.f != 0) {
            return new a();
        }
        return null;
    }

    @Override // defpackage.xly
    public final void c(long j) {
        this.h = jrh0.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
