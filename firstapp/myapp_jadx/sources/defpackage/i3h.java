package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class i3h extends ys70 {
    public final Object j;
    public final d2h k;

    public i3h(pg50 pg50Var, oso osoVar, long j, long j2, ui1 ui1Var, int i, dvh0 dvh0Var, d2h d2hVar) {
        super(pg50Var, osoVar, j, j2, ui1Var, i, dvh0Var, null);
        this.j = new Object();
        this.k = d2hVar;
    }

    @Override // defpackage.ys70, defpackage.p340
    public final rft a() {
        zw0 zw0VarB;
        ii1 ii1Var;
        synchronized (this.j) {
            pg50 pg50Var = this.a;
            oso osoVar = this.b;
            long j = this.c;
            long j2 = this.d;
            ui1 ui1Var = this.e;
            int i = this.f;
            ruh0<?> ruh0Var = this.g;
            synchronized (this.j) {
                try {
                    d2h d2hVar = this.k;
                    zw0VarB = d2hVar == null ? zw0.e : d2hVar.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zw0 zw0Var = zw0VarB;
            d2h d2hVar2 = this.k;
            ii1Var = new ii1(pg50Var, osoVar, j, j2, ui1Var, i, d2hVar2 == null ? 0 : d2hVar2.c, zw0Var, ruh0Var);
        }
        return ii1Var;
    }
}
