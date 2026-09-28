package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;

/* JADX INFO: loaded from: classes5.dex */
public final class f3k {
    public final sr10 a;

    public f3k(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        e3k e3kVar;
        if (x1bVar instanceof e3k) {
            e3kVar = (e3k) x1bVar;
            int i = e3kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e3kVar.c = i - Integer.MIN_VALUE;
            } else {
                e3kVar = new e3k(this, x1bVar);
            }
        } else {
            e3kVar = new e3k(this, x1bVar);
        }
        Object objM = e3kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = e3kVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objM);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                e3kVar.c = 1;
                objM = sr10Var.m(str, e3kVar);
                if (objM == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objM);
            }
            BankTradeData bankTradeData = (BankTradeData) n52.b((BaseResponse) objM);
            zi50.a aVar2 = zi50.b;
            return bankTradeData;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
