package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x450 {
    public static final /* synthetic */ int b = 0;
    public final d450 a;

    static {
        ohp<Object>[] ohpVarArr = d450.e;
    }

    public x450(d450 d450Var) {
        this.a = d450Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        w450 w450Var;
        if (x1bVar instanceof w450) {
            w450Var = (w450) x1bVar;
            int i = w450Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w450Var.c = i - Integer.MIN_VALUE;
            } else {
                w450Var = new w450(this, x1bVar);
            }
        } else {
            w450Var = new w450(this, x1bVar);
        }
        Object objF = w450Var.a;
        y5b y5bVar = y5b.a;
        int i2 = w450Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            d450 d450Var = this.a;
            wm20 wm20VarA = d450Var.b.a(d450Var, d450.e[0]);
            w450Var.c = 1;
            objF = wm20VarA.f(w450Var);
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
