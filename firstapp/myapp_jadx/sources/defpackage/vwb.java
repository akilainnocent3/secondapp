package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.ClabeBankAccount;
import com.sporty.android.core.model.pocket.common.ClabeType;

/* JADX INFO: loaded from: classes5.dex */
public final class vwb {
    public final sr10 a;

    public vwb(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ClabeType clabeType, x1b x1bVar) {
        uwb uwbVar;
        if (x1bVar instanceof uwb) {
            uwbVar = (uwb) x1bVar;
            int i = uwbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uwbVar.c = i - Integer.MIN_VALUE;
            } else {
                uwbVar = new uwb(this, x1bVar);
            }
        } else {
            uwbVar = new uwb(this, x1bVar);
        }
        Object objQ = uwbVar.a;
        y5b y5bVar = y5b.a;
        int i2 = uwbVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                uwbVar.c = 1;
                objQ = sr10Var.Q(str, clabeType, uwbVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            ClabeBankAccount clabeBankAccount = (ClabeBankAccount) n52.b((BaseResponse) objQ);
            zi50.a aVar2 = zi50.b;
            return clabeBankAccount;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
