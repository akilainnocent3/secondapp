package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class ys70 implements p340 {
    public final pg50 a;
    public final oso b;
    public final long c;
    public final long d;
    public final ui1 e;
    public final int f;
    public final ruh0<?> g;
    public final Object h = new Object();
    public final q21 i;

    public ys70(pg50 pg50Var, oso osoVar, long j, long j2, ui1 ui1Var, int i, ruh0 ruh0Var, q21 q21Var) {
        this.a = pg50Var;
        this.b = osoVar;
        this.c = j;
        this.d = j2;
        this.e = ui1Var;
        this.f = i;
        this.g = ruh0Var;
        this.i = q21Var;
    }

    @Override // defpackage.p340
    public rft a() {
        m21 m21VarA;
        nk1 nk1Var;
        synchronized (this.h) {
            pg50 pg50Var = this.a;
            oso osoVar = this.b;
            long j = this.c;
            long j2 = this.d;
            ui1 ui1Var = this.e;
            int i = this.f;
            ruh0<?> ruh0Var = this.g;
            synchronized (this.h) {
                try {
                    q21 q21Var = this.i;
                    if (q21Var == null || q21Var.isEmpty()) {
                        m21VarA = vw0.d;
                    } else {
                        q21 q21Var2 = this.i;
                        q21Var2.getClass();
                        xw0 xw0Var = new xw0();
                        xw0Var.c(q21Var2);
                        m21VarA = xw0Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m21 m21Var = m21VarA;
            q21 q21Var3 = this.i;
            nk1Var = new nk1(pg50Var, osoVar, j, j2, ui1Var, i, m21Var, q21Var3 == null ? 0 : q21Var3.c, ruh0Var);
        }
        return nk1Var;
    }
}
