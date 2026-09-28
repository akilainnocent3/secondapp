package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$loadName$1", f = "SpeiByStpWithdrawViewModel.kt", l = {273}, m = "invokeSuspend", v = 2)
public final class dxa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zwa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa0(zwa0 zwa0Var, v1b<? super dxa0> v1bVar) {
        super(2, v1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dxa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dxa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        zwa0 zwa0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            lyh<AccountInfo> accountInfoFlow = zwa0Var.e.getAccountInfoFlow();
            this.a = 1;
            obj = s0i.c(accountInfoFlow, this);
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
        AccountInfo accountInfo = (AccountInfo) obj;
        if (accountInfo != null) {
            wwd0 wwd0Var = zwa0Var.E;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, wwa0.a((wwa0) value, null, StringsKt.t0(accountInfo.getFirstName() + " " + accountInfo.getLastName()).toString(), null, false, false, 29)));
        }
        return Unit.a;
    }
}
