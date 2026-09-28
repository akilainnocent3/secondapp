package defpackage;

import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawBaseViewModel$observeBankTrade$1", f = "WithdrawBaseViewModel.kt", l = {391}, m = "invokeSuspend", v = 2)
public final class wkj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xkj0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ xkj0 a;

        public a(xkj0 xkj0Var) {
            this.a = xkj0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            xkj0 xkj0Var = this.a;
            xkj0Var.H.g.setValue(null);
            if (lk50Var instanceof lk50.b) {
                qxd0<uxs> qxd0VarL2 = xkj0Var.l2();
                if (qxd0VarL2 != null) {
                    qxd0VarL2.a(uxs.LOADING);
                }
            } else if (lk50Var instanceof lk50.a) {
                xkj0Var.s2();
                xkj0Var.t2(vnj0.a.e.b);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                xkj0Var.s2();
                int i = ((BankTradeData) ((lk50.c) lk50Var).a).status;
                if (i == 10) {
                    xkj0Var.t2(vnj0.a.C1217a.b);
                } else if (i != 20) {
                    xkj0Var.t2(vnj0.a.e.b);
                } else {
                    String str = xkj0Var.O;
                    if (str != null) {
                        xkj0Var.u2(str);
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkj0(xkj0 xkj0Var, v1b<? super wkj0> v1bVar) {
        super(2, v1bVar);
        this.b = xkj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wkj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wkj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xkj0 xkj0Var = this.b;
            f1i f1iVar = xkj0Var.H.h;
            a aVar = new a(xkj0Var);
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
