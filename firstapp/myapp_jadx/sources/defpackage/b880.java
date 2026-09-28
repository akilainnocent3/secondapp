package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b880 implements fff0 {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ zg8 c;
    public final /* synthetic */ g980 d;
    public final /* synthetic */ long e;

    public b880(zg8 zg8Var, g980 g980Var, long j) {
        this.c = zg8Var;
        this.d = g980Var;
        this.e = j;
    }

    @Override // defpackage.fff0
    public final void b(long j) {
        urr urrVar = (urr) this.c.invoke();
        g980 g980Var = this.d;
        if (urrVar != null) {
            if (!urrVar.e()) {
                return;
            }
            g980Var.b();
            this.a = j;
        }
        if (i980.a(g980Var, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.fff0
    public final void c() {
        long j = this.e;
        g980 g980Var = this.d;
        if (i980.a(g980Var, j)) {
            g980Var.i();
        }
    }

    @Override // defpackage.fff0
    public final void e(long j) {
        urr urrVar = (urr) this.c.invoke();
        if (urrVar == null || !urrVar.e()) {
            return;
        }
        g980 g980Var = this.d;
        if (i980.a(g980Var, this.e)) {
            long jF = gly.f(this.b, j);
            this.b = jF;
            long jF2 = gly.f(this.a, jF);
            if (g980Var.h()) {
                this.a = jF2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.fff0
    public final void onCancel() {
        long j = this.e;
        g980 g980Var = this.d;
        if (i980.a(g980Var, j)) {
            g980Var.i();
        }
    }

    @Override // defpackage.fff0
    public final void a() {
    }

    @Override // defpackage.fff0
    public final void d() {
    }
}
