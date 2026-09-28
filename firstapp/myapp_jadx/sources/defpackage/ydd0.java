package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class ydd0 implements wdd0 {
    public final w1k0 a;

    public ydd0(w1k0 w1k0Var) {
        w1k0Var.getClass();
        this.a = w1k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wdd0
    public final Object a(x1b x1bVar) {
        xdd0 xdd0Var;
        if (x1bVar instanceof xdd0) {
            xdd0Var = (xdd0) x1bVar;
            int i = xdd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xdd0Var.c = i - Integer.MIN_VALUE;
            } else {
                xdd0Var = new xdd0(this, x1bVar);
            }
        } else {
            xdd0Var = new xdd0(this, x1bVar);
        }
        Object objA = xdd0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xdd0Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            xdd0Var.c = 1;
            objA = this.a.a(xdd0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        return ((t590) n52.b((BaseResponse) objA)).getAuthToken();
    }
}
