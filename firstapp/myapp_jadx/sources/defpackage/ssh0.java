package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ssh0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(iqa0 iqa0Var, x1b x1bVar) {
        msh0 msh0Var;
        iqa0 iqa0Var2;
        Throwable th;
        lb5 lb5Var;
        if (x1bVar instanceof msh0) {
            msh0Var = (msh0) x1bVar;
            int i = msh0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                msh0Var.d = i - Integer.MIN_VALUE;
            } else {
                msh0Var = new msh0(x1bVar);
            }
        } else {
            msh0Var = new msh0(x1bVar);
        }
        Object obj = msh0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = msh0Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lb5Var = msh0Var.b;
            iqa0Var2 = msh0Var.a;
            try {
                uj50.b(obj);
                vc1.a(iqa0Var2, null);
                return lb5Var;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    vc1.a(iqa0Var2, th);
                    throw th3;
                }
            }
        }
        uj50.b(obj);
        try {
            lb5 lb5Var2 = new lb5();
            msh0Var.a = iqa0Var;
            msh0Var.b = lb5Var2;
            msh0Var.d = 1;
            if (iqa0Var.d(lb5Var2) == y5bVar) {
                return y5bVar;
            }
            iqa0Var2 = iqa0Var;
            lb5Var = lb5Var2;
            vc1.a(iqa0Var2, null);
            return lb5Var;
        } catch (Throwable th4) {
            iqa0Var2 = iqa0Var;
            th = th4;
            throw th;
        }
    }
}
