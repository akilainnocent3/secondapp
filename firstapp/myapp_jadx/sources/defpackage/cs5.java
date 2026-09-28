package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cs5 {
    public final gr5 a;
    public final br5 b;
    public final gqc c;
    public final String d;
    public final byte[] e = new byte[131072];
    public long f;
    public long g;

    public cs5(gr5 gr5Var, gqc gqcVar) {
        this.a = gr5Var;
        this.b = gr5Var.a;
        this.c = gqcVar;
        String str = gqcVar.h;
        this.d = str == null ? gqcVar.a.toString() : str;
        this.f = gqcVar.f;
    }

    public final void a() throws Exception {
        long jA;
        gqc gqcVar = this.c;
        this.b.e(gqcVar.f, this.d, gqcVar.g);
        long j = gqcVar.g;
        if (j != -1) {
            this.g = gqcVar.f + j;
        } else {
            long jA2 = xza.a(this.b.b(this.d));
            if (jA2 == -1) {
                jA2 = -1;
            }
            this.g = jA2;
        }
        while (true) {
            long j2 = this.g;
            if (j2 != -1 && this.f >= j2) {
                return;
            }
            long jA3 = this.b.a(this.f, this.d, j2 == -1 ? Long.MAX_VALUE : j2 - this.f);
            if (jA3 > 0) {
                this.f += jA3;
            } else {
                long j3 = -jA3;
                if (j3 == Long.MAX_VALUE) {
                    j3 = -1;
                }
                long j4 = this.f;
                boolean z = true;
                boolean z2 = j4 + j3 == this.g || j3 == -1;
                gr5 gr5Var = this.a;
                if (j3 != -1) {
                    gqc.a aVarA = gqcVar.a();
                    aVarA.f = j4;
                    aVarA.g = j3;
                    try {
                        jA = gr5Var.a(aVarA.a());
                    } catch (Exception unused) {
                        fqc.a(gr5Var);
                        jA = -1;
                        z = false;
                    }
                } else {
                    jA = -1;
                    z = false;
                }
                if (!z) {
                    gqc.a aVarA2 = gqcVar.a();
                    aVarA2.f = j4;
                    aVarA2.g = -1L;
                    try {
                        jA = gr5Var.a(aVarA2.a());
                    } catch (Exception e) {
                        fqc.a(gr5Var);
                        throw e;
                    }
                }
                if (z2 && jA != -1) {
                    long j5 = jA + j4;
                    try {
                        if (this.g != j5) {
                            this.g = j5;
                        }
                    } catch (Exception e2) {
                        fqc.a(gr5Var);
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    byte[] bArr = this.e;
                    i = gr5Var.read(bArr, 0, bArr.length);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                if (z2) {
                    long j6 = ((long) i2) + j4;
                    if (this.g != j6) {
                        this.g = j6;
                    }
                }
                gr5Var.close();
                this.f = j4 + ((long) i2);
            }
        }
    }
}
