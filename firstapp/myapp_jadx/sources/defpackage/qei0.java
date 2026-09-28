package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qei0 implements e06 {
    public final e06 a;
    public final c4f0 b;
    public final long c;

    public qei0(e06 e06Var, c4f0 c4f0Var, long j) {
        this.a = e06Var;
        this.b = c4f0Var;
        this.c = j;
    }

    @Override // defpackage.e06
    public final c06 b() {
        e06 e06Var = this.a;
        return e06Var != null ? e06Var.b() : c06.a;
    }

    @Override // defpackage.e06
    public final c4f0 c() {
        return this.b;
    }

    @Override // defpackage.e06
    public final long d() {
        e06 e06Var = this.a;
        if (e06Var != null) {
            return e06Var.d();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        ib5.a("No timestamp is available.");
        return 0L;
    }

    @Override // defpackage.e06
    public final zz5 f() {
        e06 e06Var = this.a;
        return e06Var != null ? e06Var.f() : zz5.a;
    }

    @Override // defpackage.e06
    public final b06 g() {
        e06 e06Var = this.a;
        return e06Var != null ? e06Var.g() : b06.a;
    }

    @Override // defpackage.e06
    public final xz5 h() {
        e06 e06Var = this.a;
        return e06Var != null ? e06Var.h() : xz5.a;
    }
}
