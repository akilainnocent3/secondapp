package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lvd0 implements uiv {
    public final vs7 a;
    public boolean b;
    public long c;
    public long d;
    public eo10 e = eo10.d;

    public lvd0(vs7 vs7Var) {
        this.a = vs7Var;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.d();
        }
    }

    @Override // defpackage.uiv
    public final eo10 c() {
        return this.e;
    }

    @Override // defpackage.uiv
    public final void e(eo10 eo10Var) {
        if (this.b) {
            a(v());
        }
        this.e = eo10Var;
    }

    @Override // defpackage.uiv
    public final long v() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jD = this.a.d() - this.d;
        eo10 eo10Var = this.e;
        return (eo10Var.a == 1.0f ? jrh0.O(jD) : jD * ((long) eo10Var.c)) + j;
    }
}
