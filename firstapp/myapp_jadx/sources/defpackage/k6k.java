package defpackage;

import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;

/* JADX INFO: loaded from: classes5.dex */
public final class k6k {
    public final sr10 a;

    public k6k(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(x1b x1bVar) {
        j6k j6kVar;
        if (x1bVar instanceof j6k) {
            j6kVar = (j6k) x1bVar;
            int i = j6kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6kVar.c = i - Integer.MIN_VALUE;
            } else {
                j6kVar = new j6k(this, x1bVar);
            }
        } else {
            j6kVar = new j6k(this, x1bVar);
        }
        Object objO = j6kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = j6kVar.c;
        if (i2 == 0) {
            uj50.b(objO);
            j6kVar.c = 1;
            objO = this.a.O(j6kVar);
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objO);
        }
        DepositHistoryStatusData depositHistoryStatusData = (DepositHistoryStatusData) ((ng50) objO).a;
        if (depositHistoryStatusData == null) {
            return Boolean.FALSE;
        }
        int state = depositHistoryStatusData.getState();
        d0e[] d0eVarArr = d0e.a;
        return Boolean.valueOf(state == 90);
    }
}
