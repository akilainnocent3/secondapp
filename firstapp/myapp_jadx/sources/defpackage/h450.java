package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h450 {
    public final d450 a;

    static {
        ohp<Object>[] ohpVarArr = d450.e;
    }

    public h450(d450 d450Var) {
        this.a = d450Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        g450 g450Var;
        if (x1bVar instanceof g450) {
            g450Var = (g450) x1bVar;
            int i = g450Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g450Var.c = i - Integer.MIN_VALUE;
            } else {
                g450Var = new g450(this, x1bVar);
            }
        } else {
            g450Var = new g450(this, x1bVar);
        }
        Object objF = g450Var.a;
        y5b y5bVar = y5b.a;
        int i2 = g450Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            d450 d450Var = this.a;
            wm20 wm20VarA = d450Var.c.a(d450Var, d450.e[1]);
            g450Var.c = 1;
            objF = wm20VarA.f(g450Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        return Boolean.valueOf(Intrinsics.g(objF, Boolean.TRUE));
    }
}
