package defpackage;

import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sporty.android.core.model.realsports.SportBet;
import com.sporty.android.core.model.realsports.TransactionStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPendingDepositsUseCase$fetchPendingDepositsAsync$1", f = "GetPendingDepositsUseCase.kt", l = {66}, m = "invokeSuspend", v = 2)
public final class mak extends tje0 implements Function2<v5b, v1b<? super List<? extends Transaction>>, Object> {
    public int a;
    public final /* synthetic */ lak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mak(lak lakVar, v1b<? super mak> v1bVar) {
        super(2, v1bVar);
        this.b = lakVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mak(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends Transaction>> v1bVar) {
        return ((mak) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Transaction> list;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sr10 sr10Var = this.b.b;
            int i2 = aqg0.e.c.a;
            TransactionStatus transactionStatus = TransactionStatus.PENDING;
            this.a = 1;
            obj = sr10.y(sr10Var, i2, null, 40, null, null, transactionStatus, this, 24);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ng50 ng50Var = (ng50) obj;
        if (ng50Var instanceof ng50.a) {
            ng50.a aVar = (ng50.a) ng50Var;
            Throwable th = aVar.c;
            if (th == null) {
                throw new RuntimeException(aVar.b);
            }
            throw th;
        }
        if ((ng50Var instanceof ng50.b) && ((ng50.b) ng50Var).a == 0) {
            b9p.a("Failed to fetch pending deposits");
            return null;
        }
        SportBet sportBet = (SportBet) ng50Var.a;
        return (sportBet == null || (list = sportBet.statements) == null) ? m2g.a : list;
    }
}
