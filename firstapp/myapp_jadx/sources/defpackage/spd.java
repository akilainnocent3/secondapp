package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$initDepositOneTimeBankList$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {187}, m = "invokeSuspend", v = 2)
public final class spd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spd(fqd fqdVar, v1b<? super spd> v1bVar) {
        super(2, v1bVar);
        this.b = fqdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new spd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((spd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        fqd fqdVar = this.b;
        wwd0 wwd0Var = fqdVar.x0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            g1i g1iVarV = fqdVar.p0.v(pu0.c.a);
            this.a = 1;
            obj = bm50.p(g1iVarV, this);
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
        if (wwd0Var.getValue() == null) {
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (cVar != null && (list = (List) cVar.a) != null) {
                for (Object obj3 : list) {
                    if (((jw1) obj3).i) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (jw1) obj2;
            }
            wwd0Var.setValue(obj2);
        }
        return Unit.a;
    }
}
