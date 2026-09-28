package defpackage;

import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankAccountDto;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$initDedicatedAccounts$1", f = "DepositDedicatedAccountViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class cyd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yxd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyd(yxd yxdVar, v1b<? super cyd> v1bVar) {
        super(2, v1bVar);
        this.b = yxdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cyd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cyd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        y5b y5bVar = y5b.a;
        int i = this.a;
        yxd yxdVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            g1i g1iVarE0 = yxdVar.l0.e0(pu0.c.a);
            this.a = 1;
            obj = bm50.p(g1iVarE0, this);
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
        lk50 lk50Var = (lk50) obj;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar != null && (list = (List) cVar.a) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((SportyBankAccountDto) it.next()).isWaiting()) {
                    jvd0 jvd0Var = yxdVar.n0;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    yxdVar.n0 = ej5.c(o8i0.d(yxdVar), null, null, new ayd(yxdVar, null), 3);
                    break;
                }
            }
        }
        return Unit.a;
    }
}
