package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class i840 implements vlv {
    public final abe0 a;
    public final kyi0 b;
    public final Object c = new Object();

    public i840(abe0 abe0Var, kyi0 kyi0Var) {
        this.a = abe0Var;
        this.b = kyi0Var;
    }

    @Override // defpackage.vlv
    public final long a() {
        long jA;
        synchronized (this.c) {
            jA = this.a.a();
        }
        return jA;
    }

    @Override // defpackage.vlv
    public final vlv.c b(vlv.b bVar) {
        vlv.c cVarB;
        synchronized (this.c) {
            try {
                cVarB = this.a.b(bVar);
                if (cVarB == null) {
                    cVarB = this.b.b(bVar);
                }
                if (cVarB != null && !cVarB.a.e()) {
                    synchronized (this.c) {
                        this.a.h(bVar);
                        this.b.h(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarB;
    }

    @Override // defpackage.vlv
    public final void c(long j) {
        synchronized (this.c) {
            this.a.c(j);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.vlv
    public final void clear() {
        synchronized (this.c) {
            this.a.clear();
            this.b.clear();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.vlv
    public final long d() {
        long jD;
        synchronized (this.c) {
            jD = this.a.d();
        }
        return jD;
    }

    @Override // defpackage.vlv
    public final long e() {
        long jE;
        synchronized (this.c) {
            jE = this.a.e();
        }
        return jE;
    }

    @Override // defpackage.vlv
    public final void g(long j) {
        synchronized (this.c) {
            this.a.g(j);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.vlv
    public final void h(vlv.b bVar, vlv.c cVar) {
        synchronized (this.c) {
            long jA = cVar.a.a();
            if (jA < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
            }
            this.a.f(bVar, cVar.a, cVar.b, jA);
            Unit unit = Unit.a;
        }
    }
}
