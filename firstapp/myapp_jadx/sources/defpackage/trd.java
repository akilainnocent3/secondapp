package defpackage;

import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$observeBankTrade$1", f = "DepositBaseViewModel.kt", l = {370}, m = "invokeSuspend", v = 2)
public final class trd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wrd b;

    public static final class a<T> implements myh {
        public final /* synthetic */ wrd a;

        public a(wrd wrdVar) {
            this.a = wrdVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            wrd wrdVar = this.a;
            wrdVar.H.g.setValue(null);
            lk50Var.getClass();
            if (lk50Var instanceof lk50.b) {
                qxd0<uxs> qxd0VarK2 = wrdVar.k2();
                if (qxd0VarK2 != null) {
                    qxd0VarK2.a(uxs.LOADING);
                }
            } else if (lk50Var instanceof lk50.a) {
                wrdVar.y2();
                n000.d2(wrdVar);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                wrdVar.y2();
                BankTradeData bankTradeData = (BankTradeData) ((lk50.c) lk50Var).a;
                int i = bankTradeData.status;
                if (i == 10) {
                    wrdVar.q2(bankTradeData);
                } else if (i == 20) {
                    wrdVar.z2();
                    wrd.B2(wrdVar, null, bankTradeData, null, null, null, 61);
                } else if (i != 80) {
                    n000.d2(wrdVar);
                } else {
                    wrdVar.p2(bankTradeData);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trd(wrd wrdVar, v1b<? super trd> v1bVar) {
        super(2, v1bVar);
        this.b = wrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new trd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((trd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wrd wrdVar = this.b;
            f1i f1iVar = wrdVar.H.h;
            a aVar = new a(wrdVar);
            this.a = 1;
            if (f1iVar.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
