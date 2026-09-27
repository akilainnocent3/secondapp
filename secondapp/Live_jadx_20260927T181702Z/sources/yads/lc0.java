package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu f151930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo2 f151931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f151932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i30 f151933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f151934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f151935f;

    public lc0(long j10, lo2 lo2Var, uo uoVar, fu fuVar, long j11, i30 i30Var) {
        this.f151934e = j10;
        this.f151931b = lo2Var;
        this.f151932c = uoVar;
        this.f151935f = j11;
        this.f151930a = fuVar;
        this.f151933d = i30Var;
    }

    public final lc0 a(long j10, lo2 lo2Var) throws zo {
        long jA;
        long jA2;
        i30 i30VarD = this.f151931b.d();
        i30 i30VarD2 = lo2Var.d();
        if (i30VarD == null) {
            return new lc0(j10, lo2Var, this.f151932c, this.f151930a, this.f151935f, i30VarD);
        }
        if (!i30VarD.a()) {
            return new lc0(j10, lo2Var, this.f151932c, this.f151930a, this.f151935f, i30VarD2);
        }
        long jC = i30VarD.c(j10);
        if (jC == 0) {
            return new lc0(j10, lo2Var, this.f151932c, this.f151930a, this.f151935f, i30VarD2);
        }
        long jB = i30VarD.b();
        long jA3 = i30VarD.a(jB);
        long j11 = jC + jB;
        long j12 = j11 - 1;
        long jB2 = i30VarD.b(j12, j10) + i30VarD.a(j12);
        long jB3 = i30VarD2.b();
        long jA4 = i30VarD2.a(jB3);
        long j13 = this.f151935f;
        if (jB2 != jA4) {
            if (jB2 < jA4) {
                throw new zo();
            }
            if (jA4 < jA3) {
                jA2 = j13 - (i30VarD2.a(jA3, j10) - jB);
            } else {
                jA = i30VarD.a(jA4, j10) - jB3;
            }
            return new lc0(j10, lo2Var, this.f151932c, this.f151930a, jA2, i30VarD2);
        }
        jA = j11 - jB3;
        jA2 = jA + j13;
        return new lc0(j10, lo2Var, this.f151932c, this.f151930a, jA2, i30VarD2);
    }

    public final long a(long j10) {
        return this.f151933d.b(j10 - this.f151935f, this.f151934e) + this.f151933d.a(j10 - this.f151935f);
    }
}
