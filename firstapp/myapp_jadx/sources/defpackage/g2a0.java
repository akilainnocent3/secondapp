package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class g2a0 implements e2a0 {
    public final g3z a;

    public g2a0(g3z g3zVar) {
        this.a = g3zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.e2a0
    public final Object a(String str, x1b x1bVar) {
        f2a0 f2a0Var;
        if (x1bVar instanceof f2a0) {
            f2a0Var = (f2a0) x1bVar;
            int i = f2a0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2a0Var.c = i - Integer.MIN_VALUE;
            } else {
                f2a0Var = new f2a0(this, x1bVar);
            }
        } else {
            f2a0Var = new f2a0(this, x1bVar);
        }
        Object objT = f2a0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = f2a0Var.c;
        if (i2 == 0) {
            uj50.b(objT);
            f2a0Var.c = 1;
            objT = this.a.t(str, f2a0Var);
            if (objT == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objT);
        }
        return n52.b((BaseResponse) objT);
    }
}
