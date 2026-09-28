package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k340<T> implements zde0<T> {
    public final long a;
    public bee0 b;
    public final tb5 c;

    public k340(int i, pb5 pb5Var, long j) {
        this.a = j;
        this.c = d77.b(i == 0 ? 1 : i, 4, pb5Var);
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        this.b = bee0Var;
        if (bee0Var != null) {
            bee0Var.request(this.a);
        } else {
            Intrinsics.n("subscription");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) throws Throwable {
        j340 j340Var;
        Object objH;
        if (x1bVar instanceof j340) {
            j340Var = (j340) x1bVar;
            int i = j340Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j340Var.c = i - Integer.MIN_VALUE;
            } else {
                j340Var = new j340(this, x1bVar);
            }
        } else {
            j340Var = new j340(this, x1bVar);
        }
        Object obj = j340Var.a;
        y5b y5bVar = y5b.a;
        int i2 = j340Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            j340Var.c = 1;
            objH = tb5.H(this.c, j340Var);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objH = ((h77) obj).a;
        }
        Throwable thA = h77.a(objH);
        if (thA != null) {
            throw thA;
        }
        if (objH instanceof h77.b) {
            return null;
        }
        return objH;
    }

    @Override // defpackage.zde0
    public final void onComplete() {
        this.c.k(null);
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        this.c.i(th, false);
    }

    @Override // defpackage.zde0
    public final void onNext(T t) {
        tb5 tb5Var = this.c;
        if (tb5Var.c(t) instanceof h77.b) {
            axz.a(t, "Element ", " was not added to channel because it was full, ", tb5Var);
        }
    }
}
