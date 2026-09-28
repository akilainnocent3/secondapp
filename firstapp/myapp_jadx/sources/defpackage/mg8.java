package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawViewModel$getDisablePaymentData$1", f = "CommonMobileMoneyWithdrawViewModel.kt", l = {544}, m = "invokeSuspend", v = 2)
public final class mg8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qg8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg8(qg8 qg8Var, v1b<? super mg8> v1bVar) {
        super(2, v1bVar);
        this.b = qg8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mg8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mg8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<? extends wqe> list;
        y5b y5bVar = y5b.a;
        int i = this.a;
        qg8 qg8Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            xqe xqeVar = qg8Var.e;
            this.a = 1;
            obj = xqeVar.d(this);
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
        ng50.b bVar = obj instanceof ng50.b ? (ng50.b) obj : null;
        if (bVar != null && (list = (List) bVar.a) != null) {
            qg8Var.T = list;
            qg8Var.x1();
        }
        return Unit.a;
    }
}
