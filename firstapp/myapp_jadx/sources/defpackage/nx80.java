package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nx80 {
    public final b9z a;
    public bxz b;
    public gf4 c;
    public long d;
    public long e;
    public long f;
    public asr g;
    public float h;

    public nx80(b9z b9zVar) {
        this.a = b9zVar;
        int i = j58.n;
        this.d = j58.m;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = asr.a;
        this.h = 1.0f;
    }

    public abstract void a(tcf tcfVar, long j, long j2, bxz bxzVar);

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public final void b(tcf tcfVar, l58 l58Var, long j, long j2, float f, int i) {
        b9z b9zVar = this.a;
        l58 l58Var2 = null;
        if (b9zVar instanceof b9z.a) {
            this.b = ((b9z.a) b9zVar).a;
            this.e = 0L;
        } else if (b9zVar instanceof b9z.c) {
            b9z.c cVar = (b9z.c) b9zVar;
            lz50 lz50Var = cVar.a;
            if (bys.f(lz50Var)) {
                this.b = null;
                this.e = lz50Var.e;
            } else {
                this.b = cVar.b;
                this.e = 0L;
            }
        } else if (!(b9zVar instanceof b9z.b)) {
            uhc.a();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (l58Var != null) {
            l58Var2 = l58Var;
        } else if (j2 != 16) {
            gf4 gf4Var = this.c;
            if (gf4Var != null) {
                long j3 = this.d;
                int i2 = j58.n;
                if (!nbh0.a(j3, j2)) {
                    gf4Var = new gf4(j2, 5);
                    this.d = j2;
                    this.c = gf4Var;
                }
            } else {
                gf4Var = new gf4(j2, 5);
                this.d = j2;
                this.c = gf4Var;
            }
            l58Var2 = gf4Var;
        }
        long j4 = this.f;
        if (j4 == 9205357640488583168L || !yw90.a(j4, j) || this.g != tcfVar.getLayoutDirection() || this.h != tcfVar.getDensity()) {
            a(tcfVar, j, this.e, this.b);
            this.f = j;
            this.g = tcfVar.getLayoutDirection();
            this.h = tcfVar.getDensity();
        }
        c(tcfVar, this.e, this.b, f, l58Var2, i);
    }

    public abstract void c(tcf tcfVar, long j, bxz bxzVar, float f, l58 l58Var, int i);
}
