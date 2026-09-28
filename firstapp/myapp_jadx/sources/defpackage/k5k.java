package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;

/* JADX INFO: loaded from: classes5.dex */
public final class k5k {
    public final u1l a;

    public k5k(u1l u1lVar) {
        u1lVar.getClass();
        this.a = u1lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        j5k j5kVar;
        if (x1bVar instanceof j5k) {
            j5kVar = (j5k) x1bVar;
            int i = j5kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j5kVar.c = i - Integer.MIN_VALUE;
            } else {
                j5kVar = new j5k(this, x1bVar);
            }
        } else {
            j5kVar = new j5k(this, x1bVar);
        }
        Object objR = j5kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = j5kVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objR);
                zi50.a aVar = zi50.b;
                lyh<lk50<BaseResponse<DepositHistoryStatusData>>> lyhVarB = this.a.b();
                j5kVar.c = 1;
                objR = bm50.r(lyhVarB, null, j5kVar);
                if (objR == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objR);
            }
            DepositHistoryStatusData depositHistoryStatusData = (DepositHistoryStatusData) n52.b((BaseResponse) objR);
            zi50.a aVar2 = zi50.b;
            return depositHistoryStatusData;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
